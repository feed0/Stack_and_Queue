public class StudentQueue {
    private StudentNode front, back;
    private int length;

    // constructor
    public StudentQueue() {
        front = back = null;
        length = 0;
    }

    // methods
    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(Student toEnqueue) {
        StudentNode studentAux = new StudentNode(toEnqueue, null);
        if (front == null)              // empty queue:
            front = studentAux;
        else                            // non empty queue:
            back.setNext(studentAux);   // points to new node
        back = studentAux;              // receives new node
        length ++;
    }
    public Student dequeue() {
        StudentNode nodeAux;
        if (front == null)
            return null;
        nodeAux = front;
        front = front.getNext();
        if (front == null)
            back = null;
        length--;
        return nodeAux.getStudent();
    }
    public String toString() {
        StringBuilder message = new StringBuilder();
        Student studentAux;
        for (int i=0; i < length; i++) {
            studentAux = dequeue();             // dequeue
            message.append(studentAux).append(", ");              // print
            enqueue(studentAux);                // enqueue back
        }
        return message.toString();
    }
}
