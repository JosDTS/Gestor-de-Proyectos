/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

import java.sql.Date;

/**
 *
 * @author Sheys
 */
public class PhasesClass {
    private int IDFases;
    private String Nombre;
    private String Descripcion;
    private Date FechaFase;
    private String EstadoFase;

    public PhasesClass(int IDFases, String Nombre, String Descripcion, Date FechaFase, String EstadoFase) {
        this.IDFases = IDFases;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.FechaFase = FechaFase;
        this.EstadoFase = EstadoFase;
    }

    public PhasesClass() {
    }

    public int getIDFases() {
        return IDFases;
    }

    public void setIDFases(int IDFases) {
        this.IDFases = IDFases;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaFase() {
        return FechaFase;
    }

    public void setFechaFase(Date FechaFase) {
        this.FechaFase = FechaFase;
    }

    public String getEstadoFase() {
        return EstadoFase;
    }

    public void setEstadoFase(String EstadoFase) {
        this.EstadoFase = EstadoFase;
    }
    
    
    
            
}
