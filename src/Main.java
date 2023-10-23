
public class Main {
    public static void main(String[] args) {
       String line="----------------------";
       /*Задача 1
Объявите три массива:
Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
new
Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
 с помощью ключевого слова или сразу заполненный элементами.
.*/
        int [] array1=new int[3];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;

        int index1=array1[0];
        int index2=array1[1];
        int index3=array1[2];


        double [] array2={1.57, 7.654, 9.986};

        int [] array3={2,2,3,4,7};

        System.out.println(line);
/*Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
В конце строки запятую ставить не надо.*/


        for (int i=0;i<array1.length;i++) {
            System.out.print(array1[i]);
            if(i<array1.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();

        for (int i=0;i<array2.length;i++) {
            System.out.print(array2[i]);
            if(i<array1.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();
        int i=0;
        while (i<array3.length){
            System.out.print(array3[i]);
            if (i<array3.length-1){
                System.out.print(" ,");
            }
            i++;
        }
        System.out.println("\n"+line);
        /*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
         В конце строки запятую ставить не надо.*/
        int s=array1.length;
        for ( i=0;i<array1.length;i++) {
            System.out.print(array1[array1.length-1-i]);
            if(i<array1.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();

        for ( i=0;i<array2.length;i++) {
            System.out.print(array2[array2.length-i-1]);
            if(i<array1.length-1){
                System.out.print(" ,");
            }
        }
        System.out.println();
        i=0;
        while (i<array3.length){
            System.out.print(array3[array3.length-i-1]);
            if (i<array3.length-1){
                System.out.print(" ,");
            }
            i++;
        }
        System.out.println("\n"+line);
/*Задача 4
Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
Распечатайте результат преобразования в консоль.*/

        for (i=0;i<array3.length;i++){
            if(array3[i]%2!=0){
                array3[i]+=1;
            }
            System.out.print(array3[i]);
            if (i<array3.length-1){
                System.out.print(" ,");
            }

        }
    }
}