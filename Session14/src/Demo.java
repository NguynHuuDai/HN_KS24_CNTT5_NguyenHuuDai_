import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Demo {
    public static void main(String[] args){
        Set<String> female = new HashSet<>();
        female.add("Hà Pick Ngọc");
        female.add("Hà Văn Hóa");
        female.add("Hồ Quý Phi");
        female.add("Hồ Quý Ly");
        female.add("Hồ Xuân Hương");
        female.add("Hồ Khánh Linh");
        for (String s : female){
            System.out.println(s);
        }
        System.out.println(female);

//        Iterator<String> iterator = female.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }

        
    }

}
