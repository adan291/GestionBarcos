
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;

    private Cliente cliente;

    private Barco barco;

    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        // initialise instance variables
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }
    
    
    /**
     * El precio del alquiler a pagar se calcula sumando el número de días de ocupación 
     * multiplicado por un valor en función del barco (obtenido simplemente multiplicando
     * por 10 los metros de eslora), 
     * más un valor ﬁjo (300 euros) multiplicado por el coeficiente de Bernua del barco.
     */
    public float getCosteAlquiler()
    {
        // ejemplo dias.(eslora*10) + 300 * mastiles
        return (numeroDias *(barco.getEslora()* MULTIPLICADOR_ESLORA)
        + VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua());
    }
    
    public String toString()
    {
        return ("Lleva" + numeroDias + "que va a estar amarrado" + this.barco
        + " este es el barco y el cliente es " + this.cliente);
    }    

}