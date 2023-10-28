package vehicleService;

import inteerface.speakers;
import inteerface.tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicleserve")

public class vehicleserve {
    @Autowired
    private speakers speakers;
    private tyres tyre;
    public  void playmusic(){
        String music= speakers.makesound();
        System.out.println(music);
    }
    public  void movevehicle(){
        String status= tyre.rotate();
        System.out.println(status);
    }

    public speakers getSpeaker() {
        return speakers;
    }

    public tyres getTyre() {
        return tyre;
    }


    public void setSpeaker(speakers speaker) {
        this.speakers = speaker;
    }
    @Autowired
    public void setTyre(tyres tyre) {
        this.tyre = tyre;
    }

}

