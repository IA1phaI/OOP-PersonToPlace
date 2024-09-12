package ru.vsu.cs.course2.a1pha;

import java.util.regex.Pattern;

public class Address {
    private final AddressType addressType;
    private final String addressName;
    private final int houseNumber;
    private final int buildingNumber;
    private final char buildingChar;

    public Address(AddressType addressType, String addressName, int houseNumber) {
        this(addressType, addressName, houseNumber, -1);
    }

    /**
     *
     * @param houseNumber Negative equals none
     * @param buildingNumber Negative equals none
     * @param buildingChar If not a letter, sets none
     */
    public Address(AddressType addressType,
                   String addressName,
                   int houseNumber,
                   int buildingNumber,
                   char buildingChar) {
        this.addressType = addressType;
        this.addressName = addressName;
        this.houseNumber = houseNumber < 0 ? -1 : houseNumber;
        this.buildingNumber = buildingNumber < 0 ? -1 : buildingNumber;
        this.buildingChar = Pattern.matches("\\w", String.valueOf(buildingChar)) ?
                    buildingChar : 1;
    }

    /**
     *
     * @param houseNumber Negative equals none
     * @param buildingNumber Negative equals none
     */
    public Address(AddressType addressType,
                   String addressName,
                   int houseNumber,
                   int buildingNumber) {
       this(addressType, addressName, houseNumber, buildingNumber, (char) 1);
    }

    /**
     *
     * @param houseNumber Negative equals none
     * @param buildingLetter If not a letter, sets none
     */
    public Address(AddressType addressType,
                   String addressName,
                   int houseNumber,
                   char buildingLetter) {
        this(addressType, addressName, houseNumber, -1, buildingLetter);
    }

    public Address(AddressType addressType, String addressName) {
        this(addressType, addressName, -1);
    }

    @Override
    public String toString() {
        return String.format(
                "%s%s%s %s %s",
                houseNumber < 0 ? "" : houseNumber,
                buildingNumber < 0 ? "" : String.format("/%d", buildingNumber),
                buildingChar == 1 ? "" : buildingChar,
                addressType,
                addressName);
    }
}
