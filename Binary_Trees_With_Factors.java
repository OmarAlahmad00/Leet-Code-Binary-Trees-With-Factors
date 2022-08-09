	import java.util.Scanner; 
	
	class Solution {
	    
	   
		public static void main(String[] args) {
			numFactoredBinaryTrees();
		}
		
	    public static void numFactoredBinaryTrees() {
	        Scanner c = new Scanner(System.in);
	        int num;
	        int[] intArr = new int[0];
	
	        System.out.println("Enter number: ");
	        num = c.nextInt();
	        while(num > 1) {
	            intArr = addToArr(num, intArr);
	            System.out.println("Enter number (Type number 1 or less to submit): ");
	        	num = c.nextInt();
	        }
	        
	      
	        
	        arrPoss(intArr);
	    
	    } 
	    
	    public static void arrPoss(int[] arr) {
			
	    	System.out.println("Possibilities ");
	    	for(int i = 0; i < arr.length; i++) {
	    		
	    		System.out.println(arr[i]);
	    	
	    		
	    	}
	 
	    	for(int i = 0; i < arr.length; i++) {
	    		
	    		
	    		
	    		
	    		
	    			
	    	
	    			checkAll(arr, i, arr[i]);
	    			
	    		
	    		
	    		
	    	}
	    }
	    	
	    	
	 
		
	    	
	    
		public static int checkAll(int[] arr, int pos, int prod) {
	    	//System.out.println(111);
	    	for(int i = 0; i < arr.length; i++) {
	        	
	
	        	for(int r = 0; r < arr.length; r++)	{
	        	
	        		   
	        		if(arr[i] * arr[r] == prod) {
	        			
	        		
	        			System.out.print(prod + ",");
	        	    	System.out.print(arr[i] + ",");
	        	    	
	        	    	System.out.print(arr[r]);
	        			System.out.println();
	        	}
	        	
	        		
	    	}
	    		
	    	}
	    	
	    	return 0;
	    }
	    	
	public static int[] addToArr(int num, int[] numArr){
	        
	    	int[] tempArr = new int[numArr.length + 1];
	    	tempArr[numArr.length] = num;
	  
	    	for (int i = 0; i < numArr.length; i++) {
	    		tempArr[i] = numArr[i];
	    	}
	    	
	    	return tempArr;
	    
	    }
	
	}
	    
	    
	    //public int arr_create()
	
