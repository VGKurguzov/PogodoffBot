package Weather;

import com.google.gson.annotations.SerializedName;

public class Current {
    @SerializedName("temp_c")
    public String temperature;
    public Condition condition;

    @Override
    public String toString() {
        return String.valueOf(this.temperature);
    }
}
