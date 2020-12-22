public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  OrderedArrayList(){
    super();
  }

  OrderedArrayList(int index){
    super(index);
  }

  public boolean add(T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();
    boolean hold = super.add(value);
    sort();
    return hold;
}

  public void add(int index, T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();
    super.add(index, value);
    sort();
  }

  public T set(int index, T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();
    T ans = super.remove(index);
    super.add(index, value);
    sort();
    return (ans);
  }

  private void sort() {
    boolean change = true;

    while (change) {
      change = false;
      for (int i = 1; i <= size(); i++) {
        for (int k = 0; k + 1 < i; k ++) {
          if (get(k).compareTo(get(k + 1)) > 0) {
            T hold = get(k + 1);
            set(k + 1, get(k));
            set(k, hold);

            change = true;
          }
        }
      }
    }

  }


}
