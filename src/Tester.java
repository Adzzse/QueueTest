/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DoHoangAnh
 */
public class Tester {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);  // Creating a queue with a maximum capacity of 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        try {
            System.out.println("Front element: " + queue.front());
            System.out.println("Top(last) element: " + queue.top());
        } catch (Exception e) {
            System.err.println("Queue is empty.");
        }

        try {
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
        } catch (Exception e) {
            System.err.println("Queue is empty.");
        }

        try {
            System.out.println("Dequeued: " + queue.dequeue());
        } catch (Exception e) {
            System.err.println("Queue is empty.");
        }
    }
}
