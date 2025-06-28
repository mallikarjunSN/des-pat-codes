package DIP;

public class EmailService implements NotificationMethod {

	@Override
	public void send(String msg) {
		System.out.println("Email Message : "+msg);
	}

}
