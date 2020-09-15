package pl.javastart.paintcalc;

class ConstructionElement {
    private int width;
    private int height;

    public ConstructionElement(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}
