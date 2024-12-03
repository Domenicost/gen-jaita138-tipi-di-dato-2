import java.util.Scanner;

public class Piatto {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Crea un Piatto");
        System.out.print("Inserisci il nome del piatto: ");
        String nome = sc.nextLine();

        System.out.print("Inerisci una descrizione: ");
        String descrizione = sc.nextLine();

        System.out.print("Definisci un prezzo (in euro): ");
        double prezzo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Il piatto è disponibile? (inserisci true o false): ");
        boolean disponibile = sc.nextBoolean();
        sc.nextLine();

        System.out.print("\nChe tipologia appartiene? \n 1. Antipasto \n 2. Primo Piatto \n 3. Altro \n\nInerisci tipologia: ");
        byte tipologia = sc.nextByte();
        sc.nextLine();

        System.out.print("Inserisci allergeni: ");
        String allergeni = sc.nextLine();

        System.out.print("Carica immagine (inserisci il percorso): ");
        String foto = sc.nextLine();

        System.out.print("Quante calorie ha questo piatto?: ");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.print("Inserisci variazioni: ");
        String variazioni = sc.nextLine();

        System.out.println("--------------------------");
        System.out.println("Perfetto! Hai Creato il piatto: "+ nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + "€");

        if (disponibile == true)
            System.out.println("Disponibilià: Si");
        else
            System.out.println("Disponibilià: No");

        if (tipologia == 1)
            System.out.println("Tipologia: Antipasto");
        else if (tipologia == 2)
            System.out.println("Tipologia: Primo Piatto");
        else
            System.out.println("Tipologia: Altro");

        System.out.println("Allergeni: " + allergeni);
        System.out.println("Calorie: " + calorie);
        System.out.println("Variazioni: " + variazioni);
        System.out.println("Percorso Foto: " + foto);

        sc.close();
    }
}
