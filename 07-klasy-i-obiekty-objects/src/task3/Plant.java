package task3;

public class Plant {
    String name;
    String description;
    double water;

    public Plant(String name, String description, double water) {
        this.name = name;
        this.description = description;
        this.water = water;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }
}
