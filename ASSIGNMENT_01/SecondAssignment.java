import java.util.*;  
public class SecondAssignment {

	public static void main(String[] args) {
		int i,j,rows,cols;
		
//		print   1 1 1 1
//		        2 2 2 2
//		        3 3 3 3
//		        4 4 4 4
		
		Scanner sc= new Scanner(System.in); 
		 
		rows=sc.nextInt(); 
		
		cols=sc.nextInt();
 
		for( i=1;i<=rows;i++)
		{
			for(j=1;j<=cols;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

}
