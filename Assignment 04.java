//Task 1
import java.util.Scanner;
public class lab_question_04_01{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range number:");
        int ini_num=sc.nextInt();
        System.out.print("Enter the ending range number:");
        int final_num=sc.nextInt();
        int rem=0;
        int sum=0;
        int temp_ini;
        while(ini_num<=final_num){
            temp_ini=ini_num;
            while(temp_ini!=0){
                rem=temp_ini%10;
                sum+=(rem*rem*rem);
                temp_ini=temp_ini/10;
            }
            if(sum==ini_num){
                System.out.println(ini_num+" is an armstrong number");
            }
            sum=0;
            rem=0;
            ini_num++;
        }
    }
}



//Task 2
import java.util.Scanner;
public class lab_question_04_02{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students to check:");
        int student_quan=sc.nextInt();
        int i=0;
        int id;
        int n;
        boolean not_equal=false;
        while(i<student_quan){
            System.out.print("Enter student ID:");
            id=sc.nextInt();
            if(id<=0){
                System.out.println("Not Lucky");
            }
            else if(id==1){
                System.out.println("Lucky ID");
            }
            else{
                if(id%2!=0){
                    System.out.println("Not Lucky");
                }
                else if(id%2==0){
                    for(n=1;n<id;n++) {
                        if(id!=Math.pow(2,n)){
                            not_equal=true;
                        }
                            if(id==Math.pow(2, n)){
                            System.out.println("Lucky ID");
                            not_equal=false;
                            break;
                        }
                    }
                    if(not_equal){
                        System.out.println("Not Lucky");
                }
                }
                }
                       i++;
                       id=0;
        }
    }
}



//Task 3
import java.util.Scanner;
public class lab_question_04_03{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of days:");
        int days=sc.nextInt();
        int sale;
        int i=0;
        int sale1;
        int sale2;
        int sale3;
        double sum=0;
        while(i<days){
            System.out.print("Enter sales for Day "+(i+1)+": ");
            sale1=sc.nextInt();
            sale2=sc.nextInt();
            sale3=sc.nextInt();
            sum=sale1+sale2+sale3;
            if(sum>=100 && sum<200){
                sum+=(sum*2)/100;
            }
                else if(sum>=200 && sum<500){
                    sum+=(sum*5)/100;
                }
                else if(sum>=500){
                    sum+=(sum*10)/100;
                }
                System.out.println("Day "+(i+1)+": Total Sales with Tax: "+sum);
           sum=0;
           i++;
        }
   }
}



//Task 4
import java.util.Scanner;
public class lab_question_04_04{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of Members:");
        int membs=sc.nextInt();
        int i=0;
        int ex_quan;
        int ex1,ex2,ex3;
        int raw_sum=0;
        double ini_avg=0.0;
        double final_avg=0.0;
        while(i<membs){
            System.out.print("Exercises for Member-"+(i+1)+":");
            ex_quan=sc.nextInt();
            System.out.print("Exercise-1:");
            ex1=sc.nextInt();
             System.out.print("Exercise-2:");
            ex2=sc.nextInt();
             System.out.print("Exercise-3:");
            ex3=sc.nextInt();
            raw_sum=ex1+ex2+ex3;
            if(ex1>350){
                raw_sum+=(ex1*50/100);
            }
            if(ex2>350){
                raw_sum+=(ex2*50/100);
            }
            if(ex3>350){
                raw_sum+=(ex3*50/100);
            }
            ini_avg=raw_sum/3;
            if(ini_avg>400){
                raw_sum+=(50*3);
            }
            final_avg=raw_sum/3;
            if(ex1<200 && ex2<200 && ex3<200){
                final_avg-=(final_avg*10)/100;
            }
            System.out.println("Average calories earned per day for Member "+(i+1)+" : "+final_avg);
            if(ex_quan>=4){
                System.out.println("(Can’t do more than 3 exercise)");
            }
            ex1=0;
            ex2=0;
            ex3=0;
            raw_sum=0;
            ini_avg=0;
            final_avg=0;
            i++;
        }
    }

}
