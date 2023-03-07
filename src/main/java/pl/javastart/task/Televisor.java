package pl.javastart.task;

public class Televisor {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean showStatus() {
        return isOn;
    }
}
