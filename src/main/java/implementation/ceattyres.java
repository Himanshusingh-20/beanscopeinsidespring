package implementation;

import org.springframework.stereotype.Component;
import inteerface.tyres;
@Component
public class ceattyres implements tyres {
    public String rotate(){
        return "ceat tyre is been used";
    }
}
