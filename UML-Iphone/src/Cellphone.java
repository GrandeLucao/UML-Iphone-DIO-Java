

import java.util.Scanner;

import Apps.Browser;
import Apps.MP3;
import Apps.Telefone;

public class Cellphone {

	public static Scanner input=new Scanner(System.in);
    static Browser browser=new Browser();
    static MP3 mp3=new MP3();
    static Telefone telefone=new Telefone();    

    public static void main(String[] args) {
        while(true){
            System.out.println("Which app would you like to use?\n1 - Browser\n2 - MP3\n3 - Calls\n4 - Exit");
            int appNumber=input.nextInt();

            switch(appNumber)
            {
                case (1):
                    Internet();
                    break;
                case (2):
                    SongPlayer();
                    break;
                case (3):
                    Calls();
                    break;
                case (4):
                    System.out.println("Goodbye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid App selected.");
                    System.exit(0);
            
            }
        }
    }

    static void Internet(){
        System.out.println("WHat do you wanna browse?\n1 - Show Pages\n2 - Add new page\n3 - Refresh browser");
        int netOperation=input.nextInt();

        if(netOperation==1){browser.showPage();}
        if(netOperation==2){
            System.out.println("What page do wanna add?");
            String newPageName=input.nextLine();
            browser.addNewPage(newPageName);
        }
        if(netOperation==3){browser.refreshPage();}

        if(netOperation<1 || netOperation>3){System.out.println("Invalid Operation"); return;}

    }

    static void SongPlayer(){
        String songName;
        boolean changeSong=true;

        if(mp3.isPlaying()){
            songName=mp3.getSongName();
            System.out.println("Music playing: "+songName+". \nWanna change (1) or pause (2) the song?");
            int choose=input.nextInt();
            if(choose==1){changeSong=true;} else if(choose==2){changeSong=false; mp3.pauseSong();}
            
        }else{System.out.println("No song playing now");}

        if(changeSong){
            mp3.selectSong();
        }
    }

    static void Calls(){
        System.out.println("Registering a new contact: ");
        System.out.println("Insert contact's name: ");
        String cName=input.nextLine();
        System.out.println("Insert contact's number: ");
        Long cNumb=input.nextLong();
        System.out.println("Adding "+cName+" with number "+cNumb);
        telefone.addContact(cName, cNumb);
        System.out.println("Insert contact's name to call: ");
        String callName=input.nextLine();
        telefone.callNumber(callName);

    }
    
}
