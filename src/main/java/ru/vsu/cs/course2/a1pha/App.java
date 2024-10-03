package ru.vsu.cs.course2.a1pha;

import java.io.File;
import java.util.Random;
import ru.vsu.cs.course2.a1pha.place.Cafe;
import ru.vsu.cs.course2.a1pha.place.EducationalInstitution;
import ru.vsu.cs.course2.a1pha.place.Park;
import ru.vsu.cs.course2.a1pha.place.Place;
import ru.vsu.cs.course2.a1pha.place.ShoppingMall;

public class App {
  public static void main(String[] args) {
    PersonInPlace personInPlace = new PersonInPlace(new Location("Russia", "Voronezh"));
    Place[] places =
        new Place[] {
          new ShoppingMall(
              "Arena", new Address(AddressType.BOULEVARD, "Victory's", 23, 'B'), new File("")),
          new EducationalInstitution(
              "VSU", new Address(AddressType.SQUARE, "University's", 1), new File("")),
          new Cafe(
              "Central Yummy and the dot",
              new Address(AddressType.AVENUE, "Revolution's", 32, 'A'),
              new File("")),
          new Park("Dinamo", new Address(AddressType.STREET, "Lenin's"), new File(""))
        };

    Person[] persons =
        new Person[] {
          new Person("Oleg"),
          new Person("Alex"),
          new Person("Senya"),
          new Person("Vitya"),
          new Person("Ars"),
          new Person("Vladimir"),
          new Person("Misha")
        };

    Random random = new Random();
    for (Person person : persons) {
      personInPlace.putPersonIntoPlace(person, places[random.nextInt(places.length)]);
    }
    
    System.out.printf("\n%s\n", personInPlace);

    places[0].sendNotifications(personInPlace.getPersonsInPlace(places[0]));
    places[2].sendNotifications(personInPlace.getPersonsInPlace(places[2]));
  }
}
