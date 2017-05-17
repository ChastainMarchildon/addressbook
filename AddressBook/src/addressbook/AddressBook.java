package addressbook;

import java.util.Arrays;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * This application creates an address book to store contact information, allow
 * searching and displaying, as well as deleting of info.
 *
 * @author Chastain Marchildon
 * @version 1.0
 * @since May 16th 2017
 */
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create an option panel
        Scanner input = new Scanner(System.in);
        boolean done = false;
        boolean validInput = false;
        int choice;
        int adder = 1;
        addContact add = new addContact();
        ContactList clist = new ContactList();
        JOptionPane dialog = new JOptionPane();
        JOptionPane prompt = new JOptionPane();
        JOptionPane.showMessageDialog(null, "Select an option: \n 1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit");
        System.out.println("Make a selection");
        choice = input.nextInt();
        /**
         * if(input.hasNextInt()){ choice=input.nextInt(); validInput=true;
         * }//end of if
         *
         */
        while (!done) {

            if (choice == 1) {
                //add a contact
                //Gets user input and stores it into an Array list of contact info.
                //Increments based on how many contacts the user wants to add
                for (int i = 0; i < adder; i++) {
                    add.setName(JOptionPane.showInputDialog(null, "Enter a contact name", "Add Contact", 1));
                    clist.storeName(add.getName());

                    add.setNumber(JOptionPane.showInputDialog(null, "Enter a contact phone number", "Add Contact", 1));
                    clist.storeNumber(add.getNumber());

                    add.setAddress(JOptionPane.showInputDialog(null, "Enter a contact Address", "Add Contact", 1));
                    clist.storeAddress(add.getAddress());

                    int reply = JOptionPane.showConfirmDialog(null, "Add another Contact?", "Add another Contact", 1);
                    if (reply == JOptionPane.YES_OPTION) {
                        adder++;
                    }//end of if
                    else{
                        JOptionPane.showMessageDialog(null, "Select an option: \n 1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit");
                        System.out.println("Make a selection");
                        choice=input.nextInt();
                    }
                }//end of for
                

            } else if (choice == 2) {
                //delete a contact
            } else if (choice == 3) {
                //search contacts
               String search= JOptionPane.showInputDialog(null, "Search Contacts", "Enter info", 1);
                if(clist.names.contains(search)){
                    int index=clist.names.indexOf(search);
                    System.out.println(clist.names.get(index));
                    System.out.println(clist.numbers.get(index));
                    System.out.println(clist.addresses.get(index));
                }
                else{
                    JOptionPane.showMessageDialog(null, "404", "Contact not found!", 0);
                }
                done=true;
            } else if (choice == 4) {
                //display all contacts*/
                System.out.println(clist.names);
                System.out.println(clist.numbers);
                System.out.println(clist.addresses);
                done=true;
            } else if (choice == 0) {
                System.exit(0);
            }

        }//end of while

    }//end of main

}//end of class

