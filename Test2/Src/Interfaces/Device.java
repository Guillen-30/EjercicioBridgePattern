package Test2.Src.Interfaces;

public interface Device {
    void turnOn();
    void turnOff();
    void displayPhoto(String photo);
    void adjustPhotoSize();
    void setVolume(int volume);
    String getDimensions();
    int getWidth();
    int getHeight();
    String getName();
}