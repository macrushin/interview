package controllers;

import entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ClientService;
import services.ContractService;

import java.util.List;

@RestController
@RequestMapping("contracts")
public class ContractController {
    private ContractService contractService = new ContractService();


}
