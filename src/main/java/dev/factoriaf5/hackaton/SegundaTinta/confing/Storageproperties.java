package dev.factoriaf5.hackaton.SegundaTinta.confing;


import org.springframework.stereotype.Component;

@Component
public class Storageproperties {
    
    String location = "src/main/resources/static/images";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}