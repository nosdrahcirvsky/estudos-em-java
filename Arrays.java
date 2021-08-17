import java.util.Scanner;

/**
 * Praticando arrays
 * 
 * @author David, 2020
 *
 */

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] name = new String[5];
        int[] age = new int[5];
        String[] ocupation = new String[5];
        String search;
        boolean foundFlag = false;

        for (int i = 0, j = 1; i < name.length; i++, j++) {
            System.out.println("Digite seu nome, usuário " + j + ": ");
            name[i] = scan.next();

            System.out.println(name[i] + ", digite sua idade: ");
            age[i] = scan.nextInt();

            System.out.println(name[i] + ", digite sua profissão: ");
            ocupation[i] = scan.next();
        }

        System.out.println("######################################################");
        System.out.println("                PESSOAS CADASTRADAS:                  ");
        System.out.println("######################################################");

        for (int i = 0, j = 1; i < name.length; i++, j++) {
            System.out.println("Usuário " + j + " | Nome: " + name[i] + " | Idade: " + age[i] + " | Profissão: " + ocupation[i]);
        }

        System.out.println("######################################################");
        System.out.println("                PESQUISAR POR NOME:                  ");
        System.out.println("######################################################");
        System.out.print("Nome: ");
        search = scan.next();

        // Um bloco try... catch pra evitar a finalização do programa no caso de um input incorreto.
        try {
            for (int i = 0; i < name.length; i++) {
                if (search.equals(name[i])) {
                    System.out.println("######################################################");
                    System.out.println("                CADASTRO ENCONTRADO!                  ");
                    System.out.println("######################################################");
                    System.out.println("Usuário " + i + " | Nome: " + name[i] + " | Idade: " + age[i] + " | Profissão: " + ocupation[i]);
                    foundFlag = true;
                    break;
                }
            }

            if (foundFlag == false) {
                System.out.println("+++++++++++++++++ USUÁRIO NÃO CADASTRADO! +++++++++++++++++");
            }
        } catch (Exception error) {
            System.out.println("Ops... algo deu errado! | " + error.getMessage());
        }
    }
}
