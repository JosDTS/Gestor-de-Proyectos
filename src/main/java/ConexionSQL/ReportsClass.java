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
public class ReportsClass {
    private int IDInforme;
    private String Autor;
    private String Descripcion;
    private Date FechaCreacion;

    public ReportsClass(int IDInforme, String Autor, String Descripcion, Date FechaCreacion) {
        this.IDInforme = IDInforme;
        this.Autor = Autor;
        this.Descripcion = Descripcion;
        this.FechaCreacion = FechaCreacion;
    }

    public ReportsClass() {
    }

    public int getIDInforme() {
        return IDInforme;
    }

    public void setIDInforme(int IDInforme) {
        this.IDInforme = IDInforme;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }
    
    
            
}
