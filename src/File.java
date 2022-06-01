public class File implements IPrintProvider{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getPrint() {
        return this.name;
    }

}
