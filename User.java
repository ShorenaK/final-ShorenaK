
import java.util.ArrayList;
import java.util.List;

// user

public class User {
    private String name;
    private String email;
    private List<NotificationInterface> notifications; // Manages notifications
     // private List<CallOut> callOuts = new ArrayList<>();
    private CallOutList callOuts;                      // Custom linked list for CallOuts

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.notifications = new ArrayList<>();
         // this.callOuts = new ArrayList<>();
        this.callOuts = new CallOutList();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addNotification(NotificationInterface notification) {
        notifications.add(notification);
    }
   // Calls the send() method of each NotificationInterface object
    // triggers the notifications to be sent via  email or SMS etc... .

    // Send all notifications
    public void sendNotifications() {
        for (NotificationInterface notification : notifications) {
            notification.send();
        }
    }

    // Create and send a CallOut
    public CallOut sendCallout(String message, User receiver){
        CallOut newCallOut = new CallOut(this, receiver, message);
        callOuts.addCallOut(newCallOut); // Use addCallOut
        return newCallOut;
    }
    
// Collect each notification's message 
// Return the list of messages
    // View all notification messages
    public List<String> viewNotifications() {
        List<String> messages = new ArrayList<>();
        for (NotificationInterface notification : notifications) {
            messages.add(notification.getMessage());
        }
        return messages;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + 
               "', callOuts=" + callOuts.size() + 
               ", notifications=" + notifications.size() + "}";
    }
}
