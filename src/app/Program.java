package app;

import entities.Financing;
/**
 * <h1> DEVSUPERIOR - Java Spring Expert - Capítulo 2: Testes automatizados</h1>
 * Exercício: JUnit vanilla
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   04/08/2024
 */
public class Program {
    public static void main(String[] args) {

        try {
            Financing f1 = new Financing(100000.0, 2000.0, 20);
            System.out.println("Dados do financiamento 1:");
            System.out.printf("Entrada: %.2f%n", f1.entry());
            System.out.printf("Prestação: %.2f%n", f1.quota());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro no financiamento 1: " + e.getMessage());
        }

        try {
            Financing f2 = new Financing(100000.0, 2000.0, 80);
            System.out.println("Dados do financiamento 2:");
            System.out.printf("Entrada: %.2f%n", f2.entry());
            System.out.printf("Prestação: %.2f%n", f2.quota());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro no financiamento 2: " + e.getMessage());
        }
    }
}
