
import org.junit.Test;
import static org.junit.Assert.*;

public class DirectoryBoxTest {

    public DirectoryBoxTest() {
    }

    @Test
    public void testGetPrintNotEmpty() {
        System.out.println("getPrint");
        DirectoryBox instance = new DirectoryBox("Test");
        String result = instance.getPrint();
        assertNotEquals("", result);
    }

    @Test
    public void testAddFileNotNull() {
        System.out.println("addFile");
        IPrintProvider file = new File("Medias");
        assertNotNull(file);
        DirectoryBox instance = new DirectoryBox("Media Files");
        instance.addFile(file);
    }

    @Test
    public void testRemoveFileNotNull() {
        System.out.println("removeFile");
        IPrintProvider file = new File("Medias");
        assertNotNull(file);
        DirectoryBox instance = new DirectoryBox("Media Files");
        instance.removeFile(file);
    }

}
