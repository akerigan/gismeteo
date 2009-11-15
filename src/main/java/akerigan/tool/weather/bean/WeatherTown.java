package akerigan.tool.weather.bean;

import akerigan.tool.weather.adapter.UrlEncodedAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.LinkedList;
import java.util.List;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 14:55:59
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherTown {

    @XmlAttribute(name = "index")
    private int index;

    @XmlAttribute(name = "sname")
    @XmlJavaTypeAdapter(UrlEncodedAdapter.class)
    private String name;

    @XmlElement(name="FORECAST")
    private List<WeatherTownForecast> forecasts = new LinkedList<WeatherTownForecast>();

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherTownForecast> getForecasts() {
        return forecasts;
    }
}
