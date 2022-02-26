package com.company;

public class AddressEntry {
    /**
     * Declaring variables
     */
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * 0 args AddressEntry constructor
     */
    public AddressEntry() {
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.phone = "";
        this.email = "";
    }

    /**
     * Multi args AddressEntry constuctor
     * @param firstName: First Name
     * @param lastName: Last Name
     * @param street: Street
     * @param state: State, assuming they live in the US
     * @param zip: Zip Code
     * @param phone: Phone number
     * @param email: Email
     */
    public AddressEntry(String firstName, String lastName, String street, String state, int zip, String phone,
                         String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }


    /**
     * Returns first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns street
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns state
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns zip
     * @return zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets zip
     * @param zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Returns phone number
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns email address
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email address
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method to compare AddressEntries. First compares lastName, and if necessary, compares firstName
     * @param differentAddressEntry
     * @return
     */
    public int compareTo(AddressEntry differentAddressEntry) {
        int compareValue = this.lastName.compareTo(differentAddressEntry.lastName);
        if (compareValue == 0 ) {
            return this.firstName.compareTo(differentAddressEntry.firstName);
        }
        return compareValue;
    }

}

