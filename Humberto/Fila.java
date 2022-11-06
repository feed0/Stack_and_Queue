public class Fila {
    private int fila[];
    private int frente, tras, quantos;

    public Fila()
    {
        fila = new int[100];
        frente =  quantos = 0;
        tras = -1;
    }

    public boolean enfileira(int elemento)
    {
        if (quantos > 99 ) return false;
        quantos++; tras++;
        if ( tras > 99) tras = 0;
        fila[tras] = elemento;
        return true;
    }

    public int desenfileira()
    {    int aux;

        if (quantos <= 0 ) return -1;
        aux = fila[frente];
        frente++;  quantos--;
        if (frente > 99) frente = 0;
        return aux;
    }

    public boolean filaVazia()
    {
        return quantos == 0;
    }

    public void imprimeFila()
    {
        int i, num;

        for (i=0; i<quantos; i++) {
            num = desenfileira();
            System.out.println(num);
            enfileira(num);
        }
    }
}
