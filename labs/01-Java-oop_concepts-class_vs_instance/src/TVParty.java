/**
 * Let's make a TV party!!
 */
public class TVParty {

    /**
     * Main method to the TV party.
     * @param args args
     */
    public static void main(String[] args) {

        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(3);
        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        tv.turnOff();

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.setChannel(95);
        tv2.volumeDown();
        tv2.volumeDown();
        tv2.turnOff();

        System.out.println("tv1's channel is " + tv.channel + " and volume level is " + tv.volumeLevel);

        System.out.println("Let's watch the Alien Movie. The TV is currently [" + tv.isOn() + "] and it should be [on]." +
                " It's being shown on channel [3], and we're currently on channel [" + tv.channel + "]. " +
                "Your friend Lisa also would like to have the volume set to [7], and we're currently on volume [" + tv.volumeLevel + "].");

        System.out.println("Food break! The TV should be [off], and it's currently [" + tv.isOn() + "].");

        System.out.println("Now let's watch the last season of Game of Thrones. The TV is currently [" + tv.isOn() +
                "] and it should be [on]. " +
                "It's being shown on channel [95], and we're currently on channel [" + tv.channel + "]. " +
                "Your friend Gabriel also would like to have the volume set to [5], and we're currently on volume [" + tv.volumeLevel + "].");
    }




}
