package codeAlong3;

public abstract class Device {
    private String name;
    public Device(String deviceName) {
        this.name = deviceName;

    }

    public void plugIn() {
        System.out.println(this.name + " has been plugged in!");
    }

    public void turnOn() {
        System.out.println(this.name + " has been turned on!");
    }

}
