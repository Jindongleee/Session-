public class Person {
    private float cm;
    private float kg;

    public float getBMI(float cm,float kg){
        float BMI = kg / (cm/100 * cm/100);
        return BMI;
    }


    public void say(){
        System.out.println("응애");
    }

    public float getCm() {
        return cm;
    }

    public void setCm(float cm) {
        this.cm = cm;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }
}
