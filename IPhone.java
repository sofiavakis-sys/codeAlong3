package codeAlong3;

public class IPhone extends Device implements Playable {

  private int batteryLife;
  public IPhone() {
    //super() invokes the constructor
    super("IPhone");
    this.batteryLife = 100;
  }

  @Override
  public void play(String songName){
    this.searchOnSpotify();
    System.out.println("Playing " + songName + " from IPhone!");
    this.batteryLife--;
    System.out.println("Battery now at " + this.batteryLife);
  }

  private void searchOnSpotify(){
    System.out.println("Searching on Spotify...");
  }

}