package mainwork;


import bean.person;
import bean.vehicles;
import config.projectconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class main {
    public static void main(String []args){
        var context= new AnnotationConfigApplicationContext(projectconfig.class);
       /* vehicleserve veh1=context.getBean(vehicleserve.class);
        vehicleserve veh2=context.getBean("vehicleserve",vehicleserve.class);
        System.out.println("hashcode of vehicle 1 is "+veh1.hashCode());
        System.out.println("heahcode of vehicle 2 is "+veh2.hashCode());
        if(veh1 == veh2){
            System.out.println("vehicle been is bean a single stone been");*/
        String[] persons = context.getBeanNamesForType(person.class);
        person per = context.getBean(person.class);
        String[] names = context.getBeanNamesForType(vehicles.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        per.getvehicles().getvehicleserve().playmusic();
        per.getvehicles().getvehicleserve().movevehicle();
        }

    }

