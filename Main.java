//This program creates a linked list which is represented by a phonebook
//with entries for name, address, city, and phone number.
//Each entry has a unique ID

//Name: Pierce Coyle

//Date: 2/14/2024  

//Class: CS 145

//Assignment # 2 Phone book
import java.util.Scanner;
class Main {
    public static void main(String[] args) { //Handles menu and user interaction
        PhoneBookManager Manager = new PhoneBookManager();
        Scanner scan = new Scanner(System.in);
        Boolean running = true;
        //Menu Start
        System.out.println("1 - Add");
        System.out.println("2 - View contacts");
        System.out.println("3 - Modify contact");
        System.out.println("4 - Delete Contact");
        System.out.println("5 - Exit");
        String choiceStr = scan.nextLine();
        while(running) {
            String choiceLowerCase = choiceStr.toLowerCase(); //Logic for user selection
            if (choiceLowerCase.equals("1") || choiceLowerCase.equals("add")) {
                System.out.println("Enter Name:");
                String name = scan.nextLine();
                System.out.println("Enter Address:");
                String address = scan.nextLine();
                System.out.println("Enter City:");
                String city = scan.nextLine();
                System.out.println("Enter Phone Number:");
                String phoneNumber = scan.nextLine();
                ListNode node = new ListNode(name, address, city, phoneNumber);
                Manager.add(node);
            } else if (choiceLowerCase.equals("2") || choiceLowerCase.equals("view")) {
                Manager.display();
            } else if (choiceLowerCase.equals("3") || choiceLowerCase.equals("modify")) {
                System.out.println("Enter Phone Number to Edit");
                String number = scan.next();
                scan.nextLine();
                Manager.modify(number);
            } else if (choiceLowerCase.equals("4") || choiceLowerCase.equals("delete")) {
                System.out.println("Enter Number to be Deleted");
                String number = scan.next();
                scan.nextLine();
                Manager.delete(number);
            } else if (choiceLowerCase.equals("5") || choiceLowerCase.equals("exit")) {
                System.out.println("Exiting program...");
                running = false;
                break;
            } else {
                //Handles wrong input
                System.out.println("Input Invalid.");
            }
            System.out.println("1 - Add");
            System.out.println("2 - View contacts");
            System.out.println("3 - Modify contact");
            System.out.println("4 - Delete Contact");
            System.out.println("5 - Exit");
            choiceStr = scan.nextLine();
        }
    }
}