package Deeplinks;


import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Refer_Deeplink {

    static void print(String val) {
        System.out.println(val);
    }

    static void sleep(int val) throws InterruptedException {
        Thread.sleep(val);
    }
    @Test
    public void Refer_screen_deeplink() throws MalformedURLException, InterruptedException {
        URL url = new URL("http://localhost:4723/wd/hub");
        sleep(2000);
        MobileCapability.App.get("https://otipy.app.link/gqXIgFZaQCb");
        print("Refer_screen_clicked" + "https://otipy.app.link/gqXIgFZaQCb");
        sleep(2000);

    }
}

