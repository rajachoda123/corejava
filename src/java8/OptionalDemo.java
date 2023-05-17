package java8;

import java.util.Arrays;
import java.util.List;

public class OptionalDemo {
    public static void main(String[] args) {
        CustomerOptional customerOptional = new CustomerOptional(1,null,"abc@gmail.com", Arrays.asList("123","456"));
        //empty
        //of
        //nullable
    }
}

class CustomerOptional {
    private int id;
    private String name;
    private String email;
    private List<String> phonenumbers;

    public CustomerOptional(int id, String name, String email, List<String> phonenumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumbers = phonenumbers;
    }
    public CustomerOptional(){}

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(List<String> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }
}