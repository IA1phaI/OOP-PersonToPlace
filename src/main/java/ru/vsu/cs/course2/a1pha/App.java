package ru.vsu.cs.course2.a1pha;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonInPlace personInPlace = new PersonInPlace();
        Place[] places = new Place[]{
                new Place("Paris"),
                new Place("Moscow"),
                new Place("Berlin"),
                new Place("Voronezh")};
        Person[] persons = new Person[]{
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
            personInPlace.putPersonIntoPlace(person, places[random.nextInt(places.length - 1)]);
        }
        System.out.println(personInPlace);
    }
}
