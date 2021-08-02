import entities.Calculation;
import entities.Client;
import entities.Contract;
import enums.TypeOfProperty;
import org.junit.Test;
import services.ClientService;
import services.ContractService;

import java.sql.Date;
import java.util.List;

public class ServiceTest {

    @Test
    public void testPostgres()
    {
        ClientService clientService = new ClientService();
        Client client = new Client();
        client.setName("Ilya");
        client.setSurname("Marushin");
        client.setFather("Alex");
        client.setDateBorn(Date.valueOf("2000-4-9" ));
        clientService.save(client);

    }
    @Test
    public void findByName()
    {
        ClientService clientService = new ClientService();
        List<Client> clients = clientService.findByFname("Marushin", "sergei", "Alex");
    }
    @Test
    public void getByIdClient()
    {
        ClientService clientService = new ClientService();
        Client client = clientService.find(2);
        clientService.delete(client);
    }
    @Test
    public void addContract()
    {
        Contract contract = new Contract(123456, Date.valueOf("2021-7-2"));
        Calculation calculation = new Calculation(123456,100000,Date.valueOf("2021-7-2"),Date.valueOf("2031-7-10"),60.0, 2001, TypeOfProperty.apartment);
        Double conclusion = calculation.getConclusion();
        ContractService contractService = new ContractService();
        ClientService clientService = new ClientService();
        Client client = clientService.find(3);
        contract.setClient(client);

        contractService.saveContract(contract);


    }

}
