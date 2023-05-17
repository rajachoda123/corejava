public interface Vehicle {
    static String producer() {
        System.out.println("Producer Called");
        return "N&F Vehicles";
    }

    default String getOverview() {
        return "AT V made by producer"+ producer();
    }
}
