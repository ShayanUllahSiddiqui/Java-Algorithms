public class Member {
        private double Salary;
        private String Name, Address, Number;
        private int Age;
        
        void printSalary() {
            System.out.println("Salary = " + Salary);
        }
    
        static class Employee extends Member {
            private String Specialization;
        }
    
        static class Manager extends Member {
            private String Department;
        }
    
        public String getName() {
            return Name;
        }
    
        public String getAddress() {
            return Address;
        }
    
        public String getNumber() {
            return Number;
        }
    
        public int getAge() {
            return Age;
        }
    
        public double getSalary() {
            return Salary;
        }
    
        public void setName(String newName) {
            Name = newName;
        }
    
        public void setAddress(String newAddress) {
            Address = newAddress;
        }
    
        public void setNumber(String newNumber) {
            Number = newNumber;
        }
    
        public void setAge(int newAge) {
            Age = newAge;
        }
    
        public void setSalary(double newSalary) {
            Salary = newSalary;
        }
    
        public static void main(String[] args) {
            Employee Emp1 = new Employee();
          
            Emp1.setName("Muhammad Yousuf Baloch");
            Emp1.setNumber("03567984381");
            Emp1.setAge(21);
            Emp1.setAddress("Punjab Town");
            Emp1.setSalary(35000);
            Emp1.Specialization = "Data Processing";

            System.out.println("\nEMPLOYEE DETAILS");
            System.out.println("Name:" + Emp1.getName());
            System.out.println("Phone number:" + Emp1.getNumber());
            System.out.println("Age:" + Emp1.getAge());
            System.out.println("Address:" + Emp1.getAddress());
            System.out.println("Specialization:" + Emp1.Specialization);
            Emp1.printSalary();
            System.out.println(".........................\n");


            

            Manager Man1 = new Manager();

            Man1.setName("Mehroz Khan");
            Man1.setNumber("03875672312");
            Man1.setAge(18);
            Man1.setAddress("Gulshan-E-Maymar");
            Man1.setSalary(900000);
            Man1.Department = "Data Analytics";

            System.out.println("MANAGER DETAILS");
            System.out.println("Name:" + Man1.getName());
            System.out.println("Phone number:" + Man1.getNumber());
            System.out.println("Age:" + Man1.getAge());
            System.out.println("Address:" + Man1.getAddress());
            System.out.println("Department:" + Man1.Department);
            Man1.printSalary();
            System.out.println(".........................");
        }
    }
    
