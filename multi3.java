import java.util.ArrayList;

public class multi3{
    
    public static void main(String[] args){
    
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            if(i % 3 == 0){
                num.add(i);
            }
        }
        for(int i = 0; i < num.size() - 1; i++){
            if(num.get(i) % 2 == 0){
                num.remove(i);
            }
        }
        System.out.println(num);
    }
}