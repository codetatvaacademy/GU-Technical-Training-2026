
let array = [];

// BackGrond fix Start
particlesJS("particles-js", {
    particles: {
        number: { value: 80, density: { enable: true, value_area: 800 } },
        color: { value: [ "#00ff00", "#0000ff" ,"#ffffff","#f00"] },    // "#00ff00", "#0000ff" ,
        shape: { type: "star" },
        opacity: { value: 0.5, random: true },
        size: { value: 7.5, random: true },
        move: { enable: true, speed: 2 },
        line_linked: { enable: true, distance: 150, color: "#ffffff", opacity: 0.4, width: 1 }
    },
    interactivity: {
        events: {
            onhover: { enable: true, mode: "repulse" }, // Particles move away on hover
            // onclick: { enable: true, mode: "bubble" } // Particles spawn on click
        }
    },
    retina_detect: true
});

// BackGround fix End

// Speed Control for Sorting Start 

document.addEventListener("DOMContentLoaded", function () {
    let slider = document.getElementById("speed-slider");
    let speedValue = document.getElementById("speed-value");

    slider.addEventListener("input", function () {
        let speed = slider.value;
        speedValue.textContent = speed + "ms";
        updateSpeed(); // Update sorting speed when slider is moved

        if (speed > 300) {
            slider.style.accentColor = "orange"; // High speed - Red
        } else if (speed > 100) {
            slider.style.accentColor = "green"; // Normal speed - Green
        } else {
            slider.style.accentColor = "red"; // Slow speed - Sky Blue
        }
    });
});



let sortingSpeed = 100; // Default speed

function updateSpeed() {
    let speedSlider = document.getElementById("speed-slider");
    sortingSpeed = speedSlider.value;
    document.getElementById("speed-value").innerText = `${sortingSpeed}ms`;
}

// Modify sorting functions to use 'sortingSpeed' for delays
async function delay() {
    return new Promise(resolve => setTimeout(resolve, sortingSpeed));
}


// Speed Control for Sorting end 

// Complexities define start 



