package LegalDocumentApplication.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Data
@Entity
public class CandidateDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String candidateName;
    @Column(name = "fatherName")
    private String fatherName;
    @Column(name = "motherName")
    private String motherName;
    @Column(name = "dob")
    private String dob;
    @Column(name = "address")
    private String address;
    @Column(name = "aadharCardNumber", unique = true)
    private String aadharCardNumber;
    @Column(name = "panCardNumber", unique = true)
    private String panCardNumber;
    @Column(name = "createdBy")
    private Date createdBy;
    @Column(name = "updatedBy")
    private Date updatedBy;
    private String aadharCardFilePath;
    private String aadharCardFileName;

    @PrePersist
    protected void onCreate() {
        createdBy = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedBy = new Date();
    }

    @Override
    public String toString() {
        return "CandidateDetails{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", aadharCardNumber='" + aadharCardNumber + '\'' +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                ", aadharCardFilePath='" + aadharCardFilePath + '\'' +
                ", aadharCardFileName='" + aadharCardFileName + '\'' +
                '}';
    }

    public CandidateDetails(int id, String candidateName, String fatherName, String motherName, String dob, String address, String aadharCardNumber, String panCardNumber, Date createdBy, Date updatedBy, String aadharCardFilePath, String aadharCardFileName) {
        this.id = id;
        this.candidateName = candidateName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dob = dob;
        this.address = address;
        this.aadharCardNumber = aadharCardNumber;
        this.panCardNumber = panCardNumber;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.aadharCardFilePath = aadharCardFilePath;
        this.aadharCardFileName = aadharCardFileName;
    }

    public CandidateDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadharCardNumber() {
        return aadharCardNumber;
    }

    public void setAadharCardNumber(String aadharCardNumber) {
        this.aadharCardNumber = aadharCardNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Date updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getAadharCardFilePath() {
        return aadharCardFilePath;
    }

    public void setAadharCardFilePath(String aadharCardFilePath) {
        this.aadharCardFilePath = aadharCardFilePath;
    }

    public String getAadharCardFileName() {
        return aadharCardFileName;
    }

    public void setAadharCardFileName(String aadharCardFileName) {
        this.aadharCardFileName = aadharCardFileName;
    }
}
