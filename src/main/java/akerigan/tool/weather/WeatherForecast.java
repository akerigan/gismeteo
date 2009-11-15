package akerigan.tool.weather;

import akerigan.tool.weather.bean.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * User: Vlad Vinichenko (ake rigan@gmail.com)
 * Date: 08.11.2009
 * Time: 14:43:10
 */
public class WeatherForecast {

    public static void main(String[] args) {
        try {
            URI uri = new URI("http://informer.gismeteo.ru/xml/27612_1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Weather weather = (Weather) unmarshaller.unmarshal(uri.toURL().openStream());
            List<WeatherTown> towns = weather.getTowns();
            if (towns.size() > 0) {
                WeatherTown town = towns.get(0);
                StringBuilder sb = new StringBuilder();
/*
                sb.append(town.getName());
                sb.append(":");
*/
                List<WeatherTownForecast> forecasts = town.getForecasts();
                if (forecasts.size() > 0) {
                    WeatherTownForecast forecast = forecasts.get(0);
/*
                    if (forecast.getDayOfWeek() != null) {
                        sb.append(" ");
                        sb.append(forecast.getDayOfWeek().getAlias());
                    }
                    if (forecast.getDayPart() != null) {
                        sb.append(",");
                        sb.append(forecast.getDayPart().getAlias());
                    }
*/
                    if (forecast.getTemperature() != null) {
/*
                        sb.append(",");
*/
                        sb.append(forecast.getTemperature().getMin());
                        sb.append("-");
                        sb.append(forecast.getTemperature().getMax());
                        sb.append("°C");
                    }
                    if (forecast.getWind() != null) {
                        if (forecast.getWind().getDirection() != null) {
                            sb.append(",");
                            sb.append(forecast.getWind().getDirection().getAlias());
                        }
                        sb.append(" ");
                        sb.append(forecast.getWind().getMin());
                        sb.append("-");
                        sb.append(forecast.getWind().getMax());
                        sb.append("м/с");
                    }
                    if (forecast.getFenomena() != null) {
                        WeatherTownForecastFenomena fenomena = forecast.getFenomena();
                        if (fenomena.getCloudiness() != null) {
                            sb.append(",");
                            sb.append(fenomena.getCloudiness().getAlias());
                        }
                        Precipitation precipitation = fenomena.getPrecipitation();
                        if (precipitation != null) {
                            sb.append(",");
                            if ((precipitation == Precipitation.snowstorm || precipitation == Precipitation.storm)
                                    && fenomena.getRainPower() != null) {
                                sb.append(fenomena.getRainPower().getAlias());
                            } else if (fenomena.getStormPower() != null) {
                                sb.append(fenomena.getStormPower().getAlias());
                            }
                            sb.append(fenomena.getPrecipitation().getAlias());
                        }
                    }
                }
                System.out.println(sb);
            } else {
                System.out.println("Пустой ответ от сервера");
            }
        } catch (URISyntaxException e) {
            System.out.println("Неправильный адрес: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Неправильный адрес: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка получения данных: " + e.getMessage());
        } catch (JAXBException e) {
            System.out.println("Ошибка разбора xml: " + e.getMessage());
        }
        System.exit(0);
    }

}
