package Heaps;

public class Heap {

    static class Heap {
      ArrayList<Integer> arr = new ArrayList<>();

      //Insert
      public void add(int data){// O(log n)
          //add at last idx
          arr.add(data);

          int x = arr.size()-1;
          int par  = (x-1)/2;

          while(arr.get(x) < arr.get(par)){
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
          }
      }

      public static int peek(){
           return arr.get(0);
      }
        
    }
    public static void main(String[] args) {
        
    }
}
