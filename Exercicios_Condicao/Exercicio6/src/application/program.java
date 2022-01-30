package application;

public class program {

	public static void main(String []args){
		int x =0;
		for(x=0;x<=100;x++){
			System.out.printf("%d %\r",+x);
			try { Thread.sleep (300); } catch (InterruptedException ex) { }		
		}		

	}
}
