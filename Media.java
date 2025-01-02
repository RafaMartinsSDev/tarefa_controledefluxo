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
        int numero6 = 4;
        numero5 /= numero6;
        System.out.println("Média do Período");
        System.out.println(numero5);


        String numSt = getNum(numero5);
        System.out.println(numSt);

    }
        public static String getNum(int numero5) {

        if (numero5 >= 0 && numero5 <= 5) {
            return "Reprovado";
        } else if (numero5 >= 6 && numero5 <= 7) {
            return "Recuperação";
        } else {
            return "Aprovado";
        }
    }

}
