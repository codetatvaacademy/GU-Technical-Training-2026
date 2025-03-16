import "./UpperRight";
import { Bar } from "react-chartjs-2";
import { useState, useEffect } from "react";
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend,
} from "chart.js";
ChartJS.register(
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend
);

const BarChart = ({ dataArray, firstIndex, secondIndex }) => {
  const [chartData, setChartData] = useState({
    labels: dataArray,
    datasets: [
      {
        label: "Array Data",
        data: dataArray,
        backgroundColor: dataArray.map((_, index) => 
          index === firstIndex || index === secondIndex  ? "rgba(153, 102, 255, 0.6)" :"rgba(75, 192, 192, 0.6)"
        ),
        borderColor: dataArray.map((_, index) => 
          index === firstIndex || index === secondIndex  ? "rgba(153, 102, 255, 0.6)" :"rgba(75, 192, 192, 0.6)"
        ),
        borderWidth: 1,
      },
    ],
    
  });

  useEffect(() => {
    setChartData({
      labels: dataArray,
      datasets: [
        {
          label: "Array Data",
          data: dataArray,
          backgroundColor: dataArray.map((_, index) => 
            index === firstIndex || index === secondIndex  ? "rgba(153, 102, 255, 0.6)" :"rgba(75, 192, 192, 0.6)"
          ),
          borderColor: dataArray.map((_, index) => 
            index === firstIndex || index === secondIndex  ? "rgba(153, 102, 255, 0.6)" :"rgba(75, 192, 192, 0.6)"
          ),
          borderWidth: 1,
        },
      ],
    });
  }, [dataArray]);
    const chartOptions = {
      responsive: true,
      plugins: {
        legend: {
          position: "top",
        },
        title: {
          display: true,
          text: "Sorting Data",
        },
      },
    };
  return <Bar data={chartData} options={chartOptions} />;
};

export {BarChart};