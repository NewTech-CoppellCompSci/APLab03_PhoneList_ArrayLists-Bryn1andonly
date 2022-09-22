package phoneList;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact{
    private String Name;
    private int Number;

    public Contact(String Name, int Number){
        this.Name = Name;
        this.Number = Number;
    }
    
}
