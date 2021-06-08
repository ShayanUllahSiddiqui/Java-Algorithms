public class Car {

    private int year;
    private String model;
    private float price;
    private String color;
    private Engine engine;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
            return price;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        System.out.println("\nCar Name is: Toyota Supra MK4");
    }

    public Car(int year, String model, float price, String color) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayInfo() {  
        System.out.println("\nDiplay info of car method\n");
    }

    public void start() {
        System.out.println("\nThe Car Method Start\n");
    }

    public void stop() {
        System.out.println("\nThe Car Method Stop\n");
    }
}

class Engine {

    private String modelNumber;

    public String getmodelNumber() {
        return modelNumber;
    }

    public void setmodelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Engine() {
        System.out.println("Engine Name Is: 2JZ GT-e Twin Turbo DOHC");
    }

    Engine(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void start() {
        System.out.println("\nEngine Method Start\n");
    }

    public void stop() {
        System.out.println("\nEngine Method Stop\n");
    }
}

class Main {

    public static void main(String[] args) {
        Car newObj = new Car();
        
        newObj.setYear(2019);
        newObj.setColor("Black\n");
        newObj.setModel("2019\n");
        newObj.setPrice(250000);
        newObj.displayInfo();

        newObj.start();
        System.out.println("\nCar Details: \n");
        System.out.println("Color: " + newObj.getColor());
        System.out.println("Model: " + newObj.getModel());
        System.out.println("Launch year: " + newObj.getYear());
        System.out.println("\nCost: " + newObj.getPrice());
        newObj.stop();

        Engine engine_obj = new Engine();
        engine_obj.start();
        engine_obj.setmodelNumber("HHH");
        System.out.println("\nEngine Details: \n");
        System.out.println("Engine Model: " + engine_obj.getmodelNumber());
        engine_obj.stop();

    }
}