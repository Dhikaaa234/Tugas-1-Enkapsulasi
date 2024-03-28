package kelas;
public class kelasLcd {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    // Constructor
    public kelasLcd() {
        
        this.status = "off"; // Default status 
        this.volume = 50; // Default volume 
        this.brightness = 37; // Default brightness 
        this.cable = "none"; // Default cable
    }

    public void turnOff() {
        this.status = "off";
    }

    public void turnOn() {
        this.status = "on";
    }

    public void freeze() {
        this.status = "freeze";
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        } 
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        } 
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } 
    }

    public void brightnessUp() {
        if (brightness < 100) {
            brightness++;
        } 
    }

    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        } 
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } 
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getStatus() {
        return status;
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getCable() {
        return cable;
    }
}

