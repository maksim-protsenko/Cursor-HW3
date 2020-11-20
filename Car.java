package com.company;

public class Car {
    private String manufacturerOfCar;
    private int currentSpeed;
    private int maxSpeed;
    private int quantityOfDoors;
    private boolean isEngineOn;

    public Car(String manufacturerOfCar, int maxSpeed, int quantityOfDoors) {
        this.manufacturerOfCar = manufacturerOfCar;
        this.currentSpeed = 0;
        this.quantityOfDoors = quantityOfDoors;
        this.maxSpeed = maxSpeed;
        this.isEngineOn = isEngineOn;
    }

    public void startEngine() {
        if (isEngineOn == false) {
            isEngineOn = true;
            System.out.println("Engine was started");
        } else {
            System.out.println("Engine was already started. Don`t you hear it?");
        }
    }

    public void stopEngine() {
        if (isEngineOn == true) {
            isEngineOn = false;
            System.out.println("Engine was stopped");
        } else {
            System.out.println("Engine was already stopped");
        }
    }

    public void increaseSpeed(int setSpeed) {
        if (isEngineOn == false) {
            System.out.println("You can`t increase your speed because of engine. Please, start your engine.");
        } else if ((setSpeed > 0) && ((currentSpeed + setSpeed) < maxSpeed)) {
            currentSpeed += setSpeed;
            System.out.println("Current speed was increased to: " + currentSpeed + " km/h");
        } else {
            System.out.println("You entered wrong speed");
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Your car: ");
        sb.append("manufacturer of car is ").append(manufacturerOfCar);
        sb.append(", currentSpeed = ").append(currentSpeed);
        sb.append(", maxSpeed = ").append(maxSpeed);
        sb.append(", quantity of doors = ").append(quantityOfDoors);
        sb.append(", is engine working? ").append(isEngineOn);
        return sb.toString();
    }
}

