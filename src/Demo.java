public class Demo {
    public static void main(String[] args) {
        // MediaFiles
        IPrintProvider img123 = new File("img123.jpg");
        IPrintProvider video = new File("video.mpg4");
        IPrintProvider music = new File("music.mp3");
        IPrintProvider audio = new File("audio.mp3");

        // Applications
        IPrintProvider apk = new File("apk.exe");

        DirectoryBox media = new DirectoryBox("Media Files");
        media.addFile(img123);
        media.addFile(video);
        media.addFile(music);

        DirectoryBox mediaUpdated = new DirectoryBox("Media Files 2022");
        mediaUpdated.addFile(media);
        mediaUpdated.addFile(audio);

        DirectoryBox apks = new DirectoryBox("Applications");
        apks.addFile(apk);

        DirectoryBox androidApk = new DirectoryBox("Android apks");
        androidApk.addFile(apks);

        DirectoryBox all = new DirectoryBox("All files");
        all.addFile(mediaUpdated);
        all.addFile(androidApk);

        System.out.println(all.getPrint());

    }
}
