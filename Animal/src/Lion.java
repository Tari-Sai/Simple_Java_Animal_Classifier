//A class to have features of a lion
class Lion extends Animal{		
	static String type;		
//method to determine type here
	public static String decidetype(int weight) {
		if (weight<80) {
			type = " cub.";
		}
		else if (weight>=80 &&weight<120){
			type= " female";	}
		else {
			type= " male";
		}
		return type;
	}	
}
