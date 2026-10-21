public class Exercise1_5 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sunDiameter = 865000;
        double earthDiameter = 7600;
        
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;
        
        double earthVolume = (4.0 / 3) * PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3) * PI * Math.pow(sunRadius, 3);
        double ratio = sunVolume / earthVolume;
        
        System.out.println("Volume of the Earth: " + earthVolume + " cubic miles");
        System.out.println("Volume of the Sun: " + sunVolume + " cubic miles");
        System.out.println("Ratio of Sun volume to Earth volume: " + ratio);
    }
}
