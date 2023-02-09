/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresymatrices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ATHLON
 */
public class VectoresYMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        //se crea la matriz de 3X3
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                //El for hace que se recorra cada espacio de la matriz   

                Random r = new Random();
                List<Integer> numeros = new ArrayList<Integer>();
                for (int i = 0; i < 1; i++) {
                    numeros.add(r.nextInt(9));
                    //Se especifica la creación de numeros aleatorios entre el 0 y el 9
                }
                for (int n : numeros) {
                    System.out.printf("", n);
                    //Se hacen numeros aleatorios y se guardan en n
                    matriz[f][c] = n;
                }

                System.out.print(matriz[f][c] + " ");
                //Se guarda el numero aleatorio n en cada casilla de la matriz
            }
            System.out.println(" ");
        }

        int diagonal1 = 0;
        int diagonal2 = 0;

        diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.println("\nLa suma total de la diagonal izquierda es: " + diagonal1);
        //Se suma en diagonal

        diagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        System.out.println("\nLa suma total de la diagonal derecha es: " + diagonal2);
        //Se suma en diagonal
    }
}
