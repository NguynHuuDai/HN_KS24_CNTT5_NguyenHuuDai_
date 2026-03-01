import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bt4 {

    public static void main(String[] args) {

        List<String> diseases = new ArrayList<>();
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");
        diseases.add("Cúm A");
        diseases.add("Covid-19");
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");

        Map<String, Integer> statistics = new TreeMap<>();

        for (String disease : diseases) {
            if (statistics.containsKey(disease)) {
                statistics.put(disease, statistics.get(disease) + 1);
            } else {
                statistics.put(disease, 1);
            }
        }

        System.out.println("BAO CAO SO CA BENH TRONG NGAY:");
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}