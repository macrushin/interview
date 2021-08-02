package controllers;

import entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ClientService;

import java.util.List;

@RestController
@RequestMapping("clients/")
public class ClientController {
    private ClientService clientService = new ClientService();
    @GetMapping
    public ResponseEntity<List<Client>> getTodoList() {
        return ResponseEntity.ok(clientService.findAll());
    }
}
