import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        Vehicle[] cos = {
                new Car("auto"),
                new Plane("samolot"),
                new Ship("lodka")
        };
        for(Vehicle elem : cos){
            elem.go();
            elem.calculateFuelConsumption();
            if(elem instanceof Flying){
                ((Flying) elem).callAirControl();
            }
            elem.stop();
        }
    }
}
