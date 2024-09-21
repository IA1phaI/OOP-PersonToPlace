package ru.vsu.cs.course2.a1pha;

public class Location {
    private final String country;
    private final String city;

    public Location(final String country, final String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("country=%s, city=%s", country, city);
    }
}
