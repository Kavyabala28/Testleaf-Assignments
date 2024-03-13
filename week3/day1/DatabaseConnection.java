package week3.day1;

public interface DatabaseConnection {

	// Creating 3 abstract methods which is unimplemented methods
	
	public void connect();
	
	public void disconnect();
	
	public void executeUpdate();


}
