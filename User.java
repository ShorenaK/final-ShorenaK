
import java.util.ArrayList;
import java.util.List;

// user
public class User {
    // Existing attributes
    private String name;
    private String email;
    private List<NotificationInterface> notifications; 
    private CallOutList callOuts;                     

    // Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.notifications = new ArrayList<>();
        this.callOuts = new CallOutList();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Add a notification
    public void addNotification(NotificationInterface notification) {
        notifications.add(notification);
    }

    // Send all notifications
    public void sendNotifications() {
        for (NotificationInterface notification : notifications) {
            notification.send();
        }
    }

    // Create and send a CallOut
    public CallOut sendCallout(String message, User receiver) {
        CallOut newCallOut = new CallOut(this, receiver, message);
        callOuts.addCallOut(newCallOut); // Add CallOut to the custom linked list
        return newCallOut;
    }

    // View all notification messages
    public List<String> viewNotifications() {
        List<String> messages = new ArrayList<>();
        for (NotificationInterface notification : notifications) {
            messages.add(notification.getMessage());
        }
        return messages;
    }

    // Reply to a specific CallOut
    public void replyToCallout(String calloutId, String message) {
        CallOut callOut = callOuts.findById(calloutId); // Assuming CallOutList has findById()
        if (callOut != null) {
            Reply reply = new Reply(this, message); // Create a new Reply
            callOut.addReply(reply); // Add Reply to CallOut
        } else {
            System.out.println("CallOut with ID " + calloutId + " not found.");
        }
    }

    // React to a specific CallOut
    public void reactToCallout(String calloutId, ReactionType type, CallOutList globalCallOuts) {
        CallOut callOut = globalCallOuts.findById(calloutId); // Find CallOut in global list
        if (callOut != null) {
            Reaction reaction = new Reaction(this, type); // Create a new Reaction
            callOut.addReaction(reaction); // Add Reaction to CallOut
        } else {
            System.out.println("CallOut with ID " + calloutId + " not found.");
        }
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + 
               "', callOuts=" + callOuts.size() + 
               ", notifications=" + notifications.size() + "}";
    }
}
