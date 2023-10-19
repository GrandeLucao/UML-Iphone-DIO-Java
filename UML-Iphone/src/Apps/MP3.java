package Apps;

import java.util.Scanner;

public class MP3 {

	public static Scanner input=new Scanner(System.in);

    private String songName;
    private boolean isPlaying;

    public void playSong(String songName){
        System.out.println("Playing "+songName);
        isPlaying=true;
    }

    public void pauseSong(){
        if(isPlaying){
            System.out.println("Pausing song: "+songName);
            isPlaying=false;
        }
    }

    public void selectSong(){
        System.out.println("What song do you want to play?");
        songName=input.nextLine();
        setSongName(songName);
        playSong(songName);
    }



    
    

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
}
