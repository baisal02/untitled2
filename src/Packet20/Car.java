package Packet20;

public class Car implements AutoCloseable{
    public void close(){
        System.out.println("mashina jabylyp jatat");
    }
    public void drive(){
        System.out.println("mashina jurup jatat");
    }
}
