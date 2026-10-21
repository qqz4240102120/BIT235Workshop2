public class Exercise1_4 {
    public static void main(String[] args) {
        double principal = 5000.0;
        double rate = 0.04;
        int years = 10;
        
        double amount = principal * Math.pow(1 + rate, years);
        System.out.println("Total amount after 10 years: $" + String.format("%.2f", amount));
    }
}
