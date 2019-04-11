
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author hendrik.brutsaert@cs111b.ccsf
 */
public class AddressBook {

	private static int menuChoice;
	private static DBConnection DB;

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
		System.out.println("Which ID number? ");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public static void addContact() throws IOException {
		System.out.println("Enter Name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Enter Address: ");
		String address = scan.nextLine();
		address = scan.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scan.next();

		try {
			DB.insert(name, address, phone);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void updateContact() throws IOException {
		System.out.println("Enter ID: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		System.out.println("Enter New Name: ");
		String name = scan.next();
		System.out.println("Enter New Address: ");
		String address = scan.nextLine();
		address = scan.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scan.next();

		DB.update(id, name, address, phone);
	}

	public static void deleteContact() throws IOException {
		DB.remove(getContactIndex());
	}

	public static void searchForContact() {
		System.out.println("Enter Name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		DB.search(name);
	}

	public static void main(String[] args) throws Exception {

		DB = new DBConnection();
		DB.createDatabase();
		DB.dropTable();
		DB.createTable();
		System.out.println("*******************************************************");
		DB.insert("Don Trump", "1 Whitehouse rd", "1-800-president");
		DB.insert("Barry Obama", "1 Democrat way", "1-800-govlawyer");
		DB.insert("George Bush", "1 Republican St", "1-800-juniorb");
		try {
			DB.viewTable();
		} catch (Exception e) {

		}
		System.out.println("*******************************************************");
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
				DB.viewTable();
				break;
			case 5:
				searchForContact();
				break;
			}

		} while (getContinue());
	}

}
