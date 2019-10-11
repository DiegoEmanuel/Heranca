public class Funcionario {
    
    private String nome;
    private int matricula;

        
    public Funcionario(String n, int m){
        this.nome = n;
        this.matricula=m;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
