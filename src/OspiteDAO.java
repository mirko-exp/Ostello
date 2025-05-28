import java.util.Vector;

/**
 * Classe che gestisce la persistenza degli oggetti Ospite, implementando operazioni CRUD.
 * Utilizza un Vector per la memorizzazione in memoria.
 * 
 * @author <a href="mailto:20498@studenti.marconiverona.edu.it">Mirko Tosi</a>
 * @author <a href="mailto:20407@studenti.marconiverona.edu.it">Plaku Justin</a>
 * @version 1.0 20250528
 */
public class OspiteDAO {
    private Vector<Ospite> ospiti = new Vector<Ospite>();

    /**
     * Aggiunge un nuovo ospite.
     * @param ospite L'ospite da salvare.
     */
    public void salva(Ospite ospite) {
        ospiti.addElement(ospite);
        System.out.println("\nOspite salvato: " + ospite.getNome());
    }

    /**
     * Cerca un ospite per nome.
     * @param nome Il nome dell'ospite da cercare.
     * @return L'ospite trovato, oppure null se non trovato.
     */
    public Ospite trovaPerNome(String nome) {
        for (int i = 0; i < ospiti.size(); i++) {
            if (ospiti.get(i).getNome().equals(nome)) {
                return ospiti.elementAt(i);
            }
        }
        return null;
    }

    /**
     * Aggiorna un ospite esistente.
     * @param ospiteAggiornato L'ospite con i dati aggiornati.
     * @return true se l'ospite è stato aggiornato, false altrimenti.
     */
    public boolean aggiorna(Ospite ospiteAggiornato) {
        for (int i = 0; i < ospiti.size(); i++) {
            if (ospiti.elementAt(i).getNome().equals(ospiteAggiornato.getNome())) {
                ospiti.set(i, ospiteAggiornato);
                System.out.println("\nOspite aggiornato: " + ospiteAggiornato.getNome());
                return true;
            }
        }
        return false;
    }

    /**
     * Rimuove un ospite dato il suo nome.
     * @param nome Il nome dell'ospite da rimuovere.
     * @return true se l'ospite è stato rimosso, false altrimenti.
     */
    public boolean eliminaPerNome(String nome) {
        for (int i = 0; i < ospiti.size(); i++) {
            if (ospiti.get(i).getNome().equals(nome)) {
                ospiti.removeElementAt(i);
                System.out.println("\nOspite rimosso: " + nome);
                return true;
            }
        }
        return false;
    }

    /**
     * Restituisce la lista completa degli ospiti salvati.
     * @return Un Vector contenente tutti gli ospiti.
     */
    public Vector<Ospite> getTutti() {
        return ospiti;
    }
}
