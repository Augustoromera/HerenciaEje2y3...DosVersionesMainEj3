package HerenciaEje3;

import Entidades.Electrodomestico;
import Entidades.Lavarropa;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaElectro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        List<Electrodomestico> ListaElectro = new ArrayList();
        String rta = "";
        for (int i = 0; i < 2; i++) {
            Lavarropa L = new Lavarropa();
            Televisor T = new Televisor();
            System.out.println("Ingrese el electrodomestico que desea:  (Lavarropa/Televisor: ");
            rta = leer.next();
            if (rta.equalsIgnoreCase("lavarropa")) {
                L.crearLavarropa();
                ListaElectro.add(L);
            } else if (rta.equalsIgnoreCase("televisor")) {
                T.crearTelevisor();
                ListaElectro.add(T);
            }
        }
//        Iterator it=ListaElectro.iterator();
        Integer precioTotal = 0;
//        while (it.hasNext()) {
        for (Electrodomestico electrodomestico : ListaElectro) {
            if (electrodomestico instanceof Lavarropa) {
                Lavarropa L1 = (Lavarropa) electrodomestico;
                L1.precioFinalLav();
                precioTotal += L1.getPrecio();
                System.out.println("--------------");
                System.out.println("El precio lavarropa: " + L1.getPrecio());
            }
            if (electrodomestico instanceof Televisor) {

                Televisor T1 = (Televisor) electrodomestico;
                T1.precioFinalTv();
                precioTotal += T1.getPrecio();
                System.out.println("--------------");
                System.out.println("El precio televisor: " + T1.getPrecio());
            }

        }

        System.out.println("------------------------------");
        System.out.println("La sumatoria es: " + precioTotal);
    }

}
