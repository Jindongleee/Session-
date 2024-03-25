//add(요소) , get(인덱스), remove(인덱스)

/*import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();

        for(int i=1;i<101;i++){
            list.add(i);
        }

        for(int i=0;i<list.size();i++){  //인덱스가 삭제 될 시 앞으로 밀린다. 각 인덱스가 -1씩
            if(list.get(i)%2!=0){
                list.remove(i);
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}*/

/*public class Main{
    public static void main(String[] args){
        printNum(2);
    }
    static void printNum(int a){
        System.out.println(a);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        String str=greeting();
        System.out.println(str);
    }

    static String greeting(){
        return "Hello!";
    }
}*/


/*public class Main{
    public static void main(String[] args){
        greeting_2();
    }

    static void greeting_2(){
        System.out.println("Hello");
    }
}*/

public class Main{
    public static void main(String[] args){
        sum_1(1,2);
    }

    static void sum_1(int a,int b){
        System.out.println(a+b);
    }
}