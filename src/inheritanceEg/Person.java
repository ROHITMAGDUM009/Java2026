package inheritanceEg;

class Person {

    // Data members
    String name;
    int age;

    // Method to accept person details
    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}