package com.stacknqueue;


public class StackOperation {
	public static void addElement() {
		StackAndqueue list= new StackAndqueue();
		list.push(56);
		list.push(30);
		list.push(70);
		list.display();
	}

	public static void peek(){
		StackAndqueue list= new StackAndqueue();
		list.push(70);
		list.push(30);
		list.push(56);
		list.peek();
	}

	public static void pop(){
		System.out.println("Before Pop:");
		StackAndqueue list= new StackAndqueue();
		list.push(56);
		list.push(30);
		list.push(70);
		list.display();
		
		list.pop();
		System.out.println("\nAfter Pop:");
		list.display();
	}
	
	public static void queueElement() {
		StackAndqueue list =new StackAndqueue();
        list.queue(56);
        list.queue(30);
        list.queue(70);
        list.display();
	}    
       // dequeue elements
    	public static void dequeueElement(){
    		StackAndqueue list =new StackAndqueue();
            list.queue(56);
            list.queue(30);
            list.queue(70);
            System.out.println("Before Pop:");
    		
    		list.display();
            list.pop();
            System.out.println("\nAfter Pop:");
            list.display();
        }
    
	}

