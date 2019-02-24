/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hendrik.brutsaert@cs111b.ccsf
 */
public class Hw4 {

    static List<Object> addressBook = new ArrayList();
    static int menuChoice;

    public static int getMenuChoice() {
        System.out.println("Menu: ");
        System.out.println("1. Add a new contact ");
        System.out.println("2. Update an existing contact");
        System.out.println("3. Delete a contact ");
        System.out.println("4. List all added contacts in sorted order");
        System.out.println("5. Search for a given contact");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static boolean getContinue() {
        System.out.println("Continue? (y/n) ");
        Scanner scan = new Scanner(System.in);
        return (scan.next().charAt(0) == 'y');
    }

    public static int getContactIndex() {
        System.out.println("Which contact number? ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void addContact() {
        addressBook.add(new Address());
    }

    public static void updateContact() {
        Address a = (Address) addressBook.get(getContactIndex());
        a.update();
    }

    public static void deleteContact() {
        addressBook.remove(getContactIndex() - 1);
    }

    public static void listContacts() {
        addressBook.sort((a, b) -> ((Address) a).getName().compareTo(((Address) b).getName()));
        addressBook.forEach(a -> {
            ((Address) a).print();
        });
    }

    public static void searchForContact() {
        System.out.println("Contact Name? ");
        Scanner scan = new Scanner(System.in);
        String response = scan.next();
        final boolean found[] = new boolean[]{false};
        addressBook.forEach(a -> {
            if (response.equals(((Address) a).getName())) {
                ((Address) a).print();
                found[0] = true;
            }
        });
        if (!found[0]) {
            System.out.println("Not Found ");
        }
    }

    public static void main(String[] args) {

        do {
            menuChoice = getMenuChoice();
            switch (menuChoice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;

                case 4:
                    listContacts();
                    break;
                case 5:
                    searchForContact();
                    break;
            }

        } while (getContinue());
    }

}
