public class Exercise1_6 {
    public static void main(String[] args) {
        double tankCapacity = 40;
        double normalConsumption = 8;
        double roughConsumption = normalConsumption * 1.15;
        
        double normalDistance = tankCapacity / normalConsumption * 100;
        double roughDistance = tankCapacity / roughConsumption * 100;
        
        System.out.println("Distance on normal roads with full tank: " + normalDistance + " km");
        System.out.println("Distance on rough roads with full tank: " + roughDistance + " km");
    }
}
