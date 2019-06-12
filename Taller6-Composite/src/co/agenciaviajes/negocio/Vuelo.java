package co.agenciaviajes.negocio;

import java.util.Date;

/**
 * Representa un determinado vuelo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class Vuelo {

    private String aerolinea;
    private Date fechaHoraLlegada;
    private Date fechaHoraSalida;

    // Complete constructor, getters and setter

    public Vuelo(String aerolinea, Date fechaHoraLlegada, Date fechaHoraSalida) {
        this.aerolinea = aerolinea;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
}