const complexities = {
    bubble: {
        worst: "O(n²)",
        average: "O(n²)",
        best: "O(n)",
        space: "O(1)",
        desc: "Defination: Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.",
        define: "Imagine you have a bunch of numbers written on sticky notes and you want to sort them in order.\n\nBubble Sort works like this:\n\n<strong>Compare two numbers next to each other.\n\n If they are in the wrong order, swap them.\n\n Keep doing this until you reach the end of the list.\n\n Repeat the process until everything is sorted.</strong>",
        fact: "<strong>Simple but Inefficient:</strong> Bubble Sort is one of the simplest sorting algorithms but has a high time complexity of O(n²) in the worst and average cases, making it inefficient for large datasets.\n\n<strong>Repeated Swapping:</strong> It works by repeatedly swapping adjacent elements if they are in the wrong order, leading to multiple passes through the array.\n\n<strong>Stable Sorting Algorithm:</strong> Since Bubble Sort only swaps adjacent elements, it maintains the relative order of equal elements, making it a stable sorting algorithm.",
        useCase: "<strong>Teaching and Learning:</strong> Bubble Sort is often used in educational settings to teach sorting concepts, algorithm analysis, and complexity due to its simplicity and easy-to-understand logic.\n\n<strong>Small Data Sets:</strong> For very small lists (e.g., fewer than 10 elements), Bubble Sort can be sufficient because the overhead of more complex sorting algorithms may not be worth it.\n\n<strong>Nearly Sorted Data:</strong> If the data is already almost sorted, Bubble Sort performs efficiently in O(n) time, making it useful when only a few elements are out of place.",
        limitation: "<strong>High Time Complexity:</strong> Bubble Sort has a worst-case and average-case time complexity of O(n²), making it inefficient for large datasets compared to algorithms like Quick Sort (O(n log n)).\n\n<strong>Unnecessary Comparisons and Swaps:</strong> Even if the list is partially sorted, Bubble Sort still makes unnecessary comparisons and swaps, leading to inefficiency.\n\n<strong>Not Suitable for Large Datasets:</strong> Due to its quadratic time complexity, Bubble Sort becomes extremely slow for large arrays, making it impractical in real-world applications."
    },
    selection: {
        worst: "O(n²)",
        average: "O(n²)",
        best: "O(n²)",
        space: "O(1)",
        desc: "Definition: Selection Sort repeatedly finds the smallest element and moves it to the sorted part.",
        define: "Imagine you have a messy pile of playing cards, and you want to arrange them in order from smallest to largest.\n\n Here’s how Selection Sort works:\n\n<b><strong> Look through all the cards and find the smallest one.</b>\n\n<b> Swap it with the first card in the pile.</b>\n\n<b> Now, ignore the first card (since it's in the correct place) and look at the remaining cards.</b>\n\n<b> Find the next smallest card and swap it with the second card.</b>\n\n<b> Keep repeating this process until all cards are in order.</b></strong>",
        fact: "<strong>Simple but Inefficient:</strong> Selection Sort is easy to understand and implement but has a time complexity of O(n²), making it inefficient for large datasets.\n\n<b><strong> Works by Finding the Minimum:</b></strong> It repeatedly selects the smallest element from the unsorted part and swaps it with the first unsorted element, gradually sorting the array.\n\n<b><strong> Fewer Swaps Compared to Bubble Sort:</b></strong> Unlike Bubble Sort, which swaps adjacent elements multiple times, Selection Sort swaps only n - 1 times, making it better when swap operations are costly.",
        useCase: "<strong><b> Sorting Small Data Sets:</b></strong> Selection Sort works well for small arrays where the simplicity of the algorithm outweighs its inefficiency.\n\n<b><strong> When Swaps Are Costly:</b></strong> Since Selection Sort makes only O(n) swaps, it is useful when swapping elements is expensive.\n\n<b><strong> Teaching Sorting Concepts:</b></strong> It is commonly used in education to teach sorting algorithms due to its simple logic and step-by-step approach.",
        limitation: "<b><strong> High Time Complexity:</strong></b> Selection Sort has a time complexity of O(n²) in both worst and average cases, making it inefficient for large datasets.\n\n<b><strong> Not Stable:</strong></b> Selection Sort is not a stable sorting algorithm, meaning it can change the relative order of elements with the same value.\n\n<strong><b> Inefficient for Nearly Sorted Data:</b></strong> Unlike Insertion Sort, which performs well on nearly sorted data, Selection Sort still takes O(n²) time regardless of order."
    },
    insertion: {
        worst: "O(n²)",
        average: "O(n²)",
        best: "O(n)",
        space: "O(1)",
        desc: "Definition: Insertion Sort builds a sorted array one element at a time by picking the next element and placing it in the correct position.",
        define:"Imagine you are arranging playing cards in your hand one by one.\n\nHere's how Insertion Sort works:\n\n<strong> Take the second card and compare it with the first. If it's smaller, move it before the first card.\n\n Take the third card and insert it into its correct position among the first two.\n\n Keep picking the next card and placing it in its proper position among the sorted ones.\n\n Repeat until all the cards are in order</strong>",
        fact:"<strong><b> Efficient for Small or Nearly Sorted Data:</b></strong> Insertion Sort performs well on small arrays and almost sorted data, with a best-case time complexity of O(n) when the input is nearly sorted.\n\n<strong><b> Works Like Sorting Playing Cards </strong></b> It builds the sorted array one element at a time, picking each item and inserting it into its correct position.\n\n<strong><b> Stable Sorting Algorithm:</strong></b> Insertion Sort maintains the relative order of equal elements, making it a stable sort (useful in certain applications).\n\n<strong><b> In-Place Sorting:</strong></b> It does not require extra memory, as it sorts the array by shifting elements within the same list (space complexity O(1)).\n\n<strong><b> Inefficient for Large Data Sets:</strong></b>Due to its O(n²) worst and average case time complexity, it is impractical for sorting large lists compared to Merge Sort or Quick Sort.",
        useCase:"<strong><b> Sorting Small Data Sets:</strong></b> Insertion Sort is efficient for small lists due to its simple implementation and low overhead.\n\n<strong><b> Nearly Sorted Data:</strong></b> If the input is almost sorted, Insertion Sort runs in O(n) time, making it much faster than other quadratic sorting algorithms.\n\n<strong><b> Online Sorting:</strong></b> It is useful when data is received one element at a time, as it can insert new elements into a sorted list dynamically.\n\n<strong><b> Teaching Purposes:</strong></b> Insertion Sort is widely used in computer science education to introduce sorting concepts due to its intuitive, step-by-step approach.\n\n<strong><b> Used in Hybrid Sorting Algorithms:</strong></b> More advanced sorting algorithms like Timsort use Insertion Sort for small subarrays because it performs better than Quick Sort on tiny datasets.",
        limitation:"<strong><b> High Time Complexity:</strong></b> Insertion Sort has a worst-case and average-case time complexity of O(n²), making it inefficient for large datasets.\n\n<strong><b> Not Suitable for Large Data:</strong></b> Due to its quadratic time complexity, it is not practical for sorting big lists compared to Quick Sort (O(n log n)) or Merge Sort.\n\n<strong><b> Too Many Shifts in Worst Case:</strong></b> If the input is reverse sorted, every element needs to be shifted, leading to a high number of data movements and slowing down the process.\n\n<strong><b> Not Cache Efficient:</strong></b> Since it shifts elements frequently, it doesn’t take full advantage of CPU caching compared to more optimized algorithms like Merge Sort.\n\n<strong><b> Slower than Merge Sort & Quick Sort:</strong></b> For larger datasets, sorting algorithms like Merge Sort, Quick Sort, and Heap Sort are significantly faster due to their better time complexity."
    },
    merge: {
        worst: "O(n log n)",
        average: "O(n log n)",
        best: "O(n log n)",
        space: "O(n)",
        desc: "Definition: Merge Sort is a divide-and-conquer algorithm that splits the array into halves, sorts them recursively, and merges the sorted halves.",
        define:"Imagine you have a messy pile of papers, and you want to organize them.\n\nInstead of sorting everything at once, you:\n\n<strong><b> Split the pile into two smaller piles.\n\n Keep splitting each pile in half until each pile has just one paper.\n\n Now, start merging the small piles back together in sorted order.\n\n Continue merging until all the papers are back in one sorted pile.</strong></b>",
        fact:"<strong><b> Uses Divide and Conquer:</strong></b> Merge Sort splits the array into smaller parts, sorts them individually, and then merges them back together in order.\n\n<strong><b> Time Complexity is Always O(n log n):</strong></b> Unlike Quick Sort, whose worst-case can be O(n²), Merge Sort consistently runs in O(n log n) time, making it predictable and efficient.\n\n<strong><b> Stable Sorting Algorithm:</strong></b> Merge Sort maintains the relative order of equal elements, making it useful for cases where stability matters (e.g., sorting names by last name while keeping first name order).\n\n<strong><b> Requires Extra Space:</strong></b> Unlike Quick Sort (which sorts in place), Merge Sort requires O(n) extra memory to store temporary subarrays while merging, making it less suitable for memory-limited systems.\n\n<strong><b> Performs Well on Large Datasets:</strong></b> Because of its consistent O(n log n) time complexity, Merge Sort is widely used for sorting linked lists, external sorting (e.g., large files on disk), and parallel computing.",
        useCase:"<strong><b> Sorting Large Data Sets:</strong></b> Merge Sort is efficient for large datasets due to its consistent O(n log n) time complexity, making it suitable for big data applications.\n\n<strong><b> Sorting Linked Lists:</strong></b> Unlike Quick Sort, Merge Sort is well-suited for linked lists since it doesn't require random access and works efficiently with pointers.\n\n<strong><b> External Sorting (Disk-Based Sorting):</strong></b> When sorting large files that don't fit into RAM, Merge Sort is used in external sorting algorithms, as it processes data in chunks.\n\n<strong><b> Stable Sorting in Databases:</strong></b> Since Merge Sort maintains the relative order of equal elements, it is used in databases where stability is important for multi-field sorting.\n\n<strong><b> Parallel Sorting:</strong></b> Merge Sort can be easily adapted for parallel computing, where different parts of the list can be sorted simultaneously and then merged, improving performance.",
        limitation:"<strong><b> High Memory Usage:</strong><b> Merge Sort requires O(n) extra space for temporary arrays, making it inefficient for memory-constrained systems compared to in-place sorting algorithms like Quick Sort.\n\n<strong><b> Slower for Small Data Sets:</strong></b> For small arrays, simpler algorithms like Insertion Sort often perform better due to lower overhead.\n\n<strong><b> Recursive Overhead:</strong></b> Merge Sort uses recursion, which can lead to stack overflow for very large datasets in languages with limited recursion depth (e.g., C, C++).\n\n<strong><b> More Comparisons and Moves:</strong></b> Compared to Quick Sort, Merge Sort does more data movements, making it slower in practical scenarios where in-place sorting is preferred.\n\n<strong><b> Not In-Place:</strong></b> Merge Sort doesn’t sort the array within the original structure; instead, it requires additional memory to store subarrays during merging, unlike Quick Sort or Heap Sort."
    },
    quick: {
        worst: "O(n²)",
        average: "O(n log n)",
        best: "O(n log n)",
        space: "O(log n)",
        desc: "Quick Sort picks a pivot and partitions the array into smaller and larger elements, recursively sorting the partitions.",
        define:"Imagine you have a messy pile of books, and you want to sort them.\n\n Instead of sorting all at once, you:\n\n<strong><b> Pick a random book (called the pivot).\n\n Move all smaller books to the left and larger books to the right.\n\n Now, repeat the process for the left and right piles separately.\n\n Keep doing this until every book is in the correct position.</strong></b>",
        fact:"<strong><b> Uses Divide and Conquer:</strong></b> Quick Sort splits the array into smaller parts around a pivot element, then sorts each part independently.\n\n<strong><b> Fastest Sorting Algorithm in Practice:</strong></b> With an average-case time complexity of O(n log n), Quick Sort is faster than Merge Sort and Heap Sort for most real-world cases.\n\n<strong><b> In-Place Sorting Algorithm:</strong></b> Unlike Merge Sort, Quick Sort does not require extra space (except for recursion), making it memory-efficient.\n\n<strong><b> Worst-Case Can Be O(n²):</strong></b> If the pivot is chosen poorly (e.g., always the smallest or largest element in a sorted array), Quick Sort degrades to O(n²), but using randomized pivot selection helps avoid this.\n\n<strong><b> Widely Used in Libraries:</strong></b> Quick Sort is commonly used in standard libraries, such as C’s qsort(), Python’s sorted(), and Java’s Arrays.sort() (for primitive types)",
        useCase:"<strong><b> Large Data Sorting:</strong></b> Quick Sort is one of the fastest sorting algorithms for large datasets, commonly used in databases and big data applications.\n\n<strong><b> Sorting in Programming Libraries:</strong></b> Many programming languages use Quick Sort (or its variations) for built-in sorting functions, such as C’s qsort(), Python’s sorted(), and Java’s Arrays.sort() (for primitive types).\n\n<strong><b> In-Place Sorting:</strong></b> Since Quick Sort does not require extra memory like Merge Sort, it is used in systems where memory efficiency is critical.\n\n<strong><b> Distributed and Parallel Computing:</strong></b> Quick Sort can be easily parallelized, making it useful for multi-threaded and distributed sorting algorithms.\n\n<strong><b> Search-Optimized Applications:</strong></b> Quick Sort is used in applications like search engines where sorting is needed for efficient lookups (e.g., sorting indexed data for binary search).",
        limitation:"<strong><b> Worst-Case Time Complexity of O(n²):</strong></b> If the pivot is poorly chosen (e.g., always the smallest or largest element in a sorted array), Quick Sort can degrade to O(n²). However, using randomized or median-of-three pivot selection helps avoid this.\n\n<strong><b> Not Stable:</strong></b> Quick Sort is not a stable sorting algorithm, meaning it does not preserve the relative order of equal elements, unlike Merge Sort.\n\n<strong><b> Recursive Overhead:</strong></b> Quick Sort is a recursive algorithm, which may lead to stack overflow for very large datasets if not optimized (e.g., by using tail recursion elimination).\n\n<strong><b> Performs Poorly on Nearly Sorted Data:</strong></b> If the array is already sorted, Quick Sort may perform badly without optimizations like randomized pivoting or three-way partitioning.\n\n<strong><b> Not Always the Best Choice for Small Data Sets:</strong></b> For small arrays, simpler algorithms like Insertion Sort often outperform Quick Sort due to lower overhead."
    }
};

