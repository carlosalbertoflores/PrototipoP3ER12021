/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento.dominio;

/**
 *
 * @author DEll
 */
public class Alumno {
//    alumnos
     private String  carnet_alumno;
    private String nombre_alumno;
    private String direccion_alumno;
 private String telefono_alumno;
    private String email_alumno;
    private String estatus_alumno;

    public String getCarnet_alumno() {
        return carnet_alumno;
    }

    public void setCarnet_alumno(String carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getDireccion_alumno() {
        return direccion_alumno;
    }

    public void setDireccion_alumno(String direccion_alumno) {
        this.direccion_alumno = direccion_alumno;
    }

    public String getTelefono_alumno() {
        return telefono_alumno;
    }

    public void setTelefono_alumno(String telefono_alumno) {
        this.telefono_alumno = telefono_alumno;
    }

    public String getEmail_alumno() {
        return email_alumno;
    }

    public void setEmail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }

    public String getEstatus_alumno() {
        return estatus_alumno;
    }

    public void setEstatus_alumno(String estatus_alumno) {
        this.estatus_alumno = estatus_alumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "carnet_alumno=" + carnet_alumno + ", nombre_alumno=" + nombre_alumno + ", direccion_alumno=" + direccion_alumno + ", telefono_alumno=" + telefono_alumno + ", email_alumno=" + email_alumno + ", estatus_alumno=" + estatus_alumno + '}';
    }

  
    


  
}
 