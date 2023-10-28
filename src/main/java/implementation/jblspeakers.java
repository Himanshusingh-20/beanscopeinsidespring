package implementation;

import inteerface.speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class jblspeakers implements speakers {
    public String makesound(){
        return "jbl speaker is been played";
    }
}
