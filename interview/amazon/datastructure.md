# PriorityQueue - heap (minHeap, maxHeap)

https://www.softwaretestinghelp.com/heap-data-structure-in-java/

Binary tree: all levels are filled, from left to right 
root: arr[i], arr[2*i+1], arr[2*i+2]
1. create priority queue obj
PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
   
2. create empty priority queue with Collections.reverseOrder to represent max heap
PriorityQueue<Integer> pQmax = new PriorityQueue<Integer>(Collections.reverseOrder());
   
Iteraor itr = qQmax.iterator();
itr.hasNext();

## heap sort
build a heap from given array
repeated remove the root element from the heap and move it to the sorted array, then heapify the remaining heap
time complexity: O(nlogn), space complexity is O(1)
1) Heap Sort algorithm to sort in ascending order:
Create a max heap for the given array to be sorted.
Delete the root (maximum value in the input array) and move it to the sorted array. Place the last element in the array at the root.
Heapify the new root of the heap.
Repeat steps 1 and 2 till the entire array is sorted.
2) Heap Sort algorithm to sort in descending order:
Construct a min Heap for the given array.
Remove the root (minimum value in the array) and swap it with the last element in the array.
Heapify the new root of the heap.
Repeat steps 1 and 2 till the entire array is sorted.

```
class BinaryHeap {
    private static final ind d = 2;
    private int[] heap;
    private int heapSize;
    
    //binaryconstructor 
    public BinaryHeap(int capacity){
        heapSize = 0;
        heap = new int[capacity];
        Arrays.fill(heap, -1);
    }
    
    public boolean isEmpty() return heapSize == 0;
    
    //is heap full
    public boolean isFull(){
        return heapSize == heap.length;
    }
    //return parent 
    private int parent(int i) {
        return (i-1)/d;
    }
    
    private int kthChild(int i, int k){
        return d*i+k;
    }
    
    public void insert(int x) {
        if(isFull()){
            throw new NoSuchElementException("Heap is full, no space");
        }
        heap[heapSize++] = x;
        heapifyUp(heapSize-1);
    }
    
    public int delete(int x){
        if(isEmpty()) throw new NoSuchElementException("Heap is empty, no element to delete");
        int key = heap[x];
        heap[x] = heap[heapSize-1];
        heapSize--;
        heapifyDown(x);
        return key;
    }
    
    //maintain heap property during insertion
    private void heapifyUp(int i){
        int temp = heap[i];
        while(i > 0 && temp > heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }
    
    private void heapifyDown(int i){
        int child;
        int temp = heap[i];
        while(kthChild(i, 1) < heapSize){
            child = maxChild(i);
            if(temp < heap[child]){
                heap[i] = heap[child];
            }
            else break;
            i = child;
        }
        heap[i] = temp;
    }
    
    public void printHeap(){
        System.out.print("nHeap == ");
        for(int i = 0; i < heapSize; i++){
            heap[i];
        }
    }
    
    public int findMax(){
        if(isEmpty()) throw NoSuchElementException("");
        return heap[0];
    }
}
```

```
class HeapSort{
    public void heap_sort(int heap_array[]){
        int heap_len = heap_arrary.length;
        for(int i = heap_len/2-1; i >= 0; i--){
            heapify(heap_array, heap_len, i);
        }
        //heap sort 
        for(int i = heap_len-1; i >= 0; i--){
            int temp = heap_array[0];
            heap_array[0] = heap_array[i];
            heap_array[i] = temp;
            heapify(heap_array, i, 0);
        }
    }
    void heapify(int heap_array[], int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i+2;
        if(left < n && heap_array[left] > heap_array[largest]){
            largelst = left;
        }
        if(right < n && heap_array[right] > heap_array[largest]) largest = right;
        if(largest != i){
            int swap = heap_array[i];
            heap_array[i] = heap_array[largest];
            heap_array[largest] = swap;
            
            heapify(heap_array, n, largest);
        }
        
    }
}


```
print array: Arrays.toString(arr);
## heap methods
insertNode()
extractMin()
getMin()

# sort 2d array
Arrays.sort(int[] array, Double.compare((a, b) ->a[0] - b[0]));

## IntStream
List<List<Integer>> lists = IntStream.rangeClosed(1, 3).boxed()
.map(i -> Collections.nCopies(4, i))
.collect(Collectors.toList());
## convert 2d array to list 
List<List<String>> list = Arrays.stream(dataSet)
.map(Arrays::asList)
.collect(Collectors.toList());

## convert between int and Integer 
Integer.valueOf(int)
IntegerVal.intValue();