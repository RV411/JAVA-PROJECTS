
public static int simpleArraySum(List<Integer> ar) {
    int sum=0;
    for(Integer i : ar){
        sum+=i;
    }
    return sum;
}

public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(Integer::intValue).sum();
}