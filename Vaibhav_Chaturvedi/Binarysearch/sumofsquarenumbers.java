package Binarysearch;


class sumofsquarenumbers {
    public boolean judgeSquareSum(int c) {
        
        for (long a = 0; a * a <= c; a++) {
            long bSquare = c - a * a;
            if (binarySearch(0, bSquare, bSquare)) {
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(long left, long right, long target) {
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long midSquare = mid * mid;
            if (midSquare == target) {
                return true;
            } else if (midSquare < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
} 