//This program creates a linked list which is represented by a phonebook
//with entries for name, address, city, and phone number.
//Each entry has a unique ID

//Name: Pierce Coyle

//Date: 2/14/2024  

//Class: CS 145

//Assignment # 2 Phone book
import java.util.Scanner;
class PhoneBookManager { //Manages the linked list
    ListNode start; //Reference to head node
    
    public PhoneBookManager() {
        this.start = null;
    }

    void display() {//Displays the database
        if (start == null) {
            System.out.println("The PhoneBook is Empty");
            return;
        }
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
         "ID", "Name", "Address", "City", "Number");
        ListNode temp = start;
        while(temp!=null) { //Prints through linked list until end
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
            temp.id, temp.name,temp.address, temp.city, temp.phoneNumber);
            temp = temp.next;
        }
    } //End of display

    void add(ListNode newNode) { //Adds the new node
        if (start == null) { //Sets the new node
            start = newNode;
        } else { //Finds the last node
            ListNode temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    } //End of add
    
    void modify(String phoneNumber) { //Modifies an existing node based on phone number
        ListNode temp = start;
        boolean found = false;
        while(temp != null) { //Finds the entry to be modified
            if(temp.phoneNumber.equals(phoneNumber)) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (found) {
            Scanner scan = new Scanner(System.in);
            System.out.println(temp.toString());
            System.out.println("Enter Name: ");
            String name = scan.nextLine();
            System.out.println("Enter Address: ");
            String address = scan.nextLine();
            System.out.println("Enter City: ");
            String city = scan.nextLine();
            System.out.println("Enter Phone Number: ");
            String phonenumber = scan.nextLine();

            temp.name = name;
            temp.address = address;
            temp.city = city;
            temp.phoneNumber = phonenumber;

            System.out.println("Contact updated.");
        }
        else {
            System.out.println("Phone Number not Found.");
        }
    } //End of modify

    void delete(String phoneNumber) { //Deletes the user selected phone number
        if (start == null) {
            System.out.println("The PhoneBook is Empty.");
            return;
        }
    
        if(start.phoneNumber.equals(phoneNumber)) { //Checks if head node
            System.out.println("Deleted Successfully.");
            start = start.next;

            return;
        }
        ListNode temp = start;
        ListNode prev = null;
        boolean found = false;
        while(temp != null) { //Finds the node to be deleted
            if(temp.phoneNumber.equals(phoneNumber)) {
                found = true;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (found) {
            if (prev != null) //Handles deletion
                prev.next = temp.next;
            else
                start = temp.next; //If there is no prev then point to next node
            System.out.println("Deleted Successfully.");
        } else {
            System.out.println("Phone number not found.");
        }
    } //End of delete
}