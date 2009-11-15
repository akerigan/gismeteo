package akerigan.tool.weather.adapter;

import akerigan.tool.weather.bean.Precipitation;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:19:31
 */
public class PrecipitationAdapter extends XmlAdapter<String, Precipitation> {

    public Precipitation unmarshal(String v) throws Exception {
        if (v != null) {
            try {
                return Precipitation.getById(Integer.parseInt(v));
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    public String marshal(Precipitation v) throws Exception {
        if (v != null) {
            return String.valueOf(v.getId());
        }
        return null;
    }

}