package cn.com.WebXml;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import cn.com.WebXml.WeatherWebService;
import cn.com.WebXml.WeatherWebServiceLocator;
import cn.com.WebXml.WeatherWebServiceSoap;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestWeathers {
@Test
public static void main(String[] args) {
WeatherWebService service1=new WeatherWebServiceLocator();
WeatherWebServiceSoap serviceSoap = null;
try {
serviceSoap = service1.getWeatherWebServiceSoap();
} catch (ServiceException e) {
e.printStackTrace();
}
String[] cityweather = null;
String[] city1={"北京","上海","深圳","广州"};
try {
cityweather = serviceSoap.getWeatherbyCityName("北京");//不输入默认为上海市
} catch (RemoteException e) {
e.printStackTrace();
}
for (String s : cityweather) {
System.out.println(s);
}
}
}