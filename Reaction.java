public class Reaction extends AbstractUserContent {
    private ReactionType reactionType; 

    public Reaction(User sender, ReactionType reactionType) {
        super(sender, reactionType.toString()); 
        this.reactionType = reactionType;
    }

    // Get the type of reaction
    public ReactionType getReactionType() {
        return reactionType;
    }

    @Override
    public void display() {
        System.out.println("Reaction by " + sender.getName() + ": " + reactionType);
    }
}
