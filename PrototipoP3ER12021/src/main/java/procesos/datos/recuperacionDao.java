
package procesos.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proceso.dominio.recuperacion;
import seguridad.datos.Conexion;
import static seguridad.datos.Conexion.getConnection;
import seguridad.dominio.Usuario;

/**
 *
 * @author Dell
 */
public class recuperacionDao {
    
  private static final String SQL_SELECT = "SELECT carnet, nombre_alumno, carrera_alumno,  curso_alumno, jornada_alumno,  pago_alumno FROM recuperacion";
    private static final String SQL_INSERT = "INSERT INTO recuperacion(carnet, nombre_alumno, carrera_alumno,  curso_alumno, jornada_alumno,  pago_alumno) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE recuperacion SET carnet=?, nombre_alumno=?, carrera_alumno=?,  curso_alumno=?, jornada_alumno=?,  pago_alumno=? WHERE carnet";
    private static final String SQL_DELETE = "DELETE FROM recuperacion WHERE carnet=?";

    private static final String SQL_QUERY2 = "SELECT PK_id_usuario, nombre_usuario, apellido_usuario, username_usuario, password_usuario, correo_usuario, cambio_password, estado_usuario, ultima_conexion FROM tbl_usuario WHERE PK_id_usuario = ?";
   private static final String SQL_QUERY = "SELECT carnet, nombre_alumno, carrera_alumno,  curso_alumno, jornada_alumno,  pago_alumno FROM recuperacion WHERE  carnet=?";
    Conexion conectar = new Conexion();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    recuperacion usuario = null;

    public List<recuperacion> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        recuperacion usuario = null;
        List<recuperacion> usuarios = new ArrayList<recuperacion>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                String nombre = rs.getString("nombre_alumno");
                String carnet = rs.getString("carnet");
                   String carrera = rs.getString("carrera_alumno");
                String curso = rs.getString("curso_alumno");
                String jornada = rs.getString("jornada_alumno");
              
                String pago = rs.getString("pago_alumno");

                usuario = new recuperacion();
             
                usuario.setNombre(nombre);
                usuario.setCarnet(carnet);
                usuario.setCurso(curso);
                usuario.setJornda(jornada);

                usuario.setPago(pago);
                 usuario.setCarrera(carrera);
               

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuarios;
    }

    public recuperacion  query(recuperacion  usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, usuario.getCarnet());
            rs = stmt.executeQuery();
            while (rs.next()) {
                 String nombre = rs.getString("nombre_alumno");
                String carnet = rs.getString("carnet");
                String curso = rs.getString("curso_alumno");
                String carrera = rs.getString("carrera_alumno");
                String jornada = rs.getString("jornada_alumno");
              
                String pago = rs.getString("pago_alumno");

                usuario = new recuperacion();
             
                usuario.setNombre(nombre);
                usuario.setCarnet(carnet);
                usuario.setCurso(curso);
                usuario.setCarrera(carrera);
                usuario.setJornda(jornada);

                usuario.setPago(pago);
               

                
                rows++;
            }
            //System.out.println("Registros buscado:" + usuario);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuario;
    }
    
    public Usuario query2(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY2);
            stmt.setInt(1, usuario.getId_usuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_usuario = rs.getInt("PK_id_usuario");
                String nombre_usuario = rs.getString("nombre_usuario");
                String apellido_usuario = rs.getString("apellido_usuario");
                String user_usuario = rs.getString("username_usuario");
                String password_usuario = rs.getString("password_usuario");
                String correo_usuario = rs.getString("correo_usuario");
                int cambio_contrasena = rs.getInt("cambio_password");
                int estado_usuario = rs.getInt("estado_usuario");
                String ultima_conexion = rs.getString("ultima_conexion");

                usuario = new Usuario();
                usuario.setId_usuario(id_usuario);
                usuario.setNombre_usuario(nombre_usuario);
                usuario.setApellido_usuario(apellido_usuario);
                usuario.setUser_usuario(user_usuario);
                usuario.setPassword_usuario(password_usuario);
                usuario.setCorreo_usuario(correo_usuario);
                usuario.setCambio_password(cambio_contrasena);
                usuario.setEstado_usuario(estado_usuario);
                usuario.setUltima_conexion(ultima_conexion);

                rows++;
            }
            System.out.println("Registros buscado:" + usuario);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuario;
    }

    public int delete(recuperacion  usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, usuario.getCarnet());
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

    public int update(recuperacion  usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            //System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getCarnet());
            stmt.setString(2, usuario.getNombre());
              stmt.setString(3, usuario.getCarrera());
            stmt.setString(4, usuario.getCurso());
            stmt.setString(5, usuario.getJornda());
            stmt.setString(6, usuario.getPago());
           
          
            rows = stmt.executeUpdate();
            //System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int insert(recuperacion usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
               stmt.setString(1, usuario.getCarnet());
            stmt.setString(2, usuario.getNombre());
              stmt.setString(3, usuario.getCarrera());
            stmt.setString(4, usuario.getCurso());
            stmt.setString(5, usuario.getJornda());
            stmt.setString(6, usuario.getPago());
           
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return 1;
    }

      
    
}
