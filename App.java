import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int choix = 1;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");
        Togolais vTogolais = new Togolais();
        vTogolais.addDico( "Bonjour","Agbeleme" );

        System.out.println("Choisir votre langue pour dire bonjour ");
        System.out.println("1 : Anglais");
        System.out.println("2 : Breton");
        System.out.println(("3 : Togolais"));

        boolean choixValide = false;
        while (!choixValide) {
            try {
                choix = Integer.parseInt(scan.nextLine());
                if (choix == 1 || choix == 2 || choix == 3) {
                    choixValide = true;
                } else {
                    System.out.println("Choix invalide, veuillez réessayer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide, veuillez entrer un entier.");
            }
        }

        if (choix == 1) {
            System.out.println(vAnglais.getTraduction("Bonjour"));
        }
        else if (choix == 3) {
            System.out.println(vTogolais.getTraduction("Bonjour"));
        }
        else {
            System.out.println(vBreton.getTraduction("Bonjour"));
        }
    }



        //Fenetre f = new Fenetre();
        //f.setVisible(true);
    }

