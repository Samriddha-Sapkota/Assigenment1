import Models.Students;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Samriddha Sapkota", 17, new float[]{80,90,100}, 12);
        Students s2 = new Students("Anuj Puri", 16, new float[]{50,30,100}, 12);
        Students s3 = new Students("Saksham Puri", 15, new float[]{40,30,60}, 12);

        s1.printfunc();
        s2.printfunc();
        s3.printfunc();
    }
}