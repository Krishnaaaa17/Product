
public class OroductMain {
	 public static void main(String[] args) {
		  
			Electronic ec = new Electronic("s24",80000,"samsung",10);
			Cloth c = new Cloth("Kappa",1800,"M","Cotton");
			System.out.println("Electronic Product:");
			ec.display();
			System.out.println("Cloth Product:");
			c.display();      
	       
		}
}