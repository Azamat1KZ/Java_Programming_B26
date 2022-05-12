package Quiz4;

public class Box {
    double width;
    double length;

    public void setInfo(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
