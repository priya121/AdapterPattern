package main;

public class MallardDuck implements Duck {

    @Override
    public String quack() {
        return "Quack";
    }

    @Override
    public String fly() {
        return "I'm flying";
    }
}
