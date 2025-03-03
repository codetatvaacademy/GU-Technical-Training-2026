public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int unsatisfied=0;

        for(int i=0;i<minutes;i++){
            unsatisfied += grumpy[i]*customers[i];
        }
        int maxUnsatisfied=unsatisfied;
        for(int i=minutes;i<customers.length;i++){
            unsatisfied += customers[i]*grumpy[i];
            unsatisfied -= grumpy[i-minutes] *customers[i-minutes];
            maxUnsatisfied = Math.max(maxUnsatisfied, unsatisfied);
        }
        int satisfied= maxUnsatisfied;

        for(int i=0;i<n;i++){
            satisfied += (1-grumpy[i]) * customers[i];
        }
        return satisfied;
    }
}
