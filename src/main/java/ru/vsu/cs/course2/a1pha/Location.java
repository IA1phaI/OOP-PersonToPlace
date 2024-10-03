package ru.vsu.cs.course2.a1pha;

public record Location(String country, String city) {

  @Override
  public String toString() {
    return String.format("country=%s, city=%s", country, city);
  }
}
