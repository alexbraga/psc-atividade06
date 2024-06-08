import controller.TrabalhadorController;
import model.Trabalhador;

import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do trabalhador a seguir:\n");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Salário Bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Desconto INSS: ");
        double descontoINSS = scanner.nextDouble();

        System.out.print("Número de Dependentes: ");
        int numeroDependentes = scanner.nextInt();

        System.out.print("Total de Descontos IRRF: ");
        double totalDescontosIRRF = scanner.nextDouble();
        scanner.nextLine(); // Consumir a linha restante

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        Trabalhador trabalhador = new Trabalhador(nome, salarioBruto, descontoINSS, numeroDependentes, totalDescontosIRRF, cpf, cep);

        TrabalhadorController controller = new TrabalhadorController();
        controller.processarTrabalhador(trabalhador);

        scanner.close();
    }
}