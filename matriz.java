/**
 * Crie um método estático que recebe uma matriz e que faça a rotação de acordo com o angulo informado.
 * Por exemplo:

    matriz = { { 2, 3}, { 4, 5} } 
    rotacionar 90graus
    resultado 
    matriz = { { 4,2}, {5,3}}

    Graus permitidos
    0, 90, 180, 270 e 360

 * Rotacione sempre no sentido horário. 
 * Considere apenas matrizes quadradas.
 */

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int grau = 0;
        String resposta;
        
        while (true){
                System.out.print("Digite um numero inteiro: ");
                numero1 = Integer.parseInt(leitor.nextLine());

                System.out.print("Digite outro numero inteiro: ");
                numero2 = Integer.parseInt(leitor.nextLine());

                System.out.print("Digite outro numero inteiro: ");
                numero3 = Integer.parseInt(leitor.nextLine());
        
                System.out.print("Digite outro numero inteiro: ");
                numero4 = Integer.parseInt(leitor.nextLine());
        
                int Array[][] = {{((numero1))}, {((numero2))}};
                int Array2[][] = {{((numero3))}, {((numero4))}};

                System.out.println(Arrays.deepToString(Array));
                System.out.println(Arrays.deepToString(Array2));
                System.out.println("\b");

                System.out.print("Deseja rotacionar 0° ou 90° ou 180° ou 270° ou 360°? ");
                grau = Integer.parseInt(leitor.nextLine());

                if (grau == 0){
                        System.out.println(Arrays.deepToString(Array));
                        System.out.println(Arrays.deepToString(Array2));
                } else if (grau == 90){
                        System.out.println("Rotacionado 90° ficará: ");

                        int Array3[][] = {{((numero3))}, {((numero1))}};
                        int Array4[][] = {{((numero4))}, {((numero2))}};

                        System.out.println(Arrays.deepToString(Array3));
                        System.out.println(Arrays.deepToString(Array4));
                } else if (grau == 180){
                        System.out.println("Rotacionado 180° ficará: ");

                        int Array3[][] = {{((numero4))}, {((numero3))}};
                        int Array4[][] = {{((numero2))}, {((numero1))}};

                        System.out.println(Arrays.deepToString(Array3));
                        System.out.println(Arrays.deepToString(Array4));
                } else if (grau == 270){
                        System.out.println("Rotacionado 270° ficará: ");

                        int Array3[][] = {{((numero2))}, {((numero4))}};
                        int Array4[][] = {{((numero1))}, {((numero3))}};

                        System.out.println(Arrays.deepToString(Array3));
                        System.out.println(Arrays.deepToString(Array4));
                } else if (grau == 360){
                        System.out.println("Rotacionado 360° ficará: ");

                        int Array3[][] = {{((numero1))}, {((numero2))}};
                        int Array4[][] = {{((numero3))}, {((numero4))}};

                        System.out.println(Arrays.deepToString(Array3));
                        System.out.println(Arrays.deepToString(Array4));
                }

                System.out.println("Deseja realizar a operação novamente?");
                resposta = leitor.nextLine();
                if (resposta.equalsIgnoreCase("sim")) {
                        continue;
                } else if (resposta.equalsIgnoreCase("s")) {
                        continue;
                } else if (resposta.equalsIgnoreCase("ss")) {
                        continue;
                } else if (resposta.equalsIgnoreCase("yes")) {
                        continue;
                } else if (resposta.equalsIgnoreCase("yep")) {
                        continue;
                } else if (resposta.equalsIgnoreCase("sim")) {
                        continue;
                } else if (resposta.equalsIgnoreCase("1")) {
                        continue;
                } else
                        break;
        }
        leitor.close();
    }
}