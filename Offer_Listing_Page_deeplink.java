package Deeplinks;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Offer_Listing_Page_deeplink {
    static void print(String val) {
        System.out.println(val);
    }

    static void sleep(int val) throws InterruptedException {
        Thread.sleep(val);
    }
    @Test
    public void OLP_Deeplink() throws MalformedURLException, InterruptedException {
        URL url = new URL("http://localhost:4723/wd/hub");
        try{
            MobileCapability.App.get("https://otipy.app.link/g1f9N4LUkKb");
            print("Offer_Listing_screen_clicked" + "https://otipy.app.link/g1f9N4LUkKb");
            sleep(2000);
        }catch (Exception e){
            print("The OLP Deeplink doesn't work");
        }


    }
}
