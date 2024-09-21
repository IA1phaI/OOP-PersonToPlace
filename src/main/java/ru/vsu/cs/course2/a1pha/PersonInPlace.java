package ru.vsu.cs.course2.a1pha;

import ru.vsu.cs.course2.a1pha.place.Place;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PersonInPlace {
    private final Location location;
    private final HashMap<Person, Place> personPosition = new HashMap<>();

    public PersonInPlace(Location location) {
        this.location = location;
    }

    public HashMap<Person, Place> getPersonPositions() {
        if (personPosition instanceof HashMap<Person, Place> personPositions){
            return personPositions;
        } else {
            throw new RuntimeException("No information about person position");
        }
    }

    public Place getPersonPlace(Person person) {
        return personPosition.get(person);
    }

    public Set<Person> getPersonsInPlace(final Place place) {
        Set<Person> persons = new HashSet<>();
        for (Person person : personPosition.keySet()) {
            if (personPosition.get(person).equals(place)) {
                persons.add(person);
            }
        }

        return persons;
    }

    public void putPersonIntoPlace(final Person person, final Place place) {
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
        sb.append(location.toString()).append("\n");

        for (Place place : getPlaces()) {
            sb.append(String.format("\t%s:\n",place));
            for (Person person : personsByPlaces.get(place)) {
                sb.append(String.format("\t\t%s\n", person));
            }
        }
        return sb.toString();
    }
}
