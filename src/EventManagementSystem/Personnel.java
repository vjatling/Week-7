package EventManagementSystem;

public abstract class Personnel implements EventManagementInterface {

	private String name;
    private String email;
    private int number;
	
    public Personnel(String n,  String e, int num){
        setName(n);
        setEmail(e);
        setNumber(num);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
    public String display() {
        return ("Name: " + getName() + 
                "\nEmail Address: " + getEmail() +
                "\nMobile Number: " + getNumber());
    }
    
}
