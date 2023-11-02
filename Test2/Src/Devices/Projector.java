package Test2.Src.Devices;

import Test2.Src.DeviceActions.PhotoViewer;
import Test2.Src.DeviceActions.VolumeControl;
import Test2.Src.Interfaces.Device;

public class Projector implements Device {
    private String name = "Projector";
    private int width = 1920;
    private int height = 1080;
    private String dimensions = width + "x" + height;

    @Override
    public void turnOn() {
        System.out.println("Laptop encendido");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop apagado");
    }

    @Override
    public void displayPhoto(String photo) {
        new PhotoViewer().showPhoto(photo);
    }

    @Override
    public void adjustPhotoSize() {
        new PhotoViewer().adjustSize();
    }

    @Override
    public void setVolume(int volume) {
        new VolumeControl().setVolume(volume);
    }
    @Override
    public String getDimensions() {
        return this.dimensions;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
    public String getName(){
        return this.name;
    }
}