/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sala de Sistemas
 */
public class estudiante {
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int clave;
    private Map<String,String> est=new HashMap();
    
    public estudiante (){
        est.put("cedula", "1043295107");
        est.put("nombre", "jhon ");
        est.put("apellido", "bellido");
        est.put("direccion", "escallov villa ");
        est.put("telefono", "3226735803");
        est.put("clave", "123456789");
        
    }
    public boolean ValidarDatos (String pCedula, String pClave){
        System.out.println(pCedula);
        System.out.println(pClave);
        
        
        boolean logueado= false;
        if(getEst().get("cedula").equals(pCedula)&&getEst().get("clave").equals(pClave)){
            logueado= true;
            return logueado;
        }
        return logueado;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the clave
     */
    public int getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(int clave) {
        this.clave = clave;
    }

    /**
     * @return the est
     */
    public Map<String,String> getEst() {
        return est;
    }

    /**
     * @param est the est to set
     */
    public void setEst(Map<String,String> est) {
        this.est = est;
    }
    
}
