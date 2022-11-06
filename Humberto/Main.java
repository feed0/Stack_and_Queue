import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        /*
        System.out.println("Primeiro grupo de dados");
        PilhaDinamica p1 = leDados();
        System.out.println("Segundo grupo de dados");
        PilhaDinamica p2 = leDados();

        System.out.println("Primeira pilha");
        p1.imprimePilha();
        System.out.println("Segunda pilha");
        p2.imprimePilha();

        p1.concatena(p2);
        System.out.println("Topo = " + p1.topoPilha());
        p1.troca();
        System.out.println("Listando números na ordem inversa:");
        p1.imprimePilha();

    */
        /*
        Fila f = new Fila();
        f.enfileira(20);
        f.enfileira(30);
        f.enfileira(25);
        System.out.println(f.desenfileira());
        f.enfileira(40);
        System.out.println(f.desenfileira());
        System.out.println(f.desenfileira());
        System.out.println(f.desenfileira());
*/
        FilaDinamica f = leDadosF();
        f.imprimeFila();
    }
    public static PilhaDinamica leDados()
    {
        int num;

        PilhaDinamica p = new PilhaDinamica();
        System.out.println("Informe um Numero (-1 para finalizar):");
        num = entrada.nextInt();
        while (num != -1 )  {
            p.empilha(num);
            System.out.println("Informe um Numero (-1 para finalizar):");
            num = entrada.nextInt();
        }
        return  p;
    }

    public static FilaDinamica leDadosF()
    {
        int num;

        FilaDinamica f = new FilaDinamica();
        System.out.println("Informe um Numero (-1 para finalizar):");
        num = entrada.nextInt();
        while (num != -1 )  {
            f.enfileira(num);
            System.out.println("Informe um Numero (-1 para finalizar):");
            num = entrada.nextInt();
        }
        return  f;
    }
}