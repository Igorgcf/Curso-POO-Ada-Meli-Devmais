package Class09;

import java.util.Scanner;

public class Car {

    Scanner scan = new Scanner(System.in);

    private Integer velocity;
    private Integer velocityMax;
    private String model;
    private Boolean connected;

    public void menu(){

        int option = 0;

        do {
            System.out.println("1. Start");
            System.out.println("2. Accelerate");
            System.out.println("3. Brake");
            System.out.println("4. Stop");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1:
                    start();
                    System.out.println("*****--------------------------------*****");
                    System.out.println("Car started. Is on: " + getConnected());
                    System.out.println("*****--------------------------------*****");
                    break;
                case 2:
                    accelerate();
                    System.out.println("*****--------------------------------*****");
                    System.out.println("Current velocity: " + getVelocity() + " km/h");
                    System.out.println("*****--------------------------------*****");
                    break;
                case 3:
                    brake();
                    System.out.println("*****--------------------------------*****");
                    System.out.println("Current velocity: " + getVelocity() + " km/h");
                    System.out.println("*****--------------------------------*****");
                    break;
                case 4:
                    stop();
                    System.out.println("*****--------------------------------*****");
                    System.out.println("Car stopped.");
                    System.out.println("*****--------------------------------*****");
                    break;
                case 5:
                    System.out.println("*****--------------------------------*****");
                    System.out.println("Exiting the program.");
                    System.out.println("*****--------------------------------*****");
                    break;
                default:
                    System.out.println("*****--------------------------------*****");
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("*****--------------------------------*****");
            }
        }while (option != 5);
    }


    public void start() {
            this.connected = true;
    }

    public void accelerate() {
        if (this.connected && this.velocity < this.velocityMax) {
            this.velocity += 10;
        }else{
            System.out.println("Cannot accelerate, car is off. Or maximum velocity reached.");
        }
    }

    public void brake() {
        if (this.connected && this.velocity > 0) {
            this.velocity -= 10;
        } else{
            System.out.println("Cannot brake, car is off or already at zero velocity.");
        }
    }


    public void stop() {
        if (this.connected) {
            this.connected = false;
            this.velocity = 0; // Reset velocity when stopping
        }else{
            System.out.println("Car is already off.");
        }
    }

    public Car(Integer velocityMax, String model) {
        this.velocityMax = velocityMax;
        this.velocity = 0; // Default starting velocity
        this.connected = false; // Car is off by default
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getVelocityMax() {
        return velocityMax;
    }

    public void setVelocityMax(Integer velocityMax) {
        this.velocityMax = velocityMax;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }
}
