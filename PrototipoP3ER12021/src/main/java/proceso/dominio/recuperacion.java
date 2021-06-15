/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso.dominio;

/**
 *
 * @author Dell
 */
public class recuperacion {
 String ID;
    String  nombre; 
 String  carnet;
String   curso ;
 String  jornda;
  String pago;
  String carrera;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getJornda() {
        return jornda;
    }

    public void setJornda(String jornda) {
        this.jornda = jornda;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "recuperacion{" + "ID=" + ID + ", nombre=" + nombre + ", carnet=" + carnet + ", curso=" + curso + ", jornda=" + jornda + ", pago=" + pago + ", carrera=" + carrera + '}';
    }

  

 
  
  
  
}
