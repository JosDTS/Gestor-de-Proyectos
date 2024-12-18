/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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

         
         
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error: " + e.toString());
     }
     return connection;
     
 }
 
 /**
  * Metodo para obtener Tareas 
  * @return 
  */
 
 public List<TasksClass> obtenerTareas() {
        List<TasksClass> tasks = new ArrayList<>();

        String queryTasks = "SELECT * FROM Tareas";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(queryTasks)) {

            while (rs.next()) {
                TasksClass ra = new TasksClass(
                        rs.getInt("ID_Tareas"),
                        rs.getString("Nombre"),
                        rs.getString("Descripcion"),
                        rs.getDate("Fecha_inicio"),
                        rs.getDate("Fecha_fin"),
                        rs.getString("Estado"),
                        rs.getString("Prioridad")
                );
                tasks.add(ra);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Tareas: " + e.getMessage());
        }
        return tasks;
    }
 
 /**
  * Metodo para obtener los Recursos
  * @return 
  */
 
 public List<ResourcesClass> obtenerRecursos() {
        List<ResourcesClass> Resources = new ArrayList<>();

        String query = "SELECT * FROM Recursos";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                ResourcesClass ra = new ResourcesClass(
                        rs.getInt("ID_Recurso"),
                        rs.getString("Tipo_recurso"),
                        rs.getInt("Cantidad_Recurso"),
                        rs.getFloat("Costo")
                );
                Resources.add(ra);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Recursos: " + e.getMessage());
        }
        return Resources;
    }
 
 /**
  * Metodo para obtener los informes
  * @return 
  */
 
    public List<ReportsClass> obtenerInformes() {
        List<ReportsClass> Reports = new ArrayList<>();

        String query = "SELECT * FROM Informes";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                ReportsClass ra = new ReportsClass(
                        rs.getInt("ID_Informe"),
                        rs.getString("Autor"),
                        rs.getString("Descripcion"),
                        rs.getDate("Fecha_Creacion")

                );
                Reports.add(ra);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Informes: " + e.getMessage());
        }
        return Reports;
    }
    
 /**
  * Metodo para obtener Proyectos
  * @return 
  */
 public List<Proyects> obtenerProyectos() {
        List<Proyects> proyectos = new ArrayList<>();
        
        String queryProyectos = "SELECT * FROM Proyectos";

        try (Connection con = obtenerConexion(); 
             Statement stmt = con.createStatement(); 
             ResultSet rs = stmt.executeQuery(queryProyectos)) {

            while (rs.next()) {
                Proyects proyecto = new Proyects(
                        
                    rs.getInt("ID_Proyecto"),
                    rs.getString("Nombre"),
                    rs.getDate("Fecha_inicio"),
                    rs.getDate("Fecha_fin"),
                    rs.getString("Estado"),
                    rs.getFloat("Presupuesto"),
                    rs.getString("Descripcion"),
                    rs.getString("Departamento_Encargado")
                );
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyectos: " + e.getMessage());
        }
        return proyectos;
    }
 
 /**
  * Metodo  para insertar Personas
  * @param register
  * @param email
  * @return 
  */
 
public boolean InsertPersons(Person register, String email) {
    
    int nuevoID = obtenerUltimoID() + 1;  

   
    String queryPersonas = "INSERT INTO PERSONAS(ID_Persona, Nombre, Apellido_1, Apellido_2, Contraseña, Fecha_Registro) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection con = obtenerConexion(); 
         PreparedStatement pstPersonas = con.prepareStatement(queryPersonas)) {

        pstPersonas.setInt(1, nuevoID);  
        pstPersonas.setString(2, register.getNombre());
        pstPersonas.setString(3, register.getApellido1());
        pstPersonas.setString(4, register.getApellido2());
        pstPersonas.setString(5, register.getContraseña());
        pstPersonas.setString(6, register.getFechaRegistro());

        
        int filasInsertadasPersonas = pstPersonas.executeUpdate();
        
      
        if (filasInsertadasPersonas > 0) {
            return insertarEmail(nuevoID, email);  
        } else {
            return false;  
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
        return false;
    }
}

/**
 * Metodo para insertar el Email
 * @param idPersona
 * @param email
 * @return 
 */
public boolean insertarEmail(int idPersona, String email) {
    
    int nuevoID_Email = obtenerUltimoID_Email() + 1;  

    String queryEmails = "INSERT INTO Emails(ID_Email, ID_Persona, Email) VALUES (?, ?, ?)";

    try (Connection con = obtenerConexion(); 
         PreparedStatement pstEmail = con.prepareStatement(queryEmails)) {

        
        pstEmail.setInt(1, nuevoID_Email);  
        pstEmail.setInt(2, idPersona);      
        pstEmail.setString(3, email);       

        
        int filasInsertadasEmail = pstEmail.executeUpdate();
        return filasInsertadasEmail > 0; 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar email: " + e.getMessage());
    }
    return false;
}

/**
 * Metodo para obtener el ultimo ID de Email
 * @return 
 */

private int obtenerUltimoID_Email() {
    String query = "SELECT MAX(ID_Email) FROM Emails";
    
    try (Connection con = obtenerConexion(); 
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            return rs.getInt(1);  
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Email: " + e.getMessage());
    }
    
    return 0;  
}

/**
 * Metodo obtener Ultimo IDProyecto
 * @return 
 */
private int obtenerUltimoIDProyect() {
    String query = "SELECT MAX(ID_Proyecto) FROM Proyectos";
    
    try (Connection con = obtenerConexion(); 
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            return rs.getInt(1);  
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Proyecto: " + e.getMessage());
    }
    
    return 0;  
}

/**
 * Metodo para obtener el ultimo ID_Personas
 * @return 
 */
private int obtenerUltimoID() {
    String query = "SELECT MAX(ID_Persona) FROM PERSONAS";
    
    try (Connection con = obtenerConexion(); 
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            return rs.getInt(1);  
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el último ID: " + e.getMessage());
    }
    
    return 0;  
}


/**
 *Metodo para el login
 * @param email
 * @param contraseña
 * @return 
 */
public boolean VerifyLogin(String email, String contraseña) {
    
    String query = "SELECT p.ID_Persona FROM Personas p " + 
                   "INNER JOIN Emails e ON p.ID_Persona = e.ID_Persona " +
                   "WHERE e.Email = ? AND p.Contraseña = ?"; 
    
    try (Connection con = obtenerConexion(); 
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, email);  
        pst.setString(2, contraseña);  

        try (ResultSet rs = pst.executeQuery()) {
            
            if (rs.next()) {
                return true;  
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al verificar credenciales: " + e.getMessage());
    }

    
    return false;
}


/**
 * Metodo para insertar proyectos
 * @param proyecto
 * @return 
 */
public boolean insertarProyecto() {
    
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
    String fechaInicioStr = JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):");
    String fechaFinStr = JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):");
    String estado = JOptionPane.showInputDialog("Ingrese el estado del proyecto:");
    String presupuestoStr = JOptionPane.showInputDialog("Ingrese el presupuesto del proyecto:");
    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del proyecto:");
    String departamentoEncargado = JOptionPane.showInputDialog("Ingrese el departamento encargado:");

    
    if (nombre == null || fechaInicioStr == null || fechaFinStr == null || estado == null ||
        presupuestoStr == null || descripcion == null || departamentoEncargado == null) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        return false;
    }

   
    float presupuesto;
    try {
        presupuesto = Float.parseFloat(presupuestoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El presupuesto debe ser un número válido.");
        return false;
    }

    
    Date fechaInicio;
    Date fechaFin;
    try {
        fechaInicio = Date.valueOf(fechaInicioStr);
        fechaFin = Date.valueOf(fechaFinStr);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use YYYY-MM-DD.");
        return false;
    }

    
    Proyects nuevoProyecto = new Proyects(0, nombre, fechaInicio, fechaFin, estado, presupuesto, descripcion, departamentoEncargado);

    
    int nuevoID_Proyect = obtenerUltimoIDProyect() + 1;

    String queryInsertar = "INSERT INTO Proyectos (ID_Proyecto, Nombre, Fecha_inicio, Fecha_fin," +
            " Estado, Presupuesto, Descripcion," +
            " Departamento_Encargado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection con = obtenerConexion(); 
         PreparedStatement pstInsertar = con.prepareStatement(queryInsertar)) {

         pstInsertar.setInt(1, nuevoID_Proyect);
         pstInsertar.setString(2, nuevoProyecto.getNombre());
         pstInsertar.setDate(3,new java.sql.Date(nuevoProyecto.getFechaInicio().getTime())); 
         pstInsertar.setDate(4,new java.sql.Date(nuevoProyecto.getFechaFin().getTime())); 
         pstInsertar.setString(5, nuevoProyecto.getEstado());
         pstInsertar.setFloat(6, nuevoProyecto.getPresupuesto());
         pstInsertar.setString(7, nuevoProyecto.getDescripcion());
         pstInsertar.setString(8 , nuevoProyecto.getDepartamentoEncargado());

         int filasInsertadas = pstInsertar.executeUpdate();

         return filasInsertadas > 0; 

     } catch (SQLException e) {
         JOptionPane.showMessageDialog(null,"Error al insertar el proyecto: " + e.getMessage());
         return false; 
     }
}
 
 /**
  * Metodo para editarProyectos
  * @param proyecto
  * @return 
  * 
  */
