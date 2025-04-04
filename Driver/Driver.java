public class Driver {

    private int driverId;
    private String driverName;
    private double baseSalary;
    private int performScore;
    private double bonus;
    private double total;

    Driver(int driverId , String driverName){
        this.driverId=driverId;
        this.driverName=driverName;
    }
    Driver(double baseSalary){
        this.baseSalary=0;
    }
    Driver(int driverId , String driverName , double baseSalary , int performScore){
        this.driverId=driverId;
        this.driverName=driverName;
        this.baseSalary=baseSalary;
        this.performScore=performScore;
    }

    public int getDriverId(){
        return this.driverId;
    }
    public int getPerformScore(){
        return this.performScore;
    }
    
    public void setPerformScore(int performScore){
        if(performScore==1 || performScore==2 ||performScore==3||performScore==4||performScore==5){
            this.performScore=performScore;
        }else{
            this.performScore=1;
        }
    }

    public void calculateBonus(){
        if(performScore==1){
            bonus=baseSalary*0.0;
            System.out.println("Bonus : "+bonus);
        } else if (performScore==2) {
            bonus=baseSalary*0.10;
            System.out.println("Bonus : "+bonus);
        }else if (performScore==3) {
            bonus=baseSalary*0.15;
            System.out.println("Bonus : "+bonus);
        }else if (performScore==4) {
            bonus=baseSalary*0.20;
            System.out.println("Bonus : "+bonus);
        }else if (performScore==5) {
            bonus=baseSalary*0.25;
            System.out.println("Bonus : "+bonus);
        }
    }

    public void TotalSalary(){
        total=baseSalary+bonus;
        System.out.println("Total Salary : "+ total);
    }

    public void displayDetails(){
        System.out.println("Driver ID : "+driverId);
        System.out.println("Name : " + driverName);
        System.out.println("Base Salary : "+ baseSalary);
        System.out.println("Performance Score : "+ performScore);

    }

    public static void main(String[] args) {

        Driver driver1 = new Driver(10300,"Victor",3500,3);
        driver1.displayDetails();
        driver1.calculateBonus();
        System.out.println(" ");


        Driver driver2 = new Driver(10400,"Davis",4000,2);
        driver2.displayDetails();
        driver2.calculateBonus();
        System.out.println(" ");

        Driver driver3 = new Driver(10500,"Arthur",5000,5);
        driver3.displayDetails();
        driver3.calculateBonus();
        
    }
    

}
