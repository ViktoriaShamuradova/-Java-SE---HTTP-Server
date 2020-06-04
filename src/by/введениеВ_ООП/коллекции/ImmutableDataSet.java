package by.введениеВ_ООП.коллекции;

public final class ImmutableDataSet<T> extends DataSet<T> {
    private final DataSet<T> originalDataSet;
    public ImmutableDataSet(DataSet<T> originalDataSet) {
        super();
        this.originalDataSet = originalDataSet;
        this.size = originalDataSet.size();
    }
    @Override
    public void add(T element) {
//do nothing
    }
    @Override
    public T remove(int index) {
//do nothing
        return null;
    }
    @Override
    public void clear() {
//do nothing
    }
    @Override
    public T get(int index) {
        return originalDataSet.get(index);
    }
    @Override
    public T[] toArray() {
        return originalDataSet.toArray();
    }
    @Override
    public String toString() {
        return originalDataSet.toString();
    }
    @Override
    public boolean equals(Object obj) {
        return originalDataSet.equals(obj);
    }
    @Override
    public int hashCode() {
        return originalDataSet.hashCode();
    }
}
