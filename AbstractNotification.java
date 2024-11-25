import java.util.Date;
import java.util.UUID;

public abstract class AbstractNotification implements NotificationInterface {
    protected String notificationId; // Unique ID for the notification
    // The user who receives the notification
    protected User targetUser;  
    // The notification message     
    protected String message;    
     // The time when the notification was created    
    protected Date timestamp;  
     // Whether the notification has been read     
    protected boolean isRead;       

    // Constructor to initialize common fields
    public AbstractNotification(User targetUser, String message) {
        this.notificationId = UUID.randomUUID().toString(); // Generate unique ID
        this.targetUser = targetUser;
        this.message = message;
        this.timestamp = new Date();  // Set the current timestamp
        this.isRead = false;          // Default to unread
    }

    @Override
    public String getNotificationId() {
        return notificationId;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public User getTargetUser() {
        return targetUser;
    }

    @Override
    public boolean isRead() {
        return isRead;
    }

    @Override
    public void markAsRead() {
        this.isRead = true; // Mark the notification as read
    }

    // Abstract method to be implemented by subclasses
    @Override
    public abstract void send();
}
