/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hendrik.brutsaert@cs111b.ccsf
 */
public class Hw4 {

	private static List<Object> addressBook = new ArrayList();
	private static int menuChoice;

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

	public static void addContact() throws IOException {
		addressBook.add(new Address());
		saveContacts();
	}

	public static void updateContact() throws IOException {
		Address a = (Address) addressBook.get(getContactIndex());
		a.update();
		saveContacts();
	}

	public static void deleteContact() throws IOException {
		addressBook.remove(getContactIndex() - 1);
		saveContacts();
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
		final boolean found[] = new boolean[] { false };
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

	public static void saveContacts() throws IOException {
		File file = new File("contacts.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		addressBook.forEach(address -> {
			pw.println(address.toString());
		});
		pw.close();
	}

	public static void readContacts() throws IOException {
		File file = new File("contacts.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(",", 3);
			addressBook.add(new Address(strArr[0], strArr[1], strArr[2]));
		}

	}

	public static void main(String[] args) throws Exception {
		try {
			readContacts();
		} catch (Exception e) {

		}
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
