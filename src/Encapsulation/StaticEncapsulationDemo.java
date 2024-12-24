package Encapsulation;


//Using static fields with encapsulation principles.
class Configuration {
    private static String appName;
    private static String version;

    // Static getters and setters
    public static String getAppName() {
        return appName;
    }

    public static void setAppName(String appName) {
        Configuration.appName = appName;
    }

    public static String getVersion() {
        return version;
    }

    public static void setVersion(String version) {
        Configuration.version = version;
    }
}

public class StaticEncapsulationDemo {
    public static void main(String[] args) {
        Configuration.setAppName("MyApp");
        Configuration.setVersion("1.0.0");

        System.out.println("Application Name: " + Configuration.getAppName());
        System.out.println("Version: " + Configuration.getVersion());
    }
}
