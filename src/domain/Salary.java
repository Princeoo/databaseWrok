package domain;

//员工工资表
public class Salary {
    private int id;
    private int year;
    private int month;
    private String depart_id;
    private Float base_pay=10000.00f;//基本工资
    private Float house_add=300.00f;//住房补贴
    private Float should_pay;//应发金额
    private Float deduct_pay;//应扣金额
    private Float actual_pay;//实发金额

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

    public Float getBase_pay() {
        return base_pay;
    }

    public void setBase_pay(Float base_pay) {
        this.base_pay = base_pay;
    }

    public Float getHouse_add() {
        return house_add;
    }

    public void setHouse_add(Float house_add) {
        this.house_add = house_add;
    }

    public Float getShould_pay() {
        return should_pay;
    }

    public void setShould_pay(Float should_pay) {
        this.should_pay = should_pay;
    }

    public Float getDeduct_pay() {
        return deduct_pay;
    }

    public void setDeduct_pay(Float deduct_pay) {
        this.deduct_pay = deduct_pay;
    }

    public Float getActual_pay() {
        return actual_pay;
    }

    public void setActual_pay(Float actual_pay) {
        this.actual_pay = actual_pay;
    }


    public Salary(int id, int year, int month, String depart_id, Float base_pay, Float house_add, Float should_pay, Float deduct_pay, Float actual_pay) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.depart_id = depart_id;
        this.base_pay = base_pay;
        this.house_add = house_add;
        this.should_pay = should_pay;
        this.deduct_pay = deduct_pay;
        this.actual_pay = actual_pay;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", depart_id='" + depart_id + '\'' +
                ", base_pay=" + base_pay +
                ", house_add=" + house_add +
                ", should_pay=" + should_pay +
                ", deduct_pay=" + deduct_pay +
                ", actual_pay=" + actual_pay +
                '}';
    }

    public Salary() {
        super();
    }
}
