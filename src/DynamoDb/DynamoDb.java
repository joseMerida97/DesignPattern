
package DynamoDb;

import Classes.Home;

public class DynamoDb implements IDynamoDb {

    @Override
    public String save(Home home) {
        System.out.println("Saving to DynamoDb. . . ");
        return home.getType() + " " + home.getAddress();
    }

}
