package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("--- Star College ----");
            System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("(1)Professor");
            System.out.println("(2)Estudante");
            System.out.println("(3)Disciplinas");
            System.out.println("(0)Sair");
            op = sc.nextInt();
        } while (op != 0);

        switch (op) {
            case 1: //chamar Professor
                break;
            case 2: //chamar Estudante
                break;
            case 3: //Chamar disciplinas
                break;
            default: //default
        }

    }
}
