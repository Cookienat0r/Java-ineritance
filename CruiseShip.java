//Natalia Alesencova
//CP62
class CruiseShip extends Ship
{
	private int passMax;
	private int numReserve; 
	
	public CruiseShip(String n, int y, int p, int r)
	{
		super(n,y);
		passMax = p;
		numReserve = r;
	}

	public void setMax(int p)
	{
		passMax = p;
	}

	public void setReserve(int r)
	{
		numReserve = r;
	}

	public int getMax()
	{
		return passMax;
	}

	public int getReserve()
	{
		return numReserve;
	}
	
	public String toString()
	{
		String cruiseShipDesc = "\nName: "+getName()+ "\nYear built: "+getYear()+"\nNumber of passengers: "+getMax()+"\nNumber of reservations: " +getReserve()+".";
		return cruiseShipDesc;
	}
   
   //equals method
   public boolean compare(CruiseShip A)
   {
      if(passMax == A.passMax)
      {
      return true;
      } else 
            return false;
      
   }
   public boolean compareRes(CruiseShip A)
   {
      if(numReserve == A.numReserve)
      {
      return true;
      } else 
            return false;
      
   }

}
