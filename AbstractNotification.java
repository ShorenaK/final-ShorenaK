import java.util.Date;
import java.util.UUID;

public abstract class AbstractNotification implements NotificationInterface {
    protected String notificationId;
    protected User targetUser;
    protected String message;
    protected Date timestamp;
    protected boolean isRead;

    public AbstractNotification(User targetUser, String message) {
        this.notificationId = UUID.randomUUID().toString(); 
        this.targetUser = targetUser;
        this.message = message;
        this.timestamp = new Date(); 
        this.isRead = false;        
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
        this.isRead = true;
    }
}
