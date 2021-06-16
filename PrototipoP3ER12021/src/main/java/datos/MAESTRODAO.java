///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package datos;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
///**
// *
// * @author 
// */
//public class MAESTRODAO {
//      private static final String SQL_SELECT = "SELECT codigo_maestro , nombre_maestro , direccion_maestro , telefono_maestro , email_maestro , estatus_maestro FROM maestro";
//    private static final String SQL_INSERT = "INSERT INTO maestros( nombre_maestro, direccion_maestro, telefono_maestro, email_maestro, estatus_maestro) VALUES(?, ?, ?, ?, ?)";
//   
//    public List<Maestro> select(){
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        Maestro persona = null;
//        List<Maestro> personas = new ArrayList<Maestro>();
//        
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_SELECT);
//            rs = stmt.executeQuery();
//            while(rs.next()){
//                int codigo_maestro = rs.getInt("codigo_maestro");
//                String nombre_maestro = rs.getString("nombre_maestro");
//                String direccion_maestro = rs.getString("direccion_maestro");
//                String telefono_maestro = rs.getString("telefono_maestro");
//                String email_maestro = rs.getString("email_maestro");
//                String estatus_maestro = rs.getString("estatus_maestro");
//                
//                persona = new Maestro();
//                persona.setCodigo_maestro(codigo_maestro);
//                persona.setNombre_maestro(nombre_maestro);
//                persona.setDireccion_maestro(direccion_maestro);
//                persona.setTelefono_maestro(telefono_maestro);
//                persona.setEmail_maestro(email_maestro);
//                persona.setEstatus_maestro(estatus_maestro);
//                personas.add(persona);
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        }
//        finally{
//            Conexion.close(rs);
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//        
//        return personas;
//    }
//    
//    public int insert(Maestro persona){
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int rows = 0;
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_INSERT);
//            stmt.setString(1, persona.getNombre_maestro());
//            stmt.setString(2, persona.getDireccion_maestro());
//            stmt.setString(3, persona.getTelefono_maestro());
//            stmt.setString(4, persona.getEmail_maestro());
//            stmt.setString(5, persona.getEstatus_maestro());
//            System.out.println("ejecutando query:" + SQL_INSERT);
//            rows = stmt.executeUpdate();
//            System.out.println("Registros afectados:" + rows);
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        }
//        finally{
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
//        
//        return rows;
//    }
//    
//    
//    
//    
//    
//    
//}
