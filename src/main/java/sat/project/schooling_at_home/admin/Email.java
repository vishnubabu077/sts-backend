package sat.project.schooling_at_home.admin;

public class Email extends Message {
	

	@Override
	public void sendBasicMessage() {
		System.out.println("basicmessagefromemail");
		//super.sendBasicMessage();
	}
	
	public void sendEmail(String message) {
		System.out.println(message + "email");
	}
	
	public void sendEmail(String message,String st2) {
		System.out.println(message + "email");
	}
	
	
}
