package cn.com.WebXml;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import cn.com.WebXml.WeatherWebService;
import cn.com.WebXml.WeatherWebServiceLocator;
import cn.com.WebXml.WeatherWebServiceSoap;
import org.junit.Test;
public class WeatherTest {
@Test
public void main() {
WeatherWebService service1=new WeatherWebServiceLocator();
WeatherWebServiceSoap serviceSoap = null;
try {
serviceSoap = service1.getWeatherWebServiceSoap();
} catch (ServiceException e) {
e.printStackTrace();
}
String[] cityweather = null;
try {
cityweather = serviceSoap.getWeatherbyCityName("南京");//不输入默认为上海市
} catch (RemoteException e) {
e.printStackTrace();
}
for (String s : cityweather) {
System.out.println(s);
}
}
}