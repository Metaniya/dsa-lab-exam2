package package3;


public static void main(String[] args) {
 class Bubblesort {
    char A =1;
    char B=2;
    char C =3;
    char D=4;

        char[] arr = {A,B,C,D};
        int temp = 0;


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("after sorting:");
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
}
