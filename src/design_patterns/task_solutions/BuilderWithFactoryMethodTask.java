package src.design_patterns.task_solutions;

interface HousePlan {
    void setBasement(String basement);

    void setStructure(String structure);

    void setRoof(String roof);

    void setInterior(String interior);
}

class House implements HousePlan {
    private String basement;
    private String structure;
    private String roof;
    private String interior;

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House [basement=" + basement + ", interior=" + interior + ", roof=" + roof + ", structure=" + structure
                + "]";
    }
}

interface HouseBuilder {
    void buildBasement();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House getHouse();
}

class IglooHouseBuilder implements HouseBuilder {
    private House house;

    IglooHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    public House getHouse() {
        return house;
    }
}

class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    WoodenHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    public void buildStructure() {
        house.setStructure("Wood");
    }

    public void buildRoof() {
        house.setRoof("Twigs and Straws");
    }

    public void buildInterior() {
        house.setInterior("Wood Carvings");
    }

    public House getHouse() {
        return house;
    }
}

// TODO:Incorporate factory method pattern to create house instances
class HouseBuilderFactory {

    public static HouseBuilder getHouseBuilder(String houseType) {
        if (houseType == null || houseType.isEmpty()) {
            return null;
        }
        switch (houseType) {
            case "IGLOO":
                return new IglooHouseBuilder();
            case "WOODEN":
                return new WoodenHouseBuilder();
            default:
                throw new IllegalArgumentException("Unknown house type " + houseType);
        }
    }

}

// Director
class CivilEngineer {
    private HouseBuilder houseBuilder;

    CivilEngineer(String houseType) {
        this.houseBuilder = HouseBuilderFactory.getHouseBuilder(houseType);
    }

    public void constructHouse() {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }

    public String getHouseType() {
        return houseBuilder.getClass().getSimpleName();
    }

}

public class BuilderWithFactoryMethodTask {
    public static void main(String[] args) {
        CivilEngineer engineer = new CivilEngineer("WOODEN");

        engineer.constructHouse();
        House house = engineer.getHouse();

        System.out.printf("Finished house:: %s%n%s",
                engineer.getHouseType().replace("HouseBuilder", " House"),
                house);
    }
}
