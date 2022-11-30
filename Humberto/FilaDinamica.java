public class FilaDinamica {
    private No frente, tras;
    private int quantos;

    public FilaDinamica()
    {
        frente = tras = null;
        quantos=0;
    }

    public boolean filaVazia() {
        return frente == null;  // não precisa testar os dois …
    }

    public void enfileira(int elemento)
    {
        No aux = new No(elemento, null);
        if (frente == null)  // Fila vazia, é o primeiro a entrar
            frente = aux;
        else
            tras.setProx(aux);
        tras = aux; // aux é o novo elemento de trás
        quantos++;
    }
    public int desenfileira()
    {  No aux;
        if (frente == null)
            return 0; // O ideal seria gear uma Exception
        aux = frente;
        frente = aux.getProx(); // proximo aponta p/ o 2o da fila ou null
        if (frente == null)
            tras = null; // ficou vazia …
        quantos--;
        return aux.getDado();
    }

    public void imprimeFila()
    {
        int i, num;

        for (i=0; i < quantos; i++) {
            num = desenfileira();
            System.out.println(num);
            enfileira(num);
        }
    }
}
