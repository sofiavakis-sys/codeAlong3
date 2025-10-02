package codeAlong3;

public class Radio {

  public Radio(){}

  public void playRadio(String songName){
    this.adjustAntenna();
    System.out.println("Playing " + songName + " from Radio!");
  }

  private void adjustAntenna(){
    System.out.println("Adjusting the antenna for the radio...");
  }

  public void plugIn(){
    System.out.println("Radio has been plugged in");
  }

  public void turnOn(){
    System.out.println("Radio has been turned on");
  }
}