package sample;
import java.util.*;
import java.io.*;

public class Prims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int w[][] = new int[10][10];
		int w[][]= {{0,2,1,3},{2,0,5,99},{1,5,0,6},{3,99,6,0}};
		int n,i,j,s,k=0;
		int min,sum=0,u=0,v=0,flag=0;
		System.out.println("Enter the number if vertices");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int sol[] = new int[n];
		for(i=0;i<n;i++) {
			sol[i]=0;
		}
		
//		System.out.println("Enter the weighted graph");
//		for(i=0;i<n;i++) {
//			for(j=0;j<n;j++) {
//				w[i][j]=sc.nextInt();
//			}
//		}
		
		
		System.out.println("Enter the source vertex");
		s=sc.nextInt();
		
		sol[s]=1;
		k=1;
		
		while(k<=n-1) {
			min=99;
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					if(sol[i]==1 && sol[j]==0) {
						if(i!=j && min>=w[i][j]) {
							min=w[i][j];
							u=i;
							v=j;
						}
					}
				}
			}
			sol[v]=1;
			sum=sum+min;
			k++;
		}
		
		for(i=0;i<n;i++) {
			if(sol[i]==0) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("No spanning tree");
		} else {
			System.out.println("The cost of min spanning tree is "+sum);
		}
		
		sc.close();

	}

}
