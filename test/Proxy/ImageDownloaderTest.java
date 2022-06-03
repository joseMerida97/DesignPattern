
package Proxy;

import Proxy.Classes.Image;
import Proxy.Classes.UserProfile;
import Proxy.cached.CachedImageProvider;
import Proxy.cached.ImageProvider;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImageDownloaderTest {
    
    public ImageDownloaderTest() {
    }

    @Test
    public void testGetPopularImageValidated() {
        System.out.println("getPopularImageValidated");
        HashMap<String, Image> images = new HashMap<>();
        images.put("drink", new Image("1", "drinkImg.jpg", "ATP"));
        UserProfile userProfile = new UserProfile("asd123", 15);
        ImageProvider imageProvider = new ImageProvider(images);
        CachedImageProvider proxy = new CachedImageProvider(imageProvider);
        ImageDownloader instance = new ImageDownloader(proxy);
        instance.getPopularImageValidated(userProfile);
        assertNotNull(instance);
    }
    
}
