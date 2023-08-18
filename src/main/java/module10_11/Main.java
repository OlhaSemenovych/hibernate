package module10_11;

import module10_11.services.ClientCrudService;
import module10_11.services.PlanetCrudService;
import module10_11.services.TicketCrudService;

public class Main {

    public static void main(String[] args) {

        ClientCrudService clientCrudService = new ClientCrudService();
        /*
        clientCrudService.createClient(new Client("Client 12"));
        System.out.println(clientCrudService.getClientById(11));
        clientCrudService.updateClientById(15, "Test User 1");
        clientCrudService.deleteClientById(15);
        System.out.println(clientCrudService.getAll());
        */

        PlanetCrudService planetCrudService = new PlanetCrudService();
        /*
        planetCrudService.createPlanet(new Planet("Mars123", "Test Planet 123"));
        System.out.println(planetCrudService.getPlanetById("Mars123"));
        planetCrudService.updatePlanetById("Mars123", "5 Test Planet");
        planetCrudService.deletePlanetById("Mars123");
        System.out.println(planetCrudService.getAll());
        */

        TicketCrudService ticketCrudService = new TicketCrudService();
        ticketCrudService.createTicket(clientCrudService.getClientById(7),
                planetCrudService.getPlanetById("EARTH123"), planetCrudService.getPlanetById("YUP123"));
        ticketCrudService.updateTicketById(9, clientCrudService.getClientById(10),
                planetCrudService.getPlanetById("EARTH1"), planetCrudService.getPlanetById("MARS"));
        System.out.println(ticketCrudService.getTicketById(1));
        ticketCrudService.deleteTicketById(10);
        System.out.println(ticketCrudService.getAll());
    }

}