package primeira_aula.Questao_1;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(1, 1, 2023);         

        String dataFormatada = data.mostrarData(data.getDia(), data.getMes(), data.getAno());
        System.out.println(dataFormatada);
    }
}