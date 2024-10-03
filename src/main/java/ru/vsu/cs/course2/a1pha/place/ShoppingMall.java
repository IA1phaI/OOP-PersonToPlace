package ru.vsu.cs.course2.a1pha.place;

import java.io.File;
import java.util.Collection;

import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

public class ShoppingMall extends Place {

  private final File adds;

  public ShoppingMall(final String name, final Address address, final File adds) {
    super(name, address);
    this.adds = adds;
  }

  @Override
  public <T extends Collection<Person>> void sendNotifications(T persons) {
    NotificationService.send(adds, persons);
    System.out.printf("Adds were sent to all persons in list %s\n", this);
  }

  @Override
  public String toString() {
    return String.format("Shopping and Entertainment Center %s", super.toString());
  }
}
