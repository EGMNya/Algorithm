class Solution {
    public int[] solution(int l, int r) {
        StringBuilder sb = new StringBuilder();

        for(int i=l; i<=r; i++){
            boolean number = String.valueOf(i).matches("[50]+");
            if(number) sb.append(i+ " ");
        }

        
        if(sb.length()==0) {
            int[] a = {-1};
            return a;
        }

        
        String[] arr = sb.toString().split(" ");
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = Integer.parseInt(arr[i]);
        }
        return result;
    }
}