public class No {
    private int dado;
    private No prox;


    public No(int dado, No prox)  {
        this.dado = dado;
        this.prox = prox;
    }

    public int getDado() {
        return this.dado;
    }

    public No getProx() {
        return prox;
    }
    public void setProx(No p) {
        prox = p;
    }


}
