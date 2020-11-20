package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1. Написать класс Circle (круг) и метод, который будет возвращать его площадь.");

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter radius of circle: ");
        double RadiusOfCircle = input.nextInt();
        Circle Circle = new Circle(RadiusOfCircle);
        Circle.setRadiusOfCircle(RadiusOfCircle);
        Circle firstCircle = new Circle(Circle.getRadiusOfCircleOfCircle());
        double squareOfCircle = firstCircle.SquareOfCircle();
        System.out.println("Square of your circle is: " + squareOfCircle + "\n");


        System.out.println("Task 2. Написать класс, который умеет считать количество созданных объектов этого класса.");

        Scanner input2 = new Scanner(System.in);
        System.out.print("How many objects do you want to create: ");
        int quantityOfObjects = input2.nextInt();
        CounterOfObjects[] arrayOfObjects = new CounterOfObjects[quantityOfObjects];
        for (int i = 0; i < arrayOfObjects.length; i++) {
            arrayOfObjects[i] = new CounterOfObjects();
        }
        System.out.println("You created " + CounterOfObjects.getQuantity() + " objects \n");


        System.out.println("Task 3. Написать класс «автомобиль», который должен уметь заводится, глушить мотор, ехать и держать необходимую скорость.");

        Car yourCar = new Car("BMW", 250, 3);
        String showYourCar = yourCar.toString();
        System.out.println(showYourCar);
        yourCar.startEngine();
        yourCar.increaseSpeed(-5);
        yourCar.increaseSpeed(251);
        yourCar.increaseSpeed(60);
        yourCar.stopEngine();
        yourCar.increaseSpeed(100);
        yourCar.startEngine();
        yourCar.increaseSpeed(100);
        String showYourCarInMove = yourCar.toString();
        System.out.println(showYourCarInMove);
        yourCar.stopEngine();
        System.out.println();
    }
}
