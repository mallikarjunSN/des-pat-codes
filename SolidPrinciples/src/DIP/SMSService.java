package DIP;

public class SMSService implements NotificationMethod {

	@Override
	public void send(String msg) {
		System.out.println("SMS Message : "+msg);

	}

}
