import java.util.ArrayList;

public class Al {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println("At index 0 ->" + al.get(2));
        for(int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println(al.remove(al.size()-1));
        System.out.println(al.get(al.size()-1));
    }
}
