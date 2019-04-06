package Domain;

public class Invoice {
    private String Id;
    private double value;
    private String description;
    private String date;

    public Invoice(String id, double value, String description, String date) {
        Id = id;
        this.value = value;
        this.description = description;
        this.date = date;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
