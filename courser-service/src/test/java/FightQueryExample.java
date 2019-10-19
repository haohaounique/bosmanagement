import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author :haohaounique
 * @version :1.0.0
 * @Detaildescription :
 * @date : 2019/10/20
 */
public class FightQueryExample {
    private static List<String> fightCompany = Arrays.asList("CSA", "CEA", "BJ");

    public static void main(String[] args) {

        List<String> searchResults = search("SH", "BJ");
        System.out.printf("-----------------------result---------------------------------");
        searchResults.forEach(System.out::println);
    }

    private static List<String> search(String original, String dest) {
        final List<String> result = new ArrayList<>();
        List<FightQueryTask> tasks = fightCompany.stream().map(f -> createSearchTask(f, original, dest)).collect(Collectors.toList());
        tasks.forEach(Thread::start);
        tasks.forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        tasks.stream().map(FightQueryTask::get).forEach(result::addAll);
        return result;
    }

    private static FightQueryTask createSearchTask(String f, String original, String dest) {
        return new FightQueryTask(f, original, dest);
    }
}
