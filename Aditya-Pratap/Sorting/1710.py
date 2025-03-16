class Solution:
  def maximumUnits(self, boxTypes: list[list[int]], truckSize: int) -> int:
    res=0
    for boxes, units in sorted(boxTypes, key=lambda x: -x[1]):
      if boxes>= truckSize:
        return res+ truckSize* units
      res+= boxes* units
      truckSize-= boxes
    return res