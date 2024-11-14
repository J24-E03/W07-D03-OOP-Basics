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
        // part one
        tv.turnOn();
        tv.setChannel(3);
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();



        //TODO Your first code goes here

        System.out.println("Let's watch the Alien Movie. The TV is currently [" + tv.isOn() + "] and it should be [on]." +
                " It's being shown on channel [3], and we're currently on channel [" + tv.channel + "]. " +
                "Your friend Lisa also would like to have the volume set to [7], and we're currently on volume [" + tv.volumeLevel + "].");
        tv.turnOff();

        //TODO food break! turn the tv off.

        System.out.println("Food break! The TV should be [off], and it's currently [" + tv.isOn() + "].");

        //TODO your second code goes here
        // part 2
        tv.turnOn();
        tv.setChannel(95);

        tv.volumeDown();
        tv.volumeDown();
        System.out.println("Now let's watch the last season of Game of Thrones. The TV is currently [" + tv.isOn() +
                "] and it should be [on]. " +
                "It's being shown on channel [95], and we're currently on channel [" + tv.channel + "]. " +
                "Your friend Gabriel also would like to have the volume set to [5], and we're currently on volume [" + tv.volumeLevel + "].");
    }




}
