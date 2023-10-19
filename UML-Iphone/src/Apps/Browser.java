package Apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Browser {
    private List<Pages> pages;
	public static Scanner input=new Scanner(System.in);

    public Browser(){
        this.pages=new ArrayList<>();
    }
    

    public void showPage(){
        int id=0;
        System.out.println("Showing open pages");
        for(Pages p: pages){
            id++;
            System.out.println(id +" - "+ p.getName());
        }
    }

    public void addNewPage(String name){
        Pages page =new Pages(name);
        pages.add(page);
    }

    public void refreshPage(){
        System.out.println("Refreshing Browser...");
        this.pages.clear();
    }
}
