package javaTest;

public class Work1 {
	  public static void main(String grgs[])
	  {
		  Person p=new Person("С��","��",16);
		  System.out.println(p.getName() +"���Ա���"+p.getSex() +
				  ",������"+p.getAge() );
		  p.run1() ;
		 
	  }
	}
	class Person
	{ 
		
		private String name;
		private String sex;
		private int age;
		public  Person(String name,String sex,int age){
			this.name =name;
			this.sex =sex;
			this.age =age;
		}
		 private void run(){
			 System.out.println("�������");
			
		}
		 public void run1(){
			 run();
		 }
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		 
		
	}