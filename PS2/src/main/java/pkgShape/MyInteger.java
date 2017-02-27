package pkgShape;

public class MyInteger {

	
	
	private static int iValue;
	
	public MyInteger(int iValue) {
	this.iValue = iValue;
	}
	
	public static int getValue() {
		
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0){
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean isOdd(){
		if (iValue % 2 == 1) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean isPrime() {
		 for (int x = 2; x < iValue; x++) {
			 if (iValue % x == 0)
				 
				 return false;
		 }
		 
		 return true;
	}
	
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public static boolean isPrime(int value) {
		
		for (int x = 2; x < value; x++) {
			if (value % x == 0)
				
				return false;
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger value) {
		if (getValue() % 2 == 0) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger value) {
		if (getValue() % 2 == 1) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger value) {
		for (int x = 2; x < getValue(); x++) {
			if (getValue() % x == 0)
				
				return false;
		}
		
		return true;
	}
	
	public boolean equals(int value) {
		if (value == getValue()) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public boolean equals(MyInteger value) {
		if (iValue == getValue()) {
			
			return true;
		}
		else {
			
			return false;
		}
	}


}
	
	
	
	
	
	


	





	
	
