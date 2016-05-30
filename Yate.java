
public class Yate extends EmbarcacionDeportiva
{
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarote, int potencia, String matricula, float eslora, int anoFab)
    {
        super(potencia, matricula, eslora, anoFab);
        this.camarotes = camarote;
    }

    /**
     * Return coeficiente Bernua
     */
    @Override
    public int getCoeficienteBernua()
    {
				return super.getCoeficienteBernua() + camarotes; 
    }

    public String toString()
    {
        String data = super.toString();
        data += "Númeo de camarotes: " + camarotes + "\n";
        return data;
    }
  
}   
