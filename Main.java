// EXERICIO = FAZER CALCULCADORA COM SCANNER =
// SOMA, SUBTRAÇÃO, DIVISÃO E MULTIPLAÇÃO. TER CONDICIONAIS PARA NÃO ACEITAR LETRAS, E NA DIVSÃO NÃO SER DIVIDO POR 0

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        soma();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void soma (){
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        int R1 = num1 + num2;
        System.out.println("O resultado da soma destes números é " + R1);
    }

}
