import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {


        // Create users
        User sender = new User("Shorena", "Shorena@gmail.com");
        User receiver = new User("Sister", "Sister@gmail.com");

        // testing linkedliset 
        CallOutList globalCallOutList = new CallOutList();
        CallOut callOut1 = Shorena.sendCallOut("Let’s talk about it", Sister);
        globalCallOutList.addCallOut(callOut1);

        CallOut callOut2 = Sister.sendCallOut("Sure, I am free tomorrow.", Shorena);
        globalCallOutList.addCallOut(callOut2);

        System.out.println("All CallOuts:");
        globalCallOutList.displayCallOuts();





//         // Create a CallOut  /// NEEDS TO BE FIXED
//         System.out.println("Creating a CallOut...");
//         CallOut callOut = new CallOut(sender, receiver, "We need to discuss before we loose eachother.");

//         // Generate a notification for the receiver
//         NotificationInterface callOutNotification = new EmailNotification(
//                 receiver,
//                 "New CallOut Received",
//                 "Shorena sent you a CallOut: We need to discuss before we loose eachother."
//         );

//         // Add the notification to the receiver's notifications
//         receiver.addNotification(callOutNotification);

//         // View receiver's notifications
//         System.out.println("\nSister's notifications:");
//         List<String> notifications = receiver.viewNotifications();
//         for (String notificationMessage : notifications) {
//             System.out.println(notificationMessage);
//         }

//         // Send all notifications for the receiver
//         System.out.println("\nSending notifications to Sister:");
//         receiver.sendNotifications();

// /// Does not wrok 
//         // Mark all notifications as read for the receiver
//         System.out.println("\nMarking all notifications as read...");
//         receiver.getNotificationMessages().markAllAsRead();  ///  --> I need to check this getNotificationMessages() method


// //iT does nto work yet 
//         // Check unread notifications after marking as read
//         System.out.println("\nUnread notifications for Bob:");
//         List<NotificationInterface> unreadNotifications = receiver.getNotificationMessages().getUnreadNotifications();
//         if (unreadNotifications.isEmpty()) {
//             System.out.println("No unread notifications.");
//         } else {
//             System.out.println("Unread notifications exist.");
//         }
   }
}
