import java.util.*;
public class Main
{   
    
    public static void print(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void bubbleSort(int a[],int n){
        if(n==1){
       
        return ;}
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        
        bubbleSort(a,n-1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    bubbleSort(a,n);
	     print(a,n);    
	    

	}
}

i/p:
5                                                                                                                             
5 1 4 2 8  

o/p:                                                                                                                   
1 2 4 5 8   