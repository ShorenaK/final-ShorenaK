public class EmailNotification extends AbstractNotification {
    private String subject; // The subject of the email

    // Constructor to initialize email-specific fields
    public EmailNotification(User targetUser, String subject, String message) {
        super(targetUser, message);  // Call the parent constructor
        this.subject = subject;
    }

    @Override
    public void send() {
        // Simulate sending an email
        System.out.println("Sending Email to " + targetUser.getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }

    @Override
    public String getMessage() {
        return subject + ": " + message;
    }

    @Override
    public User getTargetUser() {
        return targetUser;
    }
}