public class EmployeePerformance {
    int randomID = (int)Math.floor(Math.random()*(500-100+1)+100);
    
    String employeeName;
    int employeeID = randomID;
    String designation;
    int salary;
    String promotion_status;
    int performance = 0;
    int taskCompleted;
    int projectCompleted;
    int employeeSupervision;

    EmployeePerformance(String employeeName, 
                        String designation, 
                        int salary, 
                        String promotion_status, 
                        int taskCompleted,
                        int projectCompleted,
                        int employeeSupervision) {
        
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
        this.promotion_status = promotion_status;
        this.taskCompleted = taskCompleted;
        this.projectCompleted = projectCompleted;
        this.employeeSupervision = employeeSupervision; 
    }

    void bioData() {
        System.out.println("------------------");
        System.out.println("ID: " + employeeID);
        System.out.println("Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotion_status);
    }

    void overallPerfomace() {
        bioData();
        performance = (taskCompleted + projectCompleted + employeeSupervision) * 8;
        System.out.println("Performance: " + performance);
        
        if(performance >= 8 ) {
            System.out.println("eligible");
        } else {
            System.out.println("not-eligible");
        }
    }

    public static void main(String args[]) {
        
        EmployeePerformance employee01 = new EmployeePerformance("David", "manager", 50000, "CTO", 12, 2, 10);
        employee01.overallPerfomace();
        EmployeePerformance employee02 = new EmployeePerformance("rustom", "deputy manager", 60000, "COO", 8, 1, 7);
        employee02.overallPerfomace();

    }
}

