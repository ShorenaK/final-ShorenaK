public class EmailNotification extends AbstractNotification {
    private User targetUser;
    private String subject;
    private String message;

    // public EmailNotification(User targetUser, String subject, String message) {
    //     this.targetUser = targetUser;
    //     this.subject = subject;
    //     this.message = message;
    // }

    @Override
    public void send() {
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
