class Solution:
    def countSeniors(self, details: List[str]) -> int:
        countOfPassengers = 0
        for passenger in details:
            if int(passenger[-4:-2]) > 60:
                countOfPassengers += 1
        
        return countOfPassengers
        