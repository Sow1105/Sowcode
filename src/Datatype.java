

public class Datatype {
    String employeeName;
    long id;
    String DOB;
    double Salary;
    char Currency;
    boolean isManager;
    String role;
    String joiningDate;
    String mobileNumber;
    Student manager;

    Employment previousCompanyDetails;
    Gender female;



    public static void main(String[] args) {
        System.out.println("before assigning values");

        Employment emp = new Employment();
        System.out.println(emp.employeeName);
        System.out.println(emp.id);
        System.out.println("after assigning values");
        emp.employeeName="Saras";
        emp.id=123;
        System.out.println("Employee Name: " +emp.employeeName);
        System.out.println(emp.id);
        System.out.println("update the existing");
        emp.employeeName= "Sowmya";
        System.out.println("Employee Name: " + emp.employeeName);
        System.out.println(emp.id);
    }
}
