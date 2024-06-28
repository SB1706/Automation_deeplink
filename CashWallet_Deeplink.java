package Deeplinks;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CashWallet_Deeplink {
    static void print (String val)
    {
        System.out.println(val);
    }
    static void sleep (int val) throws InterruptedException
    {
        Thread.sleep(val);
    }
    @Test
    public void CashDeeplink() throws MalformedURLException, InterruptedException {
        URL url = new URL("http://localhost:4723/wd/hub");
        MobileCapability.App.get("https://otipy.app.link/uiLbOQieQCb");
        print("WalletScreen Deeplink Clicked" + " https://otipy.app.link/uiLbOQieQCb");
        sleep(2000);

    }
}
