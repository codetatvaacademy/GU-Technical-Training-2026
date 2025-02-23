class Solution:
    def checkcars(self,ranks:List[int],cars:int,mid:int)->bool:
        n=0
        for rank in ranks:
            n+=math.floor((mid/rank)**(0.5))
        return n>=cars
    def repairCars(self, ranks: List[int], cars: int) -> int:
        low = 1
        high=min(ranks)*cars*cars
        while low < high:
            mid=(low + high)//2
            if self.checkcars(ranks,cars,mid):
                high=mid
            else:
                low = mid+1
        return low