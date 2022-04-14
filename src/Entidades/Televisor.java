
package Entidades;
import java.lang.Math;

public class Televisor extends Electrodomestico {
    protected Double pulgada;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(Double pulgada, boolean tdt, Integer precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.pulgada = pulgada;
        this.tdt = tdt;
    } 

    public Double getPulgada() {
        return pulgada;
    }

    public void setPulgada(Double pulgada) {
        this.pulgada = pulgada;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
  
    public void crearTelevisor(){     
       super.crearElectrodomestico();
       System.out.println("Ingrese las pulgadas del TV");
       this.pulgada= leer.nextDouble();
       System.out.println("¿Tiene TDT? (Ingrese si o no)");
        if (super.leer.next().equalsIgnoreCase("si")) {
          this.tdt=true;  
        }else this.tdt=false;        
   }
       public void precioFinal() {
        super.precioFinal();
        if (this.pulgada > 40) {

            this.precio = (int) Math.round(this.precio * 1.30);
        }
        System.out.println("El precio es + pulgadas: " + this.precio); 
           if (tdt) {
               this.precio+=500;
            System.out.println("El precio es + TDT: " + this.precio);    
           }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Televisor{" + "pulgada=" + pulgada + ", tdt=" + tdt + '}';
    }

}
