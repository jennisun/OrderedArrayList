import java.util.ArrayList;

class NoNullArrayList<T> extends ArrayList<T> {

  NoNullArrayList(){
    super();
  }

  NoNullArrayList(int index){
    super(index);
  }


  public boolean add(T value){
    if (value == null) throw new IllegalArgumentException();
    return super.add(value);
  }

  public void add(int index, T value){
    if (value == null) throw new IllegalArgumentException();
    super.add(index, value);
  }

  public T set(int index, T value) {
    if (value == null) throw new IllegalArgumentException();
    return super.set(index, value);
  }



}
