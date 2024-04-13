import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger ab = A.add(B);
        String answer = ab.toString();
        return answer;
    }
}