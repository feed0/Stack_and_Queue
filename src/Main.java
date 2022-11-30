import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    static StudentStack stack = new StudentStack();
    static StudentQueue queue = new StudentQueue();

    // main
    public static void main(String[] args) {
        showWelcome();
        int code;
        do {
            showMenu();
            processCode(code = in.nextInt());
        } while (code != 0);
    }

    // functions
    public static void showWelcome() {
        System.out.println("""
                __________________________________________________________
                        ===         DHC UNIVERSITY         ===
                        ===     STUDENT DATA STRUCTURE     ===
                __________________________________________________________
                
                """);
    }
    public static Student readStudent() {
        String name;
        int enrollment;
        float[] exams = new float[3];
        float assessment;
        System.out.print("Enrollment: [0]Stop ");
        enrollment = in.nextInt();
        if (enrollment == 0)                    // enrollment flag
            return null;
        in.nextLine();
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("1st Exam: ");
        exams[0] = in.nextFloat();
        System.out.print("2nd Exam: ");
        exams[1] = in.nextFloat();
        System.out.print("3rd Exam: ");
        exams[2] = in.nextFloat();
        System.out.print("Assessment: ");
        assessment = in.nextFloat();
        return new Student(enrollment, name, exams, assessment);
    }
    public static void showMenu() {
        System.out.println(""" 
                
                        ===   Main Menu   ===
                        [1] New student
                        [2] Remove
                        [3] Show data structures
                        [0] Exit
                        ===   ---------   ===
                
                """);
    }
    public static void processCode(int code) {
        switch (code) {
            case 1: // new student
                System.out.println("...   New student   ...");
                Student student = readStudent();
                stack.push(student);
                queue.enqueue(student);
                break;
            case 2: // remove and print students
                if (stack.isEmpty())
                    System.out.println("Empty data structures!\n");
                else {
                System.out.printf("""
                                ...   Remove   ...
                                Popped: %s
                                Dequeued: %s
                                
                                """,
                        stack.pop(), queue.dequeue());
                }
                break;
            case 3: // print data structures
                if (stack.isEmpty())
                    System.out.println("Empty data structures!\n");
                else {
                    System.out.printf("""
                            ...   All the data   ...
                            .   Stack   .
                            %s
                            .   Queue   .
                            %s
                            
                            """, stack.toString(), queue.toString());
                }
                break;
            case 0:
                System.out.println("Program finished!");
                break;
            default:
                System.out.println("Invalid code! Choose from range 0-3.\n");
                break;
        }
    }
}
