package primeira_aula.Questao_4_e_Questao_5;

public class ContaCorrente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean registrarDeposito(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        } else {           
            return  false;
        }
    }

    public boolean registrarSaque(double valor){
        valor += valor * 0.5;

        if (valor <= saldo && valor > 0){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }        
        
    }
    
}
