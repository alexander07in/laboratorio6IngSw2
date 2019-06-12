package co.agenciaviajes.negocio;

/**
 * Hoteles del hospeaje
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class Hotel {

    private String nombre;

    //Complete constructor, getters and setters
    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}