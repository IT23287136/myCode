import java.util.Scanner;
public class employee {
   //Attributes
   private String name;
   private int employeeId;
   private double salary;
   private int rating;
   private double bonus;
   private double total;

   //Constructor
   employee(){
       this.salary=salary;
       this.bonus=bonus;
       this.total=total;
   }
   public void calculateBonus(){
      if(rating==1){
         bonus=0;
         System.out.println("NO BONUS (0%)");
      } else if(rating==2) {
         bonus = salary*0.05;
         System.out.println("Bonus (5%) :"+bonus);
      } else if (rating==3) {
         bonus = salary*0.10;
         System.out.println("Bonus (10%) :"+salary*0.10+bonus);
      } else if (rating==4) {
         bonus = salary*0.15;
         System.out.println("Bonus (15%) :"+salary*0.15+bonus);
      } else if (rating>5) {
         bonus = salary*0.20;
         System.out.println("Bonus (20%) :"+salary*0.20+bonus);
      }else {
         System.out.println("NO numbers entered");
      }
   }

   public void calculateTotalSalary(){
      total=salary+bonus;
      System.out.println("Total Salary : "+total);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      employee emp = new employee();

      System.out.print("Enter Employee ID : ");
      emp.employeeId = scnr.nextInt();

      System.out.print("Enter Employee Name : ");
      String empName = scnr.nextLine();
      emp.name = scnr.nextLine();

      System.out.print("Enter Employee Basic Salary : ");
      emp.salary =scnr.nextDouble();

      do {
         System.out.print("Enter Rating : ");
         emp.rating = scnr.nextInt();
         if (emp.rating<1||emp.rating>5){
            System.out.println("Enter Rating (1-5) ");
         }
      }while(emp.rating<1||emp.rating>5);

      System.out.println(" ");
      System.out.println("--Employee Details--");
      System.out.println(" ");


      System.out.println("Employee ID : "+emp.employeeId);
      System.out.println("Name : "+emp.name);
      System.out.println("Basic Salary : "+emp.salary);
      System.out.println("Rating : "+emp.rating);
      emp.calculateBonus();
      emp.calculateTotalSalary();


   }
}

