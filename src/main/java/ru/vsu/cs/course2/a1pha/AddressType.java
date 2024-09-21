package ru.vsu.cs.course2.a1pha;

public enum AddressType {
    STREET,
    ROAD,
    AVENUE,
    LANE,
    BOULEVARD,
    SQUARE;

    @Override
    public String toString() {
        String out = "";
        switch (this) {
            case STREET -> out = "St.";
            case ROAD -> out = "Rd.";
            case AVENUE -> out = "Ave.";
            case LANE -> out = "Ln.";
            case BOULEVARD -> out = "Blvd.";
            case SQUARE -> out = "Sq.";
        }
        return out;
    }
}
