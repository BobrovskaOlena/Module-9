import java.util.StringJoiner;

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
            } else {
                newNumbering1[a] = numbering[i];
                a++;
            }
        }
        System.out.println(newNumbering1);
    }

    private void ifNeedNewRemove(){
       System.out.println("The removal process is successful");
       //, number: "+ number + ", numbering.length is: " + numbering.length);
        int newNumber1 = numbering.length-1;
        Object[] newNumbering1 = new Object[newNumber1];
        System.arraycopy(numbering, 0, newNumbering1, 0, numbering.length-1);
            numbering=newNumbering1;
        }
    /*
    //очищає колекцію:
    public void clear(){
        for(int i = 0; i<typesOfFruit.length; i++){
            typesOfFruit[i]="";
        }
        System.out.println(typesOfFruit);
    }
*/


}
