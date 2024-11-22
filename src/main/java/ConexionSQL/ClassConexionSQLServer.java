/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class ClassConexionSQLServer {
    
    Connection connection = null; 
    
   String user = "Proyecto_Bases"; 
   String pass = "1234";
   String db = "Proyecto_Bases";
   String ip = "localhost"; 
   String port = "1433";
 
   
 public Connection obtenerConexion (){
     try{
         
         
         String cadena = "jdbc:sqlserver://"+ip+":"+port+";databaseName="+db+";user="+user+";password="+pass+";encrypt=true;trustServerCertificate=true";
         connection = DriverManager.getConnection(cadena);
//         JOptionPane.showMessageDialog(null,"Conexion Exitosa a la Base de Datos");
         
         
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error: " + e.toString());
     }
     return connection;
     
 }
 
 
 
 
 
 
public boolean InsertPersons(Person register, String email) {
    // Primero obtenemos el último ID_Persona insertado
    int nuevoID = obtenerUltimoID() + 1;  // Incrementamos el último ID para asignar el nuevo ID_Persona

    // Inserción de la persona en la tabla PERSONAS
    String queryPersonas = "INSERT INTO PERSONAS(ID_Persona, Nombre, Apellido_1, Apellido_2, Contraseña, Fecha_Registro) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection con = obtenerConexion(); 
         PreparedStatement pstPersonas = con.prepareStatement(queryPersonas)) {

        // Asignamos el nuevo ID generado
        pstPersonas.setInt(1, nuevoID);  // Asignamos el ID manualmente
        pstPersonas.setString(2, register.getNombre());
        pstPersonas.setString(3, register.getApellido1());
        pstPersonas.setString(4, register.getApellido2());
        pstPersonas.setString(5, register.getContraseña());
        pstPersonas.setString(6, register.getFechaRegistro());

        // Ejecutar la inserción de la persona
        int filasInsertadasPersonas = pstPersonas.executeUpdate();
        
        // Si se insertó la persona correctamente, insertamos el email
        if (filasInsertadasPersonas > 0) {
            return insertarEmail(nuevoID, email);  // Llamamos al método que inserta el email
        } else {
            return false;  // Si no se insertó la persona, retornamos false
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
        return false;
    }
}

public boolean insertarEmail(int idPersona, String email) {
    // Obtenemos el último ID_Email insertado
    int nuevoID_Email = obtenerUltimoID_Email() + 1;  // Incrementamos el último ID_Email para asignar el nuevo

    String queryEmails = "INSERT INTO Emails(ID_Email, ID_Persona, Email) VALUES (?, ?, ?)";

    try (Connection con = obtenerConexion(); 
         PreparedStatement pstEmail = con.prepareStatement(queryEmails)) {

        // Asignamos el nuevo ID_Email y el ID_Persona
        pstEmail.setInt(1, nuevoID_Email);  // Asignamos el ID_Email manualmente
        pstEmail.setInt(2, idPersona);      // Asignamos el ID_Persona
        pstEmail.setString(3, email);       // Asignamos el email

        // Ejecutar la inserción del email
        int filasInsertadasEmail = pstEmail.executeUpdate();
        return filasInsertadasEmail > 0;  // Retorna true si el email fue insertado correctamente

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar email: " + e.getMessage());
    }
    return false;
}

private int obtenerUltimoID_Email() {
    String query = "SELECT MAX(ID_Email) FROM Emails";
    
    try (Connection con = obtenerConexion(); 
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            return rs.getInt(1);  // Devuelve el último ID_Email
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Email: " + e.getMessage());
    }
    
    return 0;  // Si no hay registros, devuelve 0
}


private int obtenerUltimoID() {
    String query = "SELECT MAX(ID_Persona) FROM PERSONAS";
    
    try (Connection con = obtenerConexion(); 
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            return rs.getInt(1);  // Devuelve el último ID_Persona
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el último ID: " + e.getMessage());
    }
    
    return 0;  // Si no hay registros, devuelve 0
}


// Verificar el Login
public boolean VerifyLogin(String email, String contraseña) {
    // Consulta SQL con INNER JOIN para obtener el correo y contraseña desde ambas tablas
    String query = "SELECT p.ID_Persona FROM Personas p " + 
                   "INNER JOIN Emails e ON p.ID_Persona = e.ID_Persona " +
                   "WHERE e.Email = ? AND p.Contraseña = ?"; 
    
    try (Connection con = obtenerConexion(); 
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, email);  // Establecer el email
        pst.setString(2, contraseña);  // Establecer la contraseña

        try (ResultSet rs = pst.executeQuery()) {
            // Si se encuentra un resultado, las credenciales son correctas
            if (rs.next()) {
                return true;  // Si se encuentra un registro, las credenciales son válidas
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al verificar credenciales: " + e.getMessage());
    }

    // Si no se encuentra el usuario o hay algún error, retornamos false
    return false;
}




    
    
}
