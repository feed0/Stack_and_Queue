import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static PilhaAluno pilha = new PilhaAluno();

    public static void main(String[] args) {
        ler_dados();
    }



    public static void ler_dados() {
        int matricula;
        do {
            System.out.printf("Digite a matrícula do aluno: ");
            matricula = teclado.nextInt();
            pilha.empilha(new Aluno(matricula));
        } while (matricula != 0);
    }

    public void menu() {
        int resp;
        do {
            System.out.println("""
                    SELECIONE O QUE DESEJA FAZER:
                    [1]EMPILHAR
                    [2]DESEMPILHAR
                    [3]EXIBE PILHA
                    RESPOSTA: 
                                    
                    """);
            resp = teclado.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Digite a matricula: ");
                    int matricula = teclado.nextInt();
                    pilha.empilha(new Aluno(matricula));
                    break;
                case 2:
                    System.out.println(pilha.desempilha());
                    if (pilha.pilhaVazia())
                        System.out.println("Não é possivel desempilhar uma" +
                                "pilha vazia!");
                    else
                        System.out.println(pilha.desempilha());
                    break;
                case 3:
                    pilha.imprimePilha();
                    break;
                default:
                    System.out.println("Código inválido!");
                    break;

            }
        } while (resp != 0);
    }
}
