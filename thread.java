import java.io.*;

class multithread extends Thread {
	public void run() {
		int pile=25;
		int time=0;
		int cart=0;
		int igniter_pile_of_books=0;
		while(pile!=0)
		{
			time+=10;	//loading books time
			cart=5;
			pile-=cart;
			time+=30;	//takeaway books time
			time+=10;	//unload books
			igniter_pile_of_books+=2;
			if(pile!=0)
				time+=30;	//coming back
		}
		
		int quotient=igniter_pile_of_books/3;	
		time+=20+ quotient*20;
		System.out.println(time);
	}

public static void main(String args[]){

	multithread m1=new multithread();
	multithread m2=new multithread();
	m1.start();
	m2.start();

	}
}	
