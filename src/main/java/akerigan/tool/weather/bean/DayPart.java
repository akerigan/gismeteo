package akerigan.tool.weather.bean;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:13:44
 */
public enum DayPart {

    nigth(0,"Ночь"),
    morning(1,"Утро"),
    day(2,"День"),
    evening(3,"Вечер");

    private int id;
    private String alias;

    DayPart(int id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public static DayPart getById(int id) {
        for (DayPart dayPart : values()) {
            if (dayPart.id == id) {
                return dayPart;
            }
        }
        return null;
    }
}
