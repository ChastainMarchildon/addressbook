
package addressbook;

import java.util.ArrayList;

/**
 *  This class stores the contact info, increments the index of each array list after completion
 * @author Chastain Marchildon
 * 
 */
public class ContactList {
  ArrayList<String> names=new ArrayList<>(10);
  ArrayList<String> addresses=new ArrayList<>(10);
  ArrayList<String> numbers=new ArrayList<>(10);
  //Stores the contact Name
  /**
   * This method stores the contacts name
   * @param name to store the contacts name
   */
  public void storeName(String name){
      int i=0;
      names.add(i,name);
      i++;
  }
  /**
   * This method stores the contacts address
   * @param address string to store the contacts address
   */
  public void storeAddress(String address){
      int i=0;
      addresses.add(i,address);
      i++;
  }
  /**
   * This method stores the contacts phone number
   * @param number string to store the contacts Phone number
   */
  public void storeNumber(String number){
      int i=0;
      numbers.add(i,number);
      i++;
  } 
 
  
}
