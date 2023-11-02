package Test2.Src.Bridges;

import Test2.Src.Interfaces.Device;
import Test2.Src.Interfaces.DeviceBridge;

public class GoogleHomeBridge implements DeviceBridge {
    private Device device;

    @Override
    public void powerOn() {
        device.turnOn();
    }

    @Override
    public void powerOff() {
        device.turnOff();
    }

    @Override
    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public void testDevice() {
        int numRandom = (int)Math.floor(Math.random() * (100 - 0 + 1) + 0);
        System.out.println("Hey Google!! Pon el volumen de "+device.getName()+" en "+ numRandom);
        System.out.println("Volumen del dispositivo "+device.getName()+ " en "+ numRandom );
        System.out.println("Hey Google!! Reproduce netflix en "+device.getName());
        System.out.println("Reproduciendo netflix en el dispositivo "+device.getName()+ " a la resolucion "+device.getDimensions());
    }
}