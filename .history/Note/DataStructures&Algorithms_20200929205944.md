# 第一部分：数据结构

## 一、线性表

### 数组
#### 声明
``` dataType[] arrayRefVar;   // 首选的方法 ``` <br>
``` double[] myList;         // 实例 ```

#### 创建

``` java
public class TestArray {
   public static void main(String[] args) {
      // 数组大小
      int size = 10;
      // 定义数组
      double[] myList = new double[size];
      myList[0] = 5.6;
      myList[1] = 4.5;
      myList[2] = 3.3;
      myList[3] = 13.2;
      myList[4] = 4.0;
      myList[5] = 34.33;
      myList[6] = 34.0;
      myList[7] = 45.45;
      myList[8] = 99.993;
      myList[9] = 11123;
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < size; i++) {
         total += myList[i];
      }
      System.out.println("总和为： " + total);
   }
}

//输出结果：总和为： 11367.373
```

![java数组结构说明](https://www.runoob.com/wp-content/uploads/2013/12/12-130Q0221Q5602.jpg)

#### 处理数组
``` java
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
   }
}

//Result:
1.9
2.9
3.4
3.5
Total is 11.7
Max is 3.5
```

#### For-Each循环
``` java
public class TestArray {
   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (double element: myList) {
         System.out.println(element);
      }
   }
}

//Result:
1.9
2.9
3.4
3.5
```

### 链表
#### 链表的定义与使用
``` java
import java.util.LinkedList;

public class RunoobTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        
        // 使用 addFirst()/addLast() 在头部(尾部)添加元素
        sites.addFirst("Wiki");

        // 使用 removeFirst()/removeLast() 移除头部(尾部)元素
        sites.removeFirst();

        // 使用 getFirst()/getLast() 获取头部(尾部)元素
        System.out.println(sites.getFirst());

        //For＋size（）
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));

        //For-Each循环
        for (String i : sites) {
            System.out.println(i);
    }
}
```

## 二、栈和队列
### 栈
| 序号 | 方法描述                                                     |
| :--- | :----------------------------------------------------------- |
| 1    | boolean empty()  测试堆栈是否为空。                          |
| 2    | Object peek( ) 查看堆栈顶部的对象，但不从堆栈中移除它。      |
| 3    | Object pop( ) 移除堆栈顶部的对象，并作为此函数的值返回该对象。 |
| 4    | Object push(Object element) 把项压入堆栈顶部。               |
| 5    | int search(Object element) 返回对象在堆栈中的位置，以 1 为基数。 |

#### 实例
``` java
import java.util.*;
 
public class StackDemo {
 
    static void showpush(Stack<Integer> st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
 
    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
 
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}

//Result：
stack: [ ]
push(42)
stack: [42]
push(66)
stack: [42, 66]
push(99)
stack: [42, 66, 99]
pop -> 99
stack: [42, 66]
pop -> 66
stack: [42]
pop -> 42
stack: [ ]
pop -> empty stack
```

### 队列
#### 实例
``` java
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
    public static void main(String[] args) {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素 
        for(String q : queue){
            System.out.println(q);
        }
    }
}

//Result：
a
b
c
d
e
===
poll=a
b
c
d
e
===
element=b
b
c
d
e
===
peek=b
b
c
d
e
```



## 三、树和二叉树

### 1. 2-3树
2-3树是最简单的B-树（或-树）结构，其每个非叶节点都有两个或三个子女，而且所有叶都在统一层上。2-3树不是二叉树，其节点可拥有3个孩子。不过，2-3树与满二叉树相似。高为h的2-3树包含的节点数大于等于高度为h的满二叉树的节点数，即至少有2^h-1个节点。
#### 遍历
```
inorder(in ttTree:TwoThreeTree)
//Traverse the noneempty 2-3 tree ,ttTree in sorted
//search-key order
{
if(ttTree's root node r is a leaf)
visit the data items
else if(r has two data items)
{
inorder(left subtree of ttTree's root);
visit the first data item
inorder(middle subtree of ttTree's root);
visit the last data item
inorder(right subtree of ttTree's root);
}
else
{
inorder(left subtree of ttTree's root)
visit the first data item
inorder(middle subtree of tttree's root);
}
}
```

### 2. 红黑树

红黑树的特性: 

（1）每个节点或者是黑色的，或者是红色的

（2）根节点是黑色的

（3）每个叶子节点（NIL，最后的空结点）是黑色。 [注意：这里叶子节点，是指为空(NIL或NULL)的叶子节点！] 

（4）如果一个节点是红色的，那么他的孩子结点都是黑色的

（5）从任意一个节点到叶子节点，经过的黑色节点是一样的。[这里也就可以得到插入的节点必然为红色]

### 3. 二叉树

#### 二分查找法

在有序表中，通过不断的二分判断mid与目标是否一致，并缩小目标所在区间。

**代码实现**

```java
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
```
### 4.. 二叉树遍历

#### 深度优先遍历（前序、中序、后序遍历）

```C++
/**
 * 前序遍历 非递归实现
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> ans;
        TreeNode* node = root;
        stack<TreeNode*> s;
        map<TreeNode*, bool> M;
        if(node != NULL) {
            s.push(node);
            while (!s.empty()) {
                node = s.top();
                if (!M[node]) {
                    ans.push_back(node->val);
                    M[node] = true;
                }
                if (node->left != NULL) {
                    s.push(node->left);
                    node->left = NULL;
                } else if (node->right != NULL) {
                    s.push(node->right);
                    node->right = NULL;
                } else {
                    s.pop();
                }
            }
        }
        return ans;
    }
};
```

```c++
/**
 * 中序遍历
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> ans;
        if(root != NULL) {
            traversal(root, ans);
        }
        return ans;
    }
    
    void traversal(TreeNode* node, vector<int> &ans) {
        if(node->left != NULL) {
            traversal(node->left, ans);
        }
        ans.push_back(node->val);
        if(node->right != NULL) {
            traversal(node->right, ans);
        }
    }
};
```



```c++
/**
 * 后序遍历
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> ans;
        if(root != NULL) {
            traversal(root, ans);
        }
        return ans;
    }

    void traversal(TreeNode* node, vector<int> &ans) {
        if(node->left != NULL) {
            traversal(node->left, ans);
        }
        if(node->right != NULL) {
            traversal(node->right, ans);
        }
        ans.push_back(node->val);
    }
};
```

#### 广度优先遍历（层序遍历）
``` C++
//广度优先搜索
void BreadthFirstSearch(BitNode *root)
{
    queue<BitNode*> nodeQueue;
    nodeQueue.push(root);
    while (!nodeQueue.empty())
    {
        BitNode *node = nodeQueue.front();
        cout << node->data << ' ';
        nodeQueue.pop();
        if (node->left)
        {
            nodeQueue.push(node->left);
        }
        if (node->right)
        {
            nodeQueue.push(node->right);
        }
    }
}
```

### 5. AVL树

#### 特点
AVL树本质上还是一棵二叉搜索树，它的特点是： <br> 
1.本身首先是一棵二叉搜索树。 <br>
2.带有平衡条件：每个结点的左右子树的高度之差的绝对值（平衡因子）最多为1。
也就是说，AVL树，本质上是带了平衡功能的二叉查找树（二叉排序树，二叉搜索树）。



### 6. B和B+

## 四、字符串和数组

# 第二部分：算法思想

## 一、排序

### 1. 选择排序（Selection Sort）

选择出数组中的最小元素，将它与数组的第一个元素交换位置。再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。不断进行这样的操作，直到将整个数组排序。 

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015224719590-1433219824.gif)

