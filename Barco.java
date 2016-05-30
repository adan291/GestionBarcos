
/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public Barco(String matricula, float eslora, int anoFabricacion)
    {
        // put your code here
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;

    }

    public String getMatricula()
    {
        return matricula;
    }

    public float getEslora()
    {
        return eslora;
    }

    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }

    public abstract int getCoeficienteBernua();
   
    public String toString()
    {
        return ("La matricula es " + this.matricula + " con una eslora de " + this.eslora 
            + " y año de fabricacion de " + this.anoFabricacion);
    }
}
