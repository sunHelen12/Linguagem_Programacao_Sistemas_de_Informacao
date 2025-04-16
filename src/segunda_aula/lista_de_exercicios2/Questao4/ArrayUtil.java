package segunda_aula.lista_de_exercicios2.Questao4;

import java.util.Scanner;

public class ArrayUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int array[] = null;
        boolean entrada = false;
        
        do{
            try {
                System.out.print("Informe tamanho de Array: ");
                n = sc.nextInt();
                array = new int[n];
                entrada = true;
            } catch (NegativeArraySizeException e) {
                System.out.println("Tamanho de Array Não pode ser negativo! Digite Novamente!");
            }
        }while(!entrada);         

        
        int soma = 0;

      
        for(int i = 0; i < n; i++){
            System.out.print("Digite o Valor do Elemento " + (i + 1) + "#: ");
            array[i] = sc.nextInt();
            soma+=array[i];
        }
        
        System.out.println("Soma = " + soma);
    }
}
