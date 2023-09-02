/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    public static void main(String[] args) {
        Formulasx fO = new Formulasx();
        fO.Puntos();
    }
}
    class Formulasx{
        Scanner leer = new Scanner(System.in);
        int pedirX(){
            int x = 0;
            System.out.print("Punt 1 - x: ");
            x=leer.nextInt();
            return x;
        }
        int pedirY(){
            int y = 0;
            System.out.print("Punt 1 - y: ");
            y=leer.nextInt();
            return y;
        }
        void Puntos(){
            System.out.println("Captura punto 1");
            int p1x = pedirX();
            int p1y = pedirY();
            System.out.println("Captura punto 2");
            int p2x = pedirX();
            int p2y = pedirY();
            System.out.print("Coordenadas de punto 1: ");
            System.out.println(p1x + " - " + p1y);
            System.out.print("Coordenadas de punto 2: ");
            System.out.println(p2x + " - " + p2y);
            double dP1P2 = sqrt(((p2x - p1x)*(p2x - p1x))-((p2y - p1y)*(p2y - p1y)));
            System.out.println("Distancia p1 a p2 = " + dP1P2);
        }
    }

