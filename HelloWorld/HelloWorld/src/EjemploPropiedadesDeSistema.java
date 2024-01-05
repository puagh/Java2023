public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String pathHome = System.getProperty("user.home");
        System.out.println("pathHome = " + pathHome);
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String versionJava = System.getProperty("java.version");
        System.out.println("versionJava = " + versionJava);
    }
}
