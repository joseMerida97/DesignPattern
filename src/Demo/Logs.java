package Demo;

public class Logs {
    private static Logs logs;

    private Logs() {

    } 


  //error/info/debug

  public static Logs getInstance(){

    if(logs == null){
        logs= new Logs();
    }
    return logs;
}

public void getError() {
    System.out.println("Error found from. . . "+logs.hashCode());
}

public void getInfo() {
    System.out.println("Getting information from. . . "+logs.hashCode());
}

public void getDebug() {
    System.out.println("Debugging please wait. . ."+ +logs.hashCode());
}

}
