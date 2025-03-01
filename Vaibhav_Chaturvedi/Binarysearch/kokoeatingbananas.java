package Binarysearch;

import java.util.*;
class kokoeatingbananas {

    public boolean isvalid(int []pile,int val,int hours){
             int sum=0;
             for(int i=0;i<pile.length;i++){
             sum += (pile[i] + val - 1) / val;
              if (sum > hours) return false;
             }
             return sum <=hours;
          }
  
      public int minEatingSpeed(int[] piles, int h) {
          
          Arrays.sort(piles);
          int min=1;
          int max=piles[piles.length-1];
         
          while(min<=max){
              int mid=min+(max-min)/2;
              if(isvalid(piles,mid,h)){
                   
                  max=mid-1;
              }
              else{
                  min=mid+1;
              }
          }
      return min;
      }
  } 