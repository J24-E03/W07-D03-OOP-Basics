public class TV {
    int channel;
    int volumeLevel;
    boolean turnedOn;

    /**
     * The constructor. Called when you instantiate a TV.
     */
    public TV() {
        channel = 1;
        volumeLevel = 1;
        turnedOn = false;
    }

    /**
     * Turns the TV on.
     */
    public void turnOn() {
        turnedOn = true;
    }

    /**
     * Turns the TV off.
     */
    public void turnOff() {
        turnedOn = false;
    }

    /**
     * Scrolls the channel up.
     */
    public void channelUp() {
        if (turnedOn && channel < 100) {
            channel++;
        }
    }

    /**
     * Scrolls the channel down.
     */
    public void channelDown() {
        if (turnedOn && channel > 1) {
            channel--;
        }
    }

    /**
     * Sets the channel to the desired channel.
     * @param newChannel the new channel.
     */
    public void setChannel(int newChannel) {
        if (turnedOn && newChannel >= 1 && newChannel<= 100) {
            channel = newChannel;
        }
    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {
        if (turnedOn && volumeLevel < 10) {
            volumeLevel++;
        }
    }

    /**
     * Decreases the volume.
     */
    public void volumeDown() {
        if (turnedOn && volumeLevel > 1) {
            volumeLevel--;
        }
    }

    public String isOn() {
        return turnedOn ? "on" : "off";
    }
}