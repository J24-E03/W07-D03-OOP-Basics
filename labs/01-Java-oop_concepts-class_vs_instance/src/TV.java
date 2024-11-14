import java.util.ArrayList;
import java.util.stream.IntStream;

public class TV {
    private int channel = 1;
    private static final ArrayList<Integer> channels = new ArrayList<>(
        IntStream.rangeClosed(1, 100).boxed().toList()
    );
    private int volumeLevel = 1;
    private static final ArrayList<Integer> volumeLevels = new ArrayList<>(
        IntStream.rangeClosed(1, 10).boxed().toList()
    );
    private boolean turnedOn = false;

    /**
     * Turns the TV on.
     * @return the TV object.
     */
    public TV turnOn() {
        this.turnedOn = true;

        return this;
    }

    /**
     * Turns the TV off.
     * @return the TV object.
     */
    public TV turnOff() {
        this.turnedOn = false;

        return this;
    }

    /**
     * Scrolls the channel up.
     * @param times the number of times to scroll up.
     * @return the TV object.
     */
    public TV channelUp(int times) {
        IntStream.range(0, times).forEach(i -> this
            .isChannelValid(this.channel + 1)
            .channel++
        );

        return this;
    }

    /**
     * Scrolls the channel down.
     * @param times the number of times to scroll down.
     * @return the TV object.
     */
    public TV channelDown(int times) {
        IntStream.range(0, times).forEach(i -> this
            .isChannelValid(this.channel - 1)
            .channel--
        );

        return this;
    }

    /**
     * Sets the channel to the desired channel.
     * @param newChannel the new channel.
     * @return the TV object.
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
     * @param volumeLevel the new volume level.
     * @return the TV object.
     */
    public TV setVolume(int volumeLevel) {
        this
            .isVolumeLevelValid(volumeLevel)
            .volumeLevel = volumeLevel
        ;

        return this;
    }

    /**
     * Increases the volume.
     * @param times the number of times to increase the volume.
     * @return the TV object.
     */
    public TV volumeUp(int times) {
        IntStream.range(0, times).forEach(i -> this
            .isVolumeLevelValid(this.volumeLevel + 1)
            .volumeLevel++
        );

        return this;
    }

    /**
     * Decreases the volume.
     * @param times the number of times to decrease the volume.
     * @return the TV object.
     */
    public TV volumeDown(int times) {
        IntStream.range(0, times).forEach(i -> this
            .isVolumeLevelValid(this.volumeLevel - 1)
            .volumeLevel--
        );

        return this;
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
        if (this.turnedOn) {
            return this;

        }

        throw new IllegalStateException("The TV is off. Turn it on first.");
    }

    /**
     * Checks if the channel is valid.
     * @param channel the channel to check.
     * @return the TV object.
     * @throws IllegalStateException if the channel is out of bounds.
     */
    private TV isChannelValid(int channel) {
        this.isTurnedOn();

        if (channels.contains(channel)) {
            return this;
        }

        throw new IllegalStateException(String.format("The channel [%d] is out of bounds.", channel));
    }

    /**
     * Checks if the volume level is valid.
     * @param volumeLevel the volume level to check.
     * @return the TV object.
     * @throws IllegalStateException if the volume level is out of bounds.
     */
    private TV isVolumeLevelValid(int volumeLevel) {
        this.isTurnedOn();

        if (volumeLevels.contains(volumeLevel)) {
            return this;
        }

        throw new IllegalStateException(String.format("The volume level [%d] is out of bounds.", volumeLevel));
    }
}