package main.java.com.tykhonchuk;

public class Coach {

    private String favouriteTopic;

    public Coach(){
        
    }

    public Coach(String favouriteTopic)
    {
        this.favouriteTopic = favouriteTopic;
    }

    public void speakAbout(String topic) {
        System.out.println("Hello everyone! I want to tell you about " + topic);
    }

    public String getFavouriteTopic()
    {
        return favouriteTopic;
    }
}
