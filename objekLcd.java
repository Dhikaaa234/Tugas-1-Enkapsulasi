import kelas.kelasLcd;
public class objekLcd {
    public static void main(String[] args) {
       
        kelasLcd punyaLCD = new kelasLcd();

        // punyaLCD.turnOn();
        punyaLCD.setVolume(50);
        punyaLCD.volumeUp();
        punyaLCD.setBrightness(37);
        punyaLCD.brightnessUp();
        punyaLCD.setCable("HDMI");
        punyaLCD.freeze();
        // punyaLCD.turnOff();
        
        System.out.println("LCD Status: " + punyaLCD.getStatus());
        System.out.println("Volume: " + punyaLCD.getVolume());
        System.out.println("Brightness: " + punyaLCD.getBrightness());
        System.out.println("Cable: " + punyaLCD.getCable());


    }
}