**代码实现**

```java
public static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // 寻找[i, n)区间里的最小值的索引
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if(arr[minIndex] > arr[j]){
                minIndex = j;
            }
        }
        swap( arr , i , minIndex);
    }
}

private static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}
```

**算法分析**

表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。

 

### 2. 插入排序（Insertion Sort）

插入排序从左到右进行，每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左部数组依然有序。

第 j 元素是通过不断向左比较并交换来实现插入过程：当第 j 元素小于第 j - 1 元素，就将它们的位置交换，然后令 j 指针向左移动一个位置，不断进行以上操作。

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015225645277-1151100000.gif)

**代码实现**

```java
public static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j > 0; j--) {
            if (arr[j] < arr[j - 1])
                swap(arr, j, j - 1); // 大量的交换会消耗时间
            else
                break;
        }
    }
}

// 改进版插入排序（减少了数组元素的操作次数）
public static void better_sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        int e = arr[i];
        int j = i;
        for (; j > 0; j--) {
            if (e < arr[j - 1])
                arr[j] = arr[j - 1];
            else
                break;
        }
        arr[j] = e;
    }
}

private static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}
```

**算法分析**

插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。

 

### 3. 冒泡排序（Bubble Sort）

通过从左到右不断交换相邻逆序的相邻元素，在一轮的交换之后，可以让未排序的元素上浮到右侧。

