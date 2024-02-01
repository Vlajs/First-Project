import java.util.ArrayList;
public class Vezbanje {
    public static ArrayList<String> niz(String[] podaci, String text, String startOrEnd){
        if (startOrEnd.equalsIgnoreCase("starts")){
            ArrayList<String> arrayStarts = new ArrayList<>();
            for (String s : podaci) {
                if (s.startsWith(text)) {
                    arrayStarts.add(s);
                }
            }
            if (arrayStarts.isEmpty()) {
                System.out.println("Nista ne pocinje sa " + text);
            }
            return arrayStarts;
        } else if (startOrEnd.equalsIgnoreCase("ends")) {
            ArrayList<String> arrayEnds = new ArrayList<>();
            for (String s : podaci) {
                if (s.endsWith(text)) {
                    arrayEnds.add(s);
                }
            }
            if (arrayEnds.isEmpty()) {
                System.out.println("Nista ne pocinje sa " + text);
            }
            return arrayEnds;
        } else {
            System.out.println("Pogresni podaci!");
            return null;
        }
    }
    public static void main(String[] args) {
        String[] s1 = {
                "Vladimir Spasic",
                "Milena Spasic",
                "Nena Spasic",
                "Nikola Spasic",
                "Grlica Spasic",
                "Ivan Novkovic",
                "Natalija Novkovic",
                "Novak Novkovic"
        };
        ArrayList<String> arr = niz(s1, "Vladimir", "starts");
        for (String a : arr) {
            System.out.println(a);
        }
    }

}
