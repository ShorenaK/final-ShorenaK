import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    /// List of notifications
    private List<NotificationInterface> notifications; 

    // Constructor to initialize the notification list
    public NotificationManager() {
        this.notifications = new ArrayList<>();
    }

    // Add a new notification to the list
    public void addNotification(NotificationInterface notification) {
        notifications.add(notification);
    }

    // Send all notifications in the list
    public void sendAllNotifications() {
        for (NotificationInterface notification : notifications) {
            notification.send();
        }
    }

    // Get a list of unread notifications Filter
    public List<NotificationInterface> getUnreadNotifications() {
        return notifications.stream()
                .filter(notification -> !notification.isRead()) // Filter unread notifications
                .toList();
    }

    // Get a list of all notification messages MAP
    public List<String> getNotificationMessages() {
        return notifications.stream()
                .map(NotificationInterface::getMessage) // Map to messages
                .toList();
    }
    // REDUCE // Map unread to 1, read to 0   Sum the results
    public int countUnreadNotifications() {
        return notifications.stream()
                .map(notification -> notification.isRead() ? 0 : 1) 
                .reduce(0, Integer::sum); 
    }
    

    // Mark all notifications as read
    public void markAllAsRead() {
        for (NotificationInterface notification : notifications) {
            notification.markAsRead();
        }
    }
}
