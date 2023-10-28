package implementation;

import inteerface.speakers;
import org.springframework.stereotype.Component;
@Component
public class bosespeakers implements speakers {
    public String makesound(){

        return "bose speaker is been played";
    }


}
