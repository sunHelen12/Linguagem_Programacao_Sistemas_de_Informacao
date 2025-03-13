package primeira_aula.Questao_4_e_Questao_5;

public class ContaEspecial extends ContaCorrente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean registrarDeposito(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        } else {           
            return  false;
        }
    }
    @Override
    public boolean registrarSaque(double valor){
        valor += valor * 0.1;

        if (valor <= saldo && valor > 0){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }        
        
    }
    
}
