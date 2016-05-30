
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends Barco
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Velero
     */
    public Yate(int camarotes, String matricula, float eslora, int anoFabricacion)
    {
        // initialise instance variables
        super(matricula, eslora, anoFabricacion);
        this.camarotes = camarotes;
    }

    @Override
    public int getCoeficienteBernua()
    {
        return camarotes;   
    }

    public String toString()
    {
        return ("Tiene " + this.camarotes + " camarotes");
    }
}
