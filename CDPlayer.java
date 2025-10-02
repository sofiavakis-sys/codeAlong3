package codeAlong3;

public class CDPlayer extends Device implements Playable{

  public CDPlayer(){
    super("CDPlayer");
  }

  @Override
  public void play(String songName){
    this.wipeCD(songName);
    System.out.println("Playing " + songName + " from CDPlayer!");
  }

  private void wipeCD(String songName){
    System.out.println("Wiping the CD for " + songName);
  }

}
