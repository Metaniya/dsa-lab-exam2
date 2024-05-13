package package6;

public class method {public static int[] deleteElement(int[] array, int index) {
    if (index < 0 || index >= array.length) {
        System.out.println("Invalid index.");
        return array;
    }

    int[] modifiedArray = new int[array.length - 1];
    int modifiedIndex = 0;

    for (int i = 0; i < array.length; i++) {
        if (i != index) {
            modifiedArray[modifiedIndex] = array[i];
            modifiedIndex++;
        }
    }

    return modifiedArray;
}
}
}
