package Factory;

import Driver.IFilesDriver;

public interface IFactory {
    IFilesDriver createFilesDrive();
}
