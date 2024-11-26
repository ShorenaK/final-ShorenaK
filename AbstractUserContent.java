
// Asbtract User contetn 
public abstract class AbstractUserContent {
    // The user associated with the content
    protected User sender;     
    protected String content;  

    // Constructor
    public AbstractUserContent(User sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Getters
    public User getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    // Abstract method for displaying content, implemented by subclasses
    public abstract void display();
}


