package codeAlong3;

public class IPhone {

  private int batteryLife;
  public IPhone(){
    this.batteryLife = 100;
  }

  public void playIPhone(String songName){
    this.searchOnSpotify();
    System.out.println("Playing " + songName + " from IPhone!");
    this.batteryLife--;
    System.out.println("Battery now at " + this.batteryLife);
  }

  private void searchOnSpotify(){
    System.out.println("Searching on Spotify...");
  }

  public void plugIn(){
    System.out.println("IPhone has been plugged in");
  }

  public void turnOn(){
    System.out.println("IPhone has been turned on");
  }

}