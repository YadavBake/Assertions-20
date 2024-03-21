
									Assertions Part- 1||Introduction ||identifier vs keywords
								==============================================================

 --------------------------
  Assertions 1.4v version  
 --------------------------

	1. Introduction.
	2. assert as a keyword and identifier.
	3. Types of assert statement.
	4. variuos possible Runtime flags.
	5. Appropriate and Inappropriate use of assertions.
	6. AssertionError.
	

-----------------
  Introduction 
-----------------
 
  -> Very comman way of debugging is uses of SOP statements but the problem with SOP is after fixing the bug compulsory 
	 we have delete SOP statements otherwise this SOPs we will executed at runtime for every requiest, which creates 
	 performance problem and distrups server logs.
	 
  -> To overcome this problem sun people introduced assertions concept in 1.4v version.
  
  -> The main advantage of assertions when comparad with SOPs is after fixing the bug we are not required to remove assert
	 statement because they won't be executed by default at run time based on our requirement we can Enable and disable 
	 assertions and by default assertions are disabled.
	 
  -> Hence a the main objective of assertions is to perform debugging.
  
  -> Useally we can perform debugging in development and Test enviroment but not in production enviroment hence assertions
	 concept applicable for development and Test enviroment but not for production.
	 
---------------------------------------	 
  assert as a Keyword and identifier	 
---------------------------------------

  -> assert keyword introduced in 1.4v version hence a from 1.4v version onwords we can't use assert as identifier 
	 otherwise we will get compile time error.
	 
  -> 
  
		class Test 
		{
			public static void main(String args[])
			{
				int assert = 10;
				System.out.pritnln(assert);
			}
		}
		
		1. javac Test.java 
	
		     CE: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier 	

		2. javac -source 	1.3 Test.java // valid 
		
			compiles fine but with warning 
			
		3. java Test 
				
			 10 	
		
		
		
		 javac -source 1.2 Test.java //valid 	
		 
		 javac -source 1.3 Test.java //valid 	
		 
		 javac -source 1.4 Test.java //invalid 	
		   
		 javac -source 1.5 Test.java //invalid 	
		 

 Note :

	- If we are using assert as identifier and if we are try to compile according to old version (1.3 or lower) then 
	  the code compile fine but with warning.
	  
	- We can compile a java program according to a particular version by using -source option.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 