/**
 * Classe astratta che rappresenta una persona generica con un nome.
 * Le sottoclassi devono implementare il metodo saluta().
 * 
 * Utilizzata come classe astratta per Ospite.
 * 
 * @version 1.0 20250528
 * @author <a href="mailto:20498@studenti.marconiverona.edu.it">Mirko Tosi</a>
 * @author <a href="mailto:20407@studenti.marconiverona.edu.it">Plaku Justin</a>
 */
public abstract class Persona {
    public String nome;

    /**
     * Costruttore della persona.
     * @param nome Il nome della persona.
     */
    public Persona(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il nome della persona.
     * @return Il nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo astratto per salutare. Deve essere implementato dalle sottoclassi.
     */
    public abstract void saluta();
}
