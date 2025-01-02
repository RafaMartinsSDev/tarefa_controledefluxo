import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a Nota 1:");
        int numero1 = s.nextInt();
        System.out.println("Digite a Nota 2:");
        int numero2 = s.nextInt();
        System.out.println("Digite a Nota 3:");
        int numero3 = s.nextInt();
        System.out.println("Digite a Nota 4:");
        int numero4 = s.nextInt();
        System.out.println("Nota total");
        int numero5 = numero1 + numero2 + numero3 + numero4;
        System.out.println(numero5);
    }

    {
        Scanner s = new Scanner(System.in);
        System.out.println("Média do Período");
        int result = s.nextInt();

        if (result <= 5) {
            System.out.println("Reprovado");
        } else if (result <= 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }

}
