package Weather;

public class Weather {
    public Location location;
    public Current current;

    @Override
    public String toString() {
        return this.location.toString() + "\n" + this.current.toString() + "\n" + this.current.condition.toString();
    }
}
