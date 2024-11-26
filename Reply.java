import java.util.ArrayList;
import java.util.List;

public class Reply extends AbstractUserContent {
    private List<Reply> replies; // Nested replies

    public Reply(User sender, String content) {
        super(sender, content);
        this.replies = new ArrayList<>();
    }

    // Get all nested replies
    public List<Reply> getReplies() {
        return replies;
    }

    // Add a reply to this reply
    public void addReply(Reply reply) {
        replies.add(reply);
    }

    @Override
    public void display() {
        System.out.println("Reply from " + sender.getName() + ": " + content);
    }

    // Display nested replies using recursion
    public void displayReplies(int depth) {
        System.out.println("  ".repeat(depth) + "- " + content + " (by " + sender.getName() + ")");
        for (Reply reply : replies) {
            reply.displayReplies(depth + 1);
        }
    }
    @Override
    public String toString() {
    return "Reply{content='" + content + "', sender='" + sender.getName() + "'}";
    }

}