// Complexities define end




function generateArray() {
    const container = document.getElementById("array-container");
    container.innerHTML = "";
    array = [];

    for (let i = 0; i < 10; i++) {
        let num = Math.floor(Math.random() * 100) + 1;
        array.push(num);
        let numDiv = document.createElement("div");
        numDiv.classList.add("num");
        numDiv.innerText = num;
        container.appendChild(numDiv);
    }
}

function setUserArray() {
    const input = document.getElementById("user-input").value;
    array = input.split(",").map(num => parseInt(num.trim()));

    if (array.some(isNaN)) {
        alert("Invalid input! Enter numbers separated by commas.");
        return;
    }

    const container = document.getElementById("array-container");
    container.innerHTML = "";
    array.forEach(num => {
        let numDiv = document.createElement("div");
        numDiv.classList.add("num");
        numDiv.innerText = num;
        container.appendChild(numDiv);
    });
}

// Sorting start function start
// Sorting start function
async function startSorting() {
    const method = document.getElementById("sorting-method").value;
    
    if (method) {
        const complexity = complexities[method];
        
        document.getElementById("worst-time").innerText = `Worst Time Complexity: ${complexity.worst}`;
        document.getElementById("average-time").innerText = `Average Time Complexity: ${complexity.average}`;
        document.getElementById("best-time").innerText = `Best Time Complexity: ${complexity.best}`;
        document.getElementById("space-complexity").innerText = `Space Complexity: ${complexity.space}`;
        document.getElementById("algorithm-description").innerText = complexity.desc;
        
        document.getElementById("define").innerHTML = formatText(complexity.define);
        document.getElementById("facts").innerHTML = formatText(complexity.fact);
        document.getElementById("use").innerHTML = formatText(complexity.useCase);
        document.getElementById("limitation").innerHTML = formatText(complexity.limitation);
    }

    if (method === "bubble") await bubbleSort();
    else if (method === "selection") await selectionSort();
    else if (method === "insertion") await insertionSort();
    else if (method === "merge") await mergeSort(0, array.length - 1);
    else if (method === "quick") await quickSort(0, array.length - 1);
}

