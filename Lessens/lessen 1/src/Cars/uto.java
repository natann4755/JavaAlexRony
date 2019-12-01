package Cars;

public abstract class uto {
    private int rods;
    private String model;
    private String color;

    public uto(int rods, String model, String color) {
        this.rods = rods;
        this.model = model;
        this.color = color;
    }

    public int getRods() {
        return rods;
    }

    public void setRods(int rods) {
        this.rods = rods;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
