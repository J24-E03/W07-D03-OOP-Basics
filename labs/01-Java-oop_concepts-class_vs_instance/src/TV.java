public class TV {
 int channel;
 int volumeLevel;
 boolean turnedOn;

 /**
* The constructor. Called when you instantiate a TV.
*/
 public TV() {
 // Initialize channel to 1, volumeLevel to 1, and turnedOn to false
 this.channel = 1;
 this.volumeLevel = 1;
 this.turnedOn = false;
 }

  /**
 * Turns the TV on.
 */
  public void turnOn() {
 this.turnedOn = true;
 }

 /**
* Turns the TV off.
*/
 public void turnOff() {
 this.turnedOn = false;
 }

 /**
* Scrolls the channel up.
*/
 public void channelUp() {
 if (turnedOn && channel < 100) { // Only increase channel if TV is on and below max channel
 channel++;
 }
 }

 /**
* Scrolls the channel down.
*/
 public void channelDown() {
 if (turnedOn && channel > 1) { // Only decrease channel if TV is on and above min channel
 channel--;
 }
 }

 /**
* Sets the channel to the desired channel.
* @param newChannel the new channel.
*/
 public void setChannel(int newChannel) {
 if (turnedOn && newChannel >= 1 && newChannel <= 100) { // Only set channel if within range and TV is on
 channel = newChannel;
 }
 }

 /**
* Increases the volume.
*/
 public void volumeUp() {
 if (turnedOn && volumeLevel < 10) { // Only increase volume if TV is on and below max volume
 volumeLevel++;
 }
 }

/**
     *Decreases the volume.
 */
   public void volumeDown() {
 if (turnedOn && volumeLevel > 1) { // Only decrease volume if TV is on and above min volume
 volumeLevel--;
 }
 }

 public String isOn() {
 return turnedOn ? "on" : "off";
 }
}
