package akerigan.tool.weather.adapter;

import akerigan.tool.weather.bean.Cloudiness;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:19:31
 */
public class CloudinessAdapter extends XmlAdapter<String, Cloudiness> {

    public Cloudiness unmarshal(String v) throws Exception {
        if (v != null) {
            try {
                return Cloudiness.getById(Integer.parseInt(v));
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    public String marshal(Cloudiness v) throws Exception {
        if (v != null) {
            return String.valueOf(v.getId());
        }
        return null;
    }

}