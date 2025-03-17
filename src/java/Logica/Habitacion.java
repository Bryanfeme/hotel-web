package Logica;

import java.io.Serializable;
// Importaciones actualizadas a jakarta.persistence
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Habitacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHabitacion;
    @Basic
    private String nombreTematica;
    private String pisoUbicacion;
    private Double precioNoche;
    @ManyToOne
    private TipoHabitacion tipo;

    public Habitacion() {
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNombreTematica() {
        return nombreTematica;
    }

    public void setNombreTematica(String nombreTematica) {
        this.nombreTematica = nombreTematica;
    }

    public String getPisoUbicacion() {
        return pisoUbicacion;
    }

    public void setPisoUbicacion(String pisoUbicacion) {
        this.pisoUbicacion = pisoUbicacion;
    }

    public Double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    
    
    
}
