/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electronica;


//Reglas de Negocio:
//1. Método para calcular el valor total del stock:
//• El valor total del stock de un producto se calcula multiplicando el precio de compra por la cantidad en stock.
//2. Método para evaluar la rentabilidad del producto:
//• La rentabilidad se calcula restando el precio de compra al precio de venta, y luego multiplicando el resultado por
//la cantidad en stock.
//3. Método para actualizar el stock tras una venta:
// La cantidad en stock debe reducirse en función de la cantidad vendida. Si la cantidad vendida supera la
//cantidad en stock, se debe indicar un error.
//Validaciones:
//1. El nombre del producto y del proveedor no puede estar vacío.
//2. El precio de compra debe ser mayor que 0.
//3. La cantidad en stock debe ser un número entero no negativo.
//Pruebas de Funcionamiento:
//4. En el método principal, se debe generar un menú inicial que permita ejecutar las funciones requeridas.
//5. Las validaciones se deben realizar en el momento en que se ingresa cada dato.
//6. La información del producto debe ingresarse solo después de haber ingresado el proveedor y la categoría.
public class Categoria {
    private String codigo_categoria,nombre_categoria;
    
    

    public Categoria() {
    }

    public Categoria(String codigo_categoria, String nombre_categoria) {
        this.codigo_categoria = codigo_categoria;
        this.nombre_categoria = nombre_categoria;
    }

    public String getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(String codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigo_categoria=" + codigo_categoria + ", nombre_categoria=" + nombre_categoria + '}';
    }
    public static void limpiarconsola(){
        for(int i = 0; i < 20; i++){
            System.out.println();
        }
    }
}
