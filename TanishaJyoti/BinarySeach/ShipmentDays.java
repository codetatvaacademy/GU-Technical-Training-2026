class ShipmentDays {  
    private boolean isPossible(int[] weights, int capacity, int days) {
        int currentWeight = 0;
        for (int weight : weights) {
            if (weight > capacity) return false;
            if (currentWeight + weight > capacity) {
                days--;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        return days > 0;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 1, right = 0;
        for (int weight : weights) {
            right += weight;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(weights, mid, days)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }

    public static void main(String[] args) {
        ShipmentDays shipmentDays = new ShipmentDays();
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int result = shipmentDays.shipWithinDays(weights, days);
        System.out.println("The minimum capacity needed is: " + result);
    }
}
