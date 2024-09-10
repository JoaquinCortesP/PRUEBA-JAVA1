/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electronica;



public class Proveedor {
    //RUT del proveedor
// Nombre del proveedor
//Teléfono
// Dirección
    
   private String rut_proveedor,nombre_proveedor,direccion;
   private int telefono;

    public Proveedor() {
    }

    public Proveedor(String rut_proveedor, String nombre_proveedor, String direccion, int telefono) {
        this.rut_proveedor = rut_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getRut_proveedor() {
        return rut_proveedor;
    }

    public void setRut_proveedor(String rut_proveedor) {
        this.rut_proveedor = rut_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "PROVEEDOR" + "RUT: " +
                "["+ rut_proveedor +"]"+ "NOMBRE: " +"["+ nombre_proveedor +"]"+ "DIRECCION: " +"["+ direccion +"]"+ "TELEFONO: " +"["+ telefono +"]";
    }
   
}
