OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {



public void add(int index, T value) throws IllegalArgumentException() {
  if (value == null) throw new IllegalArgumentException();
  super.add(index, value);
}









}
