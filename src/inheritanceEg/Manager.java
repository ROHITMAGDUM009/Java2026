package inheritanceEg;

//Subclass
class Manager extends Person {

 // Data members specific to Manager
 int managerId;
 String department;

 // Method to accept manager details
 void setManagerDetails(int managerId, String department) {
     this.managerId = managerId;
     this.department = department;
 }

 // Method to display manager details
 void displayManagerDetails() {
     displayPersonDetails(); // calling superclass method
     System.out.println("Manager ID : " + managerId);
     System.out.println("Department : " + department);
 }

 // Main method
 public static void main(String[] args) {
     Manager mgr = new Manager();

     mgr.setPersonDetails("Rohit", 23);
     mgr.setManagerDetails(101, "IT");

     System.out.println("Manager Details:");
     mgr.displayManagerDetails();
 }
}