public boolean editarProyecto(Proyects proyecto) {
    
    String queryActualizar = "UPDATE Proyectos SET Nombre=?, Fecha_inicio=?, Fecha_fin=?, Estado=?, Presupuesto=?, Descripcion=?, Departamento_Encargado=? WHERE ID_Proyecto=?";

    try (Connection con = obtenerConexion(); 
         PreparedStatement pstActualizar = con.prepareStatement(queryActualizar)) {

        
        pstActualizar.setString(1, proyecto.getNombre());
        pstActualizar.setDate(2, new java.sql.Date(proyecto.getFechaInicio().getTime())); 
        pstActualizar.setDate(3, new java.sql.Date(proyecto.getFechaFin().getTime())); 
        pstActualizar.setString(4, proyecto.getEstado());
        pstActualizar.setFloat(5, proyecto.getPresupuesto());
        pstActualizar.setString(6, proyecto.getDescripcion());
        pstActualizar.setString(7, proyecto.getDepartamentoEncargado());
        pstActualizar.setInt(8, proyecto.getIdProyecto()); 

        
        int filasActualizadas = pstActualizar.executeUpdate();

        if (filasActualizadas > 0) {
            
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un proyecto con el ID especificado.");
            return false;
        }

    } catch (SQLException e) {
        
        JOptionPane.showMessageDialog(null, "Error al editar el proyecto: " + e.getMessage());
        return false; 
    }
}

    
    /**
     * Metodo para obtenerproyectos por ID 
     * @param idProyecto
     * @return 
     */
    
     public Proyects obtenerProyectoPorId(int idProyecto) {
        Proyects proyecto = null;
        String queryProyecto = "SELECT * FROM Proyectos WHERE ID_Proyecto=?";

        try (Connection con = obtenerConexion(); 
             PreparedStatement pst = con.prepareStatement(queryProyecto)) {

            pst.setInt(1, idProyecto);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                proyecto = new Proyects(
                    rs.getInt("ID_Proyecto"),
                    rs.getString("Nombre"),
                    rs.getDate("Fecha_inicio"),
                    rs.getDate("Fecha_fin"),
                    rs.getString("Estado"),
                    rs.getFloat("Presupuesto"),
                    rs.getString("Descripcion"),
                    rs.getString("Departamento_Encargado")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener el proyecto: " + e.getMessage());
        }
        
        return proyecto;
    }

 
 public List<PhasesClass> obtenerFases() {
        List<PhasesClass> Phases = new ArrayList<>();

        String query = "SELECT * FROM Fases";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                PhasesClass ra = new PhasesClass(
                        rs.getInt("ID_Fases"),
                        rs.getString("Nombre"),
                        rs.getString("Descripcion"),
                        rs.getDate("Fecha_Fase"),
                        rs.getString("Estado_Fase")

                );
                Phases.add(ra);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Fases: " + e.getMessage());
        }
        return Phases;
    }
 
 
    public List<CommentsClass> obtenerComentarios() {
        List<CommentsClass> Comments = new ArrayList<>();

        String query = "SELECT * FROM Comentarios";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                CommentsClass ra = new CommentsClass(
                        rs.getInt("ID_Comentario"),
                        rs.getDate("Fecha_Comentario"),
                        rs.getString("Contenido")

                );
                Comments.add(ra);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Fases: " + e.getMessage());
        }
        return Comments;
    }
