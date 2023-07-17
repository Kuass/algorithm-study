package programmers;

import java.util.Arrays;

public class unfinished_runner { // 완주하지 못한 선수
    public unfinished_runner() {
        String[] arr = new String[] {"leo", "kiki", "eden"};
        String[] arr2 = new String[] {"eden", "kiki"};
        String result = solution(arr, arr2);
        System.out.println("result : " + result);
    }

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }
}

