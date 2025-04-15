package segunda_aula.Exercicio_Aquecimento;

public class UrnaEletronica {
    public static void main(String[] args){        
        
        try{  
            Candidato candidato1 = new Candidato("Whitney Houston",'f', 45, 12);
            candidato1.adicionarVoto();

            Candidato candidato2 = new Candidato("Madonna",'C', 22, 99);
            candidato2.adicionarVoto();

            Candidato candidato3 = new Candidato("Elton John",'M', 20, 1);
            candidato3.adicionarVoto();

            Candidato candidato4 = new Candidato("Phil Collins",'m', 45, - 1);
            candidato4.adicionarVoto();

            Candidato candidato5 = new Candidato("Peter Cetera",'m', 50, 100);
            candidato5.adicionarVoto();  
            
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}

