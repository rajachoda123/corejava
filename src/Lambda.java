import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Lambda(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lambda other = (Lambda) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Lambda l1 = new Lambda(1, "tej");
        Lambda l2 = new Lambda(2, "raja");

        List<String> list = new ArrayList<>(Arrays.asList("raja", "sai", "Ravi"));
        List<String> list1 = list;
        System.out.println(l1);
        list1.remove(0);
        System.out.println(list1);

        // System.out.println(l1.equals(l2));
        // 1.print raja
        Hello hello = () -> System.out.print("raja");
        // 2. print sum of two numbers
        Calc c = (a, b) -> {
            return a + b;
        };
        // 3.get length of String
        StringOperations st = (s) -> s.length();
    }
}

@FunctionalInterface
interface Hello {
    public void hello();
}

@FunctionalInterface
interface Calc {
    public int operation(int a, int b);
}

@FunctionalInterface
interface StringOperations {
    public int stringOps(String str);

}