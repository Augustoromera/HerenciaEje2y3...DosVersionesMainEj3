
package Entidades;

public class Lavarropa extends Electrodomestico {
protected Integer carga;
protected Integer tipo = 1;

    public Lavarropa() {
    }

    public Lavarropa(Integer carga, Integer precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    
   public void crearLavarropa(){     
       super.crearElectrodomestico();
       System.out.println("Ingrese la carga del lavarropa");
       this.carga= leer.nextInt();      
   }
   public void precioFinalLav() {
   super.precioFinal();
        
        if (this.carga > 30) {
            this.precio += 500;
        }
    System.out.println("El precio es + carga: "+ this.precio);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Lavarropa{" + "carga=" + carga + '}';
    }
   
}
