import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int c=0;
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-i-1;j++){ //in bubble sort we take two elements and than swap which one is smaller
	            if(a[j]>a[j+1]){
	                int temp =a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
	}
}



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int c=0;
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-i-1;j++){
	            if(a[j]>a[j+1]){
	                int temp =a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
	}
}

i/p:
5                                                                                                                             
5 1 4 2 8 
o/p:                                                                                                                    
1 2 4 5 8 
