
public class App {

	public static void main(String[] args) {
		
		byte byteValue = 30; 
		//16 bits
		//short onkly stores to -128 to 127
		short shrtValue = 55; 
		//32 bits
		int intValue = 808;
		long longValue = 234223;
		
		//need to put an f after number to be 
		//considered a float
		float floatValue = 8834.8f;
		double doubleValue = 32.4;	
		
		System.out.println(Byte.MAX_VALUE);
		
		//inorder for intValue to equal longValue
		//you need to type caset longValue to be
		//an int
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		//dont need to cast double with int
		//because youre not cutting up bits
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		//int casting a float will just
		//cut off the f from the float
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//trying to stuff a oversize type 
		//into a type thats not going to hold it 
		}

}
