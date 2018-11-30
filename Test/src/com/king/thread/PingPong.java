package com.king.thread;

public class PingPong extends Thread{

	String word;
	int delay;
	
	public PingPong(String whatToSay,int timeToPause) {
		word = whatToSay;
		delay = timeToPause;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0;i<10;i++){
				System.out.println(word + " " + delay);
				sleep(delay);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	public static void main(String[] args) {
		new PingPong("Ping",1000).start();
		new PingPong("Pong", 2000).start();
	}
}
