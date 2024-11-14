public class TV {
    int channel;
    int volumeLevel;
    boolean turnedOn= false;

    /**
     * The constructor. Called when you instantiate a TV.
     */
    public TV(int channel, int volumeLevel) {

        this.channel= channel;
        this.volumeLevel= volumeLevel;
        System.out.println("The TV is There");
    }

    /**
     * Turns the TV on.
     */
    public void turnOn() {
        this.turnedOn= true;
        System.out.println("The Tv is now on");
    }

    /**
     * Turns the TV off.
     */
    public void turnOff() {
        this.turnedOn= false;
        System.out.println("The Tv is now off");
    }

    /**
     * Scrolls the channel up.
     */
    public void channelUp() {

        if ( turnedOn ){
            if ( channel <100 ){
                channel +=1 ;
                System.out.println("Channel changed to "+ channel + " .");
            }
        }
    }

    /**
     * Scrolls the channel down.
     */
    public void channelDown() {
        if ( turnedOn ){
            if(channel >1 ){
                channel -=1 ;
                System.out.println("Channel changed to "+ channel + " .");
            }
        }
    }

    /**
     * Sets the channel to the desired channel.
     * @param newChannel the new channel.
     */
    public void setChannel(int newChannel) {
        if ( 0<newChannel && newChannel <=100 ){
            this.channel= newChannel;
            System.out.println("Channel changed to "+ newChannel + " .");
        }
    }

    /**
     * Increases the volume.
     */
    public void volumeUp() {
        if ( turnedOn ){
            if (volumeLevel <10 ){
                volumeLevel +=1 ;
                System.out.println("VolumeLevel changed to "+ volumeLevel + " .");
            }
        }
    }

    /**
     * Decreases the volume.
     */
    public void volumeDown() {
        if ( turnedOn ){
            if ( volumeLevel >1 ){
                volumeLevel -=1 ;
                System.out.println("VolumeLevel changed to "+ volumeLevel + " .");
            }
        }
    }

    public String isOn() {
        return turnedOn ? "on" : "off";
    }
}