package akerigan.tool.weather.adapter;

import akerigan.tool.weather.bean.DayPart;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:19:31
 */
public class DayPartAdapter extends XmlAdapter<String, DayPart> {

    public DayPart unmarshal(String v) throws Exception {
        if (v != null) {
            try {
                return DayPart.getById(Integer.parseInt(v));
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    public String marshal(DayPart v) throws Exception {
        if (v != null) {
            return String.valueOf(v.getId());
        }
        return null;
    }

}
