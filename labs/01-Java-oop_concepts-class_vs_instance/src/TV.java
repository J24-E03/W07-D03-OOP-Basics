import java.util.ArrayList;
import java.util.stream.IntStream;

public class TV {
    private int channel = 1;
    private final ArrayList<Integer> channels = new ArrayList<>(
        IntStream.rangeClosed(1, 100).boxed().toList()
    );
    private int volumeLevel = 1;
    private boolean turnedOn = false;

    /**
     * Turns the TV on.
     */
    public TV turnOn() {
        this.turnedOn = true;

        return this;
    }

    /**
     * Turns the TV off.
     */
    public TV turnOff() {
        this.turnedOn = false;

        return this;
    }

    /**
     * Scrolls the channel up.
     */
    public void channelUp() {
        this
            .isTurnedOn()
            .isChannelValid(this.channel)
            .channel++
        ;
    }

    /**
     * Scrolls the channel down.
     */
    public void channelDown() {
        this
            .isTurnedOn()
            .isChannelValid(this.channel)
            .channel--
        ;
    }

    /**
     * Sets the channel to the desired channel.
     * @param newChannel the new channel.
     */
    public TV setChannel(int newChannel) {
        this
            .isChannelValid(newChannel)
            .channel = newChannel
        ;

        return this;
    }

    /**
     * Sets the volume to the desired volume level.
     * @param newVolumeLevel the new volume level.
     * @return the TV object.
     */
    public TV setVolume(int newVolumeLevel) {
        this
            .isTurnedOn()
            .volumeLevel = newVolumeLevel
        ;

        return this;
    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {
        this
            .isTurnedOn()
            .volumeLevel++
        ;
    }

    /**
     * Decreases the volume.
     */
    public void volumeDown() {
        this
            .isTurnedOn()
            .volumeLevel--
        ;
    }

    /**
     * Gets the volume level.
     * @return the volume level.
     */
    public int getChannel() {
        return this.channel;
    }

    /**
     * Gets the volume level.
     * @return the volume level.
     */
    public int getVolumeLevel() {
        return this.volumeLevel;
    }

    /**
     * Checks if the TV is on.
     * @return true if the TV is on, false otherwise.
     */
    public boolean isOn() {
        return this.turnedOn;
    }

    /**
     * Gets the TV status.
     * @return the TV status.
     */
    public String isOnAsString() {
        return this.turnedOn ? "on" : "off";
    }

    /**
     * Checks if the TV is on.
     * @return the TV object.
     * @throws IllegalStateException if the TV is off.
     */
    private TV isTurnedOn() {
        if (!this.turnedOn) {
            throw new IllegalStateException("The TV is off. Turn it on first.");
        }

        return this;
    }

    /**
     * Checks if the channel is valid.
     * @param channel the channel to check.
     * @return the TV object.
     * @throws IllegalStateException if the channel is out of bounds.
     */
    private TV isChannelValid(int channel) {
        this.isTurnedOn();

        if (!this.channels.contains(channel)) {
            throw new IllegalStateException(String.format("The channel [%d] is out of bounds.", channel));
        }

        return this;
    }
}