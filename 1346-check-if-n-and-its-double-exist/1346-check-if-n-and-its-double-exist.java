class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s = new HashSet<>();

        for(int n:arr){
            if((s.contains(n*2)) || (s.contains(n/2) && n%2==0)){
                return true;
            }
            s.add(n);
        }
        return false;
    }
}