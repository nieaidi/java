package javaTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Work4{

public static void main(String[] args) throws IOException {
FileOutputStream out = new FileOutputStream(new File("D:\\stud.txt"),true);
out.write(("学号:   姓名:   数学:   语文:   英语:   平均分:\r\n").getBytes());
for (int i = 0; i < 5; i++) {
System.out.println("请输入学生的学号,姓名,成绩1,成绩2,成绩3:");
Scanner can = new Scanner(System.in);
int no = can.nextInt();
out.write((no + "\r\t").getBytes());
String name = can.next();
out.write((name + "\r\t").getBytes());
float[] num = new float[3];
for (int k = 0; k < 3; k++) {
num[k] = can.nextFloat();
out.write((num[k] + "\r\t").getBytes());
}	
float avg = (num[0] + num[1] + num[2]) / 3;
out.write((avg + "\r\n").getBytes());
}
out.flush();

out.close();


}
}