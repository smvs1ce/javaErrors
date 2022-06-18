package javaErrors;

public class javaErrors {

	public static void main(String[] args) {
		
		/* 
		 * Create a small program that defines some fields. Try creating some illegal field names and see what kind of error the compiler produces. 
		 *  Use the naming rules and conventions as a guide. In the program you created, try leaving the fields uninitialized and print out their values.  
		 *  Try the same with a local variable and see what kind of compiler errors you can produce.  
		 *  Becoming familiar with common compiler errors will make it easier to recognize bugs in your code. 
		 */ 
		 
		// Errors to demonstrate illegal variable names 
		 
		//String first-name; 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		Syntax error on token "first", = expected after this token
		name cannot be resolved to a variable
	
		at javaErrors.javaErrors.main(javaErrors.java:17)*/ 
		
		 
		
		//String First Name; 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		Syntax error on token "String", invalid Modifiers

		at javaErrors.javaErrors.main(javaErrors.java:26)*/ 
		
		 
		
		//intlargest@number; 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		intlargest cannot be resolved to a type
		Syntax error on token "@", delete this token

		at javaErrors.javaErrors.main(javaErrors.java:34)*/ 
		
		 
		//intsmallest;number; 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		intsmallest cannot be resolved to a type
		Syntax error on token ";", delete this token

		at javaErrors.javaErrors.main(javaErrors.java:42)*/ 
		
		
		 
		// Errors to demonstrate uninitialized field names 
		
		//intnumbers; 
		
		// System.out.println(numbers); 
		/* Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
		intnumbers cannot be resolved

		at javaErrors.javaErrors.main(javaErrors.java:51)*/ 
		 
		
		//float average; 
		//System.out.println(average); 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The local variable average may not have been initialized

		at javaErrors.javaErrors.main(javaErrors.java:62)*/ 
		 
			 
		//boolean isFun; 
		//System.out.println(isFun); 
	
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The local variable isFun may not have been initialized

		at javaErrors.javaErrors.main(javaErrors.java:69)*/		
		
	}

}
