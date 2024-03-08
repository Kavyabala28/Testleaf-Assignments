package week2.day4;

public class APIClient {

	// ----------Method Overloading------------
	
	// "sendRequest" Method with one argument
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint : " + endpoint);
		System.out.println("------------------------------------------");
	}

	// "sendRequest" Method with three arguments
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println("Endpoint : " + endpoint);
		System.out.println("Request Body :" + requestBody);
		System.out.println("Request Status : " + requestStatus);
	}

	public static void main(String[] args) {

		APIClient api = new APIClient();
		api.sendRequest("https://swagger.io/");
		api.sendRequest("https://validator.swagger.io/", "'username' : xxx", "Success");

	}

}
