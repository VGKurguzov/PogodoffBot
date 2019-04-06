package Weather;

public class Location {

    public String country;
    public String name;

    @Override
    public String toString() {
        return this.country + " " + this.name;
    }
}
