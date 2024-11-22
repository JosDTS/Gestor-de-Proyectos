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
public class CommentsClass {
     private int IDComentario;
    private Date Fecha_Comentario;
     private String Contenido;

    public CommentsClass(int IDComentario, Date Fecha_Comentario, String Contenido) {
        this.IDComentario = IDComentario;
        this.Fecha_Comentario = Fecha_Comentario;
        this.Contenido = Contenido;
    }

    public CommentsClass() {
    }

    public int getIDComentario() {
        return IDComentario;
    }

    public void setIDComentario(int IDComentario) {
        this.IDComentario = IDComentario;
    }

    public Date getFecha_Comentario() {
        return Fecha_Comentario;
    }

    public void setFecha_Comentario(Date Fecha_Comentario) {
        this.Fecha_Comentario = Fecha_Comentario;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }
  
     
    
}
