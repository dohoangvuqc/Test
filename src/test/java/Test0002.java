import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

public class Test0002 {
    String container = "phuc au vu thuan phuc thuan au vu au vu thuan phuc thuan vu au";
    @Test
    public  void test (){
        int count = container.length() - container.replaceAll("phuc", "   ").length();
        System.out.println(container.length());
        System.out.println(container.replaceAll("phuc", "   "));
        System.out.println(count);
    }

    @Test
    public void test2(){
        int count = StringUtils.countMatches(container,"phuc");
        System.out.println(count);
    }


}
