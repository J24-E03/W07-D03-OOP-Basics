/**
* Let's make a TV party!!
*/
public class TVParty {

 /**
 * Main method to the TV party.
 * @param args args
 */
 public static void main(String[] args) {
 // TODO Instantiate the TV object
 TV tv = new TV();

 // TODO Your first code goes here
 tv.turnOn(); // Turn on the TV
 tv.setChannel(3); // Set the channel to 3
 tv.volumeLevel = 7; // Set volume level to 7

 System.out.println("Let's watch the Alien Movie. The TV is currently [" + tv.isOn() + "] and it should be [on]." +
 " It's being shown on channel [3], and we're currently on channel [" + tv.channel + "]. " +
 "Your friend Lisa also would like to have the volume set to [7], and we're currently on volume [" + tv.volumeLevel + "].");

 //TODO Food break! Turn the TV off.
 tv.turnOff(); // Turn off the TV

 System.out.println("Food break! The TV should be [off], and it's currently [" + tv.isOn() + "].");

 // TODO Your second code goes here
 tv.turnOn(); // Turn on the TV again
 tv.setChannel(95); // Set the channel to 95
 tv.volumeLevel = 5; // Set volume level to 5

 System.out.println("Now let's watch the last season of Game of Thrones. The TV is currently [" + tv.isOn() +
  "] and it should be [on]. " +
  "It's being shown on channel [95], and we're currently on channel [" + tv.channel + "]. " +
  "Your friend Gabriel also would like to have the volume set to [5], and we're currently on volume [" + tv.volumeLevel + "].");
 }
}

