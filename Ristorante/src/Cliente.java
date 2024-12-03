import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Crea un Cliente!");
        System.out.print("Inserisci il nome : ");
        String nome = sc.nextLine();

        System.out.print("Inerisci il cognome: ");
        String cognome = sc.nextLine();

        System.out.print("Data di nascita: [dd/MM/yyyy]: ");
        String dataNascitaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitaStr, formatter);

        System.out.print("Inerisci il numero di telefono: ");
        String nTelefono = sc.nextLine();

        System.out.print("Data e ora di iscrizione: [dd/MM/yyyy HH:mm]: ");
        String dataTimeIscrizioneStr = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataTimeIscrizione = LocalDateTime.parse(dataTimeIscrizioneStr, dateTimeFormatter);

        System.out.print("Inerisci la sua email: ");
        String email = sc.nextLine();

        System.out.print("Crea Username: ");
        String username = sc.nextLine();

        System.out.print("Crea una Password: ");
        String password = sc.nextLine();

        System.out.print("Note: ");
        String note = sc.nextLine();

        sc.close();

        System.out.println("\n--------------------------\n");
        System.out.println("Perfetto! hai creato: " + nome + " " + cognome);
        System.out.println("Data di nascita: " + dataNascita);
        System.out.println("Numero di telefono: " + nTelefono);
        System.out.println("Data iscrizione: " + dataTimeIscrizione);
        System.out.println("Indirizzo email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Note: " + note);
    }

}
