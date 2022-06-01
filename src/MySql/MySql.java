
package MySql;

import Classes.UserInformation;

public class MySql implements IMySql {

    @Override
    public String save(UserInformation userInformation) {
        System.out.println("Saving to MySql. . .");
        return userInformation.getName() + " " + userInformation.getSurname();
    }

}
