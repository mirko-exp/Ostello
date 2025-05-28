import java.util.Vector;

/**
 * /**
 * Classe che gestisce gli ospiti aggiungendo funzionalità in più,
 * usa OspiteDAO per salvare, cercare e modificare i dati.
 * 
 * Permette la registrazione e il check-in degli ospiti, oltre a operazioni CRUD.
 * 
 * @author <a href="mailto:20498@studenti.marconiverona.edu.it">Mirko Tosi</a>
 * @author <a href="mailto:20407@studenti.marconiverona.edu.it">Plaku Justin</a>
 * @version 1.0 20250528
 */
public class OspiteRepository {
    private OspiteDAO dao = new OspiteDAO();

    /**
     * Registra un ospite e gli fa effettuare il check-in.
     * @param ospite L'ospite da registrare.
     */
    public void registraEOspita(Ospite ospite) {
        dao.salva(ospite);
        ospite.checkIn();
    }

    /**
     * Stampa tutti gli ospiti e il loro stato di check-in.
     */
    public void stampaOspiti() {
        Vector<Ospite> lista = dao.getTutti();
        for (int i = 0; i < lista.size(); i++) {
            Ospite o = lista.get(i);
            System.out.println(o.getNome() + " - Check-in: " + o.isCheckInEffettuato());
        }
    }

    /**
     * Elimina un ospite per nome.
     * @param nome Il nome dell'ospite da eliminare.
     * @return true se l'eliminazione ha avuto successo, false altrimenti.
     */
    public boolean eliminaOspite(String nome) {
        return dao.eliminaPerNome(nome);
    }

    /**
     * Aggiorna i dati di un ospite.
     * @param o L'ospite aggiornato.
     * @return true se l'aggiornamento ha avuto successo, false altrimenti.
     */
    public boolean aggiornaOspite(Ospite o) {
        return dao.aggiorna(o);
    }

    /**
     * Cerca un ospite per nome.
     * @param nome Il nome dell'ospite da cercare.
     * @return L'ospite trovato o null se non esiste.
     */
    public Ospite cerca(String nome) {
        return dao.trovaPerNome(nome);
    }
}
