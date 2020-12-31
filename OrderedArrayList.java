public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  OrderedArrayList(){
    super();
  }

  OrderedArrayList(int index){
    super(index);
  }

  public boolean add(T value) throws IllegalArgumentException {
    boolean a = false;

    if (value == null) throw new IllegalArgumentException();

    if (size() == 0) super.add(value);

    else {
      for (int i = 0; i < size(); i ++) {
        if (value.compareTo(get(i)) <= 0) {
          a = true;
          super.add(i, value);
          break;
        }
      }
      if (!a) super.add(value);
    }
    return true;
}

  public void add(int index, T value) throws IllegalArgumentException {
    if (value == null) throw new IllegalArgumentException();

    if (size() == 0) super.add(value);

    else {
      for (int i = 0; i < size(); i ++) {
        if (value.compareTo(get(i)) <= 0) {
          super.add(i, value);
          break;
        }
      }
    }

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
