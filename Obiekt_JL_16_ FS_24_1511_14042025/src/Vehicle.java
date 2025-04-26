public abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    abstract double getFuelNeeds();
    abstract double getDistance();
    double calculateFuelConsumption(){
        return getFuelNeeds()/getDistance();
    }

    void go(){
        System.out.printf("Starting engine of %s, of class %s \n",name,this.getClass().getSimpleName());
    }
    void stop(){
        System.out.printf("Stopping engine of %s, of class %s \n",name,this.getClass().getSimpleName());
    }
}
