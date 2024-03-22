							
										Assertions Part- 2||Simpleassert || augmented assert
									==========================================================

------------------------------
  Types of assert statement									
------------------------------

  -> There are two types of assert statement :
  
		1. Simple version.
		
		2. Augmented(append) version.
		
------------------
  Simple version
------------------

 -> 
 
	Syntax:
	
			 	
		assert(b);
			   |--> 'b' should be boolean type 
			   |If 'b' is true :Then assumption saticefied and hence rest of the program we will executed normaly
			   |If 'b' is false: Then assumption fails that is same where something goes wrong and hence a 
				 				 the program will be terminated abnormaly by rising RE: AssertionError. Once we got 
								 AssertionError we will analyis the code and we can fix the problem.
 
		class Test 
		{
			public static void main(String args[])throws Exception
			{
				int x = 10;
				
				;;;;;;;;;;;;;;;;;;;;
				//assert(x==10);
				assert(x>10); // After Enabliing assertion we will get RE: AssertionError 
				;;;;;;;;;;;;;;;;;;;
				;;;;;;;;;;;;;;;;;;;
				;
				;
				;
				System.out.println(x);
			}
		}
		
		javac Test.java 
		
		java Test 
			
			10 
		
		java -ea Test (-ea) == enable assertion 
		
			RE: AssertionError
			

 Note: 

	- By default assert statement won't be executed because assertions are disabled by default but we can enable 
	  assertions by using -ea(enable assertion) option .
	  
----------------------------	  
 Augmented(append) version.
----------------------------
	
	-> we can augment some description with assertion error by using Augmented version.
	
		Syntax:
				   |--> 'b' should be boolean type 	
			assert(b): e;
					   |-> Can be any type but mostly we can take string type.
	
	class Test 
    {
    	public static void main(String args[])throws Exception
    	{
    		int x = 10;
    		
    		;;;;;;;;;;;;;;;;;;;;
    		//assert(x==10);
    		assert(x>10): "Here x value should be > 10 but it is not ";
    		;;;;;;;;;;;;;;;;;;;
    		;;;;;;;;;;;;;;;;;;;
    		;
    		;
    		;
    		System.out.println(x);
    	}
    }
	
	javac Test.java 
		
		java Test 
			
			10 
		
		java -ea Test (-ea) == enable assertion 
		
			RE: AssertionError:Here x value should be > 10 but it is not.
			

--------------			
  Conclusion 			
--------------

 -> assert(b):e;

		- 'e' will be executed if and only if first arguments is false that is if the first argument is true then second 
		  argument won't executed.

		class Test 
		{
			public static void main(String args[])
			{
				int x = 10;								javac Test.java
				;                                       
				;                                       java Test 
				;assert(x==10):++x;                     
				;                                       	10 
				;                                       
				;                                       java -ea Test 
				;                                       
				System.out.println(x);                  	10
			}
		}
		
		
		
 -> assert(b):e;
 
	- For the second argument we can take method call but void return type method call is not allowed otherwise we will
	  compile time error.

	class Test 
	{
		public static void main(String args[])
		{
			int x = 10;
			;
			;									javac Test.java
			;assert(x>10):m1();                 
			;                                   java Test 
			;                                   
			;                                   	10 
			System.out.println(x);              
		}                                       java -ea Test 
		public static int m1()                  
		{                                       	RE: AssertionError: 777
			return 777;
		}
		
	}
		
		
	- If m1() method return type is void then we will get compile time error saying: void type not allowed here.


 Note: 

	- Among two versions of assertions it is recomanded to use Augmented version because it provides more information 
	  for debugging.
		
		