package br.com.fiap.investimento.test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueListTest {

	public static void main(String[] args) {

		//Queue<String> queue = new ArrayBlockingQueue<>(3);
		//Queue<String> queue = new LinkedBlockingDeque<>();
		//Queue<String> queue = new PriorityQueue<>();
		Queue<String> queue = new ArrayDeque<>();
		queue.add("Flávio");
		queue.add("Eduardo");
		queue.add("Moreni");
		
		System.out.println(queue);
		
		System.out.println("Removendo Remove: " + queue.remove());
		System.out.println("Removendo Pool  : " + queue.poll());
		
		System.out.println(queue);
		
	}

}
