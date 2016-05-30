
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class Velero
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int anoFabricacion)
    {
        // initialise instance variables
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }

    @Override
    public int getCoeficienteBernua()
    {
        return potencia;   
    }

    public String toString()
    {
        return ("Tiene " + this.potencia + " de potencia");
    }
}
