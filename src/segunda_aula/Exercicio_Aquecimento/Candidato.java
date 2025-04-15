package segunda_aula.Exercicio_Aquecimento;

public class Candidato {
    private String nome;
    private char sexo;
    private int idade;
    private int partido;
    private int votos;

    public Candidato(String nome, char sexo, int idade, int partido){    

        if (idade < 21) {
            throw new IllegalArgumentException("Idade Inserido é Inválida!");
        }

        if (partido < 0 || partido > 99) {
            throw new IllegalArgumentException("Partido Inserido é Inválido!");
        }

        if (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo Inserido é Inválido!");
        }

        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.partido = partido;
        this.votos = 0;    

    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public int getPartido() {
        return partido;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto(){
        this.votos += 1;  
        System.out.println("Voto Adicionado!");      
    }

}
