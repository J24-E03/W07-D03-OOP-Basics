public class TV {
    int channel;
    int volumeLevel;
    boolean turnedOn;

    /**
     * The constructor. Called when you instantiate a TV.
     */
    public TV() {
        this.channel = 1;
        this.volumeLevel = 1;
    }

    /**
     * Turns the TV on.
     */
    public void turnOn() {
        this.turnedOn = true;
    }

    /**
     * Turns the TV off.
     */
    public void turnOff() {
        this.turnedOn = false;
    }

    /**
     * Scrolls the channel up.
     */
    public void channelUp() {
        if (turnedOn && this.channel < 100) {
            this.channel++;
        }
    }

    /**
     * Scrolls the channel down.
     */
    public void channelDown() {
        if (turnedOn && this.channel > 1) {
            this.channel--;
        }
    }

    /**
     * Sets the channel to the desired channel.
     *
     * @param newChannel the new channel.
     */
    public void setChannel(int newChannel) {
        if (turnedOn && newChannel >= 1 && newChannel <= 100) {
            this.channel = newChannel;
        } else {
            System.out.println("Invalid chanel number!");
        }
    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {
        if (turnedOn && volumeLevel < 10) {
            this.volumeLevel++;
        }
    }

    /**
     * Decreases the volume.
     */
    public void volumeDown() {
        if (turnedOn && this.volumeLevel > 1) {
            this.volumeLevel--;
        }
    }

    public String isOn() {
        return turnedOn ? "on" : "off";
    }

    public void setVolume(int preferredVolume) {
        while (this.volumeLevel != preferredVolume) {
            if (this.volumeLevel < preferredVolume) {
                this.volumeUp();
            } else {
                this.volumeDown();
            }
        }
    }
}