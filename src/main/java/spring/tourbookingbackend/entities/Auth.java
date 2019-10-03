package spring.tourbookingbackend.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "auth")
public class Auth implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAuth")
    private int idAuth;
    @NotNull
    @Max(value = 10)
    @Min(value = 10)
    private String phone;
    @NotNull
    @Max(value = 500)
    private String password;
    private String type;
    private int customer;//id của khách hàng
    private int officer;//id của nhân viên
    private int collaborators;//id của cộng tác viên
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
    @Column(name = "updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt = new Date();

    public Auth() {

    }

    public Auth(@NotNull @Max(value = 10) @Min(value = 10) String phone, @NotNull @Max(value = 500) String password, String type,
                int customer, int officer, int collaborators, Date createdAt, Date updatedAt) {
        this.phone = phone;
        this.password = password;
        this.type = type;
        this.customer = customer;
        this.officer = officer;
        this.collaborators = collaborators;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdAuth() {
        return idAuth;
    }

    public void setIdAuth(int idAuth) {
        this.idAuth = idAuth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getOfficer() {
        return officer;
    }

    public void setOfficer(int officer) {
        this.officer = officer;
    }

    public int getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
