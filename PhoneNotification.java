public class PhoneNotification extends AbstractNotification {
    private User targetUser;
    private String phoneNumber;
    private String message;

    public PhoneNotification(User targetUser, String phoneNumber, String message) {
        this.targetUser = targetUser;
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + phoneNumber);
        System.out.println("Message: " + message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public User getTargetUser() {
        return targetUser;
    }
}
