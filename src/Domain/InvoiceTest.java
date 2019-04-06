package Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    private Invoice InvoiceTest = new Invoice ("1", 12.4, "description",  "12.12.2018" );

    @Test
    void getIDShouldReturnCorrectID(){
        assertEquals("1", InvoiceTest.getId());
    }

    @Test
    void setIDShouldSetCorrectly(){
        InvoiceTest.setId("2");
        assertEquals("2", InvoiceTest.getId());
    }

    @Test
    void getValueShouldReturnCorrectValue(){
        assertEquals(12.4, InvoiceTest.getValue());
    }

    @Test
    void setValueShouldSetCorrectly(){
        InvoiceTest.setValue(15.0);
        assertEquals(15.0, InvoiceTest.getValue());
    }



    @Test
    void getDateReturnCorrectDate() {
        assertEquals("12.12.2018", InvoiceTest.getDate());
    }

    @Test
    void setDateShouldSetCorrectly() {
        InvoiceTest.setDate("05.12.2019");
        assertEquals("05.12.2019", InvoiceTest.getDate());
    }


}