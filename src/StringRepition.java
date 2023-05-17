
public class StringRepition {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 57;
        /*
         * int b = 579857059; String str = String.valueOf(b); String s =
         * String.valueOf(a);
         *
         * System.out.println(str.lastIndexOf(s)); for (int i = -1; (i = str.indexOf(s,
         * i + 1)) != -1; i++) { System.out.println(i); } // prints "4", "13", "22"
         */
        String text = "0123hello9012hello8901hello7890";
        String word = "hello";
        String searchableString = "57123575";
        String keyword = "57";


        int index = searchableString.indexOf(keyword);
        while (index >= 0) {
            System.out.println("Index : " + index);
            index = searchableString.indexOf(keyword, index + keyword.length());
        }
    }

}
