package org.example.task2;

public class Box {

    private int width;
    private int height;
    private int length;

    public Box(int width, int height, int length) {
        if (width <= 0 || height <= 0 || length <= 0) {
            return;
        }
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public int getSurfaceArea() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }
}
