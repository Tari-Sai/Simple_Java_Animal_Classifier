import javax.swing.JOptionPane;

public class Animal  {				  
	private int numTeeth = 0;
	private boolean spots = false;
	int weight = 0;
	int age;
	public static String name;
	String colour;
	
//Teeth getter
	public int getNumTeeth(){  					
		return numTeeth;	}
//Teeth setter
	public void setNumTeeth(int numTeeth) {		  
		this.numTeeth = numTeeth;	}	
//Spots getter (boolean)
	public boolean getSpots() {					
		return spots;	}
//Spots setter (boolean)
	public void setSpots(boolean spots) {		
		this.spots = spots;	}
//Weight getter
	public int getWeight() {					
		return weight;	}
//Weight setter
	public void setWeight(int weight) {			
		this.weight = weight;	}
//Name setter
	public void setName(String name) {
		   this.name = name;		}
//Name getter
	public String getName() {
	       return name;}
	
//Method sets teeth number, weight or if it has spots
	public void Animal(int numTeeth, boolean spots, int weight){
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
		}
}