在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015223238449-2146169197.gif)

**代码实现**

```java
private static void sort(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) { // 从最后一位开始确定
        boolean swapped = false;
        for (int j = 0; j < i; j++) {
            if(arr[j] > arr[j+1]){
                swapped = true;
                swap(arr,j,j+1);
            }
        }
        if(!swapped)
            return;
    }
}

private static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}
```



### 4. 希尔排序（Shell Sort）

1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫**缩小增量排序**。



**算法描述**

先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：

- 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
- 按增量序列个数k，对序列进行k 趟排序；
- 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。

![](https://images2018.cnblogs.com/blog/849589/201803/849589-20180331170017421-364506073.gif)

**代码实现**

```java
// 希尔排序
public static void sort(int[] arr) {
    int n = arr.length;
    for (int h = n / 2; h > 0; h = h / 2) {
        // 内部是一个插入排序
        for (int i = 0; i < n; i = i + h) {

            int e = arr[i];
            int j = i;
            for (; j > 0; j = j - h) {
                if (e < arr[j - h])
                    arr[j] = arr[j - h];
                else
                    break;
            }
            arr[j] = e;
        }
    }
}


// 希尔排序2
public static void sort2(int[] arr) {
    int n = arr.length;
    // 计算 increment sequence: 1, 4, 13, 40, 121, 364, 1093...
    int h = 1;
    while (h < n / 3) h = 3 * h + 1;

    System.out.println(h);

    while (h >= 1) {
        // h-sort the array
        for (int i = h; i < n; i++) {
            
            // 对 arr[i], arr[i-h], arr[i-2*h], arr[i-3*h]... 使用插入排序
            int e = arr[i];
            int j = i;
            for (; j >= h && e < arr[j - h]; j -= h)
                arr[j] = arr[j - h];
            arr[j] = e;
        }

        h /= 3;
    }
}
```

**算法分析**

对于大规模的数组，插入排序很慢，因为它只能交换相邻的元素，每次只能将逆序数量减少 1。

希尔排序的出现就是为了改进插入排序的这种局限性，它通过交换不相邻的元素，每次可以将逆序数量减少大于 1。

希尔排序使用插入排序对间隔 h 的序列进行排序。通过不断减小 h，最后令 h=1，就可以使得整个数组是有序的。



### 5. 归并排序（Merge Sort）

归并排序的思想是将数组分成两部分，分别进行排序，然后归并起来。把长度为n的输入序列分成两个长度为n/2的子序列；对这两个子序列分别采用归并排序；将两个排序好的子序列合并成一个最终的排序序列。

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015230557043-37375010.gif)

**代码实现**

> 1.归并方法
>
> 归并方法将数组中两个已经排序的部分归并成一个。

