package spring.tourbookingbackend.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "seo")
public class Seo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSeo")
    private int idSeo;
    private String name;
    private int level;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @NotNull
    private int idCollaborators;

    public Seo() {
    }

    public int getIdSeo() {
        return idSeo;
    }

    public void setIdSeo(int idSeo) {
        this.idSeo = idSeo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getIdCollaborators() {
        return idCollaborators;
    }

    public void setIdCollaborators(int idCollaborators) {
        this.idCollaborators = idCollaborators;
    }

    public float config(int level, int idCollaborators) {
        float amount = 0;
        switch (level) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

        return amount;
    }

}
