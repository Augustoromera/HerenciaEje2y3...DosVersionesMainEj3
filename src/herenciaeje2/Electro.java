package herenciaeje2;

import Entidades.Lavarropa;
import Entidades.Televisor;

public class Electro {
    public static void main(String[] args) {
     Lavarropa L = new Lavarropa();
     L.crearLavarropa();
     L.precioFinal();
        System.out.println(L.toString());
       
Televisor T = new Televisor();
        T.crearTelevisor();
        T.precioFinal();
        System.out.println(T.toString());
    }
    
}