import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
       Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      int val=1;
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    {
           for(int space = 1; space <=  n - curr_row; space++)
	        {
	            System.out.print(" ");
	        }
            
	        for(int curr_col = 1; curr_col <=  curr_row ; curr_col++)
	        {
           
	        
	        
	            System.out.print(val+" ");
	        
          val++;
            }
          System.out.println();
	}
}
}
    
