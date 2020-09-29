public class BinarySearch {
    // 非递归实现
private static int search(int[] data, int l, int r, int target) {
    int mid;
    while(l < r) {
        mid = (l + r) / 2;
        if(data[mid] == target) {
            return mid;
        } else if(data[mid] < target) {
            l = mid + 1;
        } else {
            r = mid;
        }
    }
    return -1;
}
// 递归实现
private static int searchDfs(int[] data, int l, int r, int target) {
    if(l >= r) {
        return -1;
    }
    int mid = (l + r) / 2;
    if(target == data[mid]) {
        return mid;
    } else if(target > data[mid]) {
        return searchDfs(data, mid + 1, r, target);
    } else {
        return searchDfs(data, l, mid, target);
    }
}
}
