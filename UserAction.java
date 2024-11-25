import java.util.ArrayList;
import java.util.List;

// userAction
public interface UserAction {
    void addReply(Reply reply);             // Add a reply to the CallOut
    void addReaction(Reaction reaction);   // Add a reaction to the CallOut
    List<Reply> getReplies();              // Get all replies for the CallOut
    List<Reaction> getReactions();         // Get all reactions for the CallOut
    String getContent();                   // Get the content of the CallOut
    User getSender();                      // Get the sender of the CallOut
}