/**
 * Metodo para insertar Recursos Nuevos
 * @return 
 */
public boolean insertarRecursos() {
        
        String tipoRecurso = JOptionPane.showInputDialog("Ingrese el tipo de recurso:");
        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad del recurso):");
        String costosStr = JOptionPane.showInputDialog("Ingrese el costo del recurso:");
       

        
        if (tipoRecurso == null || cantidad == null || costosStr == null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return false;
        }

       
        float costos;

        int cant;
        try {
            costos = Float.parseFloat(costosStr);
            cant = Integer.parseInt(cantidad);
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El costo debe ser un número válido.");
            return false;
        }
        
        
        ResourcesClass nuevoRecurso = new ResourcesClass(0, tipoRecurso, cant, costos);

        
        int nuevoID_Proyect = obtenerUltimoIDRecurso() + 1;

        String queryInsertar = "INSERT INTO Recursos (ID_Recurso, Tipo_Recurso,Cantidad_Recurso,Costo) VALUES (?, ?, ?, ?)";

        try (Connection con = obtenerConexion(); PreparedStatement pstInsertar = con.prepareStatement(queryInsertar)) {

            pstInsertar.setInt(1, nuevoID_Proyect);
            pstInsertar.setString(2, nuevoRecurso.getTipoRecurso());
            pstInsertar.setInt(3, nuevoRecurso.getCantidadRecursos());
            pstInsertar.setFloat(4, nuevoRecurso.getCosto());
           

            int filasInsertadas = pstInsertar.executeUpdate();

            return filasInsertadas > 0; 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el recurso: " + e.getMessage());
            return false;
        }
    }


    private int obtenerUltimoIDRecurso() {
        String query = "SELECT MAX(ID_Recurso) FROM Recursos";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                return rs.getInt(1);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Recurso: " + e.getMessage());
        }

        return 0;  
    }

