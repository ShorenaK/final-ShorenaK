
/******
Name: Shorena K. Anzhilov
Assignment:  Final Lab -- CallOut App  
Date: 11.27.2024
Notes: Main.java
******/

import java.util.List;


public class Main {
    public static void main(String[] args) {
        //  Create Users
        User sender = new User("Shorena", "Shorena@gmail.com");
        User receiver = new User("Sister", "Sister@gmail.com");

        System.out.println("*** ---- **** Testing user creation. *** ---- **** ");
        System.out.println(sender);
        System.out.println(receiver);

        // Send a CallOut
        System.out.println("\n*** ---- **** Sending a CallOut. *** ---- ****");
        CallOutList globalCallOuts = new CallOutList(); 
        CallOut callOut = sender.sendCallout("We need to discuss before we lose each other.", receiver);
        globalCallOuts.addCallOut(callOut);

        // Display the CallOut
        System.out.println("\nDisplaying the CallOut:");
        globalCallOuts.displayCallOuts();
        
        // Add Replies to the CallOut
        System.out.println("\n*** ---- **** Adding replies to the CallOut. *** ---- ****");
        String calloutId = callOut.getId();

        receiver.replyToCallout(calloutId, "I agree. When can we talk?");
        sender.replyToCallout(calloutId, "How about tomorrow evening?");
        receiver.replyToCallout(calloutId, "Tomorrow evening works for me.");

        // Display the CallOut with Replies
        System.out.println("\nDisplaying the CallOut with Replies:");
        CallOut foundCallOut = globalCallOuts.findCalloutById(calloutId);
        if (foundCallOut != null) {
            System.out.println(foundCallOut);
            System.out.println("Replies:");
            for (Reply reply : foundCallOut.getReplies()) {
                reply.displayReplies(0);
            }
        } else {
            System.out.println("CallOut not found.");
        }

        // Adding More Replies to Test Nested Replies
        System.out.println("\n*** ---- **** Adding more nested replies. *** ---- ****");
        if (foundCallOut != null) {
            Reply initialReply = new Reply(sender, "What about next week?");
            foundCallOut.addReply(initialReply);

            Reply nestedReply1 = new Reply(receiver, "Next week works. How about Monday?");
            initialReply.addReply(nestedReply1);

            Reply nestedReply2 = new Reply(sender, "Monday sounds good.");
            nestedReply1.addReply(nestedReply2);

            // Display All Replies with Nesting
            System.out.println("\nDisplaying All Replies:");
            for (Reply reply : foundCallOut.getReplies()) {
                reply.displayReplies(0);
            }
        }
    
        //  Add Reactions to the CallOut
        System.out.println("\n*** ---- **** Adding reactions to the CallOut. *** ---- ****");
        receiver.reactToCallout(calloutId, ReactionType.LIKE, globalCallOuts);
        sender.reactToCallout(calloutId, ReactionType.LOVE, globalCallOuts);

        // Display the CallOut with Reactions
        System.out.println("\nDisplaying the CallOut with Reactions:");
        if (foundCallOut != null) {
            System.out.println(foundCallOut);
            System.out.println("Reactions:");
            for (Reaction reaction : foundCallOut.getReactions()) {
                reaction.display();
            }
        }

        // Testong NotificationseMethods  
        System.out.println("\n*** ---- **** Testing notifications. *** ---- ****");
        NotificationManager notificationManager = new NotificationManager();

        // Create Notifications
        EmailNotification emailNotification = new EmailNotification(receiver, "Important", "Please reply to the CallOut.");
        PhoneNotification phoneNotification = new PhoneNotification(receiver, "111-111-1111", "We need to talk soon.");

        // Add Notifications to the Manager and User
        notificationManager.addNotification(emailNotification);
        notificationManager.addNotification(phoneNotification);
        receiver.addNotification(emailNotification);
        receiver.addNotification(phoneNotification);

        // Send Notifications
        System.out.println("\nSending all notifications:");
        notificationManager.sendAllNotifications();

        // View Unread Notifications
        System.out.println("\nUnread notifications for receiver:");
        List<NotificationInterface> unreadNotifications = notificationManager.getUnreadNotifications();
        unreadNotifications.forEach(notification -> System.out.println(notification.getMessage()));

        // Mark Notifications as Read
        System.out.println("\n*** ---- **** Marking all notifications as read. *** ---- ****");
        notificationManager.markAllAsRead();

        // Display Notification Summary
        System.out.println("\nNotification summary for receiver:");
        System.out.println("Total unread: " + notificationManager.countUnreadNotifications());
        System.out.println("All notifications:");
        notificationManager.getNotificationMessages().forEach(System.out::println);

        // Adding more Notifications
        System.out.println("\n*** ---- **** Adding multiple notifications. *** ---- ****");
        notificationManager.addNotification(new EmailNotification(receiver, "Follow Up", "Are we meeting tomorrow?"));
        notificationManager.addNotification(new PhoneNotification(receiver, "111-111-1111", "Reminder: You have a pending CallOut."));
        notificationManager.addNotification(new EmailNotification(receiver, "Urgent", "We need to finish our discussion."));

   }
}
