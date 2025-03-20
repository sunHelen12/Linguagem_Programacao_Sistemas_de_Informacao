package primeira_aula.Questao_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemplarUtil {
    static final int MAX = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        do {
            System.out.printf("""
                    ======================================
                                DADOS DO LIVRO %d
                    ======================================
                    """, cont + 1);
            System.out.print("Tombo: ");
            int tombo = sc.nextInt();
            System.out.print("Título: ");
            sc.nextLine(); // buffer
            String titulo = sc.nextLine();
            System.out.print("Autoria: ");
            String autores = sc.nextLine();
            System.out.print("Apto para Empréstimo9 (S/N)");
            boolean aptoEmprestimo = sc.nextLine().equalsIgnoreCase("s");

            if (aptoEmprestimo == 's') {

            }

            cont++;
        } while (cont < MAX);

        List<Exemplar> exemplares = new ArrayList<>();
        System.out.println("");

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
