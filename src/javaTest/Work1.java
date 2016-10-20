package javaTest;

public class Work1 {
	  public static void main(String grgs[])
	  {
		  Person p=new Person("小明","男",16);
		  System.out.println(p.getName() +"的性别是"+p.getSex() +
				  ",年龄是"+p.getAge() );
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
			 System.out.println("人类会跑");
			
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