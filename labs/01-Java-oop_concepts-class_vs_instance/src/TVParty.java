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

        tv
            .turnOn()
            .setChannel(3)
            .volumeUp(6)
        ;
        System.out.println("Let's watch the Alien Movie. The TV is currently [" + tv.isOnAsString() + "] and it should be [on].");
        System.out.println("It's being shown on channel [3], and we're currently on channel [" + tv.getChannel() + "].");
        System.out.println("Your friend Lisa also would like to have the volume set to [7], and we're currently on volume [" + tv.getVolumeLevel() + "].");

        tv.turnOff();
        System.out.println("Food break! The TV should be [off], and it's currently [" + tv.isOnAsString() + "].");

        tv
            .turnOn()
            .setChannel(95)
            .volumeDown(2)
        ;
        System.out.println("Now let's watch the last season of Game of Thrones. The TV is currently [" + tv.isOnAsString() + "] and it should be [on].");
        System.out.println("It's being shown on channel [95], and we're currently on channel [" + tv.getChannel() + "].");
        System.out.println("Your friend Gabriel also would like to have the volume set to [5], and we're currently on volume [" + tv.getVolumeLevel() + "].");
    }
}
