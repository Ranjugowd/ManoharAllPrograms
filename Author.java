class Author{
	static String name;
	String FirstName;
	String LastName;

	Author(String firstname,String lastname){
		FirstName=firstname;
		LastName=lastname;		
	}
	public void setFirstName(String firstname){
		FirstName=firstname;
	}
	public void setLastName(String lastname){
		LastName=lastname;
	}
	public String getFirstName(String firstname){
		return firstname;
	}
	public String getLastName(String lastname){
		return lastname;
	}
	public String toString(){
		return FirstName+" "+LastName;
	}
}