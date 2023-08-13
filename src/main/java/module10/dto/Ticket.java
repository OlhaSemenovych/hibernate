package module10.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class Ticket {

    private int id;
    private ZonedDateTime createdAt;
    private int clientId;
    private int fromPlanetId;
    private int toPlanetId;

    public Ticket(int id, ZonedDateTime createdAt, int clientId, int fromPlanetId, int toPlanetId) {
        this.id = id;
        this.createdAt = createdAt;
        this.clientId = clientId;
        this.fromPlanetId = fromPlanetId;
        this.toPlanetId = toPlanetId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", clientId=" + clientId +
                ", fromPlanetId=" + fromPlanetId +
                ", toPlanetId=" + toPlanetId +
                '}';
    }

}
