public class Student {
    private int enrollment;
    private String name;
    private float[] exams;
    private float assessment;

    // constructor
    public Student(int enrollment, String name, float[] exams, float assessment) {
        this.enrollment = enrollment;
        this.name = name;
        this.exams = exams.clone();
        this.assessment = assessment;
    }
    public Student(int enrollment, String name) {
        this.enrollment = enrollment;
        this.name = name;
    }

    //get & set
    public int getEnrollment() {
        return this.enrollment;
    }
    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float[] getExams() {
        return exams;
    }
    public void setExams(int i, float exam) {
        this.exams[i] = exam;
    }
    public float getAssessment() {
        return assessment;
    }
    public void setAssessment(float assessment) {
        this.assessment = assessment;
    }
    public String toString() {
        return String.format("[%d,\t%s,\t%.2f,\t%.2f,\t%.2f,\t%.2f]",
                enrollment, name, exams[0], exams[1], exams[2], assessment);
    }
}
