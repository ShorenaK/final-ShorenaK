
///for ADT Linked List 
/// 
///last step to test it 

public class CallOutList {
    private CallOutNode head;

    public void addCallOut(CallOut callOut) {
        if (head == null) {
            head = new CallOutNode(callOut);
        } else {
            CallOutNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new CallOutNode(callOut));
        }
    }
///  desplaye
    public void displayCallOuts() {
        CallOutNode current = head;
        while (current != null) {
            System.out.println(current.getCallOut());
            current = current.getNext();
        }
    }
}
