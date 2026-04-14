package tag01.sortierer;

public class MergeSort implements Sortieralgorithmus {

  // Beim MergeSort handelt es sich, wie beim Quicksort, um ein "Teile und Herrsche" (Divide and Conquer) Algorithmus.
// Es teilt die empfangene Liste in zwei Teillisten und ruft sich rekursiv auf beide Teillisten auf.
// Anschließend werden beide Listen wieder zu einer zusammengeführt.
  @Override
  public void sortiere(int[] zahlen) {
    sort(zahlen, 0, zahlen.length - 1);
  }

  void sort(int[] arr, int left, int right) {
    if (left < right) {
      // Mitte finden.
      int m = left + (right - left) / 2;

      // Beide Hälften sortieren.
      sort(arr, left, m);
      sort(arr, m + 1, right);

      // Beide Hälften wieder zusammenfügen.
      merge(arr, left, m, right);
    }
  }

  void merge(int[] arr, int left, int middle, int right) {

    int n1 = middle - left + 1;
    int n2 = right - middle;

    // Temporäre Arrays erstellen.
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // In temporäre Arrays kopieren.
      for (int i = 0; i < n1; ++i) {
          leftArray[i] = arr[left + i];
      }
      for (int j = 0; j < n2; ++j) {
          rightArray[j] = arr[middle + 1 + j];
      }

    // Zusammenfügen und dabei sortieren.
    int i = 0, j = 0;

    int k = left;
    while (i < n1 && j < n2) {
      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }
      k++;
    }

    // Verbliebene Elemente kopieren.
    while (i < n1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
