package Apps;

public class Contacts {

    private String name;
    private Long number;

    public Contacts(String name, Long number){
        this.name=name;
        this.number=number;
    }

    public String getName()
    {
        return name;
    }

    public Long getNUmber(){
        return number;
    }
    
}
