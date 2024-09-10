/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electronica;

/**
 *
 * @author Cetecom
 */
public class Producto {
    private String codigo_producto,nombre_prodcuto;
    private Categoria categoria;
    private int precio_compra,precio_venta,stock;

    public Producto() {
    }

    public Producto(String codigo_producto, String nombre_prodcuto, Categoria categoria, int precio_compra, int precio_venta, int stock) {
        this.codigo_producto = codigo_producto;
        this.nombre_prodcuto = nombre_prodcuto;
        this.categoria = categoria;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.stock = stock;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_prodcuto() {
        return nombre_prodcuto;
    }

    public void setNombre_prodcuto(String nombre_prodcuto) {
        this.nombre_prodcuto = nombre_prodcuto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public double rentabilidad(){
        return (precio_venta - precio_compra) * stock;
    }
    
   
    
        
  
    @Override
    public String toString() {
        return "Codigo del producto : "+"[" + codigo_producto +"]" +
               "Producto: " +"["+ nombre_prodcuto +"]"+ 
               " Categoria: " +"["+ categoria +"]"+ "Precio Compra: " +"["+ precio_compra +"]"+ 
               "Precio Venta: "+"["+ precio_venta +"]"+
               "Stock: " +"["+ stock +"]"+ '}';
    }
     public int compra(){
        return stock + 1;
       
    }
    public int venta(){
        if(stock <= 0){
            System.out.println("No quedan"); 
        }else{
        return stock - 1;
        }
        return 0;
        
    }
    
             


}
