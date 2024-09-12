package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

public class ShoppingMall extends Place {
    public ShoppingMall(String name, Address address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return String.format("Shopping and Entertainment Center %s", super.toString());
    }
}
