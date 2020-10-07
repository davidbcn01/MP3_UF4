package daus2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        int option2;
        int victorias = 0;
        int derrotas = 0;
        int total = 0;
        boolean a = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("1.Daus");
        System.out.println("2.Parxís");
        System.out.println("3.Tic tac toe");
        System.out.println("4.Exit");
        System.out.println("------------------");
        System.out.println("Ingresa tu numero:");
        option = sc.nextInt();
        switch (option) {
            case 1:
                while (!a) {
                    JocDaus juego = new JocDaus();
                    total++;
                    if (juego.jugar()) {
                        victorias++;
                        System.out.println("Has ganado");

                    } else {

                        derrotas++;
                        System.out.println("Has perdido");

                    }

                    System.out.println("Quieres seguir jugando? 1 para seguir,pulsa cualquier otro número para finalizar el juego");
                    option2 = sc.nextInt();

                    if (option2 == 1) {
                    } else {
                        total = victorias + derrotas;
                        System.out.println("Has jugado " + total + "Has ganado " + victorias + " y has perdido " + derrotas);
                        System.exit(0);
                    }
                }


                break;
            case 2:
                System.out.println("Esta opción del juego es un DLC, para jugar pague 9,99");
                break;
            case 3:
                System.out.println("Esta opción del juego es un DLC, para jugar pague 10,99");
                break;
            case 4:

                System.exit(0);
                break;


        }
    }
}

