package akerigan.tool.weather.bean;

import akerigan.tool.weather.adapter.WindDirectionAdapter;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 22:44:49
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WindValueRange extends ValueRange{

    @XmlAttribute(name = "direction")
    @XmlJavaTypeAdapter(WindDirectionAdapter.class)
    private WindDirection direction;

    public WindDirection getDirection() {
        return direction;
    }

    public void setDirection(WindDirection direction) {
        this.direction = direction;
    }
}
