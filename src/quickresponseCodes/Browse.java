package quickresponseCodes;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

@Author(name="kamesh kushwaha ",date="5 Jan 2020")
public class Browse {
    public static boolean isValidURL(String urlString) {
        try {
            URL url = new URL(urlString);
            url.toURI();
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
    public static void surf(String URL) {
        Desktop d = Desktop.getDesktop();
        try {
            if(isValidURL(URL)) {
                d.browse(new URI(URL));
            }
        }
        catch (Exception e){e.printStackTrace();}
    }
}