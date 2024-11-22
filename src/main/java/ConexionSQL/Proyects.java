/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

import java.sql.Date;

/**
 *
 * @author ESTUDIANTE
 */
public class Proyects {
    
    private int idProyecto;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private float presupuesto;
    private String descripcion;
    private String departamentoEncargado;

    public Proyects() {
    }

    public Proyects(int idProyecto, String nombre, Date fechaInicio, Date fechaFin, String estado, float presupuesto, String descripcion, String departamentoEncargado) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.presupuesto = presupuesto;
        this.descripcion = descripcion;
        this.departamentoEncargado = departamentoEncargado;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamentoEncargado() {
        return departamentoEncargado;
    }

    public void setDepartamentoEncargado(String departamentoEncargado) {
        this.departamentoEncargado = departamentoEncargado;
    }
    
    
}
  