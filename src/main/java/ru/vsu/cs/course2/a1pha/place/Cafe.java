package ru.vsu.cs.course2.a1pha.place;

import java.io.File;
import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

public class Cafe extends Place {

  private final File menu;

  public Cafe(String name, Address address, final File menu) {
    super(name, address);
    this.menu = menu;
  }

  @Override
  public <T extends Collection<Person>> void sendNotifications(T persons) {
    NotificationService.send(menu, personList);
    System.out.printf("Menu of %s sent to users in list\n", this);
  }

  @Override
  public String toString() {
    return String.format("Cafe %s", super.toString());
  }
}
