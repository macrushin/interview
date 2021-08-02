package services;

import dao.AddressDAO;
import dao.CalculationDAO;
import dao.ContractDAO;
import entities.Address;
import entities.Calculation;
import entities.Contract;

public class ContractService {
    private ContractDAO contractDAO = new ContractDAO();
    private CalculationDAO calculationDAO = new CalculationDAO();
    private AddressDAO addressDAO = new AddressDAO();
    public Contract getContract(Integer id)
    {
        return contractDAO.findById(id);
    }
    public Calculation getCalculation(Integer contractId)
    {
        return calculationDAO.findById(contractId);
    }
    public Address getAddress(Integer contractId)
    {
        return addressDAO.findById(contractId);
    }
    public void saveContract(Contract contract)
    {
        contractDAO.save(contract);
    }
    public void saveAddress(Address address)
    {
        addressDAO.save(address);
    }
    public void saveCalculation(Calculation calculation)
    {
        calculationDAO.save(calculation);
    }
    public void updateContract(Contract contract)
    {
        contractDAO.update(contract);
    }
    public void updateCalculation(Calculation calculation)
    {
        calculationDAO.update(calculation);
    }
    public void updateAddress(Address address)
    {
        addressDAO.update(address);
    }
    public void deleteContract(Contract contract)
    {
        contractDAO.delete(contract);
    }
    public void deleteCalculation(Contract contract)
    {
        contractDAO.delete(contract);
    }
    public void deleteAddress(Contract contract)
    {
        contractDAO.delete(contract);
    }




}
