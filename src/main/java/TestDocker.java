import org.testcontainers.containers.PostgreSQLContainer;

public class TestDocker {
    public static void main(String[] args) {
        System.out.println();
        // It does not depend on which container you try to create. Tried with these also. Still the same Exception.
        //        MySQLContainer mysql = new MySQLContainer();
        //        GenericContainer redis = new GenericContainer("redis:3.0.2").withExposedPorts(6379);
        System.out.println("Printing out the class name: ");
        System.out.println(PostgreSQLContainer.class);

        // Exception will be thrown from this line:
        PostgreSQLContainer postgres = new PostgreSQLContainer().withDatabaseName("smurfs");

        postgres.start();
        System.out.println(postgres.getDriverClassName());
    }
}