// Function to format the text with subheadings
function formatText(text) {
    return text.replace(/(\d+\.\s)(.*?)(\n|$)/g, (match, num, title, end) => {
        return `<strong>${num}${title}</strong>${end}`;
    }).replace(/\n/g, '<br>');
}

// CSS for styling
const style = document.createElement('style');
style.innerHTML = `
    strong {
        color:rgb(54, 215, 89);
        font-size: 1.1em;
    }
`;
document.head.appendChild(style);

// Sorting start function end



// Bubble Sort
async function bubbleSort() {
    let elements = document.querySelectorAll(".num");
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            elements[j].classList.add("active");
            elements[j + 1].classList.add("active");
            await delay();


            if (array[j] > array[j + 1]) {
                elements[j].classList.remove("active");
                elements[j + 1].classList.remove("active");
                elements[j].classList.add("swap");
                elements[j + 1].classList.add("swap");

                [array[j], array[j + 1]] = [array[j + 1], array[j]];
                elements[j].innerText = array[j];
                elements[j + 1].innerText = array[j + 1];

                await delay();

            }

            elements[j].classList.remove("swap", "active");
            elements[j + 1].classList.remove("swap", "active");
        }
        elements[array.length - i - 1].classList.add("sorted");
    }
}

// Selection Sort
async function selectionSort() {
    let elements = document.querySelectorAll(".num");
    for (let i = 0; i < array.length - 1; i++) {
        let minIndex = i;
        elements[minIndex].classList.add("active");

        for (let j = i + 1; j < array.length; j++) {
            elements[j].classList.add("active");
            await delay();


            if (array[j] < array[minIndex]) {
                elements[minIndex].classList.remove("active");
                minIndex = j;
                elements[minIndex].classList.add("active");
            }

            elements[j].classList.remove("active");
        }

        [array[i], array[minIndex]] = [array[minIndex], array[i]];
        elements[i].innerText = array[i];
        elements[minIndex].innerText = array[minIndex];

        elements[minIndex].classList.remove("active");
        elements[i].classList.add("sorted");
    }
}

