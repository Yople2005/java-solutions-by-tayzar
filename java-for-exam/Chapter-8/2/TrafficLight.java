public enum TrafficLight {
    RED(90),
    GREEN(70),
    YELLOW(60);

    // Instance field
    private final int duration;

    // Constructor
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Accessor for duration
    public int getDuration() {
        return this.duration;
    }
}
