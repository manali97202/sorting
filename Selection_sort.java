import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    for(int i=0;i<n-1;i++){
	        int m=i;
	        for(int j=i+1;j<n;j++)
	        if(a[j]<a[m])
	        m=j;
	        int temp=a[m];
	       a[m]=a[i];
	       a[i]=temp;
	       
	        
	    }
	    for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
	}
}

i/p:
5                                                                                                                             
64 25 12 22 11

o/p:                                                                                                                
11 12 22 25 64 4  
