package ScenarioBasedJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodeReal {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
	//3.3	//What is the average age of male and female employees
		// Get the details of highest paid employee in the organization
		//3.5	//Get the names of all employees who have joined after 2015
		//3.6	// Count the number of employees in each department
		//3.7	//What is the average salary of each department
		
	//1st Method	
//		List<Integer> list=employeeList.stream().filter(e -> e.getGender().equalsIgnoreCase("Female"))
//		.map(e -> e.getAge()).collect(Collectors.toList());
//		list.forEach(System.out::println);
//		double avgFemaleAge=list.stream().mapToInt(x -> x).summaryStatistics().getAverage();     
//		System.out.println("Average age of female::" +avgFemaleAge);
	//2nd Method
//		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
//				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//				         
//				System.out.println(avgAgeOfMaleAndFemaleEmployees);
		
		//3rd method
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
		employeeList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e -> e.getAge())));
		System.out.println(avgAgeOfMaleAndFemaleEmployees);
		
		
	//3.4	// Get the details of highest paid employee in the organization
		
//		Optional<Employee> emp=employeeList.stream()
//				               .collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())));
//		System.out.println(emp.get().toString());
		
	//3.5	//Get the names of all employees who have joined after 2015
		
//		List<String> list=employeeList.stream().filter(e -> e.getYearOfJoining()>2015)
//		.map(e -> e.getName()).collect(Collectors.toList());
//		list.forEach(System.out::println);
		
	//3.6	// Count the number of employees in each department
		
//		Map<String,Long> map=employeeList.stream()
//		.map(e -> e.getDepartment())
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		map.entrySet().stream().forEach(System.out::println);
		
	//3.7	//What is the average salary of each department
//		System.out.println("INDIAAAAAA:");
//		Map<String,Double> map=employeeList.stream()
//				.collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.averagingDouble(e -> e.getSalary())));
//				map.entrySet().stream().forEach(System.out::println);
//		map.entrySet().stream().forEach(System.out::println);	
		
		
		
		
		//3.8  Get the details of youngest male employee in the product development department?
		
//		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
//				employeeList.stream()
//				            .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
//				            .min(Comparator.comparingInt(Employee::getAge));
//				         
//				Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
				         
		//3.9 Who has the most working experience in the organization?
				
//	    Optional<Employee> emp=	employeeList.stream()
//				            .min(Comparator.comparingInt(Employee::getYearOfJoining));
//	    System.out.println(emp.get().getName());
//				
		//3.10-How many male and female employees are there in the sales and marketing team?
		
//	    employeeList.stream().filter(e -> e.getDepartment()=="Sales And Marketing")
//	    .collect(Collectors.groupingBy(e -> e.getGender()),Collectors.counting());
//		
				
		
		
		
		
		
	}

}
