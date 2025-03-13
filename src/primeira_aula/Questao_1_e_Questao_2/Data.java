package primeira_aula.Questao_1_e_Questao_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
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
    
    public String mostrarData(int dia, int mes, int ano){
        return String.format("%02d/%02d/%4d", dia, mes, ano);
    }     

    public int getDiasTerminaAno(int dia, int mes, int ano) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        LocalDate fimDoAno = LocalDate.of(ano, 12, 31);

        int quantidadeDias = (int) ChronoUnit.DAYS.between(data, fimDoAno);
        
        return quantidadeDias;
    }
    
}
