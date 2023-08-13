package module10.services;

import lombok.extern.slf4j.Slf4j;
import module10.dto.Client;
import org.hibernate.Session;
import module10.HibernateUtil;
import org.hibernate.Transaction;

import java.util.*;

@Slf4j
public class ClientCrudService {

    public void createClient(Client client) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(client);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException("User creation failed");
        }
    }

    public String getClientById(long id) {
        Client client;
        try (Session session = getSession()
        ) {
            client = session.get(Client.class, id);
        }
        return Optional.ofNullable(client).map(l -> client.getName())
                .orElse("Client with such ID doesn't exist");
    }

    public void updateClientById(long id, String name) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            Client client = session.get(Client.class, id);
            if (client != null) {
                client.setName(name);
                session.persist(client);
                transaction.commit();
            } else {
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Client with such ID doesn't exist");
        }
    }

    public void deleteClientById(long id) {
        Client client;
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            client = session.get(Client.class, id);
            if (client != null) {
                session.remove(client);
                transaction.commit();
            } else {
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Client with such ID doesn't exist");
        }
    }

    private static Session getSession() {
        return HibernateUtil.getInstance()
                .getSessionFactory()
                .openSession();
    }

}