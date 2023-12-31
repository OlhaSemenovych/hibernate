package module10_11;

import org.flywaydb.core.Flyway;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FlywayMigration {

    public void migration() {
        try ( FileReader prop = new FileReader("db.properties")) {
        Properties properties = new Properties();
        properties.load(prop);
        Flyway flyway = Flyway
                .configure()
                .dataSource(properties.getProperty("url"),
                        properties.getProperty("login"),
                        properties.getProperty("password"))
                .load();
        flyway.migrate();
        } catch (IOException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

}
