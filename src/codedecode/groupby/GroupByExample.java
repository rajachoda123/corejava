package codedecode.groupby;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        Emp e2 = new Emp(10,"sai", 1000);
        Emp e3 = new Emp(4,"baba",1000);
        Emp e1 = new Emp(1,"raja",38);
        Emp e4 = new Emp(5,"balu",38);
        Emp e5 = new Emp(3,"amma", 35);
        Emp e6 = new Emp(8,"Nanna", 70);
        List<Emp> listEmp = Arrays.asList(e1,e2,e3,e4,e5,e6);

        //1. default list returns
        Map<Integer, List<Emp>> collect = listEmp.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        Map<Integer, Set<Emp>> collect1 = listEmp.stream().collect(Collectors.groupingBy(e -> e.getAge(), Collectors.toSet()));
        TreeMap<Integer, List<Emp>> collect2 = listEmp.stream().collect(Collectors.groupingBy(emp -> emp.getAge(), TreeMap::new, Collectors.toUnmodifiableList()));

        //list all the ages from employee list
        List<Integer> idList = listEmp.stream().map(emp -> emp.getId()).collect(Collectors.toList());
        IntSummaryStatistics intSummaryStatistics = idList.stream().mapToInt(id -> id).summaryStatistics();
        System.out.println("max: " + intSummaryStatistics.getMax()+ "min is: "+intSummaryStatistics.getMin());
        List<Integer> filteredIdList = idList.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("filtered id list "+filteredIdList);
        System.out.println("collect:: " +  collect);
        System.out.println("collect1  " +  collect1);
        System.out.println("collect2  " +  collect2);

    }
}
