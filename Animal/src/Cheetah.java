import javax.swing.JOptionPane;

class Cheetah extends Lion{
	public void Cheetah1(String name)
		{
		this.setName(name);	
		}
	
	public String toString()
	{//overriding the default toString() method  
		String OutString="";
		OutString += getName();
		OutString += " the cheetah has ";
		OutString += getNumTeeth();
		OutString += " teeth and weighs ";
		OutString += getWeight()+" kilograms.";
		
		return OutString;  
	}  
}