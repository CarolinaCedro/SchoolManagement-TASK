package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int op;

        System.out.println("--- Star College ----");
        do {

            System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("(1)Professor");
            System.out.println("(2)Estudante");
            System.out.println("(3)Disciplinas");
            System.out.println("(0)Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Teacher();
                    break;
                case 2:
                    System.out.println("Estudante ");
                    break;
                case 3: //Chamar disciplinas
                    break;
                default:
                    System.out.println("Saindo...");
            }

        } while (op != 0);


    }

    public static void Teacher() {
        System.out.println("Bem vindo Professor!!");
        System.out.println("Entre com seu id: ");
        int idTeacher = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com seu nome: ");
        String nameTeacher = sc.nextLine();
        //TODO fazer uma lista com cursos e mostrar a opção de cursos para o user escolher
        System.out.println("Entre com o id do curso que deseja se matricular: ");
        int idCourse = sc.nextInt();

    }
}
