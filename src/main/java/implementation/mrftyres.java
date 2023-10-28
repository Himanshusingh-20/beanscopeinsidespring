package implementation;
import  inteerface.tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mrftyres implements tyres {
    public String rotate(){
        return "mef tyre is been used";
    }
}
