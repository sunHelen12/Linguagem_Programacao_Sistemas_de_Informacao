package segunda_aula.lista_de_exercicios2.Questao3;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 6, 8, 10, 12};

        try {
            for (int i = 0; i <= 12; i++) {            
                System.out.println(array[i]);
            } 

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Número de índices de Array inválido!");
        }    
            
    }
}
