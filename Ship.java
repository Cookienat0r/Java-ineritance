//Natalia Alesencova
//CP62
class Ship
{
	private String name;
	private int year;
	
//constructor
public Ship()
{
}

public Ship(String n, int y)
{
	name = n;
	year = y;
}

public void setName(String n)
{
	name = n;
}

public void setYear(int y)
{
	year = y;
}

public String getName()
{
	return name;
}

public int getYear()
{
	return year;
}

public String toString()
{
	String shipDesc= "\nName: "+getName()+", Year built: "+getYear();
	return shipDesc;
}

//equals method
   public boolean compare(Ship A)
   {
      if(year == A.year)
      {
      return true;
      } else 
            return false;
      
   }

}








