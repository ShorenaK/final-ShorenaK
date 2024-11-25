import java.util.ArrayList;
import java.util.List;

// userAction

public interface UserAction{
    // void addReply(Reply reply);
    // void addReaction(Reaction Reaction);
    List<Reply> getReplies();
    List<Reaction> getReactions();
    String getContent();
    User getCreator();

}