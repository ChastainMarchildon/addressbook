package addressbook;
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
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit", "Make A Selection3", 1));
    
        if(choice>=0&&choice<5){ 
        while (!done) {

            switch (choice) {
                case 1:
                    //add a contact
                    //Gets user input and stores it into an Array list of contact info.
                    //Increments based on how many contacts the user wants to add
                    for (int i = 0; i < adder; i++) {
                        add.setName(JOptionPane.showInputDialog(null, "Enter a contact name", "Add Contact", 1));
                        clist.storeName(add.getName().toUpperCase());

                        add.setNumber(JOptionPane.showInputDialog(null, "Enter a contact phone number", "Add Contact", 1));
                        clist.storeNumber(add.getNumber());

                        add.setAddress(JOptionPane.showInputDialog(null, "Enter a contact Address", "Add Contact", 1));
                        clist.storeAddress(add.getAddress().toUpperCase());

                        int reply = JOptionPane.showConfirmDialog(null, "Add another Contact?", "Add another Contact", 1);
                        if (reply == JOptionPane.YES_OPTION) {
                            adder++;
                        }//end of if
                        else {
                            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit", "Make A Selection3", 1));
                        }
                    }//end of for
                    break;

                case 2: {
                    //delete a contact
                    //Currently developing Swing skills in order to add a back/home button
                    //Checks through each array and and returns the index for the inputted data, uses that index to delete all related info to that contact
                    String delete = JOptionPane.showInputDialog(null, "Delete Contact", "Enter info", 1).toUpperCase();
                    int index;
                    if (clist.names.contains(delete)) {
                        index = clist.names.indexOf(delete);
                        clist.deleteContact(index, clist);

                    }//of if
                    else if (clist.numbers.contains(delete)) {
                        index = clist.numbers.indexOf(delete);
                        clist.deleteContact(index, clist);
                    }//else if
                    else if (clist.addresses.contains(delete)) {
                        index = clist.addresses.indexOf(delete);
                        clist.deleteContact(index, clist);
                    }//else if
                    else{
                        JOptionPane.showMessageDialog(null,"Contact not found, returning to menu");
                        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit", "Make A Selection3", 1));
                    }
                }//of case 2
                break;
                case 3: {
                    //search contacts
                    //Enter contact name, number or address and return all related info
                    //Brute force approach, not sure how else to approach this
                    int index;
                    //Currently developing Swing skills in order to add a back/home button
                    String search = JOptionPane.showInputDialog(null, "Search Contacts", "Enter info", 1).toUpperCase();
                    if (clist.names.contains(search)) {
                        index = clist.names.indexOf(search);
                        clist.searchContact(index, clist);

                    }//of if
                    else if (clist.numbers.contains(search)) {
                        index = clist.numbers.indexOf(search);
                        clist.searchContact(index, clist);
                    }//else if
                    else if (clist.addresses.contains(search)) {
                        index = clist.addresses.indexOf(search);
                        clist.searchContact(index, clist);
                    }//else if
                    else {
                        JOptionPane.showMessageDialog(null, "404", "Contact not found!", 0);
                        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit", "Make A Selection3", 1));
                    }//of else
                    
                    break;
                }//of case 3

                case 4: {
                    //display all contacts*/
                    System.out.println(clist.names);
                    System.out.println(clist.numbers);
                    System.out.println(clist.addresses);
                    //done = true;
                    choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Add Contact \n 2- Delete Contact \n 3- Search Contacts \n 4- Display all contacts \n 0 - Exit", "Make A Selection3", 1));
                    break;
                }//of case 4
                case 5: {
                    System.exit(0);
                    done=true;
                    break;
                }//of case 5

            }//end of while
        }//of switch
    }//of input validation

    }//end of main

}//end of class

