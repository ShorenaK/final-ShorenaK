
import java.util.ArrayList;
import java.util.List;

// user

public class User {

    private String name;
    private String email;
    private List<NotificationInterface> notifications = new ArrayList();

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

    // public void displayNotifications() {
    //     for (NotificationInterface notification : notifications) {
    //         notification.send();
    //     }
    // }

}