import java.util.ArrayList;

public class Student extends Person{
    private String name;
    private float height = getCm();
    private float weight = getKg();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Student(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    void printIntro(){
        System.out.println(name + "님의 키는" + height + "입니다. 몸무게는 "+weight+"이고, BMI는" + getBMI(height,weight));
    }

    public void say(){
        System.out.println("안녕");
    }

}
