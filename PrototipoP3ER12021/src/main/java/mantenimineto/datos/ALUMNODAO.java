/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimineto.datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import mantenimiento.dominio.Alumno;
import seguridad.datos.Conexion;
/**
 *

 */
public class ALUMNODAO {
    private static final String SQL_SELECT = "SELECT carnet_alumno , nombre_alumno , direccion_alumno , telefono_alumno , email_alumno , estatus_alumno FROM alumnos";
    private static final String SQL_INSERT = "INSERT INTO alumnos( carnet_alumno,nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno) VALUES(?, ?, ?, ?, ?,?)";
    private static final String SQL_UPDATE = "UPDATE alumnos SET  carnet_alumno =? nombre_alumno=?, direccion_alumno=?, telefono_alumno=?, email_alumno=?, estatus_alumnos=? WHERE carnet_alumno";
    private static final String SQL_DELETE = "DELETE FROM alumnos WHERE carnet_alumno=?";
    private static final String SQL_QUERY = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno , estatus_alumno FROM alumnos WHERE carnet_alumno = ?";

    
  
     public   Alumno query( Alumno persona){
        /**
         *
         * conexion de base de datos
         */
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Alumno> personas = new ArrayList< Alumno>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
             stmt.setString(1, persona.getCarnet_alumno());
             
          
            rs = stmt.executeQuery();
            while (rs.next()) {
             String carnet_alumno = rs.getString("carnet_alumno");
                String nombre_alumno = rs.getString("nombre_alumno");
                String direccion_alumno = rs.getString("direccion_alumno");
                String telefono_alumno = rs.getString("telefono_alumno");
                String email_alumno = rs.getString("email_alumno");
                String estatus_alumno = rs.getString("estatus_alumno");
                
                persona = new Alumno();
                persona.setCarnet_alumno(carnet_alumno);
                persona.setNombre_alumno(nombre_alumno);
                persona.setDireccion_alumno(direccion_alumno);
                persona.setTelefono_alumno(telefono_alumno);
                persona.setEmail_alumno(email_alumno);
                persona.setEstatus_alumno(estatus_alumno);
                personas.add(persona);
               
            
                /**
                 *
                 * busqueda de datos de la bitacocora en la de usuarios
                 */
                
               
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
           
            Conexion.close(stmt);
            Conexion.close(conn);
        }
       return persona;
 

    
     }
    
   public List<Alumno> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Alumno persona = null;
        List<Alumno> personas = new ArrayList<Alumno>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
               String carnet_alumno = rs.getString("carnet_alumno1");
                String nombre_alumno = rs.getString("nombre_alumno");
                String direccion_alumno = rs.getString("direccion_alumno");
                String telefono_alumno = rs.getString("telefono_alumno");
                String email_alumno = rs.getString("email_alumno");
                String estatus_alumno = rs.getString("estatus_alumno");
                
                persona = new Alumno();
                persona.setCarnet_alumno(carnet_alumno);
                persona.setNombre_alumno(nombre_alumno);
                persona.setDireccion_alumno(direccion_alumno);
                persona.setTelefono_alumno(telefono_alumno);
                persona.setEmail_alumno(email_alumno);
                persona.setEstatus_alumno(estatus_alumno);
                personas.add(persona);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return personas;
    }
    
    public int insert(Alumno persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
               stmt.setString(1, persona.getCarnet_alumno());
            stmt.setString(2, persona.getNombre_alumno());
            stmt.setString(3, persona.getDireccion_alumno());
            stmt.setString(4, persona.getTelefono_alumno());
            stmt.setString(5, persona.getEmail_alumno());
            stmt.setString(6, persona.getEstatus_alumno());
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int update(Alumno persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
                stmt.setString(1, persona.getCarnet_alumno());
            stmt.setString(2, persona.getNombre_alumno());
            stmt.setString(3, persona.getDireccion_alumno());
            stmt.setString(4, persona.getTelefono_alumno());
            stmt.setString(5, persona.getEmail_alumno());
            stmt.setString(6, persona.getEstatus_alumno());
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
        public int delete(Alumno  usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, usuario.getCarnet_alumno());
            rows = stmt.executeUpdate();
            //System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    
   
     //    public List<Persona> query(Persona persona) { // Si se utiliza un ArrayList
    
}




//    
//    private String nombre_maestro;
//    private String direccion_maestro;
//    private String telefono_maestro;
//    private String estatus_maestro;
//    
////    facultades
//    private String codigo_facultad;
//     private String nombre_facultad;
//    private String estatus_facultad;
//////       carreras
//    private String codigo_carreras;
//     private String nombre_carreras;
//    private String estatus_carreras;
//
//    ///       cursos
//    private String codigo_cursos;
//     private String nombre_cursos;
//    private String estatus_cursos;
//     
/////       secciones
//    private String codigo_seccion;
//     private String nombre_seccion;
//    private String estatus_seccion;
//    
/////       sedes
//    private String codigo_sede;
//     private String nombre_sede;
//    private String estatus_sede;
// 
// ///       aula
//    private String codigo_aula;
//     private String nombre_aula;
//    private String estatus_aula;
//    
//    ///       jornadas
//    private String codigo_jornada;
//     private String nombre_jornada;
//    private String estatus_jornada;
