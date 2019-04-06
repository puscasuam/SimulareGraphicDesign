package UI;

import Domain.Invoice;
import Service.InvoiceService;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    public TableView tblInvoice;
    public TableColumn colIdInvoice;
    public TableColumn colValue;
    public TableColumn colDescription;
    public TableColumn colDate;
    public TextField txtId;
    public TextField txtValue;
    public TextField txtDescription;
    public TextField txtDate;
    public Button btnAddInvoice;


    private InvoiceService invoiceService;

    private ObservableList<Invoice> invoices = FXCollections.observableArrayList();

    public void setServices(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }


    @FXML
    private void initialize() {

        Platform.runLater(() -> {
            invoices.addAll(invoiceService.getAll());
            tblInvoice.setItems(invoices);
        });
    }


    public void btnAddInvoiceClick(ActionEvent actionEvent) {
        try {
            String id = txtId.getText();
            double value = Double.parseDouble(txtValue.getText());
            String description = txtDescription.getText();
            String date = txtDate.getText();

            invoiceService.insert(id, value, description, date);

            invoices.clear();
            invoices.addAll(invoiceService.getAll());
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }
}
