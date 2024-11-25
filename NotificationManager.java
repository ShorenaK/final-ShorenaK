import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    // List of notifications
    private List<NotificationInterface> notifications; 

    public NotificationManager() {
        this.notifications = new ArrayList<>();
    }

    // Add a new notification to the manager
    public void addNotification(NotificationInterface notification) {
        notifications.add(notification);
    }

    // Send all notifications
    public void sendAllNotifications() {
        for (NotificationInterface notification : notifications) {
            notification.send();
        }
    }

    // Get all notifications
    public List<NotificationInterface> getNotifications() {
        return notifications;
    }
}
