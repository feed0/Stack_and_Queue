public class PilhaAluno {
//    Atributos
    int quant;
    private Node top;
//    Construtor
    public PilhaAluno() {
        top = null;
    }
//    Metodos
    public void empilha(Aluno aluno) {
        int quant = 0;
        top = new Node(aluno, top);
    }
    public Aluno desempilha() {
        Node aux;
        if (!pilhaVazia()) {
            aux = top;
            top = top.getProx();
            System.out.println("Desempilhado: " + aux.getAluno());
            return aux.getAluno();

        } else {
            return null;
        }
    }
    public boolean pilhaVazia() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public Aluno topoPilha() {// dentro da classe Pilha
        Aluno Aux;
        Aux = desempilha();   // tira da pilha
        empilha(Aux);           // devolve para a pilha
        return Aux;
    }

    public boolean troca() {
        Aluno aux1, aux2;
        if (pilhaVazia()) return false;   // A pilha não tem nem um elemento
        aux1 = desempilha();                 // tira o primeiro da pilha
        if (pilhaVazia()) {
            empilha(aux1);
            return false;   // A pilha não tem dois elementos para trocar ...
        }
        aux2 = desempilha();     // tira o segundo da pilha
        empilha(aux1);        // devolve o primeiro para a pilha
        empilha(aux2);             // devolve o segundo para a pilha  - trocou a ordem deles
        return true;
    }

    public void concatena(PilhaAluno pilha2) {
        PilhaAluno aux = new PilhaAluno();

        while (!pilha2.pilhaVazia())    // Copia a pilha2 para a Aux
            aux.empilha(pilha2.desempilha());

        while (!aux.pilhaVazia())   // Concatena a Aux na pilha1
            empilha(aux.desempilha());

        // Assim a pilha2 fica concatenada na pilha1 e
        // mantendo a mesma ordem original


    }

    public int quant() {
        PilhaAluno aux = new PilhaAluno();

        int quant = 0;
        if (pilhaVazia())
            return -1;
        else {
            while (!pilhaVazia()) {
                aux.empilha(desempilha());
                quant++;
            }
            while (!aux.pilhaVazia())
                empilha(aux.desempilha());
        }
        return quant;

    }

    public void imprimePilha() {
        PilhaAluno aux = new PilhaAluno();
        Aluno aluno_aux;

        while (! pilhaVazia() ) {    // para a Aux
            aluno_aux = desempilha();
            System.out.println(aluno_aux);
            aux.empilha(aluno_aux);
        }

        while (! aux.pilhaVazia() )   // volta a Aux na pilha1
            empilha(aux.desempilha());
    }
}
