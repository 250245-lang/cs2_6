import java.util.Objects;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Vehicle {
    private String manufacturer;
    private int cylinders;
    private Person owner;

    public Vehicle() {
        this.manufacturer = "Unknown";
        this.cylinders = 0;
        this.owner = null;
    }

    public Vehicle(String manufacturer, int cylinders, Person owner) {
        this.manufacturer = manufacturer;
        this.cylinders = cylinders;
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCylinders() {
        return cylinders;
    }

    public Person getOwner() {
        return owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return cylinders == vehicle.cylinders &&
               Objects.equals(manufacturer, vehicle.manufacturer) &&
               Objects.equals(owner, vehicle.owner);
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Cylinders: " + cylinders + ", Owner: " + owner;
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    public Truck() {
        super();
        this.loadCapacity = 0;
        this.towingCapacity = 0;
    }

    public Truck(String manufacturer, int cylinders, Person owner, double loadCapacity, double towingCapacity) {
        super(manufacturer, cylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
               Double.compare(truck.towingCapacity, towingCapacity) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + ", Towing Capacity: " + towingCapacity;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        Vehicle v1 = new Vehicle("Toyota", 4, p1);
        Vehicle v2 = new Vehicle("Toyota", 4, p1);
        
        Truck t1 = new Truck("Ford", 8, p2, 2.5, 5.0);
        Truck t2 = new Truck("Ford", 8, p2, 2.5, 5.0);
        Truck t3 = new Truck("Chevy", 6, p1, 1.5, 3.0);

        System.out.println("Vehicle 1: " + v1);
        System.out.println("Truck 1: " + t1);
        
        System.out.println("v1 equals v2: " + v1.equals(v2));
        System.out.println("t1 equals t2: " + t1.equals(t2));
        System.out.println("t1 equals t3: " + t1.equals(t3));

        t3.setLoadCapacity(10.5);
        System.out.println("Updated Truck 3 Load: " + t3.getLoadCapacity());
        
        t3.setOwner(p2);
        System.out.println("Updated Truck 3 Owner: " + t3.getOwner());
    }
}
