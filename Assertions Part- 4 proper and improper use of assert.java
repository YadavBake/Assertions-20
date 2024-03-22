
										Assertions Part- 4||proper and improper use of assert
									===========================================================	
									
									
  Q. 

	class One 
	{
		public static void main(String arga[])
		{
			int assert = 10;
			System.out.println(assert);
		}
	}
	
	class Two 	 
	{
		public static void main(String arga[])
		{
			int x = 10;
			assert(x>10);
		}
	}
	
	
	1. javac -source 1.3 One.java // valid compile fines with warrning 
	
	2. javac -source 1.4 One.java // invalid CE: 
	
	3. javac -source 1.3 Two.java // invalid  CE: 
	
	4. javac -source 1.4 Two.java // valid compilesfine without warrning.
	
	
	
  Q. 

	class Test 
	{
		public static void main(String args[])
		{													If assertion are not enable:? 
			boolean assertOn = false;                       	
			                                                	//No outPut 
			assert(assertOn):assertOn=true;                 
			                                                
			if(assertOn)                                    IF assertions are enable:?
			{                                               
				System.out.println("assertOn")              	//RE: AssertionError: true 
			}                                               	
		}
	}
	
	
	
 	class Test 
	{
		public static void main(String args[])
		{													If assertion are not enable:? 
			boolean assertOn = true ;                       	
			                                                	// o/p: assertOn
			assert(assertOn):assertOn=false;                 
    		                                                
    		if(assertOn)                                    IF assertions are enable:?
    		{                                               
    			System.out.println("assertOn")              	// o/p: assertOn
    		}                                               	
    	}
    }
	
-------------------	
  AssertionError	
-------------------
 
 -> It is the child class of Error and hence it is unchecked.
 
 -> If assert statement fails(That is argument is false) then we will get assertion error.
 
 -> Eeven though it is legal to catch assertion error but it's not good programming practice.

	Ex. 
 
	class Test 
	{
		public static void main(String args[])
		{
			int x = 10;
			;
			try
			{
			assert(x>10); // If x is not greater then 10 then here will get AssertionError.
			}
			catch(AssertionError e)
			{
				System.out.println("I am stupid because I am catching assertion error");
			}
			;
			System.out.println(x);
		}
	}
	

 Note: 
 
	In the case Web applications if we run java program in debug mode automatically assert statement executed.







































  