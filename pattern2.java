import java.util.Scanner;

public class pattern2
{
    public static void main(String agrs[])
    {
        Scanner a = new Scanner(System.in);
        
        
        System.out.println("\nEnter The  Number :- ");
        int num=a.nextInt();
        
        int temp=num/10;
        for(int i=num;i>0;i--)
        {
            
                for(int j=1;j<=(num+1)-i;j++)
                {    
                    if(i<num/temp)
                    {
                        System.out.print(i+" ");
                    }
                    else
                    {
                        System.out.print(i);
                    }
                        
                }
                
            
            System.out.println();
        }
        for(int i=1;i<num;i++)
        {
                
                for(int j=1;j<=num-i;j++)
                {    
                    if(i<(num/temp)-1)
                    {
                        System.out.print((i+1)+" ");
                    }
                    else
                    {
                        System.out.print(i+1);
                    }
                        
                }
            
            System.out.println();
        }
        
    }
}
