package java17;

public record GuestHouse(String name , int days) {
    public static void main(String[] args) {
        GuestHouse peachtree = new GuestHouse("raja", 30);
    }
}

 