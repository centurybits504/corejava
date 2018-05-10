package Temp;

import java.util.concurrent.Exchanger;
class Thread_Data{
	public void display(boolean flag,Exchanger<Boolean> exchanger){
		for(int i=1;i<=5;i++){
			if(flag)
			System.out.println(Thread.currentThread().getName() + " -- " + i);
			try {
				flag = exchanger.exchange(flag);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread_1 extends Thread{
	Thread_Data data;
	Exchanger<Boolean> exchanger;
	boolean flag;
	MyThread_1(Thread_Data data,Exchanger<Boolean> exchanger,boolean flag){
		this.data = data;
		this.exchanger = exchanger;
		this.flag = flag;
	}
	public void run(){
		data.display(flag,exchanger);
	}
}class MyThread_2 extends Thread{
	Thread_Data data;
	Exchanger<Boolean> exchanger;
	boolean flag;
	MyThread_2(Thread_Data data,Exchanger<Boolean> exchanger,boolean flag){
		this.data = data;
		this.exchanger = exchanger;
		this.flag = flag;
	}
	public void run(){
		data.display(flag,exchanger);
	}
}
public class SeqThreadExecution{
	public static void main(String args[]){
		Thread_Data data = new Thread_Data();
		Exchanger<Boolean> exchanger = new  Exchanger<>();
		MyThread_1 t1 = new MyThread_1(data,exchanger,true);
		MyThread_2 t2 = new MyThread_2(data,exchanger,false);
		t1.setName("MyThread_1");
		t2.setName("MyThread_2");
		t1.start();
		t2.start();
	}
}