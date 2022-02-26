package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressBookApplication {
    static Menu mainMenu = new Menu();
    static Scanner userInput = new Scanner(System.in);

    public static void main (String args[]) {
        AddressBook ab = new AddressBook();
        boolean quit = false;

        while (!quit) {
            System.out.println(mainMenu.displayMenu());
            String input = userInput.nextLine();
            switch (input) {
                case "a":
                    loadFile(ab);
                    break;
                case "b":
                    addEntry(ab);
                    break;
                case "c":
                    removeEntry(ab);
                    break;
                case "d":
                    findEntry(ab);
                    break;
                case "e":
                    ab.list();
                    break;
                case "f":
                    quit = true;
                    break;
                default:
                    System.out.println(mainMenu.invalidEntryPrompt());
                    break;
            }
        }
    }

    /**
     * Prompts user for fileName, and attempts to read it.
     * If unsuccessful, failure prompt is issued to user.
     * @param ab
     */
    public static void loadFile(AddressBook ab) {
        System.out.println(mainMenu.filePrompt());
        String fileName = userInput.nextLine();
        fileName = "src/" + fileName;

        try {
            ab.readFile(fileName);
        } catch (Exception e) {
            System.out.println("Failed to read file.\n");
        }
    }

    public static void addEntry(AddressBook ab) {
        System.out.println(mainMenu.prompt_FirstName());
        String firstName = userInput.nextLine();

        //last name entry
        System.out.println(mainMenu.prompt_LastName());
        String lastName = userInput.nextLine();

        //Street entry
        System.out.println(mainMenu.prompt_Street());
        String street = userInput.nextLine();

        //City entry
        System.out.println(mainMenu.prompt_City());
        String city = userInput.nextLine();

        //State entry
        System.out.println(mainMenu.prompt_State());
        String state = userInput.nextLine();

        //Zip entry
        boolean invalidInput = true;
        int zipCode = 0;
        while (invalidInput){
            System.out.println(mainMenu.prompt_Zipcode());
            try{
                // Will throw error if there are values other than integers in input
                zipCode = Integer.parseInt(userInput.nextLine());
                invalidInput = false;
            } catch(NumberFormatException e) {
                System.out.println("Invalid input: Please insert all numbers");
            }
        }
    }

    public static void removeEntry(AddressBook ab) {
        System.out.println(mainMenu.removeEntryPrompt());
        String lastNameToRemove = userInput.nextLine();
        List<AddressEntry> findEntry = ab.findEntry(lastNameToRemove);
        if (findEntry.size() == 0) {
            System.out.println("Last Name not found. Try again. (y/n)");
            String userResponse = userInput.nextLine();
            if (userResponse.equals("y")) {
                removeEntry(ab);
            } else if (userResponse.equals("n")) {
                return;
            } else {
                System.out.println(mainMenu.invalidEntryPrompt());
            }
        }

        for (AddressEntry i : findEntry) {
            System.out.println(i);

            if (findEntry.size() > 1) {
                System.out.println(mainMenu.removeConfirmationOrSeeNextPrompt());
            } else {
                System.out.println(mainMenu.removeConfirmationPrompt());
            }

            switch (userInput.nextLine()) {
                case "y":
                    ab.remove(i);
                    break;
                case "n":
                    break;
                case "m":
                    return;
                default:
                    System.out.println(mainMenu.invalidEntryPrompt());
                    break;
            }
        }
    }

    public static void findEntry(AddressBook ab) {
        System.out.println(mainMenu.findEntryPrompt());
        String lastNameSearch = userInput.nextLine();
        List<AddressEntry> entriesFound = ab.findEntry(lastNameSearch);

        if (entriesFound.size() == 0) {
            System.out.println("No entries found.");
        } else {
            if (entriesFound.size() == 1) {
                System.out.println("The following entry was found in the address book with last name: " + lastNameSearch);
            } else {
                System.out.println(entriesFound.size() + " entries were found in the address book with last name: " + lastNameSearch);
            }
            for (AddressEntry i : entriesFound) {
                System.out.println(i);
            }
        }
}



}