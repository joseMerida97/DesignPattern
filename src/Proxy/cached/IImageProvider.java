package Proxy.cached;

import java.util.HashMap;

import Proxy.Classes.Image;

public interface IImageProvider {
    HashMap<String, Image> getPopularImages();
    Image getImage(String imageId);
}
