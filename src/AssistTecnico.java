public class AssistTecnico extends Funcionario{
    
    public AssistTecnico(String n, int m){
        super(n, m);
    }
    
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
}
