package src.design_patterns.behavioral_patterns;

import java.util.Random;

class Car {
    int chasisNo;
    String engineType;
    String frameColor;

    public int getChasisNo() {
        return chasisNo;
    }

    public void setChasisNo(int chasisNo) {
        this.chasisNo = chasisNo;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    @Override
    public String toString() {
        return "Car [chasisNo=" + chasisNo + ", engineType=" + engineType + ", frameColor=" + frameColor + "]";
    }
}

class Request {
    private Car car;

    Request(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}

abstract class Handler {
    protected Handler nextHandler;

    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

class FrameHandler extends Handler {
    FrameHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        request.getCar().setFrameColor("Blue");
        super.handle(request);
    }
}

class EngineHandler extends Handler {
    EngineHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        request.getCar().setEngineType("V6");
        super.handle(request);
    }
}

class ChasisHandler extends Handler {
    private Random rand = new Random();

    ChasisHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        request.getCar().setChasisNo(this.rand.nextInt());
        super.handle(request);
    }
}

class Chain {
    Handler firstHandler;

    Chain() {
        buildChain();
    }

    private void buildChain() {
        this.firstHandler = new ChasisHandler(new EngineHandler(new FrameHandler(null)));
    }

    public void initiateChain(Request request) {
        firstHandler.handle(request);
    }
}

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Request request = new Request(car);

        Chain carBuildingChain = new Chain();
        carBuildingChain.initiateChain(request);

        System.out.println(request.getCar());
    }
}
