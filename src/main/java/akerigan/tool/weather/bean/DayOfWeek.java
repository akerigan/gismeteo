package akerigan.tool.weather.bean;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:24:50
 */
public enum DayOfWeek {

    Sunday(1, "Вск"),
    Monday(2, "Пнд"),
    Tuesday(3, "Втр"),
    Wednesday(4, "Срд"),
    Thursday(5, "Чтв"),
    Friday(6, "Птн"),
    Saturday(7, "Сбт");

    private int id;
    private String alias;

    DayOfWeek(int id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public static DayOfWeek getById(int id) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.id == id) {
                return dayOfWeek;
            }
        }
        return null;
    }
}
