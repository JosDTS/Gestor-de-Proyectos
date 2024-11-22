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
public class TasksClass {
    private int ID_Tareas;
    private String Nombre;
    private String Descripcion;
    private Date Fecha_Inicio;
    private Date Fecha_Fin;
    private String Estado;
    private float Presupuesto;
    private String Prioridad;
    private String Departamento_Encargado;

    public TasksClass(int ID_Tareas, String Nombre, String Descripcion, Date Fecha_Inicio, Date Fecha_Fin, String Estado, float Presupuesto, String Prioridad, String Departamento_Encargado) {
        this.ID_Tareas = ID_Tareas;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Fin = Fecha_Fin;
        this.Estado = Estado;
        this.Presupuesto = Presupuesto;
        this.Prioridad = Prioridad;
        this.Departamento_Encargado = Departamento_Encargado;
    }

    public TasksClass() {
    }

    public int getID_Tareas() {
        return ID_Tareas;
    }

    public void setID_Tareas(int ID_Tareas) {
        this.ID_Tareas = ID_Tareas;
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

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public float getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(float Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getDepartamento_Encargado() {
        return Departamento_Encargado;
    }

    public void setDepartamento_Encargado(String Departamento_Encargado) {
        this.Departamento_Encargado = Departamento_Encargado;
    }
    
    
            
}
