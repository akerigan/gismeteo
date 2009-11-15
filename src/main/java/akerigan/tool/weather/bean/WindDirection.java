package akerigan.tool.weather.bean;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 22:27:30
 */
public enum WindDirection {

    nord(0, "С"),
    nordEast(1, "СВ"),
    east(2, "В"),
    southEast(3, "СВ"),
    south(4, "Ю"),
    southWest(5, "ЮЗ"),
    west(6, "З"),
    nordWest(7, "СЗ");

    private int id;
    private String alias;

    WindDirection(int id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public static WindDirection getById(int id) {
        for (WindDirection windDirection : values()) {
            if (windDirection.id == id) {
                return windDirection;
            }
        }
        return null;
    }
}
