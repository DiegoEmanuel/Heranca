public class Gerente extends Funcionario{
    
    public Gerente (String n, int m){
        super(n, m);
    }
    private String nomeDP;

    public String getNomeDP() {
        return nomeDP;
    }

    public void setNomeDP(String nomeDP) {
        this.nomeDP = nomeDP;
    }
}
