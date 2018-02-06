import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.PostgreSQLContainer;

public class TestDocker {
    public static void main(String[] args) {
        System.out.println();
//        MySQLContainer mysql = new MySQLContainer();
//        GenericContainer redis = new GenericContainer("redis:3.0.2").withExposedPorts(6379);
                PostgreSQLContainer postgres = new PostgreSQLContainer().withDatabaseName("smurfs");
                System.out.println(postgres.getDriverClassName());
    }
}
