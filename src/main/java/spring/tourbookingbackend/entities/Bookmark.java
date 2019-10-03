package spring.tourbookingbackend.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

@Entity
@Table(name = "bookmark")
public class Bookmark implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBookmark;
    @NotNull
    private int idCustomer;
    @NotNull
    private String idTour;

    public Bookmark() {
    }

    public int getIdBookmark() {
        return idBookmark;
    }

    public void setIdBookmark(int idBookmark) {
        this.idBookmark = idBookmark;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdTour() {
        return idTour;
    }

    public void setIdTour(String idTour) {
        this.idTour = idTour;
    }
}
