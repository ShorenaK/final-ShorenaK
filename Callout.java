import java.util.ArrayList;
import java.util.List;

public class CallOut {

    private String id;
    private User creator;
    private String content;
    private CallOutStatus status;
    private List<Reply> replies;
    private List<Reaction> reactions;

    // const
    public CallOut(User creator, String content){
        this.creator = creator;
        this.content = content;
        this.status = CallOutStatus.PENDING;
        this.replies = new ArrayList<>();
        this.reactions = new ArrayList<>();
    }

    public String getId(){
        
    }

    // void addReply(Reply reply);
}