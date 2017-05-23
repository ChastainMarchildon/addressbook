

package addressbook;

/**
 *  This class is used to define contact information and store it
 * @author Chastain Marchildon
 */
public class addContact {
    private String name;
    private String number;
    private String address;
    
    
    
    
public void setName(String name){
    this.name=name;
    
}

public String getName(){
    return name;
}
public void setAddress(String address){
    this.address=address;
}
public String getAddress(){
    return address;
}
public void setNumber(String number){
    this.number=number;
}
public String getNumber(){
    return number;
}
}
