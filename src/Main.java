import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SEJA BEM VINDO AO MENU BANCÁRIO!");
        System.out.print("Insira o limite do cartão de crédito: ");
        double limit = scanner.nextDouble();
        scanner.nextLine();

        CreditCard creditCard = new CreditCard(limit);

        int exit = 1;
        while(exit != 0){
            System.out.print("Insira a descrição da compra: ");
            String description = scanner.nextLine();

            System.out.print("Insira o valor da compra: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Purchase purchase = new Purchase(description, price);
            boolean finishedPurchase = creditCard.confirmPurchase(purchase);

            if(finishedPurchase){
                System.out.println("\nCompra realizada com sucesso!");
                System.out.println("Deseja continuar as compras?");
                System.out.print("0 - NÃO");
                System.out.println("\nQUALQUER NÚMERO PARA CONTINUAR");
                System.out.print("Insira a Opção Desejada: ");
                exit = scanner.nextInt();
                scanner.nextLine();

                System.out.printf("\nSaldo do Cartão de Crédito: R$%.2f\n", creditCard.getBalance());
            } else {
                System.out.printf("Compra recusada. Limite disponível: R$%.2f\n", creditCard.getLimit());
            }

            System.out.println("\n*******************************");
            System.out.println("FATURA DO CARTÃO DE CŔEDITO");
            Collections.sort(creditCard.getPurchaseList());

            for(Purchase purchaseList : creditCard.getPurchaseList()){
                System.out.println(purchaseList);
            }
            System.out.println("*******************************");
        }
    }
}
