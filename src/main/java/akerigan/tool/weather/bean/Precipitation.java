package akerigan.tool.weather.bean;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 22:14:27
 */
public enum Precipitation {

    rain(4, "Дождь"),
    shower(5, "Ливень"),
    snow(6, "Снег"),
    snowstorm(7, "Пурга"),
    storm(8, "Гроза"),
    clear(10, "Ясно");

    private int id;
    private String alias;

    Precipitation(int id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public static Precipitation getById(int id) {
        for (Precipitation precipitation : values()) {
            if (precipitation.id == id) {
                return precipitation;
            }
        }
        return null;
    }
}
