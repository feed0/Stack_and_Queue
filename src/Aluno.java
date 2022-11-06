public class Aluno {
    public int matricula;
    public String nome;
    public float prova1, prova2, prova3, trabalhos;

    public Aluno(int matricula, String nome, float prova1, float prova2, float prova3, float trabalhos) {
        this.matricula = matricula;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
        this.trabalhos = trabalhos;
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float getProva3() {
        return prova3;
    }

    public void setProva3(float prova3) {
        this.prova3 = prova3;
    }

    public float getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(float trabalhos) {
        this.trabalhos = trabalhos;
    }

    public String toString() {
        return this.matricula
                + ", " + this.nome
                + "\nNOTAS:  "
                + this.prova1
                + ", " + this.prova2
                + ", " + this.prova3
                + ", " + this.trabalhos;
    }

}