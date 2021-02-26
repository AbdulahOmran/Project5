import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

System.out.println("For today, we're going to have a large increase in customers, so count it for corporate");
System.out.println("Okay!");
 System.out.println("An hour passes and not many customers come");
int result = sum(2);
System.out.println("1st Hour Customer Count: " + result);
System.out.println("The store clerk has a choice, to allow an exceeding amount of customers in, or allow none");
System.out.println("Customers: Well what are we waiting for let us in!");
System.out.println("Multiple customers are there, and it's all or nothing, will you let them in? If so, type 20 into the computer, if not, type 0");
int customerIncrease = scan.nextInt();
int result1 = sum(customerIncrease);
System.out.println("Final Customer Count: " + result1);
  }
  public static int sum(int num){
    if(num>0){
      //if I recieve 5x as num then it becomes 5x+4x+3x+2x+x
      return num + sum(num-1);
      //5+10=15
      //4+6=10
      //3+3=6
      //2+1=3
      //1+0=1
    }else{ 
      return 0;
        
    }
  }
}