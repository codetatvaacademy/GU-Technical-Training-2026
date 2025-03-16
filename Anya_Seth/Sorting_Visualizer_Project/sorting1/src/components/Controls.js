import React from "react";

const Controls = ({ onSort, onRandomize, onPlay, onStop, speed, onSpeedUp, onSpeedDown }) => {
    return (
        <div className="flex space-x-4 mb-4">
            <button 
                onClick={onSort} 
                className="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-700 transition">
                Sort
            </button>

            <button 
                onClick={onPlay} 
                className="bg-green-500 text-white px-4 py-2 rounded-lg hover:bg-green-700 transition">
                Play
            </button>

            <button 
                onClick={onStop} 
                className="bg-red-500 text-white px-4 py-2 rounded-lg hover:bg-red-700 transition">
                Stop
            </button>

            <button 
                onClick={onSpeedUp} 
                className="bg-yellow-500 text-white px-4 py-2 rounded-lg hover:bg-yellow-700 transition">
                Speed Up ({speed}ms)
            </button>

            <button 
                onClick={onSpeedDown} 
                className="bg-purple-500 text-white px-4 py-2 rounded-lg hover:bg-purple-700 transition">
                Speed Down ({speed}ms)
            </button>
        </div>
    );
};

export default Controls;
