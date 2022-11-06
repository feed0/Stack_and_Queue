public class Pilha {
    private int pilha[];
    private int topo;
    public Pilha() {
        pilha = new int[100];
        topo = -1; // cria a pilha vazia
    }
    public boolean empilha(int elemento) {
        if (topo >= 99 ) return false;
        topo++;
        pilha[topo] = elemento;
        return true;
    }
    public int desempilha() {
        if (topo >= 0 )
            return pilha[topo--];
        else return -1; // Erro;
    }
    public boolean pilhaVazia()
    {
        return topo == -1;
    }
    public int topoPilha() {// dentro da classe Pilha
        int Aux;
        Aux = desempilha();   // tira da pilha
        empilha(Aux);		   // devolve para a pilha
        return Aux;
    }
    boolean troca() {
        int aux1, aux2;
        if (pilhaVazia()) return false;   // A pilha não tem nem um elemento
        aux1 = desempilha();                 // tira o primeiro da pilha
        if (pilhaVazia()) {
            empilha(aux1);
            return false;   // A pilha não tem dois elementos para trocar ...
        }
        aux2 = desempilha();     // tira o segundo da pilha
        empilha(aux1);	  	// devolve o primeiro para a pilha
        empilha(aux2);             // devolve o segundo para a pilha  - trocou a ordem deles
        return true;
    }
    public void concatena(Pilha pilha2) {
        Pilha aux = new Pilha();

        while (! pilha2.pilhaVazia() ) 	// Copia a pilha2 para a Aux
            aux.empilha(pilha2.desempilha());

        while (! aux.pilhaVazia() )   // Concatena a Aux na pilha1
            empilha(aux.desempilha());

        // Assim a pilha2 fica concatenada na pilha1 e
        // mantendo a mesma ordem original

    }
    public void imprimePilha() {
        Pilha aux = new Pilha();
        int num;

        while (! pilhaVazia() ) {    // para a Aux
            num = desempilha();
            System.out.println(num);
            aux.empilha(num);
        }

        while (! aux.pilhaVazia() )   // volta a Aux na pilha1
            empilha(aux.desempilha());
    }
}
