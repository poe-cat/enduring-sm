package com.poecat.enduringsm.model;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "symptoms")
@Entity
public class Symptoms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "symptom_name")
    private String symptomName;

    @Column(name = "date")
    private Date date;

    @Column(name = "severity", columnDefinition = "integer default 0")
    private int severity;

    public Symptoms(String symptomName, Date date, int severity) {
        this.symptomName = symptomName;
        this.date = date;
        this.severity = severity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
