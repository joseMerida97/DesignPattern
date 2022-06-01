import Adapter.IPersistence;
import Adapter.Persistence;
import Classes.Home;
import Classes.UserInformation;
import DynamoDb.DynamoDb;
import DynamoDb.IDynamoDb;
import MySql.IMySql;
import MySql.MySql;

public class Demo {
    
    public static void main(String[] args) {
        System.out.println("Starting of adapter example");
        Home userHome= new Home("Apartment", "Zona equipetrol");
        UserInformation userInformation = new UserInformation("Jose","Merida",userHome);

        IDynamoDb dynamoDB = new DynamoDb();
        IMySql mysql = new MySql();

        IPersistence persistence = new Persistence(dynamoDB,mysql);
        persistence.persistenceInformation(userInformation);
        
    }
}
