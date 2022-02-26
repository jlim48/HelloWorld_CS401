package com.company;

import com.sun.source.tree.ReturnTree;

public class Menu {

    /**
     * Displays a Menu
     * @return String
     */
    public String displayMenu() {
        return "*************************\n" +
                "Please enter your menu selection \n" +
                "a) Loading From File\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*************************";
    }

    public String filePrompt() {
        return "Enter in FileName\n";
    }

    public String removeEntryPrompt() {
        return "Enter in Last Name of contact to remove\n";
    }

    public String entryFoundPrompt() {
        return "The following entry was found in the address book.\n";
    }

    public String removeConfirmationPrompt() {
        return "Hit 'y' to remove the entry or 'm' to return to main menu\\n";
    }

    public String removeConfirmationOrSeeNextPrompt() {
        return "Hit 'y' to remove the entry, 'n' to see next entry, or 'm' to return to main menu.\n";
    }

    public String findEntryPrompt() {
        return "Enter in all or beginning of last name you wish to find:\n";
    }

    /**
     * Returns a last name prompt
     * @return string
     */
    public String prompt_LastName() {
        return "Last Name: ";
    }

    /**
     * Returns a first name prompt
     * @return string
     */
    public String prompt_FirstName() {
        return "Last Name: ";
    }

    /**
     * Returns a Street prompt
     * @return String
     */
    public String prompt_Street() {
        return "Street: ";
    }

    /**
     * Returns a State prompt
     * @return string
     */
    public String prompt_State() {
        return "State: ";
    }

    /**
     * Returns a City prompt
     * @return string
     */
    public String prompt_City() {
        return "City: ";
    }

    /**
     * Returns a zipcode prompt
     * @return string
     */
    public String prompt_Zipcode() {
        return "Zipcode: ";
    }

    /**
     * Returns a phone number prompt
     * @return string
     */
    public String prompt_Phonenumber() {
        return "Phone: ";
    }

    /**
     * Returns an email prompt
     * @return string
     */
    public String prompt_Email() {
        return "Email: ";
    }

    /**
     * Returns an invalid input prompt
     * @return string
     */
    public String invalidEntryPrompt() {
        return "Invalid input, please try again\n";
    }


}
