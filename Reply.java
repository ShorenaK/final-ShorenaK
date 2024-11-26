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
}