package sat.project.schooling_at_home.admin;

public class Message {
	
public static void main(String[] args) {
	
	Vehicle v1 = new Bike();
	Vehicle v2 = new Car();
	
	Message.applyBrake(v1);
	Message.applyBrake(v2);
	
	
	
	
	
	Message message = new Message();

//	
//	Email email = new Email();
//	email.sendBasicMessage();
//	email.sendEmail("email");
	

	message.polymorphism(new Email());
	message.polymorphism(new Message());
	
	Message message1 = new Message();
	Message message2 = new Email();
	Message message3 = new Testmessage();
	
	
	
	
	String a = "Vishnu";
	String b = "Vishnu";
	String c = "Vishnu";
	
	StringBuffer sb = new StringBuffer();
	sb.append("Vishnu");
	sb.append("Sruthy");
	System.out.println(sb.toString());
	
	 a.concat("Sruthy");
	
	
	String d = new String("vishnu");
	String e = new String("vishnu");
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
	
	System.out.println(a);
	
	System.out.println(d==e);
	System.out.println(d.equals(e));
	
	
	
}


public static void applyBrake(Vehicle v) {
	
	v.brakeApplied();
	
}

public void polymorphism(Message messageclass) {
	
	messageclass.sendBasicMessage();
}
	
	
	
	public void sendBasicMessage() {
		System.out.println("basicmessage");
	}
	
	

}
