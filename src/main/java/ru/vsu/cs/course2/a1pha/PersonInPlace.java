package ru.vsu.cs.course2.a1pha;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ru.vsu.cs.course2.a1pha.place.Place;

public class PersonInPlace {
  private final Date creationDate;
  private static final SimpleDateFormat DATE_FORMAT;
  private static final SimpleDateFormat TIME_FORMAT;
  private final Location location;
  private final HashMap<Person, Place> personPosition = new HashMap<>();

  static {
    DATE_FORMAT = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
    TIME_FORMAT = new SimpleDateFormat("HH:mm:ss:S");
    log("Initialized connection to PersonInPlace class");
  }

  {
    creationDate = new Date();
    log(String.format("Tracking STARTED. Full start time: %s", DATE_FORMAT.format(creationDate)));
  }

  public PersonInPlace(final Location location) {
    this.location = location;
    log("All settings are applied. We can start working");
  }

  private static void log(String logMsg) {
    System.out.printf("[%s] %s\n", TIME_FORMAT.format(new Date()), logMsg);
  }

  public HashMap<Person, Place> getPersonPositions() {
    if (personPosition instanceof final HashMap<Person, Place> personPositions) {
      return personPositions;
    } else {
      throw new RuntimeException("No information about person position");
    }
  }

  public Place getPersonPlace(final Person person) {
    return personPosition.get(person);
  }

  public Set<Person> getPersonsInPlace(final Place place) {
    final Set<Person> persons = new HashSet<>();
    for (final Person person : personPosition.keySet()) {
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
    final HashMap<Place, HashSet<Person>> personsByPlaces = new HashMap<>();
    for (final Person person : personPosition.keySet()) {
      final Place place = personPosition.get(person);

      if (!personsByPlaces.containsKey(place)) {
        personsByPlaces.put(place, new HashSet<>());
      }
      personsByPlaces.get(place).add(person);
    }

    return personsByPlaces;
  }

  @Override
  public String toString() {
    final HashMap<Place, HashSet<Person>> personsByPlaces = getPersonsByPlaces();
    final StringBuilder sb = new StringBuilder();
    sb.append(location.toString()).append("\n");

    for (final Place place : getPlaces()) {
      sb.append(String.format("\t%s:\n", place));
      for (final Person person : personsByPlaces.get(place)) {
        sb.append(String.format("\t\t%s\n", person));
      }
    }
    return sb.toString();
  }
}
