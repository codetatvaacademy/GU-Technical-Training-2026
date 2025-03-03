export const fetchSortedData = async (algorithm, numbers) => {
    try {
        console.log("API Request:", { algorithm, numbers });

        const response = await fetch("http://localhost:8080/sort", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({ algorithm, array: numbers }),
        });

        console.log("API Response Status:", response.status);

        if (!response.ok) {
            throw new Error(`Server Error: ${response.status}`);
        }

        const data = await response.json();
        console.log("API Response Data:", data);

        let steps = [];
        let arr = [...numbers].map((num) => ({ value: num, color: "skyblue" }));

        for (let i = 0; i < arr.length; i++) {
            let minIndex = i;
            for (let j = i + 1; j < arr.length; j++) {
                if (arr[j].value < arr[minIndex].value) minIndex = j;
            }
            [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
            steps.push([...arr.map((b, idx) => ({ ...b, color: idx === i || idx === minIndex ? "red" : "skyblue" }))]);
        }

        return { steps };
    } catch (error) {
        console.error("API Error:", error);
        return null;
    }
};