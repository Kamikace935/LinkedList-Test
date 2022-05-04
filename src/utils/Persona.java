package utils;

public class Persona 
{
	private String name;
	
	public Persona(String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String toString()
	{
		return getName();
	}

	@Override
	public boolean equals(Object obj) 
	{
		
		return super.equals(obj);
	}
	
	
	
}
