
public class assignment2 {
    public static void main(String[] args) {
        int Number=5;
        System.out.println();
        for(int i=Number;i>0;i--)
        {
            // Printing spaces

        	for(int j=0;j<Number-i;j++)
        	{
        		System.out.print(" ");
        	}
            
            //Checking whether it is a even row

            if(i%2==0){
                for(int l=1;l<=i;l++){

                    // first and last element should be $ remaining is % 
                    // but for only 2 elements this condition is not applicable

                    if(l==1 || l==i && i>2){
                        System.out.print("$ ");
                    }
                    else{
                        System.out.print("% "); 
                    }
                }
            }
            else{
                for(int k=1;k<=i;k++){

                    // printing alternative elements

                    if(k%2==1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("# ");
                    }
                }
            }

        	System.out.print("\n");
        }
        System.out.println();
    }
}
