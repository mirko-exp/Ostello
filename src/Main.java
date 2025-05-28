/**
 * Classe principale per l'esecuzione del programma.
 * Dimostra l'utilizzo delle classi Ospite, OspiteRepository.
 * 
 * Crea, registra, stampa, elimina e ristampa gli ospiti per verificare il funzionamento.
 * 
 * @author <a href="mailto:20498@studenti.marconiverona.edu.it">Mirko Tosi</a>
 * @author <a href="mailto:20407@studenti.marconiverona.edu.it">Plaku Justin</a>
 * @version 1.0 20250528
 */
public class Main {
    public static void main(String[] args) {
        OspiteRepository repo = new OspiteRepository();

        // Creo due ospiti
        Ospite o1 = new Ospite("Mario");
        Ospite o2 = new Ospite("Luigi");

        // Li registro
        repo.registraEOspita(o1);
        repo.registraEOspita(o2);

        // Stampo lista
        System.out.println("\nLista iniziale:");
        repo.stampaOspiti();

        // Elimino Luigi
        repo.eliminaOspite("Luigi");

        // Stampo nuovamente la lista finale
        System.out.println("\nDopo modifica:");
        repo.stampaOspiti();
    }
}
