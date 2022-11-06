public class Node {
    private Aluno aluno;
    private Node prox;

    public Node(Aluno aluno, Node prox) {
        this.aluno = aluno;
        this.prox = prox;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Node getProx() {
        return prox;
    }
    public void setProx(Node prox) {
        this.prox = prox;
    }
}
