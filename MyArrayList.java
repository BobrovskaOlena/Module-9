public class MyArrayList {
    public String[] typesOfFruit;
    //додає елемент в кінець:
    public void add(Object value){
    }
    //видаляє елемент із вказаним індексом:
    public void remove(int index){
        for(String fruits:typesOfFruit){
            typesOfFruit[index]="";
        }
        System.out.println(typesOfFruit);
    }

    //очищає колекцію:
    public void clear(){
        for(int i = 0; i<typesOfFruit.length; i++){
            typesOfFruit[i]="";
        }
        System.out.println(typesOfFruit);
    }
    //повертає розмір колекції
    public int size(){
        int sizeOfMyArraysList = typesOfFruit.length;
        return sizeOfMyArraysList;
    }
    //повертає елемент за індексом
    public String get(int index){
        String result = "";
        for(int i = 0; i<typesOfFruit.length; i++){
            if(i==index){
                result+=typesOfFruit[i];}
        }
        return result;
    }

}
