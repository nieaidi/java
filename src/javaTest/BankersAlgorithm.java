package javaTest;



import java.util.Scanner;

public class BankersAlgorithm {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int process;//定义进程数量
		int resource;//定义资源种类；
		int[] available;//可用资源
		int[][]max,allocation,need;//最大需求，已拥有，需求；
		System.out.println("请输入进程个数");
	
		Scanner scanner=new Scanner(System.in);
		process=scanner.nextInt();
		
	
		System.out.println("请输入资源种类");
		
		resource=scanner.nextInt();

		System.out.println("请输入可用资源数量");
		

		
		available=new int[resource];
		//利用for循环读入输入的可分配的资源个数
		for(int i=0;i<resource;i++)
		{
			available[i]=scanner.nextInt();
		}
		
		allocation=new int[process][resource];
		//利用for循环读入输入的已分配的资源个数
		for(int i=0;i<process;i++)
		{
			System.out.println("请输入进程"+i+"已分配的资源个数");
			for(int j=0;j<resource;j++)
			{
				allocation[i][j]=scanner.nextInt();
			}
			
		}
		
		max=new int[process][resource];
		//利用for循环读入输入的最大需求的资源个数
		for(int i=0;i<process;i++)
		{
			System.out.println("请输入进程"+i+"最大需求的资源个数");
			for(int j=0;j<resource;j++)
			{
				max[i][j]=scanner.nextInt();
			}
			
		}
		//定义need数组存放所需的资源数量
		need=new int[process][resource];
		for(int i=0;i<process;i++)
		{
			
			for(int j=0;j<resource;j++)
			{
				need[i][j]=max[i][j]-allocation[i][j];
				
			}
			
		}
		//打印遍历的资源分配情况
		System.out.println("T0时刻的资源表");
		
		System.out.println("最大,"+"已分配,"+"需要");
	
		for(int i=0;i<process;i++)
		{
			
			System.out.print("P"+i+" ");
			
		
		for(int j=0;j<resource;j++)
		{
			System.out.print(max[i][j]+" ");
		}
		for(int j=0;j<resource;j++)
		{
			System.out.print(allocation[i][j]+" ");
		}
		for(int j=0;j<resource;j++)
		{
			System.out.print(need[i][j]+" ");
		}
		System.out.println(" ");
		}
		//定义boolean 类型的数组，作为下面的条件
		boolean[] finish=new boolean[process];
        //定义temp 数组用于存放安全序列
		int[] temp=new int[process];
		//定义work数组用于存放available数组中的数据
		int[] work=new int[resource];

		int i, k = 0, m, apply,j;//k为安全序列的序列数，apply作为资源种类的下标
		
       //将 available中的数据赋值给work
		for (i = 0; i < resource; i++) 
	     	{
			  work[i] = available[i];
			}
		for (i = 0; i < process; i++)   //当前执行完后，再从第一个开始检测
	    {
			apply = 0;
			for (j = 0; j < resource; j++) 
			{
				if (finish[i] == false && need[i][j] <= work[j])   //满足条件一二，才可执行
				{
					apply++;
					
					if (apply == resource)
					{
					
						for (m = 0; m < resource; m++)
						work[m] = work[m] + allocation[i][m];// 变分配数
						finish[i] = true;
						temp[k] = i;   //保存安全序列
						i = -1;    //从第一个进程开始继续寻找满足条件一二的进程
						k++;

					 }
				 }
		     }   
		}
		for (i = 0; i <resource; i++)
	    {
			if (finish[i] == false) {System.out.println("系统不安全！");}
			else  
			{
			    System.out.print("系统是安全的，安全序列为：");
			   	for (i = 0; i <process; i++)      // 输出安全序列数组
				{ System.out.print("p"+temp[i] + "-->"); }
			   	  System.out.println();
			  

			 }
		
		 }
	}


		
			}

