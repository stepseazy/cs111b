
/**
 *
 * @author hendrik.brutsaert@cs111b.ccsf
 */
import java.util.Scanner;

public class Address {

	private String name;
	private String address;
	private String phoneNumber;

	public Address() {
		update();
	}

	public Address(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void update() {

		System.out.println("Enter Name: ");
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		System.out.println("Enter Address: ");
		address = scan.nextLine();
		address = scan.nextLine();
		System.out.println("Enter phone number (integer): ");
		phoneNumber = scan.next();
	}

	public void print() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Address: ");
		System.out.println(address);
		System.out.print("phone Number: ");
		System.out.println(phoneNumber);
	}

	public String toString() {
		return (name + ',' + address + ',' + phoneNumber);

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
