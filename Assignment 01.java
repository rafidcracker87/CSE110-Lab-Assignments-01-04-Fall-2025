//Task 1
import java.util.Scanner;
public class Ques_1{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
        int mins=scan.nextInt();
        int full_year=((mins/1440)/365);
        int rem_days=((mins/1440)%365);
        System.out.println(mins+" minutes is approximately "+full_year+" years  and  "+rem_days+" days");
    scan.close();
  }
}



//Task 2
public class Ques_2{
  public static void main(String[] args){
    int a=2,b=5,c=8;
    int res;
    res=(2*b)*((c-a)/3)+7;
    System.out.println("Resultant output is:"+res);
  }
}



//Task 3
public class Ques_3{
  public static void main(String[] args){
    int Student_id= 1000054943;
    int lastdigit=(Student_id%10);
    int temp_num=Student_id/10;
    int last_2nd_digit=(temp_num%10);
    System.out.println("The two rightmost digits are respectively "+lastdigit+" and "+last_2nd_digit);
  }
}



//Task 4
public class Ques_4{
  public static void main(String[] args){
    int wid=13,len=10;
    double diagonal_value;
    diagonal_value=Math.pow(Math.pow(wid,2)+Math.pow(len,2),0.5);
    System.out.println("The diagonal distance is "+diagonal_value);
  }
}



//Task 5
public class Ques_5{
  public static void main(String[] args){
    double a=4.5,b=9.5;
    double c=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
    double sinA,sinB,cosA,cosB;
    sinA=a/c;
    sinB=b/c;
    cosA=b/c;
    cosB=a/c;
    System.out.println("The value of SinA is "+sinA);
    System.out.println("The value of SinB is "+sinB);
    System.out.println("The value of CosA is "+cosA);
    System.out.println("The value of CosB is "+cosB);
  }
}   


        

