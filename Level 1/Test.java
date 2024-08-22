public class Test {
  public static void main(String[] args) {
      int[] arr = new int[] { 1, 5, 10, 15, 22, 33,33,33,40, 42, 55, 66 };
      int x = 33;
      int lo = 0;
      int hi = arr.length - 1;

      int floor = -1;
      int ceil = -1;

      while (lo <= hi) {
          int mid = lo + (hi - lo) / 2;
          if (x > arr[mid]) {
              lo = mid + 1;
              floor = arr[mid];

          } else if (x < arr[mid]) {
              hi = mid - 1;
              ceil = arr[mid];
          } else {
              floor = ceil = arr[mid];
              break;
          }

      }
   System.out.println("Floor value "+ floor + " | ceil value " + ceil);
  }
}