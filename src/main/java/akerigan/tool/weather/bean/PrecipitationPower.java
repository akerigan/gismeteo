package akerigan.tool.weather.bean;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 22:22:18
 */
public enum PrecipitationPower {

    weak(0, "Возм."),
    heavy(1, "");

    private int id;
    private String alias;

    PrecipitationPower(int id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public static PrecipitationPower getById(int id) {
        for (PrecipitationPower precipitationPower : values()) {
            if (precipitationPower.id == id) {
                return precipitationPower;
            }
        }
        return null;
    }
}
