public class Vehicle {

    private String vehicleId;
    private String vehicleName;
    private int rentDays;
    private double totalCost;

    Vehicle(){
        vehicleId="Unknown";
        vehicleName="Unknown";
        rentDays=0;
    }
    Vehicle(String vehicleId , String vehicleName , int rentDays){
        this.vehicleId=vehicleId;
        this.vehicleName=vehicleName;
        this.rentDays=rentDays;
    }

    public void displayDetails(){
        System.out.println("Vehicle ID : "+ vehicleId);
        System.out.println("Vehicle Name : "+ vehicleName);
        System.out.println("Rented days : "+ rentDays);
    }

    public class Car extends Vehicle{

        Car(String vehicleId , String vehicleName , int rentedDays){
            super(vehicleId,vehicleName,rentedDays);
        }

        public void calculateRental(){
            totalCost=rentDays*50;
        }
        public void displayDetails(){
            System.out.println("Vehicle ID : "+ vehicleId);
            System.out.println("Vehicle Name : "+ vehicleName);
            System.out.println("Rented days : "+ rentDays);
            System.out.println("Total Cost : " + totalCost);
        }
    }

    public class Truck extends Vehicle{

        Truck(String vehicleId , String vehicleName , int rentedDays){
            super(vehicleId,vehicleName,rentedDays);
        }

        public void calculateRental(){
            totalCost=rentDays*80;
        }
        public void displayDetails(){
            System.out.println("Vehicle ID : "+ vehicleId);
            System.out.println("Vehicle Name : "+ vehicleName);
            System.out.println("Rented days : "+ rentDays);
            System.out.println("Total Cost : " + totalCost);
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("10200","BMW",4);
    }
}
