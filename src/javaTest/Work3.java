package javaTest;

import java.util.Scanner;

public class Work3 {

	
	
	
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		System.out.println("请输入a");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		Work3 w3=new Work3();
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+w3.test(i)*a;
		}
		
		System.out.println(sum);
		
	}
		
	public int test(int n){
	
		int s= 0;
		for(int i=0;i<n;i++)
		{
			s=10*s+1;
		}
		return s;
		}
	
	}
