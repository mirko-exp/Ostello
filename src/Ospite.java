/**
 * Classe che rappresenta un ospite, che è una persona e può effettuare il check-in.
 * Estende la classe astratta Persona e implementa l'interfaccia CheckInAble.
 * 
 * @author <a href="mailto:20498@studenti.marconiverona.edu.it">Mirko Tosi</a>
 * @author <a href="mailto:20407@studenti.marconiverona.edu.it">Plaku Justin</a>
 * @version 1.0 20250528
 */
public class Ospite extends Persona implements CheckInAble {
    private boolean checkInEffettuato;

    /**
     * Costruttore dell'ospite.
     * @param nome Il nome dell'ospite.
     */
    public Ospite(String nome) {
        super(nome);
        this.checkInEffettuato = false;
    }

    /**
     * Metodo che effettua il check-in e stampa un messaggio.
     */
    public void checkIn() {
        checkInEffettuato = true;
        System.out.println(nome + " ha effettuato il check-in.");
    }

    /**
     * Verifica se l'ospite ha effettuato il check-in.
     * @return true se il check-in è stato effettuato, false altrimenti.
     */
    public boolean isCheckInEffettuato() {
        return checkInEffettuato;
    }

    /**
     * Metodo per far salutare l'ospite.
     */
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " e sono un ospite.");
    }
}
