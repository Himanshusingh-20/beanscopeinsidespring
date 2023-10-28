package bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personbean")
public class person {
    private String name="lucky";
    private final vehicles vehicles;
    @Autowired
    public  person(vehicles vehicles){
        System.out.println("person been created by spring");
        this.vehicles=vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public vehicles getvehicles(){
        return vehicles;
    }

}
