package javaTest;



import java.util.Scanner;

public class BankersAlgorithm {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int process;//�����������
		int resource;//������Դ���ࣻ
		int[] available;//������Դ
		int[][]max,allocation,need;//���������ӵ�У�����
		System.out.println("��������̸���");
	
		Scanner scanner=new Scanner(System.in);
		process=scanner.nextInt();
		
	
		System.out.println("��������Դ����");
		
		resource=scanner.nextInt();

		System.out.println("�����������Դ����");
		

		
		available=new int[resource];
		//����forѭ����������Ŀɷ������Դ����
		for(int i=0;i<resource;i++)
		{
			available[i]=scanner.nextInt();
		}
		
		allocation=new int[process][resource];
		//����forѭ������������ѷ������Դ����
		for(int i=0;i<process;i++)
		{
			System.out.println("���������"+i+"�ѷ������Դ����");
			for(int j=0;j<resource;j++)
			{
				allocation[i][j]=scanner.nextInt();
			}
			
		}
		
		max=new int[process][resource];
		//����forѭ���������������������Դ����
		for(int i=0;i<process;i++)
		{
			System.out.println("���������"+i+"����������Դ����");
			for(int j=0;j<resource;j++)
			{
				max[i][j]=scanner.nextInt();
			}
			
		}
		//����need�������������Դ����
		need=new int[process][resource];
		for(int i=0;i<process;i++)
		{
			
			for(int j=0;j<resource;j++)
			{
				need[i][j]=max[i][j]-allocation[i][j];
				
			}
			
		}
		//��ӡ��������Դ�������
		System.out.println("T0ʱ�̵���Դ��");
		
		System.out.println("���,"+"�ѷ���,"+"��Ҫ");
	
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
		//����boolean ���͵����飬��Ϊ���������
		boolean[] finish=new boolean[process];
        //����temp �������ڴ�Ű�ȫ����
		int[] temp=new int[process];
		//����work�������ڴ��available�����е�����
		int[] work=new int[resource];

		int i, k = 0, m, apply,j;//kΪ��ȫ���е���������apply��Ϊ��Դ������±�
		
       //�� available�е����ݸ�ֵ��work
		for (i = 0; i < resource; i++) 
	     	{
			  work[i] = available[i];
			}
		for (i = 0; i < process; i++)   //��ǰִ������ٴӵ�һ����ʼ���
	    {
			apply = 0;
			for (j = 0; j < resource; j++) 
			{
				if (finish[i] == false && need[i][j] <= work[j])   //��������һ�����ſ�ִ��
				{
					apply++;
					
					if (apply == resource)
					{
					
						for (m = 0; m < resource; m++)
						work[m] = work[m] + allocation[i][m];// �������
						finish[i] = true;
						temp[k] = i;   //���氲ȫ����
						i = -1;    //�ӵ�һ�����̿�ʼ����Ѱ����������һ���Ľ���
						k++;

					 }
				 }
		     }   
		}
		for (i = 0; i <resource; i++)
	    {
			if (finish[i] == false) {System.out.println("ϵͳ����ȫ��");}
			else  
			{
			    System.out.print("ϵͳ�ǰ�ȫ�ģ���ȫ����Ϊ��");
			   	for (i = 0; i <process; i++)      // �����ȫ��������
				{ System.out.print("p"+temp[i] + "-->"); }
			   	  System.out.println();
			  

			 }
		
		 }
	}


		
			}

