## Binary search 
1. start = 0; end = len-1; while(start+1 < end){ mid = start + (e-s)/2; if(nums[mid] < target) start = mid; else end = mid; (start, end)
2. start = 0; end = len; while(start < end) mid = start+(e-2)/2; if(nums[mid] < target) start = mid+1; else end = mid; start == end;
3. start = 0; end = len-1; while(start <= end) mid = start+(e-s)/2; if(nums[mid] < target) start = mid+1; else end = mid-1;  (end, start) => mid
4. binarySearch(int[] arrays, int low, int high, int target) {
        if(low > high) return -1; int mid = (low+high)/2; if(array[mi] > target) return binarySearch(array, low, mid-1, target);
        if(array[mid] < target) return binarySearch(array, mid+1, high, target);
        return mid; }
5. binarySearch2(int[] nums, int target) {int left = 0; int right - nums.length-1; 
    while(left <= right) { int mid = left + (right-left)/2; if(nums[mid] == target) return mid; else if (nums[mid] > target) right = mid-1;
    else left = mid+1;  return -1;

## 410, 
?? 1552, 1482, 1283, 1292



```
//quicksort
public int[] quickSort(int[] array) {
    helper(array, 0, arr.length-1);
    return array;
}

public void helper(int[] array, int left, int right){
    if(left >= right) return;
    int pivot = partition(array, left, right);
    helper(array, left, pivot-1);
    helper(array,pivot+1, right);

}

public int partition(int[] array, int left, int right){
    int pivot = array[right];
    int start = left, end = right-1;
    while(start <= end){
        if(array[start] <= pivot) start++;
        else if(arr[end] > pivot) end--;
        else swap(array, start++, end--);
     }
     swap(array, start, right);
     return start;
}

public int partition2(int[] nums, int left, int right){
    int pivot = nums[right], wall = left;
    for(int i = left; i < right; i++){
        if(nums[i] < pivot){
            swap(nums, i, wall);
            wall++;
        }
    }
    swap(nums, wall, right);
    return wall;
}
    
```