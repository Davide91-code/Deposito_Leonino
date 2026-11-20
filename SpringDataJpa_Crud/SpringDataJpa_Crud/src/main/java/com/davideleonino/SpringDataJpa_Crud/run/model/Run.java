package com.davideleonino.SpringDataJpa_Crud.run.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "runs")
public class Run {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    //specifichiamo da subito sia il nome che avrà nel DB (che potrebbe differire dal nome
    //in java, sia la sua nullabilità (anche questa variabile all esigenza.
    //definiamo la grandezza della cella nel DB.
    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "started_on", nullable = false)
    private LocalDateTime startedOn;

    @Column(name = "completed_on", nullable = false)
    private LocalDateTime completedOn;

    @Column(name = "miles", nullable = false)
    private double miles;

    @Enumerated(EnumType.STRING)
    @Column(name = "location", nullable = false)
    private Location location;


    // costruttore no-arg richiesto da jpa
    protected Run() {
    }

    public Run(String title, LocalDateTime startedOn,
               LocalDateTime completedOn, double miles,
               Location location) {

        if (miles < 0) {
            throw new IllegalArgumentException("Le miglia non possono essere negative");
        }

        if (completedOn.isBefore(startedOn)) {
            throw new IllegalArgumentException("La data di fine deve essere dopo quella di inizio");
        }

        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.miles = miles;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartedOn() {
        return startedOn;
    }

    public LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public double getMiles() {
        return miles;
    }

    public Location getLocation() {
        return location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Run{id=" + id + ", title='" + title
                + "', miles=" + miles + ", location=" + location + "}";
    }
}
