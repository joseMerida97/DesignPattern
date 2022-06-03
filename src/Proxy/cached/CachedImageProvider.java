package Proxy.cached;

import java.util.HashMap;

import Proxy.Classes.Image;

public class CachedImageProvider implements IImageProvider {
    private ImageProvider imageProvider;
    private HashMap<String, Image> popularImageCached;
    private Image ImageCached;

    public CachedImageProvider(ImageProvider imageProvider) {
        this.imageProvider = imageProvider;
    }

    @Override
    public HashMap<String, Image> getPopularImages() {
        if (popularImageCached==null){
            popularImageCached=imageProvider.getPopularImages();
        }
       return popularImageCached;
    }

    @Override
    public Image getImage(String imageId) {
        if (ImageCached==null){
            ImageCached=imageProvider.getImage(imageId);
        }
        return ImageCached;
    }

}