```java
private static void sort(int[] arr) {
    __MergeSort(arr, 0, arr.length - 1);
}

private static void __MergeSort(int[] arr, int l, int r) {
    if (l >= r)
        return;
    int mid = (l + r) / 2;
    __MergeSort(arr, l, mid);
    __MergeSort(arr, mid + 1, r);
    merge(arr, l, mid, r);
}

// 将arr[l...mid]和arr[mid+1...r]两部分进行归并
private static void merge(int[] arr, int l, int mid, int r) {
    int[] aux = Arrays.copyOfRange(arr, l, r + 1);

    // 初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
    int i = l, j = mid + 1;
    for (int k = l; k <= r; k++) {
        if (i > mid) {  // 如果左半部分元素已经全部处理完毕
            arr[k] = aux[j - l];
            j++;
        } else if (j > r) {   // 如果右半部分元素已经全部处理完毕
            arr[k] = aux[i - l];
            i++;
        } else if (aux[i - l] < aux[j - l]) {  // 左半部分所指元素 < 右半部分所指元素
            arr[k] = aux[i - l];
            i++;
        } else {  // 左半部分所指元素 >= 右半部分所指元素
            arr[k] = aux[j - l];
            j++;
        }
    }
}
```

> 2.自底向上归并排序

```java
private static void sort(int[] arr) {
    int N = arr.length;
    int[] aux = new int[N];
    for (int sz = 1; sz < N; sz += sz)
        for (int i = 0; i + sz < N; i += sz + sz)
            merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, N - 1));
}
```



### 6. 快速排序（Quick Sort）

快速排序可以说是20世纪最伟大的算法之一了。相信都有所耳闻，它的速度也正如它的名字那样，是一个非常快的算法了。当然它也后期经过了不断的改进和优化，才被公认为是一个值得信任的非常优秀的算法。

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015230936371-1413523412.gif)

**代码实现**

#### 1. 普通快速排序

```java
// 递归使用快速排序,对arr[l...r]的范围进行排序
public static void QuickSort(int[] arr,int l,int r){
    if(l>=r)
        return;
    int p = partition(arr,l,r);
    QuickSort(arr,l,p-1);
    QuickSort(arr,p+1,r);
}

// 将数组通过p分割成两部分
// 对arr[l...r]部分进行partition操作
// 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
public static int partition(int[] arr, int l, int r) {
    swap(arr, l, (int) (Math.random() % (r - l + 1)) + l);  // 加入这一行变成随机快速排序

    int v = arr[l];
    int j = l;
    for(int i = j +1;i<=r;i++){
        if(arr[i] < v){
            j++;
            swap(arr,i,j);
        }
    }
    swap(arr,l,j);
    return j;
}

public static void swap(int[] arr,int i,int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

快速排序是原地排序，不需要辅助数组，但是递归调用需要辅助栈。

快速排序最好的情况下是每次都正好能将数组对半分，这样递归调用次数才是最少的。这种情况下比较次数为 CN=2CN/2+N，复杂度为 O(NlogN)。

最坏的情况下，第一次从最小的元素切分，第二次从第二小的元素切分，如此这般。因此最坏的情况下需要比较 N2/2。为了防止数组最开始就是有序的，在进行快速排序时需要随机打乱数组。



#### 2. 双路快速排序

若果数组中含有大量重复的元素，则partition很可能把数组划分成两个及其不平衡的两部分，时间复杂度退化成O(n²)。这时候应该把小于v和大于v放在数组两端。

![](pics/partition2.jpg)

```java
// 双路快速排序的partition
// 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
private static int partition(int[] arr, int l, int r) {

    // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
    // swap(arr, l, (int) (Math.random() % (r - l + 1)) + l);

    int v = arr[l];

    // arr[l+1...i) <= v; arr(j...r] >= v
    int i = l + 1, j = r;
    while (true) {
        // 注意这里的边界, arr[i].compareTo(v) < 0, 不能是arr[i].compareTo(v) <= 0
        // 思考一下为什么?
        while (i <= r && arr[i] < v)
            i++;

        // 注意这里的边界, arr[j].compareTo(v) > 0, 不能是arr[j].compareTo(v) >= 0
        // 思考一下为什么?
        while (j >= l + 1 && arr[j] > v)
            j--;

        // 对于上面的两个边界的设定, 有的同学在课程的问答区有很好的回答:)
        // 大家可以参考: http://coding.imooc.com/learn/questiondetail/4920.html
        if (i > j)
            break;
        
        swap(arr, i, j);
        i++;
        j--;
    }

    swap(arr, l, j);

    return j;
}

