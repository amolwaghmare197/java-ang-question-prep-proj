import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Long id;
    private String empCode;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String mobileNumber;
    private String department;
    private String designation;
    private Double salary;
    private Integer age;
    private String gender;
    private String city;
    private String state;
    private String country;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(Long id,
                    String fullName,
                    String department,
                    Double salary,
                    String email,
                    Integer age,
                    String city,
                    String gender) {

        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.age = age;
        this.gender= gender;
        this.city = city;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    // Sample Employee List
    public static List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1L, "Amol Patil", "IT", 1200.0, "amol@gmail.com", 29, "Nagpur", "Male"));
        employees.add(new Employee(2L, "Rahul Sharma", "HR", 8500.0, "rahul@gmail.com", 34, "Pune", "Male"));
        employees.add(new Employee(3L, "Priya Singh", "Finance", 9500.0, "priya@gmail.com", 28, "Mumbai", "Female"));
        employees.add(new Employee(4L, "Amit Verma", "IT", 1400.0, "amit@gmail.com", 31, "Delhi", "Male"));
        employees.add(new Employee(5L, "Sneha Joshi", "Sales", 7500.0, "sneha@gmail.com", 27, "Nagpur", "Female"));
        employees.add(new Employee(6L, "Vikas Gupta", "IT", 11000.0, "vikas@gmail.com", 30, "Bangalore", "Male"));
        employees.add(new Employee(7L, "Neha Kulkarni", "HR", 8000.0, "neha@gmail.com", 32, "Pune", "Female"));
        employees.add(new Employee(8L, "Rohit Mishra", "Finance", 10200.0, "rohit@gmail.com", 35, "Hyderabad", "Male"));
        employees.add(new Employee(9L, "Pooja Jain", "IT", 1350.0, "pooja@gmail.com", 26, "Mumbai", "Female"));
        employees.add(new Employee(10L, "Karan Kapoor", "Sales", 7000.0, "karan@gmail.com", 29, "Delhi", "Male"));
        employees.add(new Employee(11L, "Anjali More", "IT", 15000.0, "anjali@gmail.com", 33, "Nagpur", "Female"));
        employees.add(new Employee(12L, "Saurabh Patil", "Finance", 9800.0, "saurabh@gmail.com", 31, "Pune", "Male"));
        employees.add(new Employee(13L, "Komal Shah", "HR", 8700.0, "komal@gmail.com", 30, "Ahmedabad", "Female"));
        employees.add(new Employee(14L, "Yash Mehta", "IT", 12500.0, "yash@gmail.com", 27, "Surat", "Male"));
        employees.add(new Employee(15L, "Deepak Tiwari", "Sales", 6800.0, "deepak@gmail.com", 36, "Indore", "Male"));
        employees.add(new Employee(16L, "Nikita Deshmukh", "IT", 14500.0, "nikita@gmail.com", 28, "Nagpur", "Female"));
        employees.add(new Employee(17L, "Abhishek Roy", "Finance", 10900.0, "abhishek@gmail.com", 34, "Kolkata", "Male"));
        employees.add(new Employee(18L, "Shreya Nair", "HR", 8300.0, "shreya@gmail.com", 29, "Kochi", "Female"));
        employees.add(new Employee(19L, "Manoj Kumar", "IT", 13700.0, "manoj@gmail.com", 38, "Chennai", "Male"));
        employees.add(new Employee(20L, "Riya Choudhary", "Sales", 7600.0, "riya@gmail.com", 25, "Jaipur", "Female"));
        employees.add(new Employee(21L, "Harsh Agarwal", "IT", 16200.0, "harsh@gmail.com", 30, "Bangalore", "Male"));
        employees.add(new Employee(22L, "Megha Gupta", "Finance", 9200.0, "megha@gmail.com", 31, "Mumbai", "Female"));
        employees.add(new Employee(23L, "Aditya Kulkarni", "HR", 8300.0, "aditya@gmail.com", 35, "Pune", "Male"));
        employees.add(new Employee(24L, "Tanvi Patwardhan", "IT", 11800.0, "tanvi@gmail.com", 27, "Nagpur", "Female"));
        employees.add(new Employee(25L, "Nitin Bansal", "Sales", 7200.0, "nitin@gmail.com", 33, "Delhi", "Male"));
        employees.add(new Employee(26L, "Akash Singh", "IT", 1550.0, "akash@gmail.com", 32, "Hyderabad", "Male"));
        employees.add(new Employee(27L, "Bhavna Arora", "Finance", 900.0, "bhavna@gmail.com", 29, "Chandigarh", "Female"));
        employees.add(new Employee(28L, "Gaurav Jain", "HR", 8100.0, "gaurav@gmail.com", 36, "Indore", "Male"));
        employees.add(new Employee(29L, "Kritika Sinha", "IT", 13200.0, "kritika@gmail.com", 26, "Mumbai", "Female"));
        employees.add(new Employee(30L, "Ritesh Patel", "Sales", 8000.0, "ritesh@gmail.com", 37, "Ahmedabad", "Male"));

        return employees;
    }
}
