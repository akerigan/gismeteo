package akerigan.tool.weather.bean;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.LinkedList;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 14:55:51
 */
@XmlRootElement(name = "MMWEATHER")
@XmlAccessorType(XmlAccessType.FIELD)
public class Weather {

    @XmlElementWrapper(name = "REPORT")
    @XmlElement(name = "TOWN")
    List<WeatherTown> towns = new LinkedList<WeatherTown>();

    public List<WeatherTown> getTowns() {
        return towns;
    }
}
