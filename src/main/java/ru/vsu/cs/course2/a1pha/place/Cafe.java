package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

import java.io.File;
import java.util.List;

public class Cafe extends Place {

    private final File menu;

    public Cafe(String name, Address address, final File menu) {
        super(name, address);
        this.menu = menu;
    }

    public void sendMenuTo(List<Person> persons){
        NotificationService.sendNotification(menu, persons);
        System.out.printf("Menu sent to all users in %s\n", this);
    }

    @Override
    public String toString() {
        return String.format("Cafe %s", super.toString());
    }
}
