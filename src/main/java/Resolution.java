public class Resolution {

    private int height;

    private int width;

    public Resolution(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
