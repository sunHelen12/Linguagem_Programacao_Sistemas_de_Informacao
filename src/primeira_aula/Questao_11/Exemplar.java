package estudos_lingugagem_de_programacao.questao_11_exemplares;

public class Exemplar {

    private int tombo;
    private String titulo;
    private String autores;
    private boolean aptoEmprestimo;
    private int quantidadeEmprestimos;

    public Exemplar(int tombo, String titulo, String autores, boolean aptoEmprestimo) {
        this.tombo = tombo;
        this.titulo = titulo;
        this.autores = autores;
        this.aptoEmprestimo = aptoEmprestimo;
    }

    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public boolean isAptoEmprestimo() {
        return aptoEmprestimo;
    }

    public void setAptoEmprestimo(boolean aptoEmprestimo) {
        this.aptoEmprestimo = aptoEmprestimo;
    }

    public int getQuantidadeEmprestimos() {
        return quantidadeEmprestimos;
    }

    public void setQuantidadeEmprestimos(int quantidadeEmprestimos) {
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    public void habilitarEmprestimo() {
        this.aptoEmprestimo = true;
    }

    public void desabilitarEmprestimo() {
        this.aptoEmprestimo = false;
    }

    public void adicionarEmprestimo() {
        if (aptoEmprestimo) {
            this.quantidadeEmprestimos++;
        } else {
            System.out.println("Exemplar não está apto para empréstimo!");
        }
    }

}
