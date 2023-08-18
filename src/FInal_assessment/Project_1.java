/**
 * 
 */
package FInal_assessment;

import java.util.*;
/**
 * @author Mark Roel Andaya
 *
 */
public class Project_1 {

	public static void main(String[] args) {
		ArrayList <Double> list = new ArrayList <Double>();
		Scanner in = new Scanner(System.in);
		boolean confirmation = false;
		String decision = "";
		double total = 0;
		
		do{
		    System.out.print("Enter price of an Item:  ");
	    	list.add(in.nextDouble());
		    System.out.print("Do you want to proceed (Yes/No):  ");
		    decision = in.next();
		    if(decision.equalsIgnoreCase("no")) {
		    	System.out.print("\nPrices of an Item:  ");
			    for(int i = 0; i < list.size(); i++) {
			            String number = list.get(i).toString();
			            System.err.print(number + ", ");
			    }
			    for(int i = 0; i < list.size(); i++) {
			            total += list.get(i);
			    }
			    System.err.print("\nTotal Price:  " + total);
			    System.exit(0);
		    }
		}while(decision.equalsIgnoreCase("yes"));
		
	    
	    
	} 
}
