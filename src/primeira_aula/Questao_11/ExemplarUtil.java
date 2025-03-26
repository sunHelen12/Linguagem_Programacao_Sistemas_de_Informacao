package primeira_aula.Questao_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemplarUtil {
    static final int MAX = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Exemplar> exemplares = new ArrayList<>();

        int opcao;
        do {
            System.out.printf("""
                    ====================================================================
                                                MENU - BIBLIOTECA
                    ====================================================================
                           1. Cadastrar Livro
                           2. Habilitar Empréstimo
                           3. Desabilitar Empréstimo
                           4. Registrar Empréstimo de Livro
                           5. Exibição Total de Empréstimos
                           6. Título e Exemplar com maior Quantidade de Empéstimos
                           0. Sair
                    ====================================================================
                    """);
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    int cont = 0;
                    while (cont < MAX) {
                        System.out.printf("""
                                ======================================
                                        CADASTRO - BIBLIOTECA
                                ======================================
                                """);

                        int tombo;
                        boolean tomboValido;
                        do {
                            System.out.print("Tombo: ");
                            tombo = sc.nextInt();
                            tomboValido = true;

                            // Verificar se o tombo já existe
                            for (Exemplar e : exemplares) {
                                if (e.getTombo() == tombo) {
                                    System.out.println("""
                                            =====================================================================================
                                                "Número de tombo já registrado! Por favor, insira um número de tombo diferente.
                                            =====================================================================================
                                            """);                                           
                                    tomboValido = false;
                                    break;
                                }
                            }
                        } while (!tomboValido);

                        System.out.print("Título: ");
                        sc.nextLine(); // buffer
                        String titulo = sc.nextLine();
                        System.out.print("Autoria: ");
                        String autores = sc.nextLine();
                        System.out.print("Apto para Empréstimo (S/N): ");
                        boolean aptoEmprestimo = sc.nextLine().equalsIgnoreCase("s");
                        
                        exemplares.add(new Exemplar(tombo, titulo, autores, aptoEmprestimo));
                        cont++;
                    }
                    break;
                case 2:
                    System.out.print("Tombo para Habilitar Empréstimo: ");
                    int tomboHabilitar = sc.nextInt();

                    for (Exemplar e : exemplares) {
                        if (e.getTombo() == tomboHabilitar) {
                            e.habilitarEmprestimo();
                        }
                    }

                    break;
                case 3:
                    System.out.print("Tombo para Desabilitar Empréstimo: ");
                    int tomboDesabilitar = sc.nextInt();

                    for (Exemplar e : exemplares) {
                        if (e.getTombo() == tomboDesabilitar) {
                            e.desabilitarEmprestimo();
                        }
                    }
                    break;
                case 4:
                    System.out.print("Tombo para Registrar Empréstimo: ");
                    int tomboEmprestimo = sc.nextInt();

                    for (Exemplar e : exemplares) {
                        if (e.getTombo() == tomboEmprestimo) {
                            e.adicionarEmprestimo();
                        }
                    }
                    break;
                case 5:
                    for (Exemplar e : exemplares) {
                        System.out.println("Total de Empréstimos por Exemplar (Tombo: " + e.getTombo() + "): "
                                + e.getQuantidadeEmprestimos());
                    }
                    break;
                case 6:
                    int maiorQuantidade = 0;

                    for (Exemplar e : exemplares) {
                        if (e.getQuantidadeEmprestimos() > maiorQuantidade) {
                            maiorQuantidade = e.getQuantidadeEmprestimos();
                        }
                    }

                    System.out.println("Exemplar(es) com maior quantidade de empréstimos (" + maiorQuantidade
                            + " Empréstimo(s)):");
                    for (Exemplar e : exemplares) {
                        if (e.getQuantidadeEmprestimos() == maiorQuantidade) {
                            System.out.println("Título: " + e.getTitulo() + ", Autoria: " + e.getAutores());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso sistema!");
                    System.out.println("Saindo...");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcao != 0);

        // exemplares.add(new Exemplar(271166, "Java: como Programar", "Harvey M. Deitel
        // e Paul J. Deitel", false));

        sc.close();
    }

    // Outra forma com array
    // Exemplar [] acervo = new Exemplar[6];
    // acervo [0] = new ExemplarExemplar(271166, "Java: como Programar", "Harvey M.
    // Deitel e Paul J. Deitel", false;
    // acervo [0].adcicionarEmprestimo();

}
