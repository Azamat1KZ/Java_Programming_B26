package day47_encapsulation;

public class TrafficLights {
    private String color;

    public TrafficLights(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color){
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }
    }
}
