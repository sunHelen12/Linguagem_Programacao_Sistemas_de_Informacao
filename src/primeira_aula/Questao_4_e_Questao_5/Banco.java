package primeira_aula.Questao_4_e_Questao_5;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaEspecial contaEspecial = new ContaEspecial();

        boolean deposito = contaCorrente.registrarDeposito(5000.00);
        boolean saque = contaCorrente.registrarSaque(0.00);

        boolean depositoContaEspecial = contaEspecial.registrarDeposito(5000.00);
        boolean saqueContaEspecial = contaEspecial.registrarSaque(500.00);
        
        
        System.out.print("""
                =============================================
                             Conta Corrente
                =============================================
                """);
        System.out.println(deposito);         
        System.out.println(saque);
        
        System.out.print("""
            =============================================
                         Conta Especial
            =============================================
            """);

        System.out.println(depositoContaEspecial);         
        System.out.println(saqueContaEspecial);
    }
}
