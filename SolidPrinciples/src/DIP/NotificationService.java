package DIP;

public class NotificationService {
	
	NotificationMethod nm;
	
	public NotificationService(NotificationMethod nm) {
		this.nm = nm;
	}
	
	public void sendMessage(String msg) {
		nm.send(msg);
	}
}
