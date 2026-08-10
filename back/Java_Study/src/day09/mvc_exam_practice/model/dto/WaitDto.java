package day09.mvc_exam_practice.model.dto;

public class WaitDto {
    String telNum;
    int people;

    public WaitDto() {
    }

    public WaitDto(String telNum, int people) {
        this.telNum = telNum;
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return "WaitDto{" +
                "telNum='" + telNum + '\'' +
                ", people=" + people +
                '}';
    }
}
