
package Entidades;

import java.util.Scanner;

public abstract class Electrodomestico {
      
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
   protected Integer  precio;
   protected String color;
   protected String consumo;
   protected Double peso;

   
    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, String consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {
        String letra = this.consumo;
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B")|| letra.equalsIgnoreCase("C") 
           || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {
            this.consumo = letra;         
        } else{
            this.consumo= "F";
        }
    }
    public void comprobarColor (){
        String color= this.color;
        if(color.equalsIgnoreCase("blanco")  ||color.equalsIgnoreCase("negro")|| color.equalsIgnoreCase("gris") ||
           color.equalsIgnoreCase("rojo") ||color.equalsIgnoreCase("azul")){
            this.color= color;         
        } else {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() { 
        
        System.out.println("Ingrese el precio del electrodomestico ");
        int p=0;
        p= leer.nextInt();
        if (p < 1000){
        this.precio=1000;
        }else {
            this.precio=p;
        }
        System.out.println("Ingrese el color del electrodomestico");
        this.color= leer.next();
        System.out.println("Ingrese el Consumo del electrodomestico");
        this.consumo=  leer.next();
        System.out.println("Ingrese el Peso del electrodomestico");
        this.peso=  leer.nextDouble();
        
        this.comprobarConsumoEnergetico();
        this.comprobarColor();   
        
       
    }

    @Override
    public String toString() {
        return "Electrodomestico{ precio=" + precio + ", color=" + color +
                ", consumo=" + consumo + ", peso=" + peso + '}';
        
    }
    
    public void calcularPrecioxPeso() {
        Integer  precioPorPeso = 0;
        if (this.peso >= 1 && this.peso <= 19) {
            precioPorPeso = 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioPorPeso = 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioPorPeso = 800;
        } else if (this.peso >= 80 && this.peso <= 99) {
            precioPorPeso = 1000;
        }
        this.precio += precioPorPeso;
        
    }

    public void calcularPrecioxConsumo() {
        Integer  precioPorConsumo = 0;
        if (this.consumo.equalsIgnoreCase("A")) {
            precioPorConsumo = 1000;
        } else if (this.consumo.equalsIgnoreCase("B")) {
            precioPorConsumo = 800;
        } else if (this.consumo.equalsIgnoreCase("C")) {
            precioPorConsumo = 600;
        } else if (this.consumo.equalsIgnoreCase("D")) {
            precioPorConsumo = 500;
        } else if (this.consumo.equalsIgnoreCase("E")) {
            precioPorConsumo = 300;
        } else if (this.consumo.equalsIgnoreCase("F")) {
            precioPorConsumo = 100;
        }
        this.precio += precioPorConsumo;
    }
    public void precioFinal(){
        System.out.println("El precio es base: "+ this.precio);
        calcularPrecioxPeso();
        System.out.println("El precio es + peso: "+ this.precio);
        calcularPrecioxConsumo();
        System.out.println("El precio es + consumo: "+ this.precio);
    }
}




    

    



