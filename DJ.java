package codeAlong3;

public class DJ {

  public DJ(){}

  public void playRequest(Playable myPlayable, String songName){
    myPlayable.play(songName);

  }

  public void setUpDevice(Device myDevice){
    myDevice.plugIn();
    myDevice.turnOn();
  }

}