/**
 *  Metodo para enlistar los proyectos
 * @param nombre
 * @return 
 */
    
    public List<Proyects> buscarProyectosPorNombre(String Id_Proyecto) {
    List<Proyects> proyectos = new ArrayList<>();
    String query = "SELECT * FROM Proyectos WHERE ID_Proyecto LIKE ?"; 

    try (Connection con = obtenerConexion();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, "%" + Id_Proyecto + "%"); 
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Proyects proyecto = new Proyects(
                rs.getInt("ID_Proyecto"),
                rs.getString("Nombre"),
                rs.getDate("Fecha_inicio"),
                rs.getDate("Fecha_fin"),
                rs.getString("Estado"),
                rs.getFloat("Presupuesto"),
                rs.getString("Descripcion"),
                rs.getString("Departamento_Encargado")
            );
            proyectos.add(proyecto);
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
    }

    return proyectos;
}
    /**
     * Metodo para eliminar los proyectos
     * @param idProyecto
     * @return 
     * 
     */
    
    public boolean eliminarProyecto(int idProyecto) {
    String query = "DELETE FROM Proyectos WHERE ID_Proyecto = ?"; 

    try (Connection con = obtenerConexion();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setInt(1, idProyecto); 
        int rowsAffected = pst.executeUpdate();
        
        return rowsAffected > 0; 
    } catch (SQLException e) {
        e.printStackTrace(); 
        return false;
    }
}

   
   public Person obtenerDatosUsuario(String email) {
       String query = "SELECT  p.Nombre, p.Apellido_1, p.Apellido_2, p.Contraseña, p.Fecha_Registro "
                      + "FROM Personas p "
                      + "INNER JOIN Emails e ON p.ID_Persona = e.ID_Persona "
                      + "WHERE e.Email = ?";

       try (Connection con = obtenerConexion(); 
            PreparedStatement pst = con.prepareStatement(query)) {

           pst.setString(1, email);  
           
           try (ResultSet rs = pst.executeQuery()) {
               if (rs.next()) {
                   return new Person(
                     
                       rs.getString("Nombre"),
                       rs.getString("Apellido_1"),
                       rs.getString("Apellido_2"),
                       rs.getString("Contraseña"),
                       rs.getString("Fecha_Registro")
                   );
               }
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al obtener datos del usuario: " + e.getMessage());
       }
       
       return null; 
   }
   
   
   
    /**
     * Insertar tareas
     * @return
     */
    public boolean insertarTareas() {
      
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la tarea:");
         String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la tarea:");
        String fechaInicioStr = JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):");
        String fechaFinStr = JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):");
        String estado = JOptionPane.showInputDialog("Ingrese el estado de la tarea:");
        String prioridad = JOptionPane.showInputDialog("Ingrese la prioridad de la tarea:");
       
        

        if (nombre == null || fechaInicioStr == null || fechaFinStr == null || estado == null
                || prioridad == null || descripcion == null ) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return false;
        }

       
        Date fechaInicio;
        Date fechaFin;
        try {
            fechaInicio = Date.valueOf(fechaInicioStr);
            fechaFin = Date.valueOf(fechaFinStr);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use YYYY-MM-DD.");
            return false;
        }

        
        TasksClass nuevaTarea = new TasksClass(0, nombre,descripcion, fechaInicio, fechaFin, estado, prioridad);

       
        int nuevoID_Tarea = obtenerUltimoIdInforme() + 1;

        String queryInsertar = "INSERT INTO Tareas (ID_Tareas, Nombre, Descripcion, Fecha_inicio, Fecha_fin, Estado,Prioridad) VALUES (?, ?, ?, ?, ?, ?,?)";

        try (Connection con = obtenerConexion(); PreparedStatement pstInsertar = con.prepareStatement(queryInsertar)) {

            pstInsertar.setInt(1, nuevoID_Tarea);
            pstInsertar.setString(2, nuevaTarea.getNombre());
            pstInsertar.setString(3, nuevaTarea.getDescripcion());
            pstInsertar.setDate(4, new java.sql.Date(nuevaTarea.getFecha_Inicio().getTime()));
            pstInsertar.setDate(5, new java.sql.Date(nuevaTarea.getFecha_Fin().getTime()));
            pstInsertar.setString(6, nuevaTarea.getEstado());
             pstInsertar.setString(7, nuevaTarea.getPrioridad());
             
            int filasInsertadas = pstInsertar.executeUpdate();

            return filasInsertadas > 0; 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el tareas: " + e.getMessage());
            return false;
        }
    }
    
    private int obtenerUltimoIdInforme() {
        String query = "SELECT MAX(ID_Tareas) FROM Tareas";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                return rs.getInt(1);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Tarea: " + e.getMessage());
        }

        return 0;  
    }
    /**
     * Metodo para eliminar tareas
     * @param idTarea
     * @return 
     */

     public boolean eliminarTarea(int idTarea) {
    String query = "DELETE FROM Tareas WHERE ID_Tareas = ?"; 

    try (Connection con = obtenerConexion();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setInt(1, idTarea); 
        int rowsAffected = pst.executeUpdate();
        
        return rowsAffected > 0; 
    } catch (SQLException e) {
        e.printStackTrace(); 
        return false;
    }
}




