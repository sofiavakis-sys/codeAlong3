package codeAlong3;

public class CDPlayer {

  public CDPlayer(){}

  public void playCDPlayer(String songName){
    this.wipeCD(songName);
    System.out.println("Playing " + songName + " from CDPlayer!");
  }

  private void wipeCD(String songName){
    System.out.println("Wiping the CD for " + songName);
  }

  public void plugIn(){
    System.out.println("CDPlayer has been plugged in");
  }

  public void turnOn(){
    System.out.println("CDPlayer has been turned on");
  }
}
