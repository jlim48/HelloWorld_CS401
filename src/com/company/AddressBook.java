package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AddressBook {
    private ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * Prints a list of all entries.
     */
    public void list() {
        for (AddressEntry addressEntry:addressEntryList) {
            System.out.println(addressEntry);
        }
    }

    /**
     * Add an addressEntry to addressEntryList
     * @param newEntry new Entry
     */
    public void add(AddressEntry newEntry) {
        addressEntryList.add(newEntry);
    }

    /**
     * Removes entry delEntry from addressEntryList
     * @param delEntry
     */
    public void remove(AddressEntry delEntry) {
        addressEntryList.remove(delEntry);
    }

    /**
     * Search function that returns all entrys with last name findName
     * @param findName
     * @return index
     */
    public List<AddressEntry> findEntry(String findName) {
        List<AddressEntry> index = new ArrayList<>();
        for (AddressEntry i : addressEntryList) {
            if (i.getLastName().contains(findName)) {
                index.add(i);
            }
        }
        return index;
    }

    /**
     * Retrieves a file from user input and stores all entries from respective file into addressEntryList.
     * @param fileName
     * @throws FileNotFoundException
     */
    public void readFile(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner myScanner = new Scanner(myFile);

        while (myScanner.hasNextLine()) {
            AddressEntry newAddress = new AddressEntry(
                    myScanner.nextLine(), //firstName
                    myScanner.nextLine(), //lastName
                    myScanner.nextLine(), //Street
                    myScanner.nextLine(), //State
                    Integer.parseInt(myScanner.nextLine()), //Zipcode
                    myScanner.nextLine(), //Phone Number
                    myScanner.nextLine()  //Email
            );
            this.add(newAddress);
        }

    }
}
