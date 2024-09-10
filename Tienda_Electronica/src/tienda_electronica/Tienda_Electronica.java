/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda_electronica;

import java.util.Scanner;

//Reglas de Negocio:
//1. Método para calcular el valor total del stock:
//• El valor total del stock de un producto se calcula multiplicando el precio de compra por la cantidad en stock.

//2. Método para evaluar la rentabilidad del producto:
//• La rentabilidad se calcula restando el precio de compra al precio de venta, y luego multiplicando el resultado por
//la cantidad en stock.

//3. Método para actualizar el stock tras una venta:
//• La cantidad en stock debe reducirse en función de la cantidad vendida. Si la cantidad vendida supera la
//cantidad en stock, se debe indicar un error.

//Validaciones:
//1. El nombre del producto y del proveedor no puede estar vacío.
//2. El precio de compra debe ser mayor que 0.
//3. La cantidad en stock debe ser un número entero no negativo
public class Tienda_Electronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Categoria categoria1 = new Categoria("A001", "CONSOLAS");
        Categoria categoria2 = new Categoria("C001", "NOTEBOOKS Y COMPUTACION");
        Categoria categoria3 = new Categoria("T001", "TELEVISORES");
        
        Proveedor proveedor1 = new Proveedor("20.655.524-6", "Joaquin", "Tokio, Japon", 175756424);
        Proveedor proveedor2 = new Proveedor("17.978.567-4", "Fernando", "Santiago, Chile", 975734424);
        Proveedor proveedor3 = new Proveedor("34.001.453-1", "Ignacio", "rio de janeiro, Brazil", 375756424);
        Proveedor proveedor4 = new Proveedor("10.789.567-k", "Carlos", "Nomeseunaciudad, Corea del norte", 975756424);
        
        Producto producto_a002 = new Producto("a002", "Play Station 5", categoria1, 59000, 690000, 2);
        Producto producto_a003 = new Producto("a003", "Play Station 3", categoria1, 15990, 259000, 2);
        Producto producto_a004 = new Producto("a004", "Play Station 4", categoria1, 30000, 459000, 2);
        
        Producto producto_c002 = new Producto("c002", "Notebook lenovo", categoria2, 190000, 1400000, 10);
        Producto producto_c003 = new Producto("c003", "Procesador iNtel core", categoria2, 190000, 1500000, 10);
        Producto producto_c004 = new Producto("c004", "Computador gamer escritorio", categoria2, 190000, 1900000, 2);
        
        
        Producto producto_t002 = new Producto("t002", "Televisor 27 pulgadas  ", categoria3, 100000, 1550000, 3);
        Producto producto_t003 = new Producto("t003", "Televisor 49 pulgadas  ", categoria3, 300000, 1550000, 3);
        Producto producto_t004 = new Producto("t004", "Televisor 34 pulgadas  ", categoria3, 200000, 11550000, 3);
        
        Producto producto_nuevo = new Producto("", "  ", categoria1, 200000, 11550000, 3);
      
        
        
        
        int opcion = 0;
        while(opcion != 4){
            System.out.println("===INVENTARIO===");
            System.out.println("[1] Productos en Stock ");
            System.out.println("[2] vender");
            System.out.println("[3] ingresar producto");
            System.out.println("[4] Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Categoria.limpiarconsola();
                    Scanner entrada1 = new Scanner(System.in);
                    
                    int opcion1 = 0;
                    while(opcion1 != 11){
                   
                    System.out.println("[1] "+producto_a002.getNombre_prodcuto());
                    System.out.println("[2] "+producto_a003.getNombre_prodcuto());
                    System.out.println("[3] "+producto_a004.getNombre_prodcuto());
                    System.out.println("[4] "+producto_c002.getNombre_prodcuto());
                    System.out.println("[5] "+producto_c003.getNombre_prodcuto());
                    System.out.println("[6] "+producto_c004.getNombre_prodcuto());
                    System.out.println("[7] "+producto_t002.getNombre_prodcuto());
                    System.out.println("[8] "+producto_t003.getNombre_prodcuto());
                    System.out.println("[9] "+producto_t004.getNombre_prodcuto());
                     System.out.println("[10] "+producto_nuevo.getNombre_prodcuto());
                    System.out.println("[11]"+" Salir");
                    opcion1 = entrada.nextInt();
                    switch(opcion1){
                        case 1:
                             Categoria.limpiarconsola();
                            System.out.println(producto_a002.getNombre_prodcuto());
                            System.out.println(proveedor1);
                            
                            Scanner entrada2 = new Scanner(System.in);
                    
                            int opcion2 = 0;
                            while(opcion2 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion2 = entrada2.nextInt();
                                switch(opcion2){
                                    
                                    case 1:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_a002.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        producto_a002.compra();
                                        System.out.println(producto_a002.compra());
                                        producto_a002.setStock(producto_a002.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles " + producto_a002.getStock());
                                        
                                        break;
                                    case 3:
                                         Categoria.limpiarconsola();
                                        break;
                                }
                                
                                                        }
                            break;
                        case 2:
                             Categoria.limpiarconsola();
                            System.out.println(producto_a003.getNombre_prodcuto());
                            System.out.println(proveedor1);
                            Scanner entrada3 = new Scanner(System.in);
                    
                            int opcion3 = 0;
                            while(opcion3 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion3 = entrada3.nextInt();
                                
                                switch(opcion3){
                                    case 1:
                                         Categoria.limpiarconsola();
                                        System.out.println((int) producto_a003.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_a003.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_a003.getStock());
                                        
                                        break;
                                    case 3:
                                         Categoria.limpiarconsola();
                                        break;
                                }
                                
                                                        }
                            break;
                        case 3:
                             Categoria.limpiarconsola();
                            System.out.println(producto_a004.getNombre_prodcuto());
                            System.out.println(proveedor1);
                            Scanner entrada4 = new Scanner(System.in);
                    
                            int opcion4 = 0;
                            while(opcion4 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion4 = entrada4.nextInt();
                                
                                switch(opcion4){
                                    case 1:
                                         Categoria.limpiarconsola();
                                        System.out.println((int) producto_a004.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_a004.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_a004.getStock());
                                        
                                        break;
                                    case 3:
                                         Categoria.limpiarconsola();
                                        break;
                                }}
                            
                            break;
                        case 4:
                             Categoria.limpiarconsola();
                            System.out.println(producto_c002.getNombre_prodcuto());
                            System.out.println(proveedor2);
                            Scanner entrada5 = new Scanner(System.in);
                    
                            int opcion5 = 0;
                            while(opcion5 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion5 = entrada5.nextInt();
                                
                                switch(opcion5){
                                    case 1:
                                         Categoria.limpiarconsola();
                                        System.out.println((int) producto_c002.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_c002.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_c002.getStock());
                                        
                                        break;
                                    case 3:
                                        break;
                                }}
                            break;
                        case 5:
                             Categoria.limpiarconsola();
                            System.out.println(producto_c003.getNombre_prodcuto());
                            System.out.println(proveedor3);
                            Scanner entrada6 = new Scanner(System.in);
                    
                            int opcion6 = 0;
                            while(opcion6 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion6 = entrada6.nextInt();
                                
                                switch(opcion6){
                                    case 1:
                                         Categoria.limpiarconsola();
                                        System.out.println((int) producto_c003.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_c003.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_c003.getStock());
                                        
                                        break;
                                    case 3:
                                         Categoria.limpiarconsola();
                                        break;
                                }}
                            break;
                        case 6:
                             Categoria.limpiarconsola();
                            System.out.println(producto_c004.getNombre_prodcuto());
                            System.out.println(proveedor3);
                            Scanner entrada7 = new Scanner(System.in);
                    
                            int opcion7 = 0;
                            while(opcion7 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion7 = entrada7.nextInt();
                                
                                switch(opcion7){
                                    case 1:
                                         
                                        System.out.println((int) producto_c004.rentabilidad());
                                        break;
                                    case 2:
                                        
                                        System.out.println(producto_c004.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_c004.getStock());
                                        
                                        break;
                                    case 3:
                                         Categoria.limpiarconsola();
                                        break;
                                }}
                            break;
                        case 7:
                            
                            System.out.println(producto_t002.getNombre_prodcuto());
                            System.out.println(proveedor2);
                            Scanner entrada8 = new Scanner(System.in);
                    
                            int opcion8 = 0;
                            while(opcion8 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion8 = entrada8.nextInt();
                                
                                switch(opcion8){
                                    case 1:
                                       
                                        System.out.println((int) producto_t002.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_t002.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_t002.getStock());
                                        
                                        break;
                                    case 3:
                                        break;
                                }}
                            break;
                        case 8:
                           
                            System.out.println(producto_t003.getNombre_prodcuto());
                            System.out.println(proveedor2);
                            Scanner entrada9 = new Scanner(System.in);
                    
                            int opcion9 = 0;
                            while(opcion9 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion9 = entrada9.nextInt();
                                
                                switch(opcion9){
                                    case 1:
                                        
                                        System.out.println((int) producto_t003.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_t003.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_t003.getStock());
                                        
                                        break;
                                    case 3:
                                        break;
                                }}
                            break;
                        case 9:
                          
                            System.out.println(producto_t004.getNombre_prodcuto());
                            System.out.println(proveedor3);
                            Scanner entrada10 = new Scanner(System.in);
                    
                            int opcion10 = 0;
                            while(opcion10 != 3){
                            System.out.println("Seleccione opcion a realizar: ");
                                System.out.println("Rentabilidad [1]");
                                System.out.println("comprar[2]");
                                System.out.println("salir");
                                opcion10 = entrada10.nextInt();
                                
                                switch(opcion10){
                                    case 1:
                                         Categoria.limpiarconsola();
                                        System.out.println((int) producto_t004.rentabilidad());
                                        break;
                                    case 2:
                                         Categoria.limpiarconsola();
                                        System.out.println(producto_t004.compra());
                                        System.out.println("Compra realizada con exito");
                                        System.out.println("productos disponibles" + producto_t004.getStock());
                                        
                                        break;
                                    case 3:
                                         Categoria.limpiarconsola();
                                        break;
                                }}
                            break;
                        case 10:
                            
                        
                            break;
                        default:
                            System.out.println("Salir");
                    }
                    }
                           
                    break;
                case 2:
                Categoria.limpiarconsola();    
                System.out.println("Seleccione producto para vender.");
                Scanner entrada12 = new Scanner(System.in);
                    
                    int opcion12 = 0;
                    while(opcion12 != 10){
                    System.out.println(producto_a002);
                    System.out.println(producto_a003);
                    System.out.println(producto_a004);
                    System.out.println(producto_c002);
                    System.out.println(producto_c003);
                    System.out.println(producto_c004);
                    System.out.println(producto_t002);
                    System.out.println(producto_t003);
                    System.out.println(producto_t004);
                    System.out.println("Salir");
                    opcion12 = entrada.nextInt();
                    switch(opcion12){
                        case 1:
                             
                            producto_a002.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_a002.getStock());
                            break;
                        case 2:
                             
                            producto_a003.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_a003.getStock());
                            break;
                        case 3:
                            producto_a004.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_a004.getStock());
                            break;
                        case 4:
                            producto_c002.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_c002.getStock());
                            break;
                        case 5:
                            producto_c003.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_c003.getStock());
                            break;
                        case 6:
                            producto_c004.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_c004.getStock());
                            break;
                        case 7:
                            producto_t002.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_t002.getStock());
                            break;
                        case 8:
                            producto_t003.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_t003.getStock());
                            break;
                        case 9:
                            producto_t004.venta();
                            producto_a002.setStock(-1);
                            System.out.println("venta realizada con exito " + producto_t004.getStock());
                            break;
                        case 10:
                            System.out.println("Saliendo");
                            break;
                            
                    }
                            }
                    
                    break;
                case 3:
                    Scanner entrada14 = new Scanner(System.in);
                    Scanner entrada15 = new Scanner(System.in);
                    
                    String opcion13 = "";
                    System.out.println("Ingrese producto nuevo");
                    while(true){
                        
                        System.out.println("ingrese codigo del producto");
                        opcion13 = entrada14.next();
                        
                        producto_nuevo.setNombre_prodcuto(opcion13);
                        
                        System.out.println("Ingrese nombre ");
                        opcion13 = entrada14.next();
                                
                        producto_nuevo.setNombre_prodcuto(opcion13);
                        
                        
                        
                        int opcion14 = 0;
                        
                        System.out.println("Ingrese valor de entrada");
                        opcion14 = entrada15.nextInt();
                        producto_nuevo.setPrecio_compra(opcion14);
                        
                        System.out.println("Ingrese valor de salida");
                        opcion14 = entrada15.nextInt();
                        producto_nuevo.setPrecio_venta(opcion14);                       
                        producto_nuevo.setStock(1);
                        
                    System.out.println("Producto " + producto_nuevo.getNombre_prodcuto()+" ha sido ingresado con exito"); 
                    break;
                    }
                    
                    break;
                   

                case 4:
                    System.out.println("Saliendo. . .");
                    break;
                default:
                    System.out.println("Opcion invalida, seleccione un numero porfavor");
                    
            }
        }
    }
    
}
