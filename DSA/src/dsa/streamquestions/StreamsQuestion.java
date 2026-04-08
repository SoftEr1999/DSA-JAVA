package dsa.streamquestions;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsQuestion {
    public static void main(String[] args){

        List<Employee> listEmp = Arrays.asList(
                new Employee(1, "Satyam", "HR", 25, 50000, "Male", "Delhi"),
                new Employee(2, "Rahul", "HR", 30, 60000, "Male", "Mumbai"),
                new Employee(3, "Amit", "IT", 28, 70000, "Male", "Delhi"),
                new Employee(4, "Ankit", "IT", 32, 90000, "Male", "Delhi"),
                new Employee(5, "Suresh", "Finance", 21, 40000, "Male", "Chennai"),
                new Employee(6, "Anita", "HR", 27, 65000, "Female", "Delhi"),
                new Employee(7, "Pooja", "IT", 29, 85000, "Female", "Mumbai")
        );

        // 1. Names start with A
        List<Employee> aEmp = listEmp.stream()
                .filter(e -> e.getName().startsWith("A"))
                .toList();

        // 2. Group by department
        Map<String, List<Employee>> groupDept =
                listEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        // 3. Total count
        long count = listEmp.stream().count();

        // 4. Max age
        int maxAge = listEmp.stream().mapToInt(Employee::getAge).max().orElse(0);

        // 5. All department names
        List<String> departments = listEmp.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();

        // 6. Count by department
        Map<String, Long> countByDept =
                listEmp.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        // 7. Age < 30
        List<Employee> ageLess30 =
                listEmp.stream().filter(e -> e.getAge() < 30).toList();

        // 8. Age between 26 and 31
        List<Employee> ageRange =
                listEmp.stream()
                        .filter(e -> e.getAge() >= 26 && e.getAge() <= 31)
                        .toList();

        // 9. Average age by gender
        Map<String, Double> avgAgeByGender =
                listEmp.stream().collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)
                ));

        // 10. Department with max employees
        String maxDept =
                listEmp.stream().collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        ))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .get().getKey();

        // 11. Employees in Delhi sorted by name
        List<Employee> delhiEmp =
                listEmp.stream()
                        .filter(e -> e.getCity().equals("Delhi"))
                        .sorted(Comparator.comparing(Employee::getName))
                        .toList();

        // 12. Average salary by department
        Map<String, Double> avgSalaryDept =
                listEmp.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        // 13. Highest salary in each department
        Map<String, Optional<Employee>> highestSalaryDept =
                listEmp.stream().collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));

        // 14. Sort employees by salary
        List<Employee> sortedBySalary =
                listEmp.stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                        .toList();

        // 15. Second highest salary
        Employee secondHighest =
                listEmp.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .skip(1)
                        .findFirst()
                        .orElse(null);

        // Print sample outputs
        System.out.println("A names: " + aEmp);
        System.out.println("Group Dept: " + groupDept);
        System.out.println("Total Count: " + count);
        System.out.println("Max Age: " + maxAge);
        System.out.println("Departments: " + departments);
        System.out.println("Count by Dept: " + countByDept);
        System.out.println("Age < 30: " + ageLess30);
        System.out.println("Age 26-31: " + ageRange);
        System.out.println("Avg Age by Gender: " + avgAgeByGender);
        System.out.println("Max Dept: " + maxDept);
        System.out.println("Delhi Employees: " + delhiEmp);
        System.out.println("Avg Salary Dept: " + avgSalaryDept);
        System.out.println("Highest Salary Dept: " + highestSalaryDept);
        System.out.println("Sorted Salary: " + sortedBySalary);
        System.out.println("Second Highest: " + secondHighest);
    }

    static class Employee {
        private int id;
        private String name;
        private String department;
        private int age;
        private double salary;
        private String gender;
        private String city;

        public Employee(int id, String name, String department, int age,
                        double salary, String gender, String city) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.age = age;
            this.salary = salary;
            this.gender = gender;
            this.city = city;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public int getAge() { return age; }
        public double getSalary() { return salary; }
        public String getGender() { return gender; }
        public String getCity() { return city; }

        @Override
        public String toString() {
            return name + " (" + salary + ")";
        }
    }
}