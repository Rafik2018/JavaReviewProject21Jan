package review_8;


import review_7.Car;

public class BMW extends Car {


    public BMW(String make, String model, int year, int horsePower) {
        super(make, model, year, horsePower);
    }

    BMW(String make, String model) {
        super(make, model);
    }
    public void start() {
        System.out.println(make + " starts with push start button");


    }
    public String drive(String typeOfDriving) {
        System.out.println(make + " drives " + typeOfDriving);
        return typeOfDriving;


    }

    void brake(){
        System.out.println(make+" brakes");
    }


}

