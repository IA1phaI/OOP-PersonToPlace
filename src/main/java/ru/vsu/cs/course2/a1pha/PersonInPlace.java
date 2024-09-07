package ru.vsu.cs.course2.a1pha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PersonInPlace {
    private HashMap<Person, Place> personPosition = new HashMap<>();

    public HashMap<Person, Place> getPersonPositions() {
        return (HashMap<Person, Place>) personPosition.clone();
    }

    public Place getPersonPlace(Person person) {
        return personPosition.get(person);
    }

    public Set<Person> getPersonsInPlace(Place place) {
        Set<Person> persons = new HashSet<>();
        for (Person person : personPosition.keySet()) {
            if (personPosition.get(person).equals(place)) {
                persons.add(person);
            }
        }

        return persons;
    }

    public void putPersonIntoPlace(Person person, Place place) {
        personPosition.put(person, place);
    }

    public Set<Person> getPersons() {
        return new HashSet<>(personPosition.keySet());
    }

    public Set<Place> getPlaces() {
        return new HashSet<>(personPosition.values());
    }

    public HashMap<Place, HashSet<Person>> getPersonsByPlaces() {
        HashMap<Place, HashSet<Person>> personsByPlaces = new HashMap<>();
        for (Person person : personPosition.keySet()) {
            Place place = personPosition.get(person);

            if (!personsByPlaces.containsKey(place)) {
                personsByPlaces.put(place, new HashSet<>());
            }
            personsByPlaces.get(place).add(person);
        }

        return personsByPlaces;
    }

    @Override
    public String toString() {
        HashMap<Place, HashSet<Person>> personsByPlaces = getPersonsByPlaces();
        StringBuilder sb = new StringBuilder();

        for (Place place : getPlaces()) {
            sb.append(place).append(":\n");
            for (Person person : personsByPlaces.get(place)) {
                sb.append(String.format("\t%s\n", person));
            }
        }
        return sb.toString();
    }
}
