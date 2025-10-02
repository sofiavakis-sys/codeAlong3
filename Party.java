package codeAlong3;

public class Party {

    public Party(){
        //Instantiate DJ
        DJ lefty = new DJ();

        //Instantiate devices
        CDPlayer leftyCDPlayer = new CDPlayer();
        IPhone leftyIPhone = new IPhone();
        Radio leftyRadio = new Radio();
        Microphone leftyMic = new Microphone();

        //TODO: have the DJ set up devices!

        lefty.setUpDevice(leftyIPhone);
        lefty.setUpDevice(leftyRadio);
        lefty.setUpDevice(leftyMic);
        lefty.setUpDevice(leftyCDPlayer);


        //TODO: have the DJ play music!
        lefty.playRequest(leftyIPhone, "Mystical Magical by Benson Boone");
        lefty.playRequest(leftyRadio, "Gangam Style by Psi");
        lefty.playRequest(leftyCDPlayer, "I love cs15!!!");



    }
}