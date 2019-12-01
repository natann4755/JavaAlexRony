package sample;

import java.time.LocalDate;

public class task {
    private String shortTask;
    private String longTask;
    private LocalDate date;

    public task(String shortTask, String longTask, LocalDate date) {
        this.shortTask = shortTask;
        this.longTask = longTask;
        this.date = date;
    }

    public String getShortTask() {
        return shortTask;
    }

    public void setShortTask(String shortTask) {
        this.shortTask = shortTask;
    }

    public String getLongTask() {
        return longTask;
    }

    public void setLongTask(String longTask) {
        this.longTask = longTask;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return shortTask;
    }
}
