package akerigan.tool.weather.bean;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 22:07:43
 */
public enum Cloudiness {

    fine(0, "Ясно"),
    someCloud(1, "Малооблачно"),
    cloudy(2, "Облачно"),
    dull(3, "Пасмурно");

    private int id;
    private String alias;

    Cloudiness(int id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public static Cloudiness getById(int id) {
        for (Cloudiness cloudiness : values()) {
            if (cloudiness.id == id) {
                return cloudiness;
            }
        }
        return null;
    }

}
