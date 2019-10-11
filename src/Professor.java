public class Professor {
    private String nome;
    private int idade;
    private int nmrMatri;

    public Professor ( String n, int i, int nm){
        this.idade=i;
        this.nmrMatri=nm;
        this.nome=n;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNmrMatri() {
        return nmrMatri;
    }

    public void setNmrMatri(int nmrMatri) {
        this.nmrMatri = nmrMatri;
    }
    
}
