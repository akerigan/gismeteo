package akerigan.tool.weather.bean;

import akerigan.tool.weather.adapter.CloudinessAdapter;
import akerigan.tool.weather.adapter.PrecipitationAdapter;
import akerigan.tool.weather.adapter.PrecipitationPowerAdapter;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:37:26
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherTownForecastFenomena {

    @XmlAttribute(name = "cloudiness")
    @XmlJavaTypeAdapter(CloudinessAdapter.class)
    private Cloudiness cloudiness;

    @XmlAttribute(name = "precipitation")
    @XmlJavaTypeAdapter(PrecipitationAdapter.class)
    private Precipitation precipitation;

    @XmlAttribute(name = "rpower")
    @XmlJavaTypeAdapter(PrecipitationPowerAdapter.class)
    private PrecipitationPower rainPower;
    
    @XmlAttribute(name = "spower")
    @XmlJavaTypeAdapter(PrecipitationPowerAdapter.class)
    private PrecipitationPower stormPower;

    public Cloudiness getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(Cloudiness cloudiness) {
        this.cloudiness = cloudiness;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public PrecipitationPower getRainPower() {
        return rainPower;
    }

    public void setRainPower(PrecipitationPower rainPower) {
        this.rainPower = rainPower;
    }

    public PrecipitationPower getStormPower() {
        return stormPower;
    }

    public void setStormPower(PrecipitationPower stormPower) {
        this.stormPower = stormPower;
    }
    
}