/**
 * Insertar Reportes
 */
    public boolean insertarReports() {
        
        String autor = JOptionPane.showInputDialog("Ingrese el nombre del autor:");
         String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del reporte:");
        String fechaCreacionStr = JOptionPane.showInputDialog("Ingrese la fecha de creacion (YYYY-MM-DD):");
        
       
        

        if (autor == null || descripcion == null || fechaCreacionStr == null ) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return false;
        }

      
        Date fechaCreacion;
     
        try {
            fechaCreacion = Date.valueOf(fechaCreacionStr);
        
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use YYYY-MM-DD.");
            return false;
        }

        
        ReportsClass nuevoInforme = new ReportsClass(0, autor,descripcion, fechaCreacion);

      
        int nuevoID_Informe = obtenerUltimoIDInforme() + 1;

        String queryInsertar = "INSERT INTO Informes (ID_Informe, Autor, Descripcion, Fecha_Creacion) VALUES (?, ?, ?, ?)";

        try (Connection con = obtenerConexion(); PreparedStatement pstInsertar = con.prepareStatement(queryInsertar)) {

            pstInsertar.setInt(1, nuevoID_Informe);
            pstInsertar.setString(2, nuevoInforme.getAutor());
            pstInsertar.setString(3, nuevoInforme.getDescripcion());
            pstInsertar.setDate(4, new java.sql.Date(nuevoInforme.getFechaCreacion().getTime()));
           

            int filasInsertadas = pstInsertar.executeUpdate();

            return filasInsertadas > 0; 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el informes: " + e.getMessage());
            return false;
        }
    }
    private int obtenerUltimoIDInforme() {
        String query = "SELECT MAX(ID_Informe) FROM Informes";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                return rs.getInt(1);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Informe: " + e.getMessage());
        }

        return 0;  
    }
    



