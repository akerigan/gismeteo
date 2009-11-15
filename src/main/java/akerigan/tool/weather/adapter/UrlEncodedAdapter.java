package akerigan.tool.weather.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.net.URLEncoder;
import java.net.URLDecoder;

/**
 * User: Vlad Vinichenko (akerigan@gmail.com)
 * Date: 08.11.2009
 * Time: 15:00:50
 */
public class UrlEncodedAdapter extends XmlAdapter<String, String> {

    public String unmarshal(String v) throws Exception {
        return URLDecoder.decode(v, "WINDOWS-1251");
    }

    public String marshal(String v) throws Exception {
        return URLEncoder.encode(v, "WINDOWS-1251");
    }
}
