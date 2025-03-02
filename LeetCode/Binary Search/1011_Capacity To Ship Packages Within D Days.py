class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        total_sum=0
        for weight in weights:
            total_sum+=weight
        minimum= max(weights)
        maximum=total_sum
        while minimum<=maximum:
            mid=(maximum+minimum)//2
            current_weight=0
            required_days=1
        
            for weight in weights:
                if current_weight+weight>mid:
                    required_days+=1
                    current_weight=weight
                else:
                    current_weight+=weight
            if required_days>days:
                minimum=mid+1
            else:
                maximum=mid-1
        return minimum

        