/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

/**
 *
 * @author ESTUDIANTE
 */
public class MainConexionSQL {
    
      public static void main(String[] args) {
        
        ClassConexionSQLServer conexion = new ClassConexionSQLServer();
        conexion.obtenerConexion();
         System.out.println("Hello World!");
         
    }
}