/**
 * Insertar Fases
 */
    public boolean insertarFases() {
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la fase:");
         String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la fase:");
        String fechaCreacionStr = JOptionPane.showInputDialog("Ingrese la fecha de la fase (YYYY-MM-DD):");
        String estado=JOptionPane.showInputDialog("Ingrese el estado de la fase:");
        
       
        

        
        if (nombre == null || descripcion == null || fechaCreacionStr == null || estado == null ) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return false;
        }

       
        Date fechaCreacion;
     
        try {
            fechaCreacion = Date.valueOf(fechaCreacionStr);
        
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use YYYY-MM-DD.");
            return false;
        }

        
        PhasesClass nuevaFase = new PhasesClass(0, nombre,descripcion, fechaCreacion, estado);

       
        int nuevoID_Fase = obtenerUltimoIDFase() + 1;

        String queryInsertar = "INSERT INTO Fases (ID_Fases, Nombre, Descripcion, Fecha_Fase, Estado_Fase) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = obtenerConexion(); PreparedStatement pstInsertar = con.prepareStatement(queryInsertar)) {

            pstInsertar.setInt(1, nuevoID_Fase);
            pstInsertar.setString(2, nuevaFase.getNombre());
            pstInsertar.setString(3, nuevaFase.getDescripcion());
            pstInsertar.setDate(4, new java.sql.Date(nuevaFase.getFechaFase().getTime()));
            pstInsertar.setString(5, nuevaFase.getEstadoFase());

            int filasInsertadas = pstInsertar.executeUpdate();

            return filasInsertadas > 0; 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el informes: " + e.getMessage());
            return false;
        }
    }
    private int obtenerUltimoIDFase() {
        String query = "SELECT MAX(ID_Fases) FROM Fases";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                return rs.getInt(1);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Fase: " + e.getMessage());
        }

        return 0;  
    }


/**
 * Insertar Comentarios
 */
    public boolean insertarComentarios() {
       
        String Comentario = JOptionPane.showInputDialog("Ingrese el comentario:");  
        String fechaCreacionStr = JOptionPane.showInputDialog("Ingrese la fecha del comentario (YYYY-MM-DD):");
        
       
        

        
        if (Comentario == null || fechaCreacionStr==null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return false;
        }

        
        Date fechaCreacion;
     
        try {
            fechaCreacion = Date.valueOf(fechaCreacionStr);
        
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use YYYY-MM-DD.");
            return false;
        }

       
        CommentsClass nuevoComentario = new CommentsClass(0,fechaCreacion, Comentario);

      
        int nuevoID_Comment = obtenerUltimoIDComentario() + 1;

        String queryInsertar = "INSERT INTO Comentarios (ID_Comentario, Fecha_Comentario, Contenido) VALUES (?, ?, ?)";

        try (Connection con = obtenerConexion(); PreparedStatement pstInsertar = con.prepareStatement(queryInsertar)) {

            pstInsertar.setInt(1, nuevoID_Comment);
            pstInsertar.setDate(2, nuevoComentario.getFecha_Comentario());
            pstInsertar.setString(3, nuevoComentario.getContenido());
           

            int filasInsertadas = pstInsertar.executeUpdate();

            return filasInsertadas > 0; 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el comentarios: " + e.getMessage());
            return false;
        }
    }
    private int obtenerUltimoIDComentario() {
        String query = "SELECT MAX(ID_Comentario) FROM Comentarios";

        try (Connection con = obtenerConexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                return rs.getInt(1);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el último ID_Comentario: " + e.getMessage());
        }

        return 0;  
    }
   
   
}
