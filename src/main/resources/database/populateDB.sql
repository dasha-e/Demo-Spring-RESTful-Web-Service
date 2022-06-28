INSERT INTO algorithm VALUES
(DEFAULT, 'Bubble Sort ', 'The simplest sorting algorithm that works by repeatedly swapping the adjacent ' ||
                    'elements if they are in the wrong order.'),
(DEFAULT, 'Selection Sort', 'Selection sort is a sorting algorithm that selects the smallest element from an unsorted' ||
              ' list in each iteration and places that element at the beginning of the unsorted list.'),
(DEFAULT, 'Insertion Sort', 'Insertion sort is a simple sorting algorithm that builds the final sorted' ||
                            ' array (or list) one item at a time. It is much less efficient on large' ||
                            ' lists than more advanced algorithms such as quicksort, heapsort, or merge' ||
                            ' sort.'),
(DEFAULT, 'Quick Sort', 'Quicksort is a divide-and-conquer algorithm. It works by selecting' ||
                        ' a ''pivot'' element from the array and partitioning the other elements' ||
                        ' into two sub-arrays, according to whether they are less than or greater' ||
                        ' than the pivot. For this reason, it is sometimes called partition-exchange sort.'),
(DEFAULT, 'Merge Sort', 'This is a sorting algorithm that arranges lists in a specific order. ' ||
                        'This sorting is a good example of using the divide and conquer principle. ' ||
                        'First, the task is divided into several smaller subtasks. These tasks are then ' ||
                        'solved with a recursive call or directly if their size is small enough. Finally, ' ||
                        'their solutions are combined, and a solution to the original problem is obtained.' ),
(DEFAULT, 'Heap Sort', 'Heap sort is a comparison-based sorting technique based on Binary Heap data structure.' ||
                       ' It is similar to selection sort where we first find the minimum element and place' ||
                       ' the minimum element at the beginning. We repeat the same process for the remaining' ||
                       ' elements.');
