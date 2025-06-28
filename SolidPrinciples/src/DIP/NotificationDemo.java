package DIP;

public class NotificationDemo {

	public static void main(String[] args) {
		NotificationService emailService = new NotificationService(new EmailService());
		NotificationService smsService = new NotificationService(new SMSService());
		
		emailService.sendMessage("Hello from Email");
		smsService.sendMessage("Hello from SMS");
		

	}

}
