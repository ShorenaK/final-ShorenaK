///for ADT Linked List 

public class CallOutNode {
    private CallOut callOut;
    private CallOutNode next;

    public CallOutNode(CallOut callOut) {
        this.callOut = callOut;
        this.next = null;
    }

    public CallOut getCallOut() {
        return callOut;
    }

    public CallOutNode getNext() {
        return next;
    }

    public void setNext(CallOutNode next) {
        this.next = next;
    }
}