// 递归使用快速排序,对arr[l...r]的范围进行排序
private static void QuickSort2Ways(int[] arr, int l, int r) {
    // 对于小规模数组, 使用插入排序
    if (l >= r) return;
    int p = partition(arr, l, r);
    QuickSort2Ways(arr, l, p - 1);
    QuickSort2Ways(arr, p + 1, r);
}
```

#### 3. 三路快速排序

数组分成三个部分，大于v 等于v 小于v

在具有大量重复键值对的情况下使用三路快排

![](pics/partition3.jpg)



```java
// 递归使用快速排序,对arr[l...r]的范围进行排序
private static void QuickSort3Ways(int[] arr, int l, int r){

    // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
    swap( arr, l, (int)(Math.random()*(r-l+1)) + l );

    int v = arr[l];

    int lt = l;     // arr[l+1...lt] < v
    int gt = r + 1; // arr[gt...r] > v
    int i = l+1;    // arr[lt+1...i) == v
    while( i < gt ){
        if( arr[i] < v){
            swap( arr, i, lt+1);
            i ++;
            lt ++;
        }
        else if( arr[i] > v ){
            swap( arr, i, gt-1);
            gt --;
        }
        else{ // arr[i] == v
            i ++;
        }
    }
    swap( arr, l, lt );

    QuickSort3Ways(arr, l, lt-1);
    QuickSort3Ways(arr, gt, r);
}
```



### 7. 堆排序（Heap Sort）

#### 1. 堆

堆的某个节点的值总是大于等于子节点的值，并且堆是一颗完全二叉树。

堆可以用数组来表示，因为堆是完全二叉树，而完全二叉树很容易就存储在数组中。位置 k 的节点的父节点位置为 k/2，而它的两个子节点的位置分别为 2k 和 2k+1。这里不使用数组索引为 0 的位置，是为了更清晰地描述节点的位置关系。

![](pics/heap.png)

#### 2. 上浮和下沉

在堆中，当一个节点比父节点大，那么需要交换这个两个节点。交换后还可能比它新的父节点大，因此需要不断地进行比较和交换操作，把这种操作称为**上浮（ShiftUp）**。

![](pics/shiftup_heap.png) 

```java
private void shiftUp(int k){
    while( k > 1 && data[k/2] < data[k])){
        swap(k, k/2);
        k /= 2;
    }
}
```



类似地，当一个节点比子节点来得小，也需要不断地向下进行比较和交换操作，把这种操作称为**下沉（Shift Down）**。一个节点如果有两个子节点，应当与两个子节点中最大那么节点进行交换。

![](pics/shiftdown_heap.png) 

```java
private void shiftDown(int k){
    while( 2*k <= count ){ // 当前结点有左孩子
        int j = 2*k; // 在此轮循环中,data[k]和data[j]交换位置
        if( j+1 <= count && data[j+1] > data[j] )
            j ++;
        // data[j] 是 data[2*k]和data[2*k+1]中的最大值

        if( data[k] >= data[j] ) 
            break;
        swap(k, j);
        k = j;
    }
}
```

#### 3.插入元素

将新元素放到数组末尾，然后上浮到合适的位置。  

```java
// 向最大堆中插入一个新的元素 item
public void insert(Item item){
    assert count + 1 <= capacity;
    data[count+1] = item;
    count ++;
    shiftUp(count);
}
```

#### 4. 删除最大元素

```java
// 从最大堆中取出堆顶元素, 即堆中所存储的最大数据
public Item extractMax(){
    assert count > 0;
    Item ret = data[1];
    
    swap( 1 , count );
    count --;
    shiftDown(1);
    return ret;
}
```

#### 5. 堆排序

由于堆可以很容易得到最大的元素并删除它，不断地进行这种操作可以得到一个递减序列。如果把最大元素和当前堆中数组的最后一个元素交换位置，并且不删除它，那么就可以得到一个从尾到头的递减序列，从正向来看就是一个递增序列。因此很容易使用堆来进行排序。并且堆排序是原地排序，不占用额外空间。

```java
// 不使用一个额外的最大堆, 直接在原数组上进行原地的堆排序
public class HeapSort {

