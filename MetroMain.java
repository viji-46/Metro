package MetroGuider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MetroMain {

	public static void main(String[] args) throws Exception {
		
		  
		Scanner scan = new Scanner(System.in);
		int choice ;																
		Implementation imp = new Implementation();
		while(true) { 
			System.out.println("WELCOME TO CHENNAI METRO STATION");
			System.out.println();
			System.out.println("1. BOOK TICKET \n2. DISPLAY BOOKED TICKET \n3. SEE ROUTE  \n4. EXIT");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
				
				System.out.println();
				imp.bookTicket();
				System.out.println();
				System.out.println("TICKET BOOKED SUCCESFULLY !");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
				break; 
				
			case 2: 
				System.out.println("---------------------------------------------------");
				imp.disply();
				System.out.println("---------------------------------------------------");
				break;
			case 3: 
				imp.seeRoute();
				//System.exit(0);
					break;												// WASHERMANPET  ST.THOMAS MOUNT

			case 4:
				System.exit(0);
			default :
				System.out.println("INVALID INPUT ");
				System.out.println();
				//System.exit(0);
			}
		}

	}
	
	
}
