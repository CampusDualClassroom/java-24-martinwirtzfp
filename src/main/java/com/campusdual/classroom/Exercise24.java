package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");
        return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        int contador = 0;
        while (contador < 4) {
            for (String element : queue) {
                System.out.println(element);
            }
            String elemento = queue.poll();
            System.out.println("Elemento eliminado: " + elemento);
            contador++;
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        printAndEmptyQueue(queue);
    }

}
