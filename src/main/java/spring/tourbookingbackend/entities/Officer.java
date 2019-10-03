package spring.tourbookingbackend.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "officer")
public class Officer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idOfficer")
    private int idOfficer;
    @NotNull
    @Max(value = 10)
    @Min(value = 10)
    private String phone;
    @NotNull
    private String email;
    @NotNull
    private String name;
    private boolean gender;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
    @Column(name = "updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt = new Date();
    @Column(name = "codeRole")
    private String[] codeRole;

    public Officer() {

    }

    public Officer(@NotNull @Max(value = 10) @Min(value = 10) String phone, @NotNull String email, @NotNull String name, boolean gender,
                   Date birthday, Date createdAt, Date updatedAt, String[] codeRole) {
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.codeRole = codeRole;
    }

    public int getIdOfficer() {
        return idOfficer;
    }

    public void setIdOfficer(int idOfficer) {
        this.idOfficer = idOfficer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String[] getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(String[] codeRole) {
        this.codeRole = codeRole;
    }
}
