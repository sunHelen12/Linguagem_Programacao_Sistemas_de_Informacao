package segunda_aula.lista_de_exercicios2.Questao3;

public class ArrayUtil{
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 6, 8, 10, 12};

        for (int i = 0; i <= 12; i++) {
            if(i > 5){
                throw  new ArrayIndexOutOfBoundsException("Não há mais índices no Array!");
            }
            System.out.println(array[i]);
        }
    }
}

/*
A execução das instruções acima codificadas resulta no lançamento de uma exceção da classe
java.lang.ArrayIndexOutOfBoundsException, dada a tentativa de acesso, em determinada ocasião, a um índice de array
inválido. A solução mais simples seria reescrever o bloco de repetição, de tal modo que acessos ao array seriam restritos ao
elementos indexados entre 0 e 5. No entanto, ao invés disso, solicita-se aqui que seja implementada classe utilitária que
disponha de método estático main, que, por sua vez, contenha o trecho de código acima devidamente readaptado, para fins de
tratamento da exceção aqui mencionada. Quando do tratamento da exceção, deverá ser exibida mensagem indicativa de
tentativa de acesso à índice inválido. Tão logo seja gerada e tratada a exceção, o programa deve ser encerrado de forma
imediata, sem que haja tentativa de acesso de outros valores do array.
*/
