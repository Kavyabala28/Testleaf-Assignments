package week3.day1;

public class Concrete implements DatabaseConnection{

   // Providing implementations for abstract methods by implements the "DatabaseConnection" Interface
	
	public void connect() {
		System.out.println("I am used to connect the database");
	}


	public void disconnect() {
		System.out.println("I am used to disconnect the database");
	}

	
	public void executeUpdate() {
		System.out.println("I am used to execute the updated queries");
	}
	
	public static void main(String[] args) {
		Concrete con = new Concrete();
		con.connect();
		con.disconnect();
		con.executeUpdate();
	}

}
