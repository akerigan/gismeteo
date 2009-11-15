package akerigan.tool.weather.bean;

import akerigan.tool.weather.adapter.DayOfWeekAdapter;
import akerigan.tool.weather.adapter.DayPartAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:06:55
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherTownForecast {

    @XmlAttribute(name = "year")
    private int year;

    @XmlAttribute(name = "month")
    private int month;

    @XmlAttribute(name = "day")
    private int day;

    @XmlAttribute(name = "hour")
    private int hour;

    @XmlAttribute(name = "tod")
    @XmlJavaTypeAdapter(DayPartAdapter.class)
    private DayPart dayPart;

    @XmlAttribute(name = "weekday")
    @XmlJavaTypeAdapter(DayOfWeekAdapter.class)
    private DayOfWeek dayOfWeek;

    @XmlElement(name = "PHENOMENA")
    private WeatherTownForecastFenomena fenomena;

    @XmlElement(name = "PRESSURE")
    private ValueRange pressure;

    @XmlElement(name = "TEMPERATURE")
    private ValueRange temperature;

    @XmlElement(name = "WIND")
    private WindValueRange wind;

    @XmlElement(name = "RELWET")
    private ValueRange wetness;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public DayPart getDayPart() {
        return dayPart;
    }

    public void setDayPart(DayPart dayPart) {
        this.dayPart = dayPart;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public ValueRange getPressure() {
        return pressure;
    }

    public void setPressure(ValueRange pressure) {
        this.pressure = pressure;
    }

    public ValueRange getTemperature() {
        return temperature;
    }

    public void setTemperature(ValueRange temperature) {
        this.temperature = temperature;
    }

    public WindValueRange getWind() {
        return wind;
    }

    public void setWind(WindValueRange wind) {
        this.wind = wind;
    }

    public ValueRange getWetness() {
        return wetness;
    }

    public void setWetness(ValueRange wetness) {
        this.wetness = wetness;
    }

    public WeatherTownForecastFenomena getFenomena() {
        return fenomena;
    }

    public void setFenomena(WeatherTownForecastFenomena fenomena) {
        this.fenomena = fenomena;
    }
}
