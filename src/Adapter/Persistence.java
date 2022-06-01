
package Adapter;

import Classes.UserInformation;
import DynamoDb.IDynamoDb;
import MySql.IMySql;

public class Persistence implements IPersistence {

    private IDynamoDb dynamoDB;
    private IMySql mysql;

    public Persistence(IDynamoDb dynamoDB, IMySql mysql) {
        this.dynamoDB = dynamoDB;
        this.mysql = mysql;
    }

    @Override
    public void persistenceInformation(UserInformation userInformation) {
        System.out.println(mysql.save(userInformation));
        System.out.println(dynamoDB.save(userInformation.getHome()));
    }

}
