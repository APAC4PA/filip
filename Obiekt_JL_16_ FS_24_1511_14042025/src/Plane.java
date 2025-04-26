public class Plane extends Vehicle implements Flying{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void callAirControl() {

    }

    @Override
    double getFuelNeeds() {
        return 0;
    }

    @Override
    double getDistance() {
        return 0;
    }
    void go(){
        super.go();
        takeOff();
    }
    void stop(){
        super.go();
        land();
    }
}
