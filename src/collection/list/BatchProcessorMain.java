package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {

//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000); // ArrayList -> 1400ms / linkedList -> 2ms
    }
}
