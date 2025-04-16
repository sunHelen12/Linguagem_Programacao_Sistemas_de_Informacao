package segunda_aula.lista_de_exercicios2.Questao1_e_2;

import java.util.Scanner;
import segunda_aula.lista_de_exercicios2.Questao1_e_2.model_entities.Conta;
import segunda_aula.lista_de_exercicios2.Questao1_e_2.model_exceptions.DomainException;

public class ContaUtil {

    public static void main(String[] args) {
        double valor;

        Conta conta = null;
        Scanner scanner = new Scanner(System.in);

        boolean valorValido = false;        

        System.out.print("Informe Saldo Mínimo: ");
        valor = scanner.nextDouble();    // entrada de saldo mínimo de conta
        conta = new Conta(valor);        // inicialização de objeto da classe Conta
        System.out.print("\nInforme Depósito Inicial: ");
        valor = scanner.nextDouble();    // entrada de valor de depósito inicial da conta
        conta.depositar(valor);          // operação de depósito
        do{ 
            try {                
                System.out.print("\nInforme Saque após Depósito Inicial: ");
                valor = scanner.nextDouble();    // entrada de valor de saque após depósito
                conta.sacar(valor);              // operação de depósito
                // exibição de saldo corrente de conta após operações de depósito e saque
                valorValido = true;
            } catch (DomainException e) {
                System.out.println("Erro! Saque inválido!");
            }
        } while(!valorValido);
        
        System.out.println("\nSaldo Final: " + conta.getSaldo());       
        
        scanner.close();
    }
}
