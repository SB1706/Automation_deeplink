package Deeplinks;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Subscription_Deeplink {
    static void print(String val) {
        System.out.println(val);
    }

    static void sleep(int val) throws InterruptedException {
        Thread.sleep(val);
    }
    @Test
    public void subscription_deeplink() throws MalformedURLException, InterruptedException {
        URL url = new URL("http://localhost:4723/wd/hub");
        MobileCapability.App.get("https://otipy.app.link/jx81n83dQCb ");
        print("Subscription_screen_clicked" + "https://otipy.app.link/jx81n83dQCb ");
        sleep(2000);

    }
}
