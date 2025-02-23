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

        if (speed > 300) {
            slider.style.accentColor = "red"; // High speed - Red
        } else if (speed > 100) {
            slider.style.accentColor = "green"; // Normal speed - Green
        } else {
            slider.style.accentColor = "skyblue"; // Slow speed - Sky Blue
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

async function startSorting() {
    const method = document.getElementById("sorting-method").value;

    if (method === "bubble") await bubbleSort();
    else if (method === "selection") await selectionSort();
    else if (method === "insertion") await insertionSort();
    else if (method === "merge") await mergeSort(0, array.length - 1);
    else if (method === "quick") await quickSort(0, array.length - 1);
    
}

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
