public class BalancedBrackets {
    public static void main(String[] args) {
        String input = "([])";
        System.out.println(checkIfBalanced(input));



    }

    private static String checkIfBalanced(String input) {
       while (input.contains( "{}") || input.contains("[]" )|| input.contains("()")) {
           System.out.println("hi");
           input= input.replaceAll("\\{\\}","")
                   .replaceAll("\\[\\]","")
                   .replaceAll("\\(\\)","");
       }
       if(input.length()>0){
           return  "false";

       }else return "true";
    }
}
