package segunda_aula.lista_de_exercicios2.Questao1_e_2.model_entities;

import segunda_aula.lista_de_exercicios2.Questao1_e_2.model_exceptions.DomainException;

public class Conta {

   private double saldo;        // saldo corrente
   private double saldoMinimo;  // saldo mínimo (saldo atual não pode ser inferior a este saldo)
   // método construtor de inicialização de saldo mínimo
   public Conta(double saldoMinimo) {
      this.saldo = 0;           // inicialização de saldo atual (corrente) com 0 (zero)
      this.saldoMinimo = saldoMinimo;
   }
   // retorno de valor atual do saldo mínimo
   public double getSaldoMinimo() {
      return saldoMinimo;
   }
   // atualização de valor atual do saldo mínimo
   public void setSaldoMinimo(double saldoMinimo) {
      this.saldoMinimo = saldoMinimo;
   }
   // retorno de valor atual do saldo corrente
   public double getSaldo() {
      return saldo;
   }
   // operação de registro de depósito em conta, com atualização de saldo corrente
   public void depositar(double deposito) {
      saldo += deposito;
   }
   // operação de registro de saque em conta, com atualização de saldo corrente
   public void sacar(double saque) {
        if (saldo - saque < saldoMinimo ) {
            throw new DomainException("Erro: Você não possui saldo suficiente para saque!");
        }
        saldo -= saque;
   }

   /*
   Readapte o método sacar da classe Conta de modo a gerar uma exceção em caso da tentativa de saque
   em valor que, após debitado, resultará em saldo corrente inferior ao saldo mínimo definido para a conta.
   */
   
}


