package github.lugom.Composition.entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract
{
    private Date date;
    private Double valuePerHour = 0D;
    private Integer hours = 0;

    public HourContract(){}

    public HourContract(Date date, Double valuePerHour, Integer hours)
    {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue()
    {
        return valuePerHour * hours;
    }
}
