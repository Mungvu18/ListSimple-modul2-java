import java.util.Arrays;

public class MyList<E> {
    private int size;
    final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    // cài đặt phương thức ensureCapa() tăng đôi kích thước mảng chứa các phần tử
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    // cài đặt phương thức add();
    public void add(E e){
        if(size == elements.length){
          ensureCapa();
        }
        elements[size++]=e;
    }
    // phương thức get() trả về phần tử vừa ở vị trí thứ i thong danh sách
     public E get(int i){
        if(i>= size || i<0){
            throw new IndexOutOfBoundsException("Index: "+ i +", Size " + i);
        }
        return (E) elements[i];
     }
     // tạo lớp MyListTest chứa phương thức main()

}
