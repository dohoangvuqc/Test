import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
    @Test
    public void createDateTimeExtension(){
        String fileName = new SimpleDateFormat("ddMMyyHHmmss").format(new Date());
        System.out.println(fileName);
    }
}
