import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int check = grades.get(i); 
            for (int j = check; j >= 0; j++) {
                if (j % 5 == 0) {
                    if (check < 38) {
                        result.add(check);
                    } else if (j - check < 3) {
                        result.add(j);
                    } else {
                        result.add(check);
                    }
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(80,96,18,75,80,60,60,15,45,15,10,5,46,87,33,60,14,71,65,2,5,97,0);
        List<Integer> ans = gradingStudents(grades);
        for (Integer item : ans) {
            System.out.println(item);
        }
    }

}
