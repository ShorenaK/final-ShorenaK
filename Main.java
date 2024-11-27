import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //  Create Users
        User sender = new User("Shorena", "Shorena@gmail.com");
        User receiver = new User("Sister", "Sister@gmail.com");

        System.out.println("Testing user creation...");
        System.out.println(sender);
        System.out.println(receiver);

        // Send a CallOut
        System.out.println("\nSending a CallOut...");
        CallOutList globalCallOuts = new CallOutList(); 
        CallOut callOut = sender.sendCallout("We need to discuss before we lose each other.", receiver);
        globalCallOuts.addCallOut(callOut);

        // Display the CallOut
        System.out.println("\nDisplaying the CallOut:");
        globalCallOuts.displayCallOuts();
        
        // Add Replies to the CallOut
        System.out.println("\nAdding replies to the CallOut...");
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






        // // testing linkedliset 
        // CallOutList globalCallOutList = new CallOutList();
        // CallOut callOut1 = Shorena.sendCallOut("Let’s talk about it", Sister);
        // globalCallOutList.addCallOut(callOut1);

        // CallOut callOut2 = Sister.sendCallOut("Sure, I am free tomorrow.", Shorena);
        // globalCallOutList.addCallOut(callOut2);

        // System.out.println("All CallOuts:");
        // globalCallOutList.displayCallOuts();

   }
}
