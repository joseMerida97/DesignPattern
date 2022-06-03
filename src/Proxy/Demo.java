package Proxy;

import java.util.HashMap;

import Proxy.Classes.Image;
import Proxy.Classes.UserProfile;
import Proxy.cached.CachedImageProvider;
import Proxy.cached.ImageProvider;

public class Demo {
    public static void main(String[] args) {

        HashMap<String, Image> images = new HashMap<>();

        images.put("drink", new Image("1", "drinkImg.jpg", "ATP"));
        images.put("food", new Image("2", "foodImg.jpg", "ATP"));
        images.put("indoor", new Image("3", "indoorImg.jpg", "ATP"));
        images.put("object", new Image("4", "objectImg.jpg", "ATP"));
        images.put("people", new Image("5", "peopleImg.jpg", "ATP"));
        images.put("plant", new Image("6", "plantImg.jpg", "ATP"));
        images.put("sky", new Image("7", "skyImg.jpg", "ATP"));
        images.put("adult", new Image("8", "adultImg.jpg", "+18"));
        images.put("racy", new Image("9", "racyImg.jpg", "+18"));
        images.put("gory", new Image("10", "goryImg.jpg", "+18"));

        UserProfile userProfile = new UserProfile("lkj123", 15);
        ImageProvider imageProvider = new ImageProvider(images);
        CachedImageProvider proxy = new CachedImageProvider(imageProvider);
        ImageDownloader imageDownloader = new ImageDownloader(proxy);
        imageDownloader.getPopularImageValidated(userProfile);
    }
}
