//This program creates a linked list which is represented by a phonebook
//with entries for name, address, city, and phone number.
//Each entry has a unique ID

//Name: Pierce Coyle

//Date: 2/14/2024  

//Class: CS 145

//Assignment # 2 Phone book
import java.util.Scanner;
class ListNode { //Represents a node in the linked list
    private static int count = 0; //count for the unique ID
    int id; //Unique ID for the list
    String name;
    String address;
    String city;
    String phoneNumber;
    ListNode next; 

    public String toString() { //Returns a string representation of the node
        return String.format("%-20s%-20s%-20s%-20s%s%-20s%-20s%-20s%-20s%-20s",
        "ID", "Name", "Address", "City", "Number\n", id, name, address, city, phoneNumber);
    } //End of toString

    //Initializes a new node with given values
    public ListNode(String name, String address, String city, String phoneNumber) {
        this.id = ++count;
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    } //End of constructor ListNode
}