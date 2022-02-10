package com.company;

public class AddressBookApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Create instance of Class Menu
        Menu myMenu = new Menu();

        //Menu Prompts
        System.out.println(myMenu.prompt_FirstName());
        System.out.println(myMenu.prompt_LastName());
        System.out.println(myMenu.prompt_Street());
        System.out.println(myMenu.prompt_City());
        System.out.println(myMenu.prompt_State());
        System.out.println(myMenu.prompt_Zip());
        System.out.println(myMenu.prompt_Telephone());
        System.out.println(myMenu.prompt_Email());

    }
}
