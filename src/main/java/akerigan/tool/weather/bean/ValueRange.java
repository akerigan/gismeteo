package akerigan.tool.weather.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 22:43:09
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ValueRange {

    @XmlAttribute(name = "min")
    private int min;

    @XmlAttribute(name = "max")
    private int max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
}
