package com.yasar.entity;

public class Cashier extends BaseEntity {
    private String lastName;
    private String gender;
    private final double salary = 17_002D;

    public Cashier(Long id, String name, String lastName, String gender) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cashier{");
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

}
