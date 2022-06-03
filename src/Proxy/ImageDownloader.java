package Proxy;

import java.util.HashMap;

import Proxy.Classes.Image;
import Proxy.Classes.UserProfile;
import Proxy.cached.IImageProvider;

public class ImageDownloader {
    private IImageProvider api;
    HashMap<String, Image> list;
    public ImageDownloader(IImageProvider imageProvider) {
        this.api = imageProvider;
    }


    public void getPopularImageValidated(UserProfile userProfile){
            list=api.getPopularImages();
        for (Image image:list.values()) {
            if (userProfile.getAge()<=18){
                if (image.classification=="ATP"){
                    System.out.println("Showing. . . Id: "+image.id + " Title : "+ image.title);
                }
            }else{
                System.out.println("Showing. . . Id: "+image.id + " Title : "+ image.title);
            }
        }
    }
}
