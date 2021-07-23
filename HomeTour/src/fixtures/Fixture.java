package fixtures;

public abstract class Fixture{
//template This abstract class will be used as a base for anything that can be looked at or interacted with. 
	public String name; 
	public String shortDescription;
	public String longDescription;
	
	public Fixture (String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fixture[name =" + name + ", shortDescription=" + shortDescription + ", longDescription="
				+ longDescription + "]"; 
	}

	public String getShortDescription() {
		return shortDescription;
	}

	private void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	private void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	

}
