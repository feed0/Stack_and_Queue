public class StudentStack {
    private int height;
    private StudentNode top;

    // constructor
    public StudentStack() {
        height = 0;
        top = null;
    }

    // methods
    public void push(Student student) {
        height += 1;
        top = new StudentNode(student, top);
    }
    public Student pop() { // returns aux after popping the top
        if (!isEmpty()) {
            StudentNode aux;
            aux = top;
            top = top.getNext();
            height -= 1;
            return aux.getStudent();
        } else {
            return null;
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
    public Student peek() {
        Student aux;
        aux = pop();    // aux receives top
        push(aux);
        return aux;     // returns actual top
    }
    public boolean swap() {
        Student aux1, aux2;
        if (isEmpty())         // empty
            return false;
        aux1 = pop();
        if (isEmpty()) {       // only one node in the stack
            push(aux1);         // pushes back
            return false;
        }
        aux2 = pop();           // finally find a second element
        push(aux1);             // swap
        push(aux2);
        return true;
    }
    public void concatenate(StudentStack stack2) {
        StudentStack aux = new StudentStack();
        while (!stack2.isEmpty())  // aux receives stack2 in reverse order
            aux.push(stack2.pop());
        while (!aux.isEmpty())     // original stack receives aux' elements
            push(aux.pop());        // in the stack2's original order
    }
    public String toString() {
        StringBuilder message = new StringBuilder();
        Student studentAux;
        StudentStack stackAux = new StudentStack();
        while (!isEmpty()) {
            studentAux = pop();                         // pop & concatenate
            message.append(studentAux.toString()).append("\n");
            stackAux.push(studentAux);                  // push to aux
        }
        while (!stackAux.isEmpty())
            push(stackAux.pop());                       // push back in order
        return message.toString();
    }
}
