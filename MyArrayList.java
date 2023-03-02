import java.util.StringJoiner;
import java.util.*;

public class MyArrayList<T> {
    private static final int INIT_NUMBER = 7;
    private Object[] numbering;
    private int number;

    public MyArrayList(){
        numbering = new Object[INIT_NUMBER];
    }

    //додає елемент в кінець:
    public void add(T value){
        ifNeedNewSize();
        numbering[number]=value;
        number++;
    }
    private void ifNeedNewSize(){
        if(number==numbering.length){
            System.out.println("The resizing process is successful, number: "+ number + ", numbering.length is: " + numbering.length);
            int newNumber = (numbering.length*3)/2;
            Object[] newNumbering = new Object[newNumber];
            System.arraycopy(numbering, 0, newNumbering, 0, numbering.length);
            numbering=newNumbering;
        }
    }
    //повертає елемент за індексом
    public T get(int index){
      return (T) numbering[index];
    }
    //повертає розмір колекції
    public int size(){
        return number;
    }

    @Override
    public String toString(){
        StringJoiner result = new StringJoiner(", ");
        for(int i =0; i<number; i++){
            result.add(numbering[i].toString());
        }
        return "["+ result +"]";
    }

   //видаляє елемент із вказаним індексом:
    public void remove(int index1) {
        int newNumber1 = numbering.length - 1;
        Object[] newNumbering1 = new Object[newNumber1];
        int a = 0;
        for (int i = 0; i < numbering.length; i++) {
            if (numbering[i] == numbering[index1]) {
                continue;
            } if(numbering[i] != numbering[index1]) {
                newNumbering1[a] = numbering[i];
                a++;
            }
        }
        System.out.println("The removal process is successful. List after removal process: " + Arrays.toString(newNumbering1));
    }
    //очищає колекцію:
    public void clear(){
        for(int i = 0; i<numbering.length; i++){
            numbering[i]="";
        }
        int n = 0;
        Object[] clearNumbering = new Object[n];
        for(int i = 0; i<numbering.length; i++){
            if(numbering[i]==""){
                n+=0;
            }
        }
        System.out.println(Arrays.toString(clearNumbering));
    }
}

