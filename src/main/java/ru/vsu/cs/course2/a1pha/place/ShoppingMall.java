package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

import java.io.File;
import java.util.List;

public class ShoppingMall extends Place {

    private final List<File> adds;

    public ShoppingMall(final String name, final Address address, final List<File> adds) {
        super(name, address);
        this.adds = adds;
    }

    public List<File> sendAdd(){
        return adds;
    }

    @Override
    public String toString() {
        return String.format("Shopping and Entertainment Center %s", super.toString());
    }
}
