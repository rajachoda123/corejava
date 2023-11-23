import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private String customerId;
    private String location;
    // other attributes and methods

    public Customer(String customerId, String location) {
        this.customerId = customerId;
        this.location = location;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getLocation() {
        return location;
    }
}

class Transaction {
    private String transactionId;
    private String location;
    // other attributes and methods

    public Transaction(String transactionId, String location) {
        this.transactionId = transactionId;
        this.location = location;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getLocation() {
        return location;
    }
}

class CustomerTransaction {
    private String customerId;
    private String transactionId;

    public CustomerTransaction(String customerId, String transactionId) {
        this.customerId = customerId;
        this.transactionId = transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}

public class JoinListsExample {

    public static void main(String[] args) {
        // Sample lists
        List<Customer> customers = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();

        customers.add(new Customer("C1", "Hyderabad"));
        customers.add(new Customer("C2", "Bangalore"));
        customers.add(new Customer("C3", "Hyderabad"));

        transactions.add(new Transaction("T1", "Hyderabad"));
        transactions.add(new Transaction("T2", "Chennai"));
        transactions.add(new Transaction("T3", "Hyderabad"));

        // Joining lists based on location being "Hyderabad" and creating CustomerTransaction objects
        List<CustomerTransaction> result = customers.stream()
                .filter(customer -> "Hyderabad".equals(customer.getLocation()))
                .flatMap(customer -> transactions.stream()
                        .filter(transaction -> "Hyderabad".equals(transaction.getLocation()))
                        .map(transaction -> new CustomerTransaction(customer.getCustomerId(), transaction.getTransactionId())))
                .collect(Collectors.toList());

        // Printing the result
        result.forEach(ct -> System.out.println("CustomerID: " + ct.getCustomerId() + ", TransactionID: " + ct.getTransactionId()));
    }
}
