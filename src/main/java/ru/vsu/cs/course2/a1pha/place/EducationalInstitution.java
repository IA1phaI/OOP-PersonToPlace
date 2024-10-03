package ru.vsu.cs.course2.a1pha.place;

import java.io.File;
import java.util.Collections;
import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

public class EducationalInstitution extends Place {

  private final File facultyOffers;

  public EducationalInstitution(
      final String name, final Address address, final File facultyOffers) {
    super(name, address);
    this.facultyOffers = facultyOffers;
  }

  @Override
  public <T extends Collections<Person>> void sendNotification(T persons) {
    NotificationService.send(facultyOffers, personList);
    System.out.printf("Training offers of %s sent to users in list\n", this);
  }

  @Override
  public String toString() {
    return String.format("Educational Institution %s", super.toString());
  }
}
