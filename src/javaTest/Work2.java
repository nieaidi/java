package javaTest;

import java.math.BigDecimal;

public class Work2 {

/**
* @param args
*/
public static void main(String[] args) {
String sum="0";

for(int i=1;i<=30;i++)
{
String s="1";
//����ĳ�����Ľ׳�
for(int j=1;j<=i;j++)
{
BigDecimal str= new BigDecimal(s); 
BigDecimal end= new BigDecimal(j);
BigDecimal re=end.multiply(str);
s=re.toString();
}
//��1--30�Ľ׳˼�����
BigDecimal str= new BigDecimal(sum);
BigDecimal end= new BigDecimal(s);
BigDecimal re=end.add(str);
sum=re.toString();
}
System.out.println("1!+..+30�Ľ��Ϊ:"+sum);
}

}
