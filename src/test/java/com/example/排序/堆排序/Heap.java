package com.example.排序.堆排序;


public class Heap {
    private int[] nums; // 用数组存储元素，这个可以是任何数据类型(包括自定义的)，不要有局限性思维！
    private int count; // 当前堆中元素数量
    private int cap; // 堆的总容量容量

    public Heap(int cap){ // 初始化堆的时候指定堆的容量
        this.nums = new int[cap + 1]; // 注意这里要+1，应该知道原因吧？因为0的位置是没有用到的
        this.cap = cap;
        this.count = 0;
    }

    public int removeMax(){ // 大顶堆中也就是删除最大值元素
        if (count == 0) return -1; // 如果没有元素了我们这里直接做返回-1处理
        int curRemoveMax = nums[1];

        nums[1] = nums[count]; // 进行将数组末尾元素替换到堆顶元素
        count--; // 进行末尾元素的去除，这里直接通过count来表明，细品

        // 进行堆化操作
        heapify(nums, count, 1);

        return curRemoveMax;
    }

    public void buildHeap(int[] arr, int curCount){
        for (int i = curCount / 2; i >= 1; i--){ // 从第一个非叶子节点开始堆化
            heapify(arr, curCount, i);
        }
    }

    public void sort(int[] arr, int curCount){
        buildHeap(arr, curCount); // 先将数组进行堆化
        int k = curCount;
        while (k > 1){
            swap(arr, k, 1); // 当前末尾元素和堆顶元素替换
            k--; // 更新末尾元素下标
            heapify(arr, k, 1); // 将前面数组进行堆化操作
        }
    }

    private void heapify(int[] arr, int endIndex, int startIndex){ // 从上往下堆化操作
        while (true){
            int finalPos = startIndex; // 记录最终的位置

            // 看左孩子是否存在并且是否大于当前元素，如果大于记录左孩子的位置
            if (startIndex * 2 <= endIndex && arr[startIndex] < arr[startIndex * 2]) finalPos = startIndex * 2;
            // 看右孩子是否存在并且是否大于当前的最大值，如果大于则记录有孩子的位置，这里巧秒的选出左右孩子中最大的那个并且是大于当前节点的位置，细品
            if (startIndex * 2 + 1 <= endIndex && arr[finalPos] < arr[startIndex * 2 + 1]) finalPos = startIndex * 2 + 1;

            if (finalPos == startIndex) break; // 达到最终的位置，借结束掉
            swap(arr, startIndex, finalPos); // 替换位置
            startIndex = finalPos; // 更新当前节点的位置
        }
    }

    public void insert(int newNum){
        if (count >= cap)  return; // 如果当前元素个数满了之后,我们这里做直接返回处理

        count++; // 先进行将个数添加，这个时候count是不是就指向了当前可以添加元素的位置？细品，细节
        nums[count] = newNum;

        // 堆化操作
        int i = count; // 复制临时变量，开始进行堆化
        while (i/2 > 0 && nums[i] > nums[i/2]){ // 首先当前节点是否有父节点，其次看是否大于父亲节点
            swap(nums, i, i/2); // 替换位置
            i = i/2; // 继续来
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
