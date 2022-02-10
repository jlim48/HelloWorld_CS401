package com.company;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    public void list() {
        for (AddressEntry addressEntry:addressEntryList) {
            System.out.println(addressEntry);
        }

    }

    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }
    public void initAddressBookExercise() {
        //Create an object of AddressEntry
        AddressEntry addressEntry1=new AddressEntry("Jong", "Lim", "Peace", "California", 94402, "9315793", "jonglim@gmail.com");
        addressEntry1.setCity("Hayward");
        AddressEntry addressEntry2=new AddressEntry("Testing", "Personage", "Tier", "California", 94404, "123456", "testing@testing.com");
        addressEntry2.setCity("San Fran");
        //Call add method
        add(addressEntry1);
        add(addressEntry2);
        //Call list method
        list();
    }
}
