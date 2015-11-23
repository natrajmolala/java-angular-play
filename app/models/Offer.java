package models;


import java.util.Date;
import java.util.UUID;

public class Offer {

    private UUID id;

    private String type;
    private String description;
    private Date validUntil;

    public Offer(String type, String description, Date validUntil) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.description = description;
        this.validUntil = validUntil;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }


}
