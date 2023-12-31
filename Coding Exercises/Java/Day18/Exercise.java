public class Exercise {
  public static int[] reverseArray(int[] arr) {
      int left = 0;
      int right = arr.length - 1;

      while (left < right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          left += 1;
          right -=1;
      }

      return arr;
  }
}
