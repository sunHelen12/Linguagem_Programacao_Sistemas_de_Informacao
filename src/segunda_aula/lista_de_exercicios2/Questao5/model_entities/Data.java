package segunda_aula.lista_de_exercicios2.Questao5.model_entities;

import segunda_aula.lista_de_exercicios2.Questao5.model_exceptions.DataIncorretaException;

public class Data {

    private int dia; // dia (um inteiro entre 1 e, a depender do mês e ano, 28, 29, 30 ou 31)
    private int mes; // mês (um inteiro entre 1 e 12)
    private int ano; // ano (um inteiro de 4 dígitos)

    public Data(int dia, int mes, int ano) throws DataIncorretaException {       
      
        if(ano < 0 || String.valueOf(ano).length() != 4){
            throw new DataIncorretaException("Ano " + ano + " inválido!");
        }else if(mes < 1 || mes > 12){
            throw new DataIncorretaException("Mês " + mes + " inválido!");
        }else{
            int quantidade[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int totalDeDias = quantidade[mes - 1]; //Obtém a quantidade de dias com base no mês

            if(mes == 2 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))){
                totalDeDias++;
            }

            if(dia > 1 || dia > totalDeDias){
                throw new DataIncorretaException("Dia " + dia + " inválido para o mês " + mes + " no ano " + ano + "!");
            }
        }
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
         return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // retorno de string representativa da data encapsulada no formado DD/MM/AAAA
    public String mostrarData() {
        return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
    }

        // retorno de quantidade de dias restantes para o término do ano em que se situa a data
    public int getDiasTerminoAno() {
        // quantidade total de dias de cada mês do ano
        int[] qtdDias = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // alteração de quantidade total de dias do mês de fevereiro se data for de ano bissexto
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
            qtdDias[1]++;

        if (mes == 12) { // se mês da data for dezembro...
        // dias restantes equivalente à diferença entre 31 e dia da data acrescida de 1 (um)
            return 31 - dia + 1;
        } else { // caso contrário (mês anterior a dezembro)...
            // diferença entre total de dias do mês e dia da data acrescida de 1 (um)
            int diasRestantes = qtdDias[mes-1] - dia + 1;
            // contabilização de total de dias dos meses subsequentes (até alcançar dezembro)
            for (int i = mes + 1; i <= 12; i++)
            diasRestantes += qtdDias[i-1]; // acréscimo de total de dias do enésimo mês
            return diasRestantes; // retorno de total de dias restantes
        }
    }
}
