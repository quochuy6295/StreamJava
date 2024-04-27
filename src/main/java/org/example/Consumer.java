package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Consumer {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Murrit");
//        list.add("john");
//        list.add("piter");
//        list.add("marek");
//        list.add("mac");
//
//        List<String> m = list.stream().filter(e -> e.startsWith("m")).toList();
//        System.out.println(m);
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(list1.stream().filter(e -> e % 2 == 0).toList());

//        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
//
//        int sum = numbers.stream().mapToInt(t -> t).sum();
//        System.out.println(sum);
//
//        Integer reduceSum = numbers.stream().reduce(0, Integer::sum);
//        System.out.println(sum);
//        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
//
//        String longestString = words.stream()
//                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
//                .get();
//        System.out.println(longestString);
//
//        String longest = words.stream()
//                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
//
//        double avgSalary = getEmployees().stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
//                .map(Employee::getSalary)
//                .mapToDouble(t -> t)
//                .average().getAsDouble();
//        int decimalPart = (int) (avgSalary * 100) % 100;
//        System.out.println(decimalPart);

//        List<Customer> customers = getAll();
//
//        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
//        System.out.println(phoneNumbers);
//
//        List<String> phoneNumbersString = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).toList();
//        System.out.println(phoneNumbersString);

//        List<Integer> list = new ArrayList<>();
//        list.add(8);
//        list.add(3);
//        list.add(12);
//        list.add(4);
//
//        List<Employee> employees = getEmployees();
//
////        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
////        System.out.println(employees);
//
//        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
//    }
//
//    public static List<Employee> getEmployees(){
//        return  Stream.of(new Employee(101,"john","A",60000),
//                        new Employee(109,"peter","B",30000),
//                        new Employee(102,"mak","A",80000),
//                        new Employee(103,"kim","A",90000),
//                        new Employee(104,"json","C",15000))
//                .collect(Collectors.toList());

//        Map<String, Integer> map = new HashMap<>();
//        map.put("eight", 8);
//        map.put("four", 4);
//        map.put("ten", 10);
//        map.put("two", 2);
//
//        Map<Employee, Integer> employeeIntegerMap = new TreeMap<>() ;
//        System.out.println(employeeIntegerMap);

//        CompletableFuture.runAsync(() -> pri)

    }

//    public static void printResults(IntPredicate condition) {
//        IntStream.rangeClosed(1, 10)
//                .filter(condition)
//                .forEach(execute(E));
//    }

//    public static void execute(int i) {
//        synchronized (object) {
//            try {
//                System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + i);
//                object.notify();
//                object.wait();
//            } catch (InterruptedException ex) {
//                //error log
//            }
//        }
//    }

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}
