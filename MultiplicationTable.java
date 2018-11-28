package DAY24_V2_10_6_18;

public class MultiplicationTable {

	public static void main(String[] args) {
	
		
		int sum;
		System.out.println("******************** 1st Multiplication Table******************************");
		
		
		for(int j=1;j<=10;j++)
		{
			System.out.println("_________________________");
		for (int i=1;i<=10;i++)
		{
			
			sum=j*i;
			System.out.println("|"+j+" x "+i+" = "+sum+"|");
			//else
				//System.out.println();
		}
		sum=0;
		
		}
		
		
		
		/////////Second way///////////////////////
		
		System.out.println("\n******************** 2nd Multiplication Table******************************");
		for(int j=1;j<=10;j++)
		{
			System.out.println();
		for (int i=1;i<=5;i++)
		{
			
			sum=j*i;
			System.out.print("|"+i+" x "+j+" = "+sum+"\t");
			//else
				//System.out.println();
		}
		sum=0;
		
		}
		System.out.println("\n___________________________________________________________________________________");
		for(int j=1;j<=10;j++)
		{
			System.out.println();
		for (int i=6;i<=10;i++)
		{
			
			sum=j*i;
			System.out.print("|"+i+" x "+j+" = "+sum+"\t");
			//else
				//System.out.println();
		}
		sum=0;
		
		}
		////////////////HOMEWORK//////////////////
		
		System.out.println("\n************************************************************");
		System.out.println("\n \t Multiplication Table  \n");
		System.out.println("****************************************************************");
		System.out.print("     ");
		for (int i=1;i<=12;i++)
			if(i>=10)					// adjust the line space
			System.out.print(i+"  |");	// adjust the line space
			else								
				System.out.print(i+"   |");// adjust the line space
					
		System.out.println();
		System.out.println("________________________________________________________________ \n");
		
		for(int j=1;j<=12;j++)
		{
			if(j>=10)							// adjust the line space
				System.out.print(j+"  |");		// adjust the line space
				else								
					System.out.print(j+"   |");	// adjust the line space
		for (int i=1;i<=12;i++)
		{
			sum=j*i;
			if(sum>=100)                    // adjust the line space
				System.out.print(sum+" |"); // adjust the line space
				else if(sum>=10)			// adjust the line space
					System.out.print(sum+"  |");// adjust the line space
				else if(sum<10)					// adjust the line space
			System.out.print(sum+"   |");		// writes the multiplied numebr
		}
		sum=0;
		System.out.println();
		System.out.println("   ------------------------------------------------------------");
		
		}
		
		
		
		
		
	}

}
