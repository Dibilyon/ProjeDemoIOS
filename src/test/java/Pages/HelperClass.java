package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidElementStateException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static Utils.Driver.driver;


public class HelperClass {
    Random r = new Random();

    public static String generateString(int length) {
        String randomAlphabetic = RandomStringUtils.randomAlphabetic(length);
        return randomAlphabetic;
    }

    public static String getRandomNumber(int length) {
        String randomNumeric = RandomStringUtils.randomNumeric(length);
        return randomNumeric;
    }

    public static IOSElement verifyPage(IOSElement element,String pageName) {
        if (element.getSize().getWidth() > 0) {
            System.out.println(pageName +" "+ "is verified");
        } else {
            System.err.println(pageName +" " + "is not verified");
        }
        return element;
    }
    public void randomElementSelect (List<IOSElement> element)
    {

        int randomColor= r.nextInt(element.size());
        element.get(randomColor).click();
    }

    public static String scroll(IOSElement elementToscroll,String direction) {
        String elementId = elementToscroll.getId();
        Map<String, Object> args = new HashMap<>();
        args.put("toVisible", elementId);
        args.put("direction", direction);

        driver.executeScript("mobile: scroll",args);
       return null;

    }
    public boolean setPickerWheel(String text, Order order) {
        System.out.println("setPickerWheel(): text: '" + text
                + "',order: '" + order + "'"); // always log your actions

        // find pickerWheel
        IOSElement pickerWheel =
                (IOSElement) driver.findElement(MobileBy.className("XCUIElementTypePickerWheel"));

        // limit search time to avoid infinite loops
        String resultText;
        Long startTime = System.currentTimeMillis();
        do {
            resultText = pickerWheel.getText();
            System.out.println(resultText);
            if (resultText.equalsIgnoreCase(text))
                return true;
            if (!selectPickerWheelIOS(pickerWheel, order))
                return false;
        }



    while (System.currentTimeMillis() < startTime + 10 * 1000); // 60 sec MAX
        return false;
    }

    /**
     * Performs set next or previous value
     *
     * @param el    the pickerWheel element
     * @param order the order to select
     * @return result of select
     * @version java-client: 7.3.0
     **/
    public boolean selectPickerWheelIOS(IOSElement el, Order order) {
        System.out.println("selectPickerWheelIOS(): order: '" + order + "'"); // always log your actions

        HashMap<String, Object> params = new HashMap<>();
        params.put("order", order.name().toLowerCase());
        params.put("offset", "0.2"); // tap offset
        params.put("element", el.getId()); // pickerWheel element
        try {
            driver.executeScript("mobile: selectPickerWheelValue", params);
            return true;
        } catch (InvalidElementStateException e1) {
            System.out.println("selectPickerWheelIOS(): FAILED\n" + e1.getMessage());
        } catch (InvalidArgumentException e2) {
            System.out.println("selectPickerWheelIOS(): FAILED\n" + e2.getMessage());
        }
        return false;
    }

    public enum Order {
        NEXT,
        PREVIOUS;
    }

    }