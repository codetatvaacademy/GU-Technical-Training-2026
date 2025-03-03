package sliding_window;

 
    class grumpybookstore {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int unsatisfiedCustomers = 0;
            for(int i = 0; i < minutes; i++){
                unsatisfiedCustomers += grumpy[i] * customers[i]; 
            }
            int maxUnsatisfiedCustomers = unsatisfiedCustomers;
    
            for(int i = minutes; i < customers.length; i++){
                unsatisfiedCustomers += grumpy[i] * customers[i];
                unsatisfiedCustomers -= grumpy[i - minutes] * customers[i - minutes];
                maxUnsatisfiedCustomers = Math.max(maxUnsatisfiedCustomers , unsatisfiedCustomers);
            }
    
            int maxSatisfiedCustomers = maxUnsatisfiedCustomers;
    
            for(int i = 0; i < customers.length; i++){
                maxSatisfiedCustomers += (1 - grumpy[i]) * customers[i];
            }
            return maxSatisfiedCustomers ;
        }
    }  