package spring.tourbookingbackend.entities;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "tour")
public class Tour implements Serializable {

    @Id
    @Column(name = "idTour")
    @Max(value = 20)
    private int idTour;
    @NotNull
    @Max(value = 50)
    private String title;//tiêu đề tour
    @NotNull
    private String[] image;//hình ảnh liên quan tới tour
    @NotNull
    private float price;//giá tiền
    private String desc;//mô tả
    @NotNull
    private String location;//địa điểm đi
    @NotNull
    private String sevice;//dịch vụ đi kèm
    @NotNull
    private String duration;//thời gian tour
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startDay")
    @NotNull
    private Date startDay;//ngày khởi hành
    @NotNull
    private int idCategory;
    @NotNull
    private int idCollaborators;
    private int idSeo;
    private String status;
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    public Tour() {
    }

    public Tour(@Max(value = 20) int idTour, @NotNull @Max(value = 50) String title, @NotNull String[] image, @NotNull float price, String desc, @NotNull String location,
                @NotNull String sevice, @NotNull String duration, @NotNull Date startDay, @NotNull int idCategory, @NotNull int idCollaborators) {
        this.idTour = idTour;
        this.title = title;
        this.image = image;
        this.price = price;
        this.desc = desc;
        this.location = location;
        this.sevice = sevice;
        this.duration = duration;
        this.startDay = startDay;
        this.idCategory = idCategory;
        this.idCollaborators = idCollaborators;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getImage() {
        return image;
    }

    public void setImage(String[] image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSevice() {
        return sevice;
    }

    public void setSevice(String sevice) {
        this.sevice = sevice;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdCollaborators() {
        return idCollaborators;
    }

    public void setIdCollaborators(int idCollaborators) {
        this.idCollaborators = idCollaborators;
    }

    public int getIdSeo() {
        return idSeo;
    }

    public void setIdSeo(int idSeo) {
        this.idSeo = idSeo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    //    Sinh id tour theo thời gian
    public String generateIdTour() {
        Calendar cal = Calendar.getInstance();
        return "TO" + cal.get(Calendar.DAY_OF_MONTH) + (cal.get(Calendar.MONTH) + 1)
                + cal.get(Calendar.YEAR) + cal.get(Calendar.HOUR_OF_DAY) +
                cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND);
    }
}
