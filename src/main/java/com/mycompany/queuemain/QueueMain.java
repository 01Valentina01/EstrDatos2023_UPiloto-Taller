/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queuemain;

import com.mycompany.queue.Queue;

/**
 *
 * @author User
 */
public class QueueMain {

    public static void main(String[] args) {
        Queue<String> miCola = new Queue<String>();
        
        
        miCola.enqueue("Arroz");
        miCola.enqueue("Huevos");
        miCola.enqueue("Leche");
        
        
        for (String elem : miCola) {
            System.out.println(elem);
        }

        //miCola.showQueue();
        System.out.println("Se Retiro: " + miCola.dequeue());
        for (String elem : miCola) {
            System.out.println(elem);
        }
        System.out.println("Se Retiro: " + miCola.dequeue());
        for (String elem : miCola) {
            System.out.println(elem);
        }
        System.out.println("Se Retiro: " + miCola.dequeue());
        for (String elem : miCola) {
            System.out.println(elem);
        }
    }
}
