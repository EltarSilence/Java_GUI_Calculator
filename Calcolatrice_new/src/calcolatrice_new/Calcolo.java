/**
 * Classe di gestione di una calcolatrice
 * Lato teorico
 * 
 * @author Giovanni Rizza 4AI
 * @version 07/02/2018
*/

package calcolatrice_new;

//import javax.swing.JOptionPane;

public class Calcolo {
    
    private char calcolo;
    private String numbers;
    private double n1;
    private double n2;
    private boolean is_n1_set;
    private boolean is_n2_set;
    /**
     * Costruttore vuoto
     */
    public Calcolo(){}
    /**
     * Costruttore che viene utilizzato per creare l'oggetto
     * @param calcolo Vedi il metodo relativo
     */
    public Calcolo(char calcolo) {
        this.calcolo = calcolo;
        this.numbers = "";
        this.is_n1_set = false;
        this.is_n2_set = false;
    }

    public char getCalcolo() {
        return calcolo;
    }
    
    /**
     * Metodo standard SET
     * @param calcolo Variabile che identifica il tipo di calcolo da effettuare
     */
    public void setCalcolo(char calcolo) {
        this.calcolo = calcolo;
        
    }

    public String getNumbers() {
        return numbers;
    }
    
    /**
     * Metodo standard SET
     * @param numbers La stringa di accumulazione progressiva delle cifre
     */
    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    /**
     * @return se e' stato inserito o meno il primo numero
     */
    public boolean getIfIs_n1_set() {
        return is_n1_set;
    }

    public void setIs_n1_set(boolean is_n1_set) {
        this.is_n1_set = is_n1_set;
    }
    /**
     * @return se e' stato inserito o meno il secondo numero
     */
    public boolean getIfIs_n2_set() {
        return is_n2_set;
    }

    public void setIs_n2_set(boolean is_n2_set) {
        this.is_n2_set = is_n2_set;
    }
    
    /**
     * @param n Numero corrispondente al pulsante premuto
     * @return La stringa contente anche il numero relativo all'ultimo pulsante premuto
     */
    public String pushNumber(String n){
        return numbers += n;
    }
    
    /**
     * Metodo che va ad effettuare l'operazione tra gli attributi
     * @return Il risultato dell'operazione
     */
    public double calcolo(){
        double risultato = 0;
        switch (calcolo){
            case '+':
                risultato = n1 + n2;
                break;
            case '-':
                risultato = n1 - n2;
                break;   
            case 'x':
                risultato = n1 * n2;
                break;
            case '/':
                risultato = n1 / n2;
                break;
            default:
                break;
        }
        return risultato;
    }
    
    /**
     * Metodo che "resetta" il calcolatore
     * @param c Oggetto di calcolo
     * @return L'oggetto privato delle sue caratteristiche
     */
    public static Calcolo destroy(Calcolo c){
        c.setNumbers("");
        c.setN1(0);
        c.setN2(0);
        c.setIs_n1_set(false);
        c.setIs_n2_set(false);
        return c;
    }
    
}
