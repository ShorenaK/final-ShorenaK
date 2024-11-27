


public class CallOutList {
    private CallOutNode head;

    // Add a CallOut to the list
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

    // Display all CallOuts
    public void displayCallOuts() {
        CallOutNode current = head;
        while (current != null) {
            System.out.println(current.getCallOut());
            current = current.getNext();
        }
    }

    // Find a CallOut by its ID
    public CallOut findCalloutById(String id) {
        CallOutNode current = head;
        while (current != null) {
            if (current.getCallOut().getId().equals(id)) {
                return current.getCallOut();
            }
            current = current.getNext();
        }
        return null;
    }

    // Remove a CallOut by its ID
    public boolean removeCallOutById(String id) {
        if (head == null) {
            return false; // List is empty
        }

        // If the head needs to be removed
        if (head.getCallOut().getId().equals(id)) {
            head = head.getNext();
            return true;
        }

        // Traverse the list to find and remove the node
        CallOutNode current = head;
        while (current.getNext() != null) {
            if (current.getNext().getCallOut().getId().equals(id)) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }

        return false; // ID not found
    }

    // Get the size of the list
    public int size() {
        int count = 0;
        CallOutNode current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
    @Override
    public String toString() {
    StringBuilder result = new StringBuilder("CallOutList: [");
    CallOutNode current = head;
    while (current != null) {
        result.append(current.getCallOut().toString()).append(", ");
        current = current.getNext();
    }
    if (result.length() > 12) { 
        result.setLength(result.length() - 2);
    }
    result.append("]");
    return result.toString();
}

}
