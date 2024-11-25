import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CallOut implements UserAction{

    private String id;
    private User creator;
    private User receiver;
    private String content;
    private CallOutStatus status;
    private List<Reply> replies;
    private List<Reaction> reactions;
    private String timestamp;

    // const
    public CallOut(User creator, User receiver, String content) {
        this.id = java.util.UUID.randomUUID().toString(); // Generate a unique ID
        this.creator = creator;
        this.receiver = receiver;
        this.content = content;
        this.status = CallOutStatus.PENDING;
        this.replies = new ArrayList<>();
        this.reactions = new ArrayList<>();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()); // Current timestamp
    }

    @Override
    public void addReply(Reply reply) {
        replies.add(reply);
    }

    @Override
    public void addReaction(Reaction reaction){
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
    public User getCreator() {
        return creator;
    }

    public String getId() {
        return id;
    }

    public CallOutStatus getStatus() {
        return status;
    }
    
    public void resolve(){
        this.status = CallOutStatus.RESOLVED;
    }

    @Override
    public String toString() {
        return "CallOut{id='" + id + "', creator=" + creator.getName() + ", content='" + content + "', status=" + status + ", replies=" + replies.size() + ", reactions=" + reactions.size() + "}";
    }
}