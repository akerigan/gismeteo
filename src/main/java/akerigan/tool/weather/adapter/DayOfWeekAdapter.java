package akerigan.tool.weather.adapter;

import akerigan.tool.weather.bean.DayOfWeek;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:19:31
 */
public class DayOfWeekAdapter extends XmlAdapter<String, DayOfWeek> {

    public DayOfWeek unmarshal(String v) throws Exception {
        if (v != null) {
            try {
                return DayOfWeek.getById(Integer.parseInt(v));
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    public String marshal(DayOfWeek v) throws Exception {
        if (v != null) {
            return String.valueOf(v.getId());
        }
        return null;
    }

}