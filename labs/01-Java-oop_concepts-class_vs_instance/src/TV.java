public class TV {
    int channel;
    int volumeLevel;
    boolean turnedOn;

    /**
     * The constructor. Called when you instantiate a TV.
     */
    public TV() {
    }

    /**
     * Turns the TV on.
     */
    public void turnOn() {

    }

    /**
     * Turns the TV off.
     */
    public void turnOff() {

    }

    /**
     * Scrolls the channel up.
     */
    public void channelUp() {

    }

    /**
     * Scrolls the channel down.
     */
    public void channelDown() {

    }

    /**
     * Sets the channel to the desired channel.
     * @param newChannel the new channel.
     */
    public void setChannel(int newChannel) {

    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {

    }

    /**
     * Decreases the volume.
     */
    public void volumeDown() {

    }

    public String isOn() {
        return turnedOn ? "on" : "off";
    }
}