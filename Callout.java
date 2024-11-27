import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CallOut implements UserAction {
    // Unique ID for the CallOut
    private String id;                     
    private User sender;                   
    private User receiver;                 
    private String content;               
    private CallOutStatusType status;          
    private List<Reply> replies;          
    private List<Reaction> reactions;      
    private String timestamp;              

    // Constructor
    public CallOut(User sender, User receiver, String content) {
        this.id = UUID.randomUUID().toString();
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.status = CallOutStatusType.PENDING;
        this.replies = new ArrayList<>();
        this.reactions = new ArrayList<>();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
    

    // Add a reply to the CallOut
    @Override
    public void addReply(Reply reply) {
        replies.add(reply);
    }

    // Add a reaction to the CallOut
    @Override
    public void addReaction(Reaction reaction) {
        reactions.add(reaction);
    }

    // Getters
    public User getReceiver() {
        return receiver;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public List<Reply> getReplies() {
        return replies;
    }

    @Override
    public List<Reaction> getReactions() {
        return reactions;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public User getSender() {
        return sender;
    }

    public String getId() {
        return id;
    }

    public CallOutStatusType getStatus() {
        return status;
    }

    // Mark the CallOut as resolved
    public void resolve() {
        this.status = CallOutStatusType.RESOLVED;
    }

    public int getTotalReplies() {
        return replies.stream()
                .mapToInt(reply -> 1 + reply.getReplies().size())
                .reduce(0, Integer::sum);
    }
    
    @Override
    public String toString() {
        return "CallOut{id='" + id + "', sender=" + sender.getName() + ", receiver=" + receiver.getName() + 
               ", content='" + content + "', status=" + status + ", replies=" + replies.size() + 
               ", reactions=" + reactions.size() + ", timestamp='" + timestamp + "'}";
    }
}
