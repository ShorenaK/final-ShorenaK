import java.util.ArrayList;
import java.util.List;

public class Callout {
    private User creator;
    private String content;
    private CallOutStatus status;
    private List<Reply> replies;
    private List<Reaction> reactions;

    // const
    public Callout(User creator, String content){
        this.creator = creator;
        this.content = content;
        this.status = CallOutStatus.PENDING;
        this.replies = new ArrayList<>();
        this.reactions = new ArrayList<>();
    }

    
}