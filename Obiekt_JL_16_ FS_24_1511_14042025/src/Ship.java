public class Ship extends Vehicle implements Sailing{
    public Ship(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 0;
    }

    @Override
    double getDistance() {
        return 0;
    }

    @Override
    public void dock() {
        System.out.print("Docking commence 🐱‍👤");
    }
    @Override
    void stop(){
        dock();
    }
}