    // 对整个arr数组使用HeapSort1排序
    // HeapSort1, 将所有的元素依次添加到堆中, 在将所有元素从堆中依次取出来, 即完成了排序
    // 无论是创建堆的过程, 还是从堆中依次取出元素的过程, 时间复杂度均为O(nlogn)
    // 整个堆排序的整体时间复杂度为O(nlogn)
    public static void sort1(Comparable[] arr){

        int n = arr.length;
        MaxHeap<Comparable> maxHeap = new MaxHeap<Comparable>(n);
        for( int i = 0 ; i < n ; i ++ )
            maxHeap.insert(arr[i]);

        for( int i = n-1 ; i >= 0 ; i -- )
            arr[i] = maxHeap.extractMax();
    }


    // 只通过shiftDown操作进行排序
    public static void sort2(Comparable[] arr){
        int n = arr.length;

        // 注意，此时我们的堆是从0开始索引的
        // 从(最后一个元素的索引-1)/2开始
        // 最后一个元素的索引 = n-1
        for( int i = (n-1-1)/2 ; i >= 0 ; i -- )
            shiftDown2(arr, n, i);

        for( int i = n-1; i > 0 ; i-- ){ // 这个的目的是让序列从小到大排序
            swap( arr, 0, i);
            shiftDown2(arr, i, 0);
        }
    }

    // 交换堆中索引为i和j的两个元素
    private static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 原始的shiftDown过程
    private static void shiftDown(Comparable[] arr, int n, int k){
        while( 2*k+1 < n ){
            int j = 2*k+1;
            if( j+1 < n && arr[j+1].compareTo(arr[j]) > 0 )
                j += 1;

            if( arr[k].compareTo(arr[j]) >= 0 )break;

            swap( arr, k, j);
            k = j;
        }
    }

    // 优化的shiftDown过程, 使用赋值的方式取代不断的swap,
    // 该优化思想和我们之前对插入排序进行优化的思路是一致的
    private static void shiftDown2(Comparable[] arr, int n, int k){

        Comparable e = arr[k];
        while( 2*k+1 < n ){
            int j = 2*k+1;
            if( j+1 < n && arr[j+1].compareTo(arr[j]) > 0 )
                j += 1;

            if( e.compareTo(arr[j]) >= 0 )
                break;

            arr[k] = arr[j];
            k = j;
        }

        arr[k] = e;
    }

    // 测试 HeapSort
    public static void main(String[] args) {
        Integer[] arr = {10, 91, 8, 7, 6, 5, 4, 3, 2, 1};
        HeapSort.sort2(arr);
        PrintHelper.printArray(arr);
    }
}
```

#### 6. 堆排序的应用——Top K问题

例如，有1亿个浮点数，如何找出其中最大的10000个？（B326）



### 8. 计数排序

https://www.cnblogs.com/freedom314/p/5847092.html



### 9. 排序算法总结

|          | 平均时间复杂度 | 原地排序 | 额外空间 | 稳定排序 |
| :------: | :------------: | :------: | :------: | :------: |
| 插入排序 |     O(n^2)     |    √     |   O(1)   |    √     |
| 归并排序 |    O(nlogn)    |    ×     |   O(n)   |    √     |
| 快速排序 |    O(nlogn)    |    √     | O(logn)  |    ×     |
|  堆排序  |    O(nlogn)    |    √     |   O(1)   |    ×     |

稳定排序：对于相等的元素，在排序后，原来靠前的元素依然靠前。相等元素的相对位置没有发生变化。

```java
// 可以通过⾃自定义⽐比较函数，让排序算法不不存在稳定性的问题。
bool operator<(const Student& otherStudent){
    return score != otherStudent.score ?
    score > otherStudent.score :
    name < otherStudent.name;
}
```







![](pics/sort_algorithm_analyze.png) 





