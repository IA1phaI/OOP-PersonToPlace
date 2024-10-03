package ru.vsu.cs.course2.a1pha.place;

import java.io.File;
import java.util.Collection;
import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

public class Park extends Place {

  private File sights;

  public Park(final String name, final Address address, final File sights) {
    super(name, address);
    this.sights = sights;
  }

  @Override
  public <T extends Collection<Person>> void sendNotifications(T persons) {
    NotificationService.send(sights, personList);
    System.out.printf("Sights to visit are sent to all persons in %s\n", this);
  }

  @Override
  public String toString() {
    return String.format("Park %s", super.toString());
  }
}
