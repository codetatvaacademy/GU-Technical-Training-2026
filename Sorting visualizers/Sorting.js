document.addEventListener("DOMContentLoaded", () => {
    const arrayInput = document.getElementById("ArrayInput");
    const buildArrayBtn = document.getElementById("BuildArray");
    const barsContainer = document.getElementById("Bars");
    const sortBtn = document.getElementById("SortBtn");
    const algorithmSelect = document.getElementById("Algorithm");

    let array = [];
    const delayTime = 500; 

    function generateBars() {
        barsContainer.innerHTML = "";
        array.forEach((value) => {
            const bar = document.createElement("div");
            bar.classList.add("bar");
            bar.style.height = `${value * 3}px`;
            barsContainer.appendChild(bar);
        });
    }

    buildArrayBtn.addEventListener("click", () => {
        const input = arrayInput.value.trim();
        if (!input) {
            alert("Please enter numbers separated by commas.");
            return;
        }

        array = input.split(",").map(num => parseInt(num.trim(), 10)).filter(num => !isNaN(num));

        if (array.length === 0) {
            alert("Invalid input. Please enter numbers.");
            return;
        }

        generateBars();
    });

    sortBtn.addEventListener("click", async () => {
        const algorithm = algorithmSelect.value;
        if (algorithm === "1") await bubbleSort();
        else if (algorithm === "2") await selectionSort();
        else if (algorithm === "3") await insertionSort();
        else if (algorithm === "4") await mergeSort(0, array.length - 1);
        else if (algorithm === "5") await quickSort(0, array.length - 1);
        generateBars();
    });

    function delay() {
        return new Promise(resolve => setTimeout(resolve, delayTime));
    }

    async function bubbleSort() {
        let bars = document.querySelectorAll(".bar");
        for (let i = 0; i < array.length - 1; i++) {
            for (let j = 0; j < array.length - i - 1; j++) {
                bars[j].style.backgroundColor = "#F4D03F";
                bars[j + 1].style.backgroundColor = "#F4D03F";
                await delay();

                if (array[j] > array[j + 1]) {
                    [array[j], array[j + 1]] = [array[j + 1], array[j]];
                    bars[j].style.height = `${array[j] * 3}px`;
                    bars[j + 1].style.height = `${array[j + 1] * 3}px`;
                }

                bars[j].style.backgroundColor = "white";
                bars[j + 1].style.backgroundColor = "white";
            }
            bars[array.length - i - 1].style.backgroundColor = "#27AE60";
        }
        bars[0].style.backgroundColor = "#27AE60";
    }

    async function selectionSort() {
        let bars = document.querySelectorAll(".bar");
        for (let i = 0; i < array.length - 1; i++) {
            let minIndex = i;
            bars[i].style.backgroundColor = "#FF5733";

            for (let j = i + 1; j < array.length; j++) {
                bars[j].style.backgroundColor = "#F4D03F";
                await delay();

                if (array[j] < array[minIndex]) {
                    bars[minIndex].style.backgroundColor = "white";
                    minIndex = j;
                    bars[minIndex].style.backgroundColor = "#FF5733";
                }
                bars[j].style.backgroundColor = "white";
            }

            if (minIndex !== i) {
                [array[i], array[minIndex]] = [array[minIndex], array[i]];
                bars[i].style.height = `${array[i] * 3}px`;
                bars[minIndex].style.height = `${array[minIndex] * 3}px`;
            }
            bars[i].style.backgroundColor = "#27AE60";
            await delay();
        }
        bars[array.length - 1].style.backgroundColor = "#27AE60";
    }

    async function insertionSort() {
        let bars = document.querySelectorAll(".bar");
        for (let i = 1; i < array.length; i++) {
            let key = array[i];
            let j = i - 1;
            bars[i].style.backgroundColor = "#FF5733";
            await delay();

            while (j >= 0 && array[j] > key) {
                bars[j + 1].style.height = `${array[j] * 3}px`;
                array[j + 1] = array[j];
                j--;
                bars[j + 1].style.backgroundColor = "#F4D03F";
                await delay();
            }
            array[j + 1] = key;
            bars[j + 1].style.height = `${key * 3}px`;
            bars[i].style.backgroundColor = "white";
        }
        bars.forEach(bar => bar.style.backgroundColor = "#27AE60");
    }

    async function mergeSort(start, end) {
        if (start >= end) return;
        let mid = Math.floor((start + end) / 2);
        await mergeSort(start, mid);
        await mergeSort(mid + 1, end);
        await merge(start, mid, end);
    }

    async function merge(start, mid, end) {
        let bars = document.querySelectorAll(".bar");
        let left = array.slice(start, mid + 1);
        let right = array.slice(mid + 1, end + 1);

        let i = 0, j = 0, k = start;
        while (i < left.length && j < right.length) {
            bars[k].style.backgroundColor = "#F4D03F";
            await delay();

            if (left[i] < right[j]) {
                array[k] = left[i++];
            } else {
                array[k] = right[j++];
            }

            bars[k].style.height = `${array[k] * 3}px`;
            bars[k].style.backgroundColor = "#27AE60";
            k++;
        }

        while (i < left.length) {
            bars[k].style.backgroundColor = "#F4D03F";
            await delay();
            array[k] = left[i++];
            bars[k].style.height = `${array[k] * 3}px`;
            bars[k].style.backgroundColor = "#27AE60";
            k++;
        }

        while (j < right.length) {
            bars[k].style.backgroundColor = "#F4D03F";
            await delay();
            array[k] = right[j++];
            bars[k].style.height = `${array[k] * 3}px`;
            bars[k].style.backgroundColor = "#27AE60";
            k++;
        }
    }

    async function quickSort(start, end) {
        if (start >= end) return;
        let pivotIndex = await partition(start, end);
        await quickSort(start, pivotIndex - 1);
        await quickSort(pivotIndex + 1, end);
    }

    async function partition(start, end) {
        let bars = document.querySelectorAll(".bar");
        let pivotValue = array[end];
        let pivotIndex = start;

        bars[end].style.backgroundColor = "#FF5733";
        await delay();

        for (let i = start; i < end; i++) {
            bars[i].style.backgroundColor = "#F4D03F";
            await delay();

            if (array[i] < pivotValue) {
                [array[i], array[pivotIndex]] = [array[pivotIndex], array[i]];
                bars[i].style.height = `${array[i] * 3}px`;
                bars[pivotIndex].style.height = `${array[pivotIndex] * 3}px`;
                pivotIndex++;
            }

            bars[i].style.backgroundColor = "white";
        }

        [array[pivotIndex], array[end]] = [array[end], array[pivotIndex]];
        bars[pivotIndex].style.height = `${array[pivotIndex] * 3}px`;
        bars[end].style.height = `${array[end] * 3}px`;

        bars[end].style.backgroundColor = "white";
        bars[pivotIndex].style.backgroundColor = "#27AE60";
        return pivotIndex;
    }
});
