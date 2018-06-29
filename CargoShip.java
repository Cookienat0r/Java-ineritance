//Natalia Alesencova
//CP62
class CargoShip extends Ship
{
	double capacity;
	int tons;       // # of tons carrying

	public CargoShip(String n, int y, double c, int t)
	{
		super(n,y);
		capacity = c;
		tons = t;
	}
	
	public void setCap(double c)
	{
		capacity = c;
	}
	
	public void setTonnage(int t)
	{
		tons = t;
	}
	
	public double getCap()
	{
		return capacity;
	}
	
	public int getTonnage()
	{
		return tons;
	}
	
	public String toString()
	{
		String cargoShipDesc = ("\nName: "+getName()+"\nYear built: "+getYear()+"\nCapacity: "+getCap()+"\nTonnage: "+getTonnage());
      return cargoShipDesc;
	}
 
 
 //equals method  
    public boolean compare(CargoShip A)
   {
      if(tons == A.tons)
      {
      return true;
      } else 
            return false;  
   }
	
	public boolean fullCapacity(double c)
	{
		if(getCap() == getTonnage())
		return true;
		else
		return false;
	}
}


