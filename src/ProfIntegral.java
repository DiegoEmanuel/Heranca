public class ProfIntegral extends Professor{
    public ProfIntegral(String n, int i, int nm){
       super (n,i,nm);
    }
    private double salfixo;

    public double getSalfixo() {
        return salfixo;
    }

    public void setSalfixo(double salfixo) {
        this.salfixo = salfixo;
    }
    
}
