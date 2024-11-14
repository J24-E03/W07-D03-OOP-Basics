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
    public TV(int channel, int volumeLevel, boolean turnedOn) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.turnedOn = turnedOn;
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
        setChannel(channel + 1);
    }

    /**
     * Scrolls the channel down.
     */
    public void channelDown() {
        setChannel(channel - 1);
    }

    /**
     * Sets the channel to the desired channel.
     * @param newChannel the new channel.
     */
    public void setChannel(int newChannel) {
        if(turnedOn) {
            if (newChannel > 100 || newChannel < 1) {
                System.out.println("invalid channel");
            }
            else {
                channel = newChannel;
            }

        }
    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {
        if(turnedOn) {
            volumeLevel = volumeLevel + 1;
        }

    }

    /**
     * Decreases the volume.
     */
    public void volumeDown() {
        if(turnedOn) {
            volumeLevel = volumeLevel - 1;
        }

    }

    public String isOn() {
        return turnedOn ? "on" : "off";
    }
}