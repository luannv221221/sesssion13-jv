package generic;

public class Dictionary<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // phuoc thuc kieu du lieu generic
    public static <T> void printElementOfArray(T[] array){
        System.out.println("Cac phan tu");
        for (T el: array){
            System.out.println(el);
        }
    }
}
