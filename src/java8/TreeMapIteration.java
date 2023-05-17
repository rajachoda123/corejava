package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeMapIteration {
    public static void main(String[] args) {
        TreeMapIteration tmi = new TreeMapIteration();
        Map<String, String> resultMap = tmi.fetchResult(QuestionGroup.feedData());
        System.out.println(resultMap);
    }

    private static Map<String,String> fetchResult(List<QuestionGroup> questionGroupList) {
        List<Map<String, String>> treeMapList = questionGroupList.stream().map(x -> x.getGroupMetaData()).collect(Collectors.toList());

        final Optional<Map<String, String>> reduce = treeMapList.stream().reduce((firstMap, secondMap) -> {
            return Stream.concat(firstMap.entrySet().stream(), secondMap.entrySet().stream())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (countInFirstMap, countInSecondMap) -> countInSecondMap));
        });

        System.out.println(reduce.get());
        return reduce.get();
    }
}

class QuestionGroup {
    private Map<String,String> groupMetaData;
    private String name;

    public Map<String, String> getGroupMetaData() {
        return groupMetaData;
    }

    public void setGroupMetaData(Map<String, String> groupMetaData) {
        this.groupMetaData = groupMetaData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuestionGroup(Map<String, String> groupMetaData, String name) {
        this.groupMetaData = groupMetaData;
        this.name = name;
    }
    public static List<QuestionGroup> feedData() {
        Map<String,String> treeMap = new TreeMap<>();
        treeMap.put("sai","sai");
        treeMap.put("baba","baba");
        treeMap.put("jejinayana","jejinayana");
        System.out.println(treeMap);
        QuestionGroup group1 = new QuestionGroup(treeMap,"first");
        treeMap.put("raja","raja");
        treeMap.put("balu","balu");
        treeMap.put("lakshmi","lakshmi");
        treeMap.put("sai","saiBaba");
        treeMap.put("baba","mere sai");
        QuestionGroup group2 = new QuestionGroup(treeMap,"first");
        return Arrays.asList(group1,group2);
    }
}
