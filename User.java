
import java.util.ArrayList;
import java.util.List;

// user

public class User {

    private String name;
    private String email;
    private List<NotificationInterface> notifications = new ArrayList<>();
    private List<CallOut> callOuts = new ArrayList<>();

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void addNotification(NotificationInterface notification){
        notifications.add(notification);
    }

    // Calls the send() method of each NotificationInterface object
    // triggers the notifications to be sent via  email or SMS etc... .

    public void sendNotifications() {
        for (NotificationInterface notification : notifications) {
            notification.send();
        }
    }

    public CallOut sendCallout(String message, String receiverId){
        CallOut newCallOut = new CallOut(this, message);
        callOuts.add(newCallOut);
        return newCallOut;

     }

// Collect each notification's message 
// Return the list of messages

     public List<String> viewNotifications() {
        List<String> messages = new ArrayList<>();
        for (NotificationInterface notification : notifications) {
            messages.add(notification.getMessage()); 
        }
        return messages; 
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }

}