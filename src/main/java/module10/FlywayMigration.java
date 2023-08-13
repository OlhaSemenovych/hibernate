package module10;

import org.flywaydb.core.Flyway;

public class FlywayMigration {

    public static void main(String[] args) {
        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:mariadb://localhost:3306/database_for_learning",
                        "",
                        "")
                .load();
        flyway.migrate();
    }

}
