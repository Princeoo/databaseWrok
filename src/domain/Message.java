package domain;

//员工基本信息表
public class Message {
    private int id;
    private String name;
    private int age;
    private String sex;//性别
    private String phone_num;//电话好嘛
    private String identity;//身份证
    private String depart_id;//部门id


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(String depart_id) {
        this.depart_id = depart_id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", identity='" + identity + '\'' +
                ", depart_id='" + depart_id + '\'' +
                '}';
    }

    public Message() {
        super();
    }

    public Message(int id, String name, int age, String sex, String phone_num, String identity, String depart_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone_num = phone_num;
        this.identity = identity;
        this.depart_id = depart_id;
    }
}
