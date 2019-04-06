package Domain;

        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;

public class InvoiceValidator {

    public void validate(Invoice invoice) throws DateFormatException {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            format.parse(invoice.getDate());
        } catch (ParseException pe) {
            throw new DateFormatException("The date is not in a correct format!");
        }

    }

}

