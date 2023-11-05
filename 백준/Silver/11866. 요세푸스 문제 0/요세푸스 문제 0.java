//K번 쨰 수가 되기 직전까지 맨 앞의 원소를 K-1 번 꺼내오고(poll)
// 꺼내온 원소들을 맨 뒤로 넣는다.(offer)
//그리고 K번째로 뽑힌(poll) 원소는 출력한다.


import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int k = scan.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++) {
            q.add(i+1);
        }
 // 마지막 원소만 남겨질 때까지만
//		  반복하고 마지막 원소는 그대로 출력한다.
        System.out.print("<");
        while (q.size()>0){
            //맨앞 poll 큐에 추가 큐의 시작을 변경
            for(int i=0;i<k-1;i++) {
                q.offer(q.poll());
            }
            System.out.print(q.poll());
            if (q.size()>0) {//마지막 원소
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

}