
package com.mycompany.ejercicio24_actividad2;

import java.util.Scanner;

public class Ejercicio24_actividad2 {

    public static void main(String[] args) {
        Scanner leerporteclado = new Scanner(System.in);
        
        double pa, pb, pc;
        
         System.out.print("Ingrese el peso de la esfera A: ");
         pa = leerporteclado.nextDouble();
         
         
         System.out.print("Ingrese el peso de la esfera B: ");
         pb = leerporteclado.nextDouble();
         
         System.out.print("Ingrese el peso de la esfera C: ");
         pc = leerporteclado.nextDouble();
         
         if (pa > pb && pa > pc) {
         System.out.println("La esfera A es la mas pesada con un peso de " + pa);
      } else if (pb > pa && pb > pc) {
         System.out.println("La esfera B es la mas pesada con un peso de " + pb);
      } else if (pc > pa && pc > pb) {
         System.out.println("La esfera C es la mas pesada con un peso de " + pc);
      } else {
         System.out.println("Las esferas tienen el mismo peso.");
      }
         
    }
}
