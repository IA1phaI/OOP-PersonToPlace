package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

import java.io.File;
import java.util.List;

public class ShoppingMall extends Place {

    private final File adds;

    public ShoppingMall(final String name, final Address address, final File adds) {
        super(name, address);
        this.adds = adds;
    }

    public void sendAdd(List<Person> persons){
        NotificationService.sendNotification(adds, persons);
        System.out.printf("Adds were sent to all persons in %s", this);
    }

    @Override
    public String toString() {
        return String.format("Shopping and Entertainment Center %s", super.toString());
    }
}
