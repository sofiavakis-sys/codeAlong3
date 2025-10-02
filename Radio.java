package codeAlong3;

public class Radio extends Device implements Playable {

  public Radio() {
    super("Radio");
  }

  @Override
  public void play(String songName) {
    this.adjustAntenna();
    System.out.println("Playing " + songName + " from Radio!");
  }

  private void adjustAntenna() {
    System.out.println("Adjusting the antenna for the radio...");
  }

}