import java.util.*;

public class CF4 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i = 0; set.size() < 7; i++) {
            int num = (int)(Math.random() * 45 + 1);
            set.add(num);
        }

        System.out.println(set);

        HashMap client = new HashMap();
        client.put("지이츄","0724");
        client.put("미미유","1217");
        client.put("미미유","1997");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 비밀번호를 입력하세요");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.println("password : ");
            String password = s.nextLine().trim();

            if(!client.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }

            if(!(client.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다, 다시 입력해주세요");
            } else {
                System.out.println("id와 비밀번호가 일치합니다");
                break;
            }
        }

    }
}
