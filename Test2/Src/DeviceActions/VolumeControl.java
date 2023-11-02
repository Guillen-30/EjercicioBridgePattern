package Test2.Src.DeviceActions;

public class VolumeControl {
    private int volume = 50;
    
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volumen ajustado a " + volume);
    }
}