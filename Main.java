import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args){
        User user = new User("Shorena Anzhilov", "Shorenaa@gmail.com");
        System.out.println("User Created: " + user);
    }

        // Testing the notifcation
        NotificationInterface emailNotification = new EmailNotification(user, "CallOut  ", "You received the CallOut");
        NotificationInterface phoneNotification = new PhoneNotification(user, "111-111-111", "You received the CallOut");

        // Add notifications to the user
        user.addNotification(emailNotification);
        user.addNotification(phoneNotification);
}