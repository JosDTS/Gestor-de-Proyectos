/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

/**
 *
 * @author Sheys
 */
public class ResourcesClass {
    private int IDRecurso;
    private String TipoRecurso;
    private int CantidadRecursos;
    private float costo;

    public ResourcesClass(int IDRecurso, String TipoRecurso, int CantidadRecursos, float costo) {
        this.IDRecurso = IDRecurso;
        this.TipoRecurso = TipoRecurso;
        this.CantidadRecursos = CantidadRecursos;
        this.costo = costo;
    }

    public ResourcesClass() {
    }

    public int getIDRecurso() {
        return IDRecurso;
    }

    public void setIDRecurso(int IDRecurso) {
        this.IDRecurso = IDRecurso;
    }

    public String getTipoRecurso() {
        return TipoRecurso;
    }

    public void setTipoRecurso(String TipoRecurso) {
        this.TipoRecurso = TipoRecurso;
    }

    public int getCantidadRecursos() {
        return CantidadRecursos;
    }

    public void setCantidadRecursos(int CantidadRecursos) {
        this.CantidadRecursos = CantidadRecursos;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
           
}
