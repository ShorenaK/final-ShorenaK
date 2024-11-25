public class PhoneNotification extends AbstractNotification {
    private String phoneNumber; // The recipient's phone number

    // Constructor to initialize phone-specific fields
    public PhoneNotification(User targetUser, String phoneNumber, String message) {
       // Calling the parent constructor
        super(targetUser, message);  
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        // Simulate sending an SMS
        System.out.println("Sending SMS to " + phoneNumber);
        System.out.println("Message: " + message);
    }
}
