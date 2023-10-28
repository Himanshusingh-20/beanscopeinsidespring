package bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vehicleService.vehicleserve;
@Component("vehiclebean")
public class vehicles {
    private String name="lambo";
 private final vehicleserve vehicleserves;
 @Autowired
    public vehicles(vehicleserve vehicleserves){
     this.vehicleserves= vehicleserves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public vehicleserve getvehicleserve(){
     return vehicleserves;
    }
    public void printhello(){
        System.out.println("Printimg hello for the component vehicle bean");
    }
    @Override
    public String toString(){

     return "vehicle name is "+name;
    }
}
