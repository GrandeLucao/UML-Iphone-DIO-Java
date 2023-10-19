package Apps;

import java.util.ArrayList;
import java.util.List;

public class Telefone {

    private String voiceMessage;
    private Long callerNUmber;
    private List<Contacts> contacts;

    public Telefone(){
        contacts = new ArrayList<>();
    }
    
    
    public void callNumber(String nome){

        for(Contacts c: contacts){
            if(c.getName().equalsIgnoreCase(nome)){
                System.out.println("Calling "+c.getName()+" : "+c.getNUmber());
            }
        }
        double chanceN=Math.random();
        if(chanceN<0.5){startVoiceMail();}
        else{
            System.out.println("Call acepted");
        }
    }

    public void startVoiceMail(){
        System.out.println("Call reject, leaving Voice Mail...");
    }

    public void addContact(String name, Long number){
        Contacts contact=new Contacts(name, number);
        contacts.add(contact);
    }

    public String getVoiceMessage() {
        return voiceMessage;
    }

    public void setVoiceMessage(String voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    public Long getCallerNUmber() {
        return callerNUmber;
    }

    public void setCallerNUmber(Long callerNUmber) {
        this.callerNUmber = callerNUmber;
    }


}
