package Proxy.cached;

import java.util.HashMap;

import Proxy.Classes.Image;

public class ImageProvider implements IImageProvider {

    HashMap<String, Image> listOfImages;

    public ImageProvider(HashMap<String, Image> listOfImages) {
        this.listOfImages = listOfImages;
    }

    @Override
    public HashMap<String, Image> getPopularImages() {
        return listOfImages;
    }

    @Override
    public Image getImage(String imageId) {
        return listOfImages.get(imageId);
    }

}
