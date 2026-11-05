import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        System.out.println("hi");
        List<Employee> employeeList = Employee.getEmployeeList();

        List<String> names = new ArrayList<>();

        names.add("Amol");
        names.add("anil");
        names.add("Rahul");
        names.add("Snehal");
        names.add("Vikas");
        names.add("Priya");
        names.add("Rohit");
        names.add("Neha");
        names.add("Ajay");
        names.add("Komal");
        names.add("Sachin");


        test a = new test();

        List<Integer> numbers = List.of(1,2,3,6,5,4,7,8,9,51,52,45,61,566);

        //Q1.printAll
        //a.printAll(employeeList);

        //Q2.get all from Mechanical dept
        //a.getFromDept("IT",employeeList);

        //Q3.get aged than 24
        //a.getAgedThanThreeshold(employeeList,24);

        //Q4.grouped by dept
        //a.getGrouped(employeeList);

        //Q5.getall amount of salary to given in org
        //a.allSal(employeeList);

        //Q6.avg salary given to each dept
        //a.getAvgSalToEachDept(employeeList);

        //Q7.get youngest
        //a.getYoungest(employeeList);

        //Q8.GET SECOND AGED
        //a.getSecondAged(employeeList);

        //Q9. reverse string
        //a.reveString("amolislegendandhewillneverfalldown");

        //Q10.reverse array
        //a.sortArr();

        //Q12 group by even and odd
        //a.groupedByevenOdd(numbers);

        //Q13. get list of strings and uppercast it
        //a.convert(names);

        //Q14. group string by length
        //a.groupByLength(names);

        //Q15. find if it starts with a
        //a.getStartWithA(names);

        //Q17. remove null
        //a.removeNull(names);

        //Q26. join by comma
        //a.joinByComma(names);

        //Q57 getTopThree
        //a.getTopThree(employeeList);

        //Q59 getHighestMaleAndFemale
        //a.getHighestMaleAndFemale(employeeList);

        //Q60 getSortedonsalAgeName
        //a.getSortedonsalAgeName(employeeList);

        //Q62.Group students by grade (return names only)
        //a.GroupByDeptGiveOnlyName(employeeList);

        //Q50 reverseCharOfEachString
        //a.reverseCharOfEachString(names);

        //Write a Java function to check if two strings are anagrams. checkAnagram
        //a.checkAnagram("ama", "ama");

        //Q19. groupByMiddle
        //a.groupByMiddle();

        //Q20 CONCAT 2 LIST
        //a.groupByLength();

        //Q18. flatmapexp
        //a.getFlatMA();

        //Q.23. getMaxed length size
        //a.getMaxedLength();

        //Q16. get duplicates
        //a.getDuplicate();

        //Q25. get avg of all
        //a.getAvg();

        //Q40 getTwoListSortConcatDistinct
        //a.getTwoListSortConcatDistinct();

        //Q29 remove repeated
        //a.removeRepeated();

        //Q40 getTwoListSortConcatDistinct
        a.getTwoListSortConcatDistinct();
    }

    public void printAll(List<Employee> l1){
        l1.forEach(System.out::println);
    }

    public void getFromDept(String dept , List<Employee> l1){
        l1.stream().filter(n->n.getDepartment().equalsIgnoreCase(dept)).forEach(System.out::println);
    }

    public void getAgedThanThreeshold(List<Employee> l1 , int age){
        l1.stream().filter(n->n.getAge()>age).forEach(System.out::println);
    }

    public void getGrouped(List<Employee> l1){
        l1.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((m,n)->System.out.println(m + ":" + n));
    }

    public void allSal(List<Employee> l1){
        System.out.println(l1.stream().mapToDouble(Employee::getSalary).sum());
    }

    public void getAvgSalToEachDept(List<Employee> l1){
        l1.stream().collect(Collectors.groupingBy(n->n.getDepartment(), Collectors.averagingDouble(Employee::getSalary))).forEach((m,n)->System.out.println(m + " : " +n));
    }

    public void getYoungest(List<Employee> l1){
        System.out.println(l1.stream().max(Comparator.comparingInt(Employee::getAge).reversed()).get());
        l1.stream().sorted(Comparator.comparingInt(Employee::getAge)).findFirst().ifPresent(System.out::println);
        l1.stream().min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);
    }

    public void getSecondAged(List<Employee> l1){
        l1.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).limit(2).skip(1).findFirst().ifPresent(System.out::println);
        l1.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).limit(2).forEach(System.out::println);
    }

    public void reveString(String s1){

        System.out.println(new StringBuilder(s1).reverse());

        System.out.println("new way");

        char[] c = s1.toCharArray();
        int len = c.length;
        String s2 = "";
        for (int i = len-1 ; i >=0;i--){
            s2+=c[i];
        }
        System.out.println(s2);

        System.out.println("new way half ");
        char[] d = s1.toCharArray();
        for(int i =0; i< len/2;i++){
            int targetIndex= len-1-i;

            char temp = d[targetIndex];
            d[targetIndex]= d[i];
            d[i]= temp;
        }
        System.out.println(new String(d));


        System.out.println("new way");

        System.out.println(IntStream.rangeClosed(1,s1.length()).mapToObj(n->s1.charAt(s1.length()-n)).collect(StringBuilder::new ,StringBuilder::append , StringBuilder::append).toString());
    }

    public void sortArr(){
        int arr[] ={9,8,7,6,5,4,1,2,3};

        for(int i =0; i <arr.length; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public void groupedByevenOdd(List<Integer> l1){
        l1.stream().collect(Collectors.groupingBy(n->n%2==0 ? "Even":"odd")).forEach((m,n)->System.out.println(m + " : " +n));
        l1.stream().collect(Collectors.partitioningBy(n->n%2==0)).forEach((m,n)->System.out.println(m + " : " +n));
    }

    public void convert(List<String> s1){
        s1.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public void groupByLength(List<String> s1){
        s1.stream().collect(Collectors.groupingBy(n->n.length())).forEach((m,n)->System.out.println(m + " : " +n));
    }

    public void getStartWithA(List<String> s1){
        s1.stream().filter(n->n.startsWith("A")||n.startsWith("a") ).forEach(System.out::println);
    }

    public void removeNull(List<String> s1){
        s1.stream().filter(n->n !=null).forEach(System.out::println);
    }

    public void joinByComma(List<String>s1){
        System.out.println(s1.stream().collect(Collectors.joining(" ")));
    }

    public void getTopThree(List<Employee> l1){
        l1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
    }

    public void getHighestMaleAndFemale(List<Employee> l1){
        l1.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                .forEach((m,n)->System.out.println(m + " : " +n.get()));
    }

    public void getSortedonsalAgeName(List<Employee> l1){
        l1.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparingInt(Employee::getAge)
                        .thenComparing(Employee::getFirstName))
                .forEach(System.out::println);
    }

    public void GroupByDeptGiveOnlyName(List<Employee> l1){
        l1.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getFullName,Collectors.toList())))
                .forEach((m,n)->System.out.println(m + " : " + n));
    }

    public void reverseCharOfEachString(List<String> s1){
        s1.stream().map(n->new StringBuilder(n).reverse().toString()).forEach(System.out::println);
    }

    public void checkAnagram(String s1, String s2){
        if(s1.length()!= s2.length()){
            System.out.println("not anaghram");
        }
        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("anaghram");
        } else {
            System.out.println("not anaghram");
        }
    }

    public void groupByMiddle(){
        List<String> names = List.of("CAT" , "MAT","SAT" , "CET" , "MET" , "SET");
        names.stream().collect(Collectors.groupingBy(n->n.charAt(1))).forEach((m,n)->System.out.println(m + " : " + n ));
    }

    public void groupByLength(){
        List<String> a1 = List.of("apple" , "banan","grapes");
        List<String> a2 = List.of("apple1" , "banan1","grapes1");

    List<String> a3 = Stream.concat(a1.stream(),a2.stream()).toList();
    }

    public void getFlatMA(){
        List<Integer> a1 = List.of(1,2,3);
        List<Integer> a2 = Arrays.asList(11,22,33);
        List<Integer> a3 = Arrays.asList(111,222,333);

        List<List<Integer>> a4 = List.of(a1,a2,a3);

        a4.stream().flatMap(List::stream).forEach(System.out::println);
    }

    public void getMaxedLength(){
        List<String> a1 = List.of("apple" , "banana" , "grapes" , "mango");
        List<String> a2=Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");
        a1.stream().max(Comparator.comparingInt(n->n.length())).ifPresent(System.out::println);
    }

    public void getDuplicate(){

        List<Integer> a1= Arrays.asList(1,2,3,2,5,6,3,7,5,9);

        HashSet h1 = new HashSet<>();
        a1.stream().filter(n->!h1.add(n)).forEach(System.out::println);
    }

    public void getAvg(){
        List<Integer> a1 = List.of(1,2,3,4,5,6,7,8,9,3,3,4,66,4);

        a1.stream().mapToDouble(Integer::intValue).average().ifPresent(System.out::println);
        System.out.println(a1.stream().mapToDouble(Integer::intValue).average());
    }

    public void getTwoListSortConcatDistinct(){
        List<Integer> a1 = Arrays.asList(1,313,45,22,55);
        List<Integer> a2 = Arrays.asList(14,13,445,272,595);
    }

    public void removeRepeated(){
        List<String> s1 = List.of("apple" , "banana" , "grapes" , "orange" , "banana");
        s1.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }


    }
