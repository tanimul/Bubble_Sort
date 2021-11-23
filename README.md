# Bubble Sort
Perform Bubble Sort using JAVA language.

# About Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.The pass through 
the list is repeated until the list is sorted.

![Bubble-sort](https://user-images.githubusercontent.com/35636662/142982681-de20bcf8-57bb-4bb1-955d-ccaf9acf77e0.gif)

# Java
   Step 1: 
   
                // loop to access each array element
                for (int i = 0; i < numbers.length - 1; i++) {
                // loop to compare array elements
                    for (int j = 0; j < numbers.length - i - 1; j++) {
                           // compare two adjacent elements
                          // change > to < to sort in descending order
                          if (numbers[j] > numbers[j + 1]) {
                                  // swapping occurs if elements are not in the intended order
                                  int temp = numbers[j];
                                  numbers[j] = numbers[j + 1];
                                  numbers[j + 1] = temp;
                          }
                        }
                      }
    
   Step 2: 
   Now,Print sorted Array in Ascending Order by loop
   
                System.out.print("Sorted Array in Ascending Order: ");
                for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + " ");
                }
