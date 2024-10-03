package ru.vsu.cs.course2.a1pha;

public class Person {
  private static long lastID = 0;

  private final long id;
  private final String name;

  public Person(String name) {
    this.name = name;
    this.id = lastID++;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("Person %s (person_id=%d)", name, id);
  }
}
