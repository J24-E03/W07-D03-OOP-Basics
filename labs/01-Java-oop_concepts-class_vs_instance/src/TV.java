public class TV {
    int channel = 1;    // Default channel is 1
    int volumeLevel = 1;    // Default volume level is 1
    boolean turnedOn = false;   // TV is off

    /**
     * The constructor. Called when you instantiate a TV.
     */
    public TV() {
        this.channel = 1;
        this.volumeLevel = 1;
        this.turnedOn = false;
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
        if (turnedOn && channel < 120) {
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
     * * Sets the channel to the desired channel.
     *
     * @param newChannel the new channel.
     */
    public void setChannel(int newChannel) {
        if (turnedOn && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (turnedOn && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {
        if (turnedOn && volumeLevel < 7) {
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