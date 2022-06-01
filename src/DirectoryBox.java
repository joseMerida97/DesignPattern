import java.util.*;

public class DirectoryBox implements IPrintProvider {
    private List<IPrintProvider> files = new ArrayList<>();
    private String directoryName;

    public DirectoryBox(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public String getPrint() {
        String print = this.directoryName;
        for (IPrintProvider file : files) {
            print = print + "\n" + "  " + file.getPrint();
        }
        return "└──" + print;
    }

    public void addFile(IPrintProvider file) {
        files.add(file);
    }

    public void removeFile(IPrintProvider file) {
        files.remove(file);
    }

}
