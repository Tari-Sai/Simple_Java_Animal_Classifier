import javax.swing.JOptionPane;

//4. Application Class	/////////////////////////////////////////////////////////
class application extends Cheetah{
	public static void main(String args[]) {		    	   
//1 Creating new Lion object with the name "Leo"
	   Lion leo = new Lion();		   
	// Assigning Weight of "Leo" and printing it out
	   leo.weight = Integer.parseInt( JOptionPane.showInputDialog("How much does the lion weigh?"));
	   System.out.print("The lion type is"+Lion.decidetype(leo.weight)+"\n");
			  
//2 Cheetah 	   
	   Cheetah speedy = new Cheetah();
	   speedy.Cheetah1("Speedy Speedsta");
	   speedy.Animal(38, false, 48);
	   System.out.print(speedy.toString());
	   
	}	   
}