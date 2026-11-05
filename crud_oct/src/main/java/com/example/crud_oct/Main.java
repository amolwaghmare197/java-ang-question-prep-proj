package com.example.crud_oct;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hi");

    }
    }

        /*Main a = new Main();
        List<Employee> employeeList = Employee.getEmployeeList();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            numbers.add(i);
        }

        List<String> names = new ArrayList<>();

        names.add("Amol");
        names.add("Rahul");
        names.add("Snehal");
        names.add("Vikas");
        names.add("Priya");
        names.add("Rohit");
        names.add("Neha");
        names.add("Ajay");
        names.add("Komal");
        names.add("Sachin");
        //names.add(null);



        //Q1.getPrintAll
        //a.printAll(employeeList);

        //Q2.get all from Mechanical dept
        //a.getFromDept("Mechanical",employeeList);

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
        a.reveString("amolislegendandhewillneverfalldown");

        //Q10.reverse array
        //int [] b ={2,3,5,7,8,9,22,1,13,21,67};
        //a.revArr(b);

        //Q11. rev using for loop
        //a.revString("amolislegendandhewillneverfalldown");

        //Q12 group by even and odd
        //a.groupedByevenOdd(numbers);

        //Q13. get list of strings and uppercast it
        //a.convert(names);

        //Q14. group string by length
        //a.groupByLength(names);

        //Q15. find if it starts with a
        //a.getStartWithA(names);

        //Q16. get duplicates
        //a.getDuplicate();

        //Q17. remove null
        //a.removeNull(names);

        //Q18. flatmapexp
        //a.getFlatMA();

        //Q19. groupByMiddle
        //a.groupByMiddle();

        //Q20 CONCAT 2 LIST
        //a.groupByLength();

        //Q21. GET SQUARED
        //a.getSquared();

        //Q22. getSum
        //a.getSumed();

        //Q.23. getMaxed length size
        //a.getMaxedLength();

        //Q24. GET SECOND
        //a.getSecondHighest();

        //allMatch and NoneMAtch allMAtch: here it check if all input data matches following condition
        //noneMatch: here it check none of the data would match the conditon

        //Q25. get avg of all
        //a.getAvg();

        //Q26. join by comma
        //a.joinByComma();

        //Q27 Sort on basis of length
        //a.sortOnBasisOfLength();

        //Q28 check if palindrome
        //a.checkIfPalindrome();

        //Q29 remove repeated
        //a.removeRepeated();

        //39 countPal
        //a.countPal();

        //Q40 getTwoListSortConcatDistinct
        //a.getTwoListSortConcatDistinct();

        //Q41 reverseList
        //a.reverseList(names);

        //Q42 getTotalNuOfCharInCollection
        //a.getTotalNuOfCharInCollection(names);

        //Q43 getFirstNonRepeating
        //a.getFirstNonRepeating("kkaalltrr");

        //Q44 getOccu
        //a.getOccu(names);

        //Q45 getCommonBetweenTwoList
        //a.getCommonBetweenTwoList();

        //Q46 getLongestWordFromString
        //a.getLongestWordFromString();

        //Q47 firstRepeated
        //a.firstRepeated();

        //Q48 sortListOfStringBasedOnLastChar
        //a.sortListOfStringBasedOnLastChar(names);

        //Q49 getDiffOfList
        //a.getDiffOfList();

        //Q50 reverseCharOfEachString
        //a.reverseCharOfEachString(names);

        //Q51 findUniqChar
        //a.findUniqChar("hello world");

        //Q52 getLongestPalindrome
        //a.getLongestPalindrome();

        //Q53 mostFrequentElement
        //a.mostFrequentElement();

        //Q55 countDigit
        //a.countDigit();

        //Q56 getByDept
        //a.getByDept(employeeList);

        //Q57 getTopThree
        //a.getTopThree(employeeList);

        //Q58 IflessThan100ThenMultiplyBy100
        //a.IflessThan100ThenMultiplyBy100(numbers);

        //Q59 getHighestMaleAndFemale
        //a.getHighestMaleAndFemale(employeeList);

        //Q60 getSortedonsalAgeName
        //a.getSortedonsalAgeName(employeeList);

        //Q.61 getHighestSalaryPerDepartment
        //a.getHighestSalaryPerDepartment(employeeList);

        //Q62.Group students by grade (return names only)
        //a.GroupByDeptGiveOnlyName(employeeList);

        //Q63. Count frequency of each word CountFrequencyUsingOnlyStream
        //a.CountFrequencyUsingOnlyStream("aaabvvcccccfcdeess");

        //Q.64 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        //List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        //a.startwithOneFromIntegerList(myList);

        //Q.65 Find common elements between two lists
        //a.findCommonBetweenTwoList();

        //Q.66 joinTwoListAndRemoveDuplicate
        //a.joinTwoListAndRemoveDuplicate();

        //Q.67 Replace all negative numbers with 0
        //a.ReplaceNegativeNumbersWith0();

        //Q.68 Convert Optional<List<T>> to a Stream
        //a.ConvertOptionalToStream();

        //Q.69 UppercaseValueInsideOptionalUsingMap
        //a.UppercaseValueInsideOptionalUsingMap();

        //Q.70 Collect department → list of salaries
        //a.CollectDeptAndListOfSal(employeeList);

        //Q. 71 Collect distinct characters of a string as a Set
        //a.collectCHarUsingSet();

        //Q.72 CountTotalCharactersFromList
        //a.CountTotalCharactersFromList();

        //Q.73 give prime upto 100
        //a.printPrimeUpto100();

        //Q.74 missing value in list of integer
        //List<Integer> l1 = List.of(1,2,3,4,5,7,8);
        //missingValueOfIntegerList(l1);

        //Q.75 youngestAndSmallestUsingTeeing
        //a.youngestAndSmallestUsingTeeing(employeeList);

        //Q.76 chechTwoStringAnagram
        //a.chechTwoStringAnagram();

        //Q.77 𝗙𝗶𝗻𝗱 𝗗𝘂𝗽𝗹𝗶𝗰𝗮𝘁𝗲 𝗘𝗹𝗲𝗺𝗲𝗻𝘁𝘀 𝗶𝗻 𝗮 𝗟𝗶𝘀𝘁 𝘂𝘀𝗶𝗻𝗴 𝗦𝘁𝗿𝗲𝗮𝗺𝘀
        //a.findDuplicateFromList();

        //Q.78	Partition strings into palindromes vs non-palindromes.
        // a.PartitionToCheckPalindrome();

        //Q.79 getDigitSummed
        //a.getDigitSummed();

        //Q.80 removeDuplicatesFromListOfString
        //a.removeDuplicatesFromListOfString();

        //Q.81 topThreeByDept
        //a.topThreeByDept(employeeList);

        //Q.82 String s = “abcdefghijabcklmnopabc”; program to count abc appearing in given string using java 8?
        //a.checkSubString("abcdefghijabcklmnopabc");

        //q.83 TwoDArrayPrintAndInput
        //a.TwoDArrayPrintAndInput();

        //Q.84 transposeTwoDArray
        //a.transposeTwoDArray();

        //Q85 .AddAndDiffTwod
        //a.AddAndDiffTwod();

        //Q.86 MulTwoDArray
        //a.MulTwoDArray();

        //Q.89 sumOfEachCOlAndRow
        //a.sumOfEachCOlAndRow();

        //Q.90 DiagonalTwoDArray
        //a.DiagonalTwoDArray();

        //Q.91 TwoSumStream   List.of(1,2,3,4,5,6) find two no which sum is 5 without two for loop , better approach
        //a.TwoSumStream(numbers , 5);
    }

    public void printAll(List<Employee> employeeList){
        employeeList.stream().forEach(System.out::println);
    }

    public void getFromDept(String DeptName , List<Employee> employeeList){
        employeeList.stream().filter(n-> n.getDept().equalsIgnoreCase(DeptName)).forEach(System.out::println);
    }

    public void getAgedThanThreeshold(List<Employee> employeeList, int age){
        employeeList
                .stream()
                .filter(n->n.getAge() > age)
                .forEach(System.out::println);
    }

    public void getGrouped(List<Employee> employeeList){
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept , Collectors.counting()))
                .entrySet()
                .stream().filter(n->n.getKey().equalsIgnoreCase("Civil"))
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }

    public void allSal(List<Employee> employeeList){
        System.out.println(employeeList.stream().mapToDouble(Employee::getSalary).sum());
    }

    public void getAvgSalToEachDept(List<Employee> employeeList){
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept , Collectors.averagingDouble(Employee::getSalary)))
                .forEach((m,n) -> System.out.println( m +" : "+ n));
    }

    public void getYoungest(List<Employee> employeeList){
        employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .findFirst().ifPresent(System.out::println);

        System.out.println("----------------------");

        employeeList
                .stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .ifPresent(System.out::println);
    }

    public void getSecondAged(List<Employee> employeeList){
        employeeList
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .skip(1)
                .findFirst().ifPresent(System.out::println);
    }

    public void reveString(String st){
        System.out.println(st);
        //System.out.println(IntStream.rangeClosed(1,st.length()).mapToObj(i->st.charAt(st.length()-i)).collect(StringBuilder::new , StringBuilder::append , StringBuilder::append).toString());
        //String string = IntStream.rangeClosed(1, st.length()).mapToObj(i -> st.charAt(st.length() - i)).toString();

        String s1 = "";
        for(int i=st.length()-1;i>=0;i--){
            s1+= st.charAt(i);
        }
        System.out.println(s1);

        ///
        System.out.println("from two pointer");

        char [] chars = st.toCharArray();
        int leftPointer = 0;
        int rightPointer = chars.length-1;

        while (leftPointer<rightPointer){
            char temp = chars[leftPointer];
            chars[leftPointer]= chars[rightPointer];
            chars[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        System.out.println(new String(chars));
    }

    public void revArr(int [] a){

        for(int i =0;i< a.length -1;i++){
            for(int j =0; j< a.length-i-1;j++){
                if(a[j]> a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }

    public void revString(String st){
        String s1 = "";
        for(int i=st.length()-1;i>=0;i--){
            s1+= st.charAt(i);
        }
        System.out.println(s1);
    }

    public void groupedByevenOdd(List<Integer> a){
        a.stream()
                .collect(Collectors.groupingBy(n->n%2==0 ? "EVEN":"ODD"))
                .forEach((m,n)->System.out.println(m +" : " + n) );

        a.stream()
                .collect(Collectors.groupingBy(n->n%2==0))
                .forEach((m,n)->System.out.println(m +" : " + n) );

        a.stream()
                .collect(Collectors.groupingBy(n->n%2==0 ? "EVEN":"ODD",Collectors.counting()))
                .forEach((m,n)->System.out.println(m +" : " + n) );

        a.stream().collect(Collectors.partitioningBy(n-> n%2==0)).forEach((m,n)->System.out.println(m + " ; " + n));
    }

    public void convert(List<String> s1){
        s1.stream().map(n->n.toUpperCase()).forEach(System.out::println);
    }

    public void groupByLength(List<String> l1){
        l1.stream().collect(Collectors.groupingBy(n->n.length())).forEach((m,n)->System.out.println(m +" : " +n));
    }

    public void getStartWithA(List<String> s1){
        s1.stream().filter(n-> n.startsWith("A")).forEach(System.out::println);
    }
    public void getStartWith1FromList(List<Integer> s1){
        s1.stream().filter(n->String.valueOf(n).equalsIgnoreCase("1")).forEach(System.out::println);
    }

    public void getDuplicate(){
        List<Integer> a1= Arrays.asList(1,2,3,2,5,6,3,7,5,9);

        Set<Integer> s1 = new HashSet<>();
        a1.stream().filter(n->!s1.add(n)).forEach(System.out::println);
    }

    public void removeNull(List<String> s1){
        s1.stream()
                .filter(n->n!= null).forEach(System.out::println);
    }

    public void getFlatMA(){
        List<Integer> a1 = List.of(1,2,3);
        List<Integer> a2 = Arrays.asList(11,22,33);
        List<Integer> a3 = Arrays.asList(111,222,333);

        List<List<Integer>> a4 = List.of(a1,a2,a3);

        a4.stream().flatMap(List::stream).forEach(System.out::println);

        System.out.print(a4.stream().flatMap(List::stream));

    }

    public void groupByMiddle(){
        List<String> names = List.of("CAT" , "MAT","SAT" , "CET" , "MET" , "SET");
        //names.stream().forEach(n->System.out.println(n));
        names.stream()
                .collect(Collectors.groupingBy(n->n.charAt(1)))
                .forEach((m,n) -> System.out.println(m + " : " + n));
    }

    public void groupByLength(){
        List<String> a1 = List.of("apple" , "banan","grapes");
        List<String> a2 = List.of("apple1" , "banan1","grapes1");
        List<String> op = Stream.concat(a1.stream() ,a2.stream()).toList();
        op.forEach(System.out::println);
    }

    public void getSquared(){
        List<Integer> a1 = List.of(2,4,6,8,10);

        List<Integer> a2 =a1.stream().map(n->n*n).toList();
        a2.forEach(System.out::println);
    }

    public void getSumed(){
        List<Integer> a1 = List.of(1,2,3,4,5,6,7,8,9,11,222,333);
        int a2 = a1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(a2);
    }

    public void getMaxedLength(){
        List<String> a1 = List.of("apple" , "banana" , "grapes" , "mango");
        List<String> a2=Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");
        int s1 = a1.stream().mapToInt(String::length).max().orElse(0);
//        a1.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
//        a1.stream().max(Comparator.comparingInt(String::length)).ifPresent(n->System.out.println(n +": "+ n.length()));
//        System.out.println(s1);
        a2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).forEach((m,n)->System.out.println(m + " = " +n ));
    }

    public void getSecondHighest(){
        List<Integer> a2 = List.of(2,4,6,3,11,8,9,44,56,7,8,33,23,31);

        a2.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .skip(1).findFirst().ifPresent(System.out::println);

        a2.stream()
                .sorted((a,b) -> a.compareTo(b))
                .skip(1).findFirst().ifPresent(System.out::println);


    }

    public void getAvg(){
        List<Integer> a1 = List.of(1,2,3,4,5,6,7,8,9,3,3,4,66,4);

        a1.stream().mapToDouble(Integer::intValue).average().ifPresent(System.out::println);
        System.out.println(a1.stream().mapToDouble(Integer::intValue).average());
    }

    public void joinByComma(){
        List<String> a1 = List.of("amol" , "vimol" , "kamaol", "kanmol");
        String s2 = a1.stream().collect(Collectors.joining(","));
        System.out.println(s2);
        a1.stream().map(n->new StringBuffer(n).reverse().toString()).collect(Collectors.joining(" "));
        String s3 = String.join(" " , a1);
        System.out.println("new way" +" :"+s3);
    }

    public void sortOnBasisOfLength(){
        List<String> a1 = List.of("amol" , "akshada" , "sakshi" , "karan" , "rohan" , "kamalakshi" , "rahul");

        a1.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);

        a1.stream().sorted((m,n)->Integer.compare(m.length(),n.length())).forEach(System.out::println);
    }

    public void checkIfPalindrome() {
        List<String> a1 = List.of("madam" , "caram" , "aman" , "apple" , "cat" , "tat");

        a1.stream().filter(n-> new StringBuffer(n).reverse().toString().equals(n)).forEach(System.out::println);
    }

    public void removeRepeated(){
        List<String> s1 = List.of("apple" , "banana" , "grapes" , "orange" , "banana");
        s1.stream().collect(Collectors.toSet()).forEach(System.out::println);
        Set<String> s2 = new HashSet<>(s1);
        System.out.println(s2);
    }

    public void countPal(){
        List<String> l1 = List.of("ama", "madam" , "amol" , "prk" , "krk");

        long count = l1.stream().filter(n -> new StringBuffer(n).reverse().toString().equals(n)).count();

        System.out.println("count is :" + count);
    }

    public void getTwoListSortConcatDistinct(){
        List<Integer> a1 = Arrays.asList(1,313,45,22,55);
        List<Integer> a2 = Arrays.asList(14,13,445,272,595);

        List<Integer> a3 = Stream.concat(a1.stream(),a2.stream()).sorted().distinct().toList();
        a3.forEach(System.out::println);
    }

    public void reverseList(List<String> names){
        List<String> a1 = names.stream().collect(Collectors.collectingAndThen(Collectors.toList(),n->{
            Collections.reverse(n);
            return n;
        }));
        names.stream().toList().reversed().forEach(System.out::println);
        a1.forEach(System.out::println);

        //secodn option
        names.reversed().forEach(System.out::println);

        Collections.reverse(names);
        names.forEach(System.out::println);
    }

    public void getTotalNuOfCharInCollection(List<String> a1){

        System.out.println(a1.stream().mapToInt(n->n.length()).sum());
    }

    public void getFirstNonRepeating(String s){
        Map<Character , Integer> m1 = new HashMap<>();
        char [] c1 = s.toCharArray();
        for(Character c: c1){
            m1.put(c,m1.getOrDefault(c,0) + 1);
        }
        m1.entrySet().stream().filter(n->n.getValue()==1).findFirst().ifPresent(System.out::println);

        for(Map.Entry<Character,Integer> m2 : m1.entrySet()){
            System.out.println(m2.getKey() + " :" + m2.getValue());
        }

        for(Map.Entry<Character,Integer> m2 : m1.entrySet()){
            if(m2.getValue()==1){
                System.out.println(m2.getKey() + " :" + m2.getValue());}
        }

        Arrays.stream(s.split(""))
                .filter(n-> !n.equals(" "))
                .collect(Collectors.groupingBy(n->n, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue()==1)
                .findFirst()
                .ifPresent(System.out::println);

    }

    public void getOccu(List<String> a1){
        //a1.stream().collect(Collectors.groupingBy(n->n , Collectors.counting())).forEach((m,n)->System.out.println(m +" : "+n));

        //to  get a map

        Map<String , Long> a2 = a1.stream().collect(Collectors.groupingBy(n->n , Collectors.counting()));
        System.out.println(a2);
    }

    public void getCommonBetweenTwoList(){
        List<String> a1 = List.of("apple" , "banan","grapes");
        List<String> a2 = List.of("apple" , "banan","grapes" , "bite" , "kite");

        a2.stream().filter(n-> a1.contains(n)).forEach(System.out::println);
    }

    public void getLongestWordFromString(){
        String s1 = "i AM the Best Coder in the worlds";

        Arrays.stream(s1.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst().ifPresent(System.out::println);

        String s2= "aaabbcccccd";
        Arrays.stream(s2.split(""))
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue() >2)
                .forEach(System.out::println);
    }

    public void firstRepeated(){

        List<Integer> a1 = Arrays.asList(1,2,3,4,3,2,4,56,6,7,5,6,7);
        Set<Integer> seen = new HashSet<>();

        a1.stream().filter(s->!seen.add(s)).findFirst().ifPresent(System.out::println);
    }

    public void sortListOfStringBasedOnLastChar(List<String> s){
        s.stream().sorted(Comparator.comparing(n->n.charAt(n.length()-1))).forEach(System.out::println);
    }

    public void getDiffOfList(){

        List<Integer> a1 = Arrays.asList(1,2,3,4,5,6);

        List<Integer> a2= Arrays.asList(3,4,5,6,7,7,8);

        List<Integer> a3 =a1.stream().filter(n->!a2.contains(n)).toList();

        System.out.println(a3);
        Stream.concat(a1.stream().filter(n->!a2.contains(n)),a2.stream().filter(n->!a1.contains(n))).distinct().forEach(System.out::println);
    }

    public void reverseCharOfEachString(List<String> s1){
        s1.stream().map(n-> new StringBuffer(n).reverse().toString()).forEach(System.out::println);
    }

    public void findUniqChar(String s){
        s.chars().mapToObj(n-> (char) n).distinct().forEach(System.out::println);
    }

    public void getLongestPalindrome(){
        List<String> a1 = List.of("madam" , "caram" , "aman" , "apple" , "cat" , "tat" ,"kkkkkk");

        a1.stream().filter(n-> n.equalsIgnoreCase(new StringBuilder(n).reverse().toString()))
                .sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

//        a1.stream()
//                .filter(n -> n.equalsIgnoreCase(new StringBuilder(n).reverse().toString()))
//                .sorted(Comparator.comparing(String::length).reversed())
//                .forEach(System.out::println);


    }

    public void mostFrequentElement(){

        List<Integer> a1 = Arrays.asList(1,2,2,3,3,3,6,7,8,8,8,8,8,8);
        a1.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting() ))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(n->n.getValue()))
                .stream().findFirst().ifPresent(System.out::println);

        a1.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting() ))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry<Integer,Long>::getValue).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void countDigit(){
        String s = "amol1234";

        System.out.println(s.chars().filter(n->Character.isDigit(n)).count());
    }

    public void getByDept(List<Employee> employeeList){
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((m,n)-> System.out.println(m +" : " + n));
    }

    public void getTopThree(List<Employee> e1){
        e1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
    }

    public void IflessThan100ThenMultiplyBy100(List<Integer> a1){
        a1.stream().filter(n->n<100).map(m->m*100).forEach(System.out::println);
    }

    public void getHighestMaleAndFemale(List<Employee> e1){
        e1.stream()
                .collect(Collectors.groupingBy(Employee::getDept , Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))))
                .forEach((m,n)->System.out.println(m+ " : " + n));
    }

    public void getHighestSalaryPerDepartment(List<Employee> elist){
        elist.stream().collect(
                        Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))))
                .forEach((m,n) ->System.out.println(m +" : " + n));
    }

    //Coding ques. Sort employee on basis of salasry  , if salary is equal then by age if age is same , by graphically smallest name.
    public void getSortedonsalAgeName(List<Employee> employeeList){
        employeeList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparingInt(Employee::getAge)
                        .thenComparing(Employee::getFname))
                .forEach(System.out::println);
    }

    public void GroupByDeptGiveOnlyName(List<Employee> elist){
        elist.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getFname , Collectors.toList())))
                .forEach((m,n)->System.out.println(m + " : " +n));
    }

    public void CountFrequencyUsingOnlyStream(String s){
        s.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong((Map.Entry<Character,Long> n)-> n.getValue()).reversed())
                .forEach((n)->System.out.println(n.getKey() + " : " + n.getValue()));

        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(n->n,LinkedHashMap::new , Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()>2).sorted(Comparator.comparingLong((Map.Entry<String ,Long> n)-> n.getValue()).reversed()).forEach(System.out::println);

        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(n->n,LinkedHashMap::new , Collectors.counting()))
                .entrySet().stream().sorted((Map.Entry.<String,Long>comparingByValue().reversed())).forEach(n->{System.out.println();});

        Object String;
        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                //.sorted(Comparator.comparingLong(Map.Entry.<String,Long>comparingByValue().reversed()))
                //.sorted(Map.Entry.<String, Long>comparingByValue()) // ascending by count
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // descending by count
                //.sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .forEach(System.out::println);

    }

    public void startwithOneFromIntegerList(List<Integer> a1){
        a1.stream().map(String::valueOf).filter(n->n.startsWith("1")).forEach(System.out::println);
    }

    public void findCommonBetweenTwoList(){
        List<Integer> a1 = List.of(1,2,3,4,5,6,7);
        List<Integer> a2 = Arrays.asList(1,2,3,11,22,33);

        a1.stream().filter(a2::contains).forEach(System.out::println);
    }

    public void joinTwoListAndRemoveDuplicate(){
        List<Integer> a1 = List.of(1,2,3,4,5,6,7);
        List<Integer> a2 = Arrays.asList(1,2,3,11,22,33);

        Stream.concat(a1.stream(),a2.stream()).distinct().forEach(System.out::println);

    }

    public void ReplaceNegativeNumbersWith0(){
        List<Integer> na = Arrays.asList(10, -5, 20, -15, 30);
        na.stream().map(n-> n<0? 0:n).forEach(System.out::println);
    }

    public void ConvertOptionalToStream(){

        Optional<List<String>> op = Optional.of(List.of("amol","saksu" , "mohit" , "honey" , "rakul"));

        op.map(List::stream).ifPresent(n->n.forEach(System.out::println));
    }

    public void UppercaseValueInsideOptionalUsingMap(){
        Optional<List<String>> s1 = Optional.of(List.of("aaa" , "ss" , "wer" , "tyui"));

        s1.stream().map(n->n.stream().map(String::toUpperCase).toList()).forEach(System.out::println);
    }

    public void CollectDeptAndListOfSal(List<Employee> elist){
        elist.stream()
                .collect(Collectors.groupingBy(Employee::getDept , Collectors.mapping(Employee::getSalary, Collectors.toList())))
                .forEach((m,n)->System.out.println(m +" : " + n));
    }

    public void collectCHarUsingSet(){
        String s1 = "asdfghasdf";
        Arrays.stream(s1.split("")).collect(Collectors.toSet()).forEach(System.out::println);
        s1.chars().mapToObj(m->(char) m ).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public void CountTotalCharactersFromList(){
        List<String> s1 =List.of("amol","saksu" , "mohit" , "honey" , "rakul");
        System.out.println(s1.stream().map(String::length).collect(Collectors.counting()));

        System.out.println(s1.stream().map(String::length).collect(Collectors.counting()));

        System.out.println(Arrays.stream(s1.stream().collect(Collectors.joining()).split("")).count());
    }

    public void printPrimeUpto100(){
        IntStream.rangeClosed(2,100).filter(Main::isPrimeByStream).forEach(System.out::println);
    }

    public static boolean isPrimeByStream(int i){
        return i>1 && IntStream.rangeClosed(2,(int)Math.sqrt(i)).allMatch(k-> i%k !=0);
    }

    public static void missingValueOfIntegerList(List<Integer> l1){
        IntStream.rangeClosed(Collections.min(l1) , Collections.max(l1)).filter(n-> !l1.contains(n)).findFirst().ifPresent(System.out::println);
    }

    public void youngestAndSmallestUsingTeeing(List<Employee> elists){
        elists.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparingInt(Employee::getAge)),
                Collectors.minBy(Comparator.comparingInt(Employee::getAge)),
                (m,n)->{
                    Map<String , Employee> m1 = new HashMap<>();
                    m1.put("Oldest" ,m.orElse(null) );
                    m1.put("youngest" ,n.orElse(null));

                    return m1;
                }
        )).forEach((m,n)->System.out.println(m + " : " + n));
    }

    public void chechTwoStringAnagram(){
        String s ="madam";
        String k = "madam";

        System.out.println(
                s.chars().sorted().boxed().toList().equals(k.chars().sorted().boxed().toList())
        );
    }

    public void findDuplicateFromList(){
        List<Integer> l1 = List.of(1,1,1,2,2,3,6,4,5,8,7,9,44,5,6,11);

        l1.stream().filter(n-> Collections.frequency(l1,n)>1).forEach(System.out::println);

    }

    public void PartitionToCheckPalindrome(){
        List<String> s1 =List.of("amol","saksu" , "mohit" , "madam" , "aba");

        s1.stream().collect(Collectors.partitioningBy(Main::checkPal)).forEach((m,n)-> System.out.println(m + " : " + n ));
        s1.stream().collect(Collectors.partitioningBy(n->n.equalsIgnoreCase(new StringBuilder(n).reverse().toString()))).forEach((m,n)-> System.out.println(m + " : " + n ));
    }

    public static boolean checkPal(String s1){
        return s1.equalsIgnoreCase(new StringBuilder(s1).reverse().toString());
    }

    public void SortInt(){
        List<Integer> l1 = List.of(1,1,1,2,2,3,6,4,5,8,7,9,44,5,6,11);

        l1.stream().sorted(Comparator.comparingInt(Integer::intValue)).skip(1).forEach(System.out::println);


    }

    public void getDigitSummed(){
        List<Integer> l1 = List.of(112,55,66,36,78);
        //System.out.println(l1.stream().flatMapToInt(n-> IntStream.of(n)));
        System.out.println(l1.stream().flatMapToInt(n-> String.valueOf(n).chars().map(k-> k- '0')).sum());
    }

    public void removeDuplicatesFromListOfString(){

        List<String> l1 = Arrays.asList("aam","kafjka" , "teems" , "lopog");

        l1.stream().map(
                n->n.chars().mapToObj(m->String.valueOf((char)m)).distinct().collect(Collectors.joining())
        ).forEach(System.out::println);
    }

    public void topThreeByDept(List<Employee> elist){
        elist.stream().collect(
                        Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.mapping(n->n.getSalary(),
                                        Collectors.collectingAndThen(
                                                Collectors.toList(),
                                                l->l.stream().sorted(
                                                                Comparator.comparingInt(Integer::intValue).reversed())
                                                        .limit(3)))))
                .forEach((g,h)->System.out.println(g + " : " + h.toList()));
    }

    public void checkSubString(String a){

        System.out.println(a);
        System.out.println(IntStream.range(0,a.length()-2).filter(n->a.substring(n,n+3).equalsIgnoreCase("abc")).count());
    }

    public void TwoDArrayPrintAndInput(){

        int a[][] ={
                {1,2,3},
                {4,5,6}
        };
        for(int i=0;i<2;i++){
            for (int j =0; j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void transposeTwoDArray(){
        int a[][] ={
                {1,2,3},
                {4,5,6}
        };
        for(int i=0;i<2;i++){
            for (int j =0; j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //traverse
        int b [][] = new int [a[0].length][a.length];

        System.out.println("-------------");

        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){

                b[j][i]=a[i][j];
            };
        }

        for(int i =0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void AddAndDiffTwod(){
        int a [][]= {
                {1,2,3,4,5},
                {6,7,8,9,0}
        };

        int b [][] = {
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int add[][] = new int [a.length][a[0].length];
        int diff[][] = new int [a.length][a[0].length];


        for(int i =0;i<a.length;i++){
            for(int j =0; j<a[0].length;j++){
                add[i][j]= a[i][j] + b[i][j];
                diff[i][j]= a[i][j] - b[i][j];
            }
        }

        System.out.println("print addd");

        for(int i =0;i<a.length;i++){
            for(int j =0; j<a[0].length;j++){
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("print diff");

        for(int i =0;i<a.length;i++){
            for(int j =0; j<a[0].length;j++){
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void MulTwoDArray() {
        int a[][] = {
                {1, 2},
                {6, 7}
        };

        int b[][] = {
                {11, 12},
                {16, 17}
        };
        int c [][] = new int [2][2];
        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void  sumOfEachCOlAndRow(){
        int a [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i =0;i<a[0].length;i++){
            int sum =0;
            for(int j =0;j<a.length;j++){
                sum += a[i][j];
            }
            System.out.println(sum);
        }

        for(int i =0;i<a.length;i++){
            int num =0;
            for(int j =0;j<a[0].length;j++){
                num += a[j][i];
            }
            System.out.println(num);
        }
    }

    public  void  DiagonalTwoDArray(){
        int a [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //int b [][] = new int [2][3];

        for(int i =0; i < a.length;i++){
            //for(int j =0; j< a[0].length;j++){

            //b[i][j]= a[i][i];
            System.out.print(a[i][i]);
            //}
            System.out.println();
        }

        for(int i =0; i < a.length;i++){
            //for(int j =0; j< a[0].length;j++){

            //b[i][j]= a[i][i];
            System.out.print(a[i][a.length-i-1]);
            //}
            System.out.println();
        }
    }

    public void TwoSumStream(List<Integer> a2 , int sum){
        a2.forEach(System.out::print);
        System.out.println(" ");
        System.out.println("the required sum op we want "+ sum);

        Set <Integer> s1 = new HashSet<>();

        a2.stream().filter(n->{
            int diff = sum - n;
            s1.add(diff);
            return a2.contains(diff);
        }).forEach(n->{System.out.println("the required two elementds are " +n +" , " + (sum - n));});
    }
}*/