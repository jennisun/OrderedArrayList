public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  OrderedArrayList(){
    super();
  }

  OrderedArrayList(int index){
    super(index);
  }

  public boolean add(T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();
    return super.add(value);
  }

  public void add(int index, T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();
    super.add(index, value);
  }

  public T set(int index, T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();
    T ans = super.remove(index);
    super.add(index, value);
    return (ans);
  }








}
