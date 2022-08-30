package Packet20;

import java.io.IOException;

public class Try {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
            System.out.println(1/0);
        } catch (Exception ignored) {
        }
    }
}
