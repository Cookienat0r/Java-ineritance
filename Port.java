//Natalia Alesencova
//CP62
import java.util.*;
public class Port
{public static void main(String[] args)
 { 
   System.out.println("***Ships***");
 	Ship Pearl = new Ship("Black Pearl",2006 );
	System.out.println(Pearl.toString());
   Ship Dutchman = new Ship("Flying Dutchman", 1999);
   System.out.println(Dutchman.toString());
   
   System.out.println("\nComparing years: " +Pearl.compare(Dutchman));
	
   System.out.println("\n***Cruise Ships*** ");
	CruiseShip Carnival = new CruiseShip("Carnival Breeze", 2010, 3619, 2500);
	System.out.println(Carnival.toString());
   CruiseShip Royal = new CruiseShip("Royal Caribbean International", 1969, 2599, 1700);
   System.out.println(Royal.toString());
   
   System.out.println("\nComparing number of passengers: "+Carnival.compare(Royal));
   System.out.println("Comparing number of reservation: "+Carnival.compareRes(Royal));
   
   System.out.println("\n***Cargo Ships*** ");
   CargoShip Colombo = new CargoShip("Colombo Express", 2005, 93750, 7000);
   System.out.println(Colombo.toString());
   CargoShip Altmark = new CargoShip("Altmark", 1937, 65800, 7000);
   System.out.println(Altmark.toString());
   
   System.out.println("\nComparing max tonnage: "+Colombo.compare(Altmark));
	
	Ship[] ShipArray = new Ship[6];
	for (int i=0; i<6; i++)
		{if(i<3)
			{ShipArray[i] = new CruiseShip("Cruise "+(i+1), 200+(i+1), 300+(i+1), 400+(i+1));
			}
			
		if(i>2)
		 	{ShipArray[i] = new CargoShip("Cargo "+(i+1),  200+(i+1), 300+(i+1), 400+(i+1));
			}
		}	
   }		
}