// Insertion Sort
async function insertionSort() {
    let elements = document.querySelectorAll(".num");
    for (let i = 1; i < array.length; i++) {
        let key = array[i];
        elements[i].classList.add("active");
        let j = i - 1;

        while (j >= 0 && array[j] > key) {
        elements[j + 1].innerText = array[j];
            array[j + 1] = array[j];
            j--;
            await delay();

        }
        array[j + 1] = key;
        elements[j + 1].innerText = key;
        elements[j + 1].classList.add("sorted");
    }
}

// Merge Sort 
async function mergeSort(start, end) {
    if (start >= end) {
        return;
    }
    
    const mid = Math.floor((start + end) / 2);

    await mergeSort( start, mid);
    await mergeSort( mid + 1, end);
    await merge( start, mid, end);

}

async function merge( start, mid, end) {
    const leftArray = [];
    const rightArray = [];
    const elements = document.querySelectorAll(".num");

    for (let i = start; i <= mid; i++) {
        leftArray.push(array[i]);

    }
    for (let i = mid + 1; i <= end; i++) {
        rightArray.push(array[i]);
 
    }
       

    await delay();


    let i = 0, j = 0, k = start;

    while (i < leftArray.length && j < rightArray.length) {
        if (leftArray[i] <= rightArray[j]) {
            array[k] = leftArray[i];
            elements[k].innerText = array[k];
            elements[k].classList.remove("left");
            elements[k].classList.add("active","swap");
            await delay();

            elements[k].classList.remove("active","swap");
            i++;
        } else {
            array[k] = rightArray[j];
            elements[k].innerText = array[k];
            elements[k].classList.remove("right");
            elements[k].classList.add("active","swap");
            await delay();

            elements[k].classList.remove("active","swap");

            j++;
        }
        elements[k].classList.add("merge");
        await delay();

        elements[k].classList.remove("merge");
        elements[k].classList.add("merge");
        k++;
    }

    while (i < leftArray.length) {
        array[k] = leftArray[i];
        elements[k].innerText = array[k];
        elements[k].classList.remove("left");
        elements[k].classList.add("merge");
        elements[k].classList.add("active");
        await delay();

        elements[k].classList.remove("merge");
        elements[k].classList.remove("active");
        i++;
        k++;
    }

    while (j < rightArray.length) {
        array[k] = rightArray[j];
        elements[k].innerText = array[k];
        elements[k].classList.remove("right");
        elements[k].classList.add("merge");
        await delay();

        elements[k].classList.remove("merge");
        j++;
        k++;
    }
    let sorti = 0;
    
}

