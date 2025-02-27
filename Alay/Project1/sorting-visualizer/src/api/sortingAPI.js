import axios from "axios";

export const sortArray = async (algorithm, array) => {
    try {
        const response = await axios.post("http://localhost:8080/sort", { 
            algorithm, 
            array 
        }, {
            headers: { "Content-Type": "application/json" }
        });

        console.log("Backend Response:", response.data);
        return response.data || [];
    } catch (error) {
        console.error("Sorting API Error:", error.response?.data || error.message);
        return [];
    }
};
