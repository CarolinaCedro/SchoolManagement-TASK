package entities;

public class Teacher extends Course {

    private Integer id;
    private String nameTeacher;


    public Teacher(){}


    public Teacher(Integer id, String nameTeacher) {
        this.id = id;
        this.nameTeacher = nameTeacher;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }


}
