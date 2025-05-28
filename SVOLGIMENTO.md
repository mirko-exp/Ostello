# Svolgimento - Progetto "Ospiti Ostello"

## Obiettivo del progetto

Lo scopo di questo progetto è mostrare in modo pratico e semplice le differenze tra **classi astratte e interfacce**, nonché tra **DAO e Repository**, usando un esempio ispirato a un ostello che gestisce i propri ospiti.

---

## Spiegazione concetti chiave

### Classe Astratta

Una **classe astratta** è una classe che può contenere metodi implementati e non implementati (appunto astratti). Non può essere istanziata direttamente.

Nel nostro progetto:
- `Persona` è una classe astratta.
- Contiene un attributo `nome` e un metodo astratto `saluta()` che sarà definito nelle sottoclassi.

### Interfaccia

Un'**interfaccia** definisce un comportamento astratto (solo metodi, senza implementazione) che può essere "aggiunto" a qualunque classe.

Nel progetto:
- `CheckInAble` è un'interfaccia con un solo metodo: `checkIn()`.
- La classe `Ospite` la implementa.

### DAO (Data Access Object)

Il DAO gestisce l'accesso diretto ai dati, come un database. Contiene operazioni **CRUD**:
- `Create`: `salva(Ospite ospite)`
- `Read`: `trovaPerNome(String nome)`
- `Update`: `aggiorna(Ospite ospiteAggiornato)`
- `Delete`: `eliminaPerNome(String nome)`

Nel progetto:
`OspiteDAO` gestisce un `Vector<Ospite>` che simula un archivio di ospiti.

### Repository

Il Repository, invece, è un livello sopra il DAO che usa questi metodi per offrire operazioni più generiche e facili da usare.

Nel progetto:
`OspiteRepository` usa `OspiteDAO` per registrare e gestire gli ospiti.

---

## Classi del progetto

- `Persona` (astratta): base per definire persone con nome.
- `CheckInAble` (interfaccia): impone la presenza del metodo `checkIn()`.
- `Ospite`: estende `Persona` e implementa `CheckInAble`.
- `OspiteDAO`: classe che contiene un `Vector` e implementa tutte le operazioni CRUD.
- `OspiteRepository`: classe che usa il DAO e fornisce metodi di livello superiore.

---

## Esempio di funzionamento

Nel `main`:
1. Si creano due ospiti.
1. Si registra ogni ospite nel repository.
1. Si stampa l'elenco degli ospiti registrati.
1. Si elimina un ospite.
1. Si stampa nuovamente l'elenco degli ospiti registrati.

---

## Diagramma UML

*(vedi file `uml_ostello.png`)*
