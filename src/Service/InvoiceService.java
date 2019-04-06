package Service;

import Domain.Invoice;
import Repository.InvoiceRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceService {
    private InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public void insert(String Id, double value, String description, String date) {

        for (Invoice i : repository.getAll()) {

            if (i.getId().equals(Id)) {
                throw new RuntimeException("The Id is already used!");
            }
        }

        Invoice invoice = new Invoice(Id, value, description, date);
        repository.insert(invoice);
    }

    public List<Invoice> getAll() {
        return repository.getAll();
    }






}
