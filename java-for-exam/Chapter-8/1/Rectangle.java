public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle() {
        setLength(1.0f);
        setWidth(1.0f);
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // SETTERS
    public void setLength(double length) {
        if (length >= 0.0f && length <= 20.0f) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
    }

    public void setWidth(double width) {
        if (width >= 0.0f && width <= 20.0f) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
    }

    // GETTERS
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    // Calculate area
    public double getArea() {
        return length * width;
    }

    // Convert length, width, area and perimeter to string
    public String toString() {
        return String.format("Width: %.2f\nLength: %.2f\nArea: %.2f\nPerimeter: %.2f\n", 
                             getLength(), getWidth(), getArea(), getPerimeter());
    }
}
