package exercicios.fixacao.application;

import exercicios.fixacao.entities.Contract;
import exercicios.fixacao.entities.Installment;
import exercicios.fixacao.services.ContractService;
import exercicios.fixacao.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();

        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dateTimeFormatter);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract  = new Contract(numero, date, totalValue);

        System.out.print("Entre como o número de parcelas: ");
        int n = sc.nextInt();


        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");

        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
