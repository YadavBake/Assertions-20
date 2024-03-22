
											Assertions Part- 3||various run time flags
										=================================================


---------------------------------
  Various possible Runtime Flags  
---------------------------------

  1. -ea |-enableassertions.

		 -> To enableassertions in every non-system class(our own classes).

  2. -da |-disableassertions.
  
		 -> To disableassertions in every non-system class(our own classes).

  3. -esa|-enablesystemassertions.

		-> To enablesytemassertions in every system class(pre-define classes).

  4. -dsa|-disablesystemassertions.
  
		-> To disablesystemassertions in every system class(pre-define classes).
		
		
  -> We can use above flags simulteneously then JVM will considard this flags from left to right.

		Ex. 
		
		java -ea -esa -ea -dsa -da -esa -ea -dsa Test 
	
			non-system 				System 
			
				yes 				 Yes 
				yes 				 No 
				No 					 Yes 	
				Yes 				 No 
				
		- At the end assertions will be enbled in every non-system class and disabled in every system class.

-------------
 case Study 
------------- 

	1. To enable assertions only in B class.										pack1
                                                                                      |
		java -ea:pack1.B                                                              |-A.class 
																			          |
	2. To enable assertions in both B and D class.                                    |-B.class 
	                                                                                  |
		java -ea:pack1.B -ea:pack1.pack2.D                                            |-pack2
		                                                                            	 |
	3. To enable assertions in every class of pack1.                                	 |-C.class 
	                                                                                	 |
		java -ea:pack1...                                                           	 |-D.class 
		
	4. To enable assertions in every class of pack1 except B class.

		java -ea:pack1... -da:pack1:B
		
	5. To enable assertions in every class of pack1 except pack2 classes.
	
		java -ea:pack1... -da:pack1.pack2...
		
		
 Note: 

	-> We can enable and disable assertions either class wise and package wise also.
	
-------------------------------------------------
 Appropriate and Inappropriate use of Assertions 	
-------------------------------------------------

 1. It is always Inappropriate to mix programming logic with assert statements because there guaranty for the execution
	of assert statements always at runtime 

	public void withdraw(double amount)							public void withdraw(double amount)
	{                                                           {
		if(amount<100)                                          	assert (amount>=100);
		                                                        	process Request 
			throw new IllegalRequiestException();               	
		                                                        }
		else                                                    
			                                                    // Inappropriate way to coding 
			process request;
	}
	
	// approprieate of Coding 
	
 2. While performing debugging in our program if there is any place where the control is not allowed to reach that is 
	the best place to use assertions.
	
	Ex. 
	
		   |--> 'x' should be valid month number 
	switch(x)
	{
		
		case 1: 
			System.out.println("JAN");
			break;
			
		case 2: 
			System.out.println("FEB");
			break;	
	
		
		case 12: 
			System.out.println("DEC");
			break;
	
		default : 
		
			assert (false); // RE: AssertionError 
	}
	


 3. It is always Inappropriate for validating public method arguments by using assertions because outside persion doesn't 
	aware whether assertions are enable or disabled in our system.
	
 4. It is always approprieate for validating private method arguments by using  assertions because local persion can 
	aware whether assertions are enableed or disabled in our system.
	
 5. It is always Inappropriate for validating command line arguments by using assertions because this are arguments 
	to main()  method, which is public.
	
 
	public static void main(String args[])
	{
		
		assert(args[0].equals("durga")); //invalid 
	}

		
 -> 

	class Test 
	{
		int z = 5;
		public void m1(int x)
		{
			assert(x>10); //----> 1 Inappropriate use 
		
			switch(x)
			{
				case 10:
				 System.out.println(10);
				 break;
				
				 case 11:
				 System.out.println(10);
				 break;
				 
				 default:
				  
				  assert (false); //-------> 2 approprieate use 
			}
		}
		private void m2(int x)
		{
			assert(x<10);// ---------> 3 approprieate use 
		}
		private void m3()
		{
			assert(m4());
		}
		private boolean m4() //------> 4 Inappropriate use 
		{
			z = 6;
			return true;
		}
	}
				 