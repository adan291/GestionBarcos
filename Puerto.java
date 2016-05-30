
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler [] alquileres = new Alquiler [NUMERO_AMARRES];
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        // initialise instance variables

    }

    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {      
        int numAmarres = 0;
        int ammares = -1;
        while((numAmarres < NUMERO_AMARRES) && (ammares == -1)) {
            if (alquileres[numAmarres] == null) {
                alquileres[numAmarres] = new Alquiler(numeroDias, cliente, barco);
                ammares = numAmarres;
            }
            numAmarres++;
        }

        return  ammares;
    }

    public void verEstadoAmarres()
    {
        for (int i = 0; i < NUMERO_AMARRES; i++) {
            System.out.println("Amarre nº" + i);
            System.out.println(alquileres[i]);
        }
    }

    public float liquidarAlquiler(int posicion)
    {
        float coste = -1;
        if ((posicion < NUMERO_AMARRES) && 
        (posicion > 0) && 
        (alquileres[posicion] != null)) {
            coste = alquileres[posicion].getCosteAlquiler();
            alquileres[posicion] = null;
        }
        return coste;
    }
}
