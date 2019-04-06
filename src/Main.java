import Domain.InvoiceValidator;
import Repository.InvoiceRepository;
import Service.InvoiceService;
import UI.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UI/mainWindow.fxml"));
        Parent root = fxmlLoader.load();

        InvoiceValidator invoiceValidator = new InvoiceValidator();

        InvoiceRepository invoiceRepository = new InvoiceRepository(invoiceValidator);

        InvoiceService invoiceService = new InvoiceService(invoiceRepository);
        //invoiceService.insert("1", 12.5, "description1",  10.10.2019);

        MainController mainController =  fxmlLoader.getController();
        mainController.setServices(invoiceService);

        primaryStage.setTitle("Invoice manager");
        primaryStage.setScene(new Scene(root, 600, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