// Quick Sort
async function quickSort( low, high) {
    if (low < high) {
        const pi = await partition(low, high);
        await quickSort( low, pi - 1);
        await quickSort( pi + 1, high);
    }
}

async function partition(low, high) {
    const pivot = array[high];
    const elements = document.querySelectorAll(".num");
    elements[high].classList.add("pivot");
    let i = low - 1;

    for (let j = low; j < high; j++) {
        elements[j].classList.add("active");
        await delay();


        if (array[j] <= pivot) {
            i++;
            [array[i], array[j]] = [array[j], array[i]];
            elements[i].innerText = array[i];
            elements[j].innerText = array[j];
            elements[i].classList.add("swap");
            elements[j].classList.add("swap");
            await delay();

            elements[i].classList.remove("swap");
            elements[j].classList.remove("swap");
        }

        elements[j].classList.remove("active");
    }

    [array[i + 1], array[high]] = [array[high], array[i + 1]];
    elements[i + 1].innerText = array[i + 1];
    elements[high].innerText = array[high];
    elements[i + 1].classList.add("swap","sorted");
    await delay();

    elements[i + 1].classList.remove("swap", "pivot");

    return i + 1;
}


// Utility Function: Sleep
function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

// Load a random array on page load
window.onload = generateArray;


// Footer tag line animatin start 

const dynamicText = document.getElementById("dynamic-text");
const text = "Meet the Team";
let index = 0;

function typeEffect() {
    if (index < text.length) {
        dynamicText.textContent += text.charAt(index);
        index++;
        setTimeout(typeEffect, 150);
    } else {
        setTimeout(() => {
            dynamicText.textContent = "";
            index = 0;
            typeEffect();
        }, 3000);
    }
}

typeEffect();

// Footer tagline end
