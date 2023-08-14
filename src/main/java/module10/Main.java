package module10;

import module10.dto.Client;
import module10.dto.Planet;
import module10.services.ClientCrudService;
import module10.services.PlanetCrudService;

public class Main {

    public static void main(String[] args) {

        ClientCrudService clientCrudService = new ClientCrudService();
        clientCrudService.createClient(new Client("Client 12"));
        System.out.println(clientCrudService.getClientById(11));
        clientCrudService.updateClientById(15, "Test User 1");
        clientCrudService.deleteClientById(15);
        System.out.println(clientCrudService.getAll());

        PlanetCrudService planetCrudService = new PlanetCrudService();
        planetCrudService.createPlanet(new Planet("Mars123", "Test Planet 123"));
        System.out.println(planetCrudService.getPlanetById("Mars123"));
        planetCrudService.updatePlanetById("Mars123", "5 Test Planet");
        planetCrudService.deletePlanetById("Mars123");
        System.out.println(planetCrudService.getAll());
    }

}