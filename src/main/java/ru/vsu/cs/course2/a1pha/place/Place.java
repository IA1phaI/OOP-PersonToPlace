package ru.vsu.cs.course2.a1pha.place;

import java.io.File;
import java.util.Collection;
import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

public class Place {
  private static long lastID = 0;
  private static final File RULES = new File("");

  private final long id;
  private final String name;
  private final Address address;

  public Place(final String name, final Address address) {
    this.id = lastID++;
    this.name = name;
    this.address = address;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

  public <T extends Collection<Person>> void sendNotifications(T persons) {
    NotificationService.send(RULES, persons);
    System.out.printf("Rules list sent to all persons in %s\n", this);
  }

  @Override
  public String toString() {
    return String.format("\"%s\" (place_id=%d, address=\"%s\")", name, id, address);
  }
}
