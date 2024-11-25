import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CallOut implements UserAction{

    private String id;
    private User creator;
    private String content;
    private CallOutStatus status;
    private List<Reply> replies;
    private List<Reaction> reactions;

    // const
    public CallOut(User creator, String content){
        this.id = UUID.randomUUID().toString();
        this.creator = creator;
        this.content = content;
        this.status = CallOutStatus.PENDING;
        this.replies = new ArrayList<>();
        this.reactions = new ArrayList<>();
    }

    // public String getId(){
        
    // }

    @Override
    void addReply(Reply reply){
        replies.add(reply);
    }

    @Override
    public void addReaction(Reaction reaction){
        reactions.add(reaction);
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


}