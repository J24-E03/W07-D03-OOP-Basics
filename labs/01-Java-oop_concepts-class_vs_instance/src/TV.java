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
        this.turnedOn = false;
    }

    //Method to turn the tv on
    public void turnOn() {
        turnedOn = true;
        System.out.println("TV is now on");
    }
    //Method to turnoff tv
    public void turnOff() {
        turnedOn = false;
        System.out.println("TV is now off");
    }
    //Method to channel up
    public void channelUp() {
        if(turnedOn){
            if(channel < 100){
                channel++;
                System.out.println("Channel is now: " + channel);
            } else  {
                System.out.println("Channel cannot go above 100.");
            }
        }else {
            System.out.println("TV is off. Turn it on first.");
        }
    }
    // Method to decrease the channel
    public void channelDown() {
        if(turnedOn){
            if(channel>1){
                channel--;
                System.out.println("Channel is now: " + channel);
            } else {
                System.out.println("channel cannot go below 1.");
            }
        } else {
            System.out.println("TV is off. Turn it on first.");
        }

    }
    // Method to set a specific channel
    public void setChannel(int newChannel) {
        if(turnedOn){
            if(newChannel >= 1 && newChannel <= 100){
                channel = newChannel;
                System.out.println("Channel is now: " + channel);
            } else {
                System.out.println("Invalid channel. Channel must be between 1 and 100.");
            }
        } else {
            System.out.println("TV is Off. Turn it on first.");
        }

    }
    // Method to increase the volume
    public void volumeUp() {
        if(turnedOn){
            if(volumeLevel<= 10 ){
                volumeLevel++;
                System.out.println("Volume is now: " + volumeLevel);
            } else {
                System.out.println("Volume cannot go above 10.");
            }
        } else {
            System.out.println("TV is off. Turn it on first.");
        }
    }

     //Method to Decreases the volume.

    public void volumeDown() {
        if(turnedOn){
            if(volumeLevel>= 1){
                volumeLevel--;
                System.out.println("Volume is now: " + volumeLevel);
            } else {
                System.out.println("Volume cannot go below 1.");
            }

        } else {
            System.out.println("TV is Off. Turn it on first.");
        }
    }

    public String isOn() {

        return turnedOn ? "on" : "off";
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
