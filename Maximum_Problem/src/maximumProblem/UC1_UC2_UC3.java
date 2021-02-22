package maximumProblem;

public class UC1_UC2_UC3 {
	
public static void main(String[] args) {
		
		
		System.out.println(maximumIntegerMethod(86,36,52));     
		
		
		System.out.println(maximumIntegerMethod(36,86,52));     
		
		
		System.out.println(maximumIntegerMethod(52,36,86));  
		
	}
	
	
	public static <T extends Comparable<T>> T maximumIntegerMethod(T one,T two,T three) {  
		
		T maximum =  one;                   
		
		if(two.compareTo(one) > 0 ) {       
			maximum = two;                 
		}
		
		if(three.compareTo(maximum) > 0) {  
			
			maximum = three;                
		}
		return maximum;                    
				
	}
	
}
