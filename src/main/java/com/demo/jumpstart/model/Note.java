package com.demo.jumpstart.model;

public class Note {
    public Integer id;
    public String title;
    public String description;
    public String date_created;
    public String date_updated;

    public Note() {
    }

    public Note(String title, String description, String date_created, String date_updated) {
        this.title = title;
        this.description = description;
        this.date_created = date_created;
        this.date_updated = date_updated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date_created='" + date_created + '\'' +
                ", date_updated='" + date_updated + '\'' +
                '}';
    }
}
