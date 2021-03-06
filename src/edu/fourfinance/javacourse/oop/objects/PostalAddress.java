package edu.fourfinance.javacourse.oop.objects;

/*
Design a class PostalAddress providing fields like city, street, house number etc.// DONE
Equip the class with appropriate constructors, setters and getters.// DONE
Then enrich the class with methods asEuroStyle(), asUKStyle(), asRussianStyle(),
which return a String consisting of all address fields as it is used in continental Europe (street with house number, then city),
in the UK (house number before the street name) or in Russia (first city, then street, then house number).

 */

public class PostalAddress {

    private String city;
    private String street;
    private String houseNumber;

    PostalAddress(String city, String street, String houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String[] getAddress() {
        String[] address = new String[3];

        address[0] = city;
        address[1] = street;
        address[2] = houseNumber;

        return address;
    }

    // is this necessary if we have a constructor? Need to create separate 3 setters?
    public void setAddress(String city, String street, String houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    /**
     * street with house number, then city
     * @return full concatenated address
     */

    String asEuroStyle() {
        return street+", "+houseNumber+", "+city;
    }

    /**
     * house number before the street name
     * @return full concatenated address
     */

    String asUKStyle() {
        return houseNumber+", "+street+", "+city;
    }

    /**
     * first city, then street, then house number
     * @return full concatenated address
     */

    String asRussianStyle() {
        return city+", "+street+", "+houseNumber;
    }

}
