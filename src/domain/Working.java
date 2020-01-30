package domain;

//员工考勤表
public class Working {
    private int id;
    private int year;
    private int month;
    private String depart_id;
    private Float late_day;//迟到天数
    private Float early_day;//早退天数
    private Float leave_day;//请假天数
    private Float add_hour;//加班小时

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(String depart_id) {
        this.depart_id = depart_id;
    }

    public Float getLate_day() {
        return late_day;
    }

    public void setLate_day(Float late_day) {
        this.late_day = late_day;
    }

    public Float getEarly_day() {
        return early_day;
    }

    public void setEarly_day(Float early_day) {
        this.early_day = early_day;
    }

    public Float getLeave_day() {
        return leave_day;
    }

    public void setLeave_day(Float leave_day) {
        this.leave_day = leave_day;
    }

    public Float getAdd_hour() {
        return add_hour;
    }

    public void setAdd_hour(Float add_hour) {
        this.add_hour = add_hour;
    }

    public Working(int id, int year, int month, String depart_id, Float late_day, Float early_day, Float leave_day, Float add_hour) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.depart_id = depart_id;
        this.late_day = late_day;
        this.early_day = early_day;
        this.leave_day = leave_day;
        this.add_hour = add_hour;
    }

    @Override
    public String toString() {
        return "Wroking{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", depart_id='" + depart_id + '\'' +
                ", late_day=" + late_day +
                ", early_day=" + early_day +
                ", leave_day=" + leave_day +
                ", add_hour=" + add_hour +
                '}';
    }

    public Working() {
        super();
    }
}
