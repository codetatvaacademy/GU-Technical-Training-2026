import React, { Component } from 'react';
import { BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort } from './SortingAlgorithms';

class Graph extends Component {
    constructor(prop) {
        super(prop);
        this.state = {
            bar: [],
            currentSortingBars: [],
            isSorted: false,
            selectedAlgorithm: '',
            arraySize: 10
        };
    }

    generateRandomArray = () => {
        const { arraySize } = this.state;
        let newBar = Array.from({ length: arraySize }, () => Math.floor(Math.random() * 100) + 10);

        this.setState({ bar: newBar }, () => console.log("Generated array:", newBar));
    };

    updateGraph = (updatedState, selectedBars) => {
        this.setState({
            bar: updatedState,
            currentSortingBars: selectedBars
        });
    };

    resetGraph = () => {
        this.setState({ bar: [], currentSortingBars: [] });
    };

    handleSort = () => {
        const { selectedAlgorithm, bar } = this.state;
        if (!selectedAlgorithm) {
            alert("Please select a sorting algorithm first!");
            return;
        }

        const sortingAlgorithms = {
            BubbleSort,
            SelectionSort,
            InsertionSort,
            MergeSort,
            QuickSort
        };
        
        sortingAlgorithms[selectedAlgorithm]([...bar], this.updateGraph.bind(this));
    };

    render() {
        return (
            <div className='mainInput'>
                {}
                <h1 className="heading">SORTING VISUALIZER</h1>

                {}
                <input 
                    type='number' 
                    value={this.state.arraySize}
                    min="5" max="50"
                    onChange={(e) => this.setState({ arraySize: Number(e.target.value) })}
                    placeholder='Enter array size' 
                />
                <button onClick={this.generateRandomArray}>Generate Random Array</button>
                <hr />

                {}
                <select 
                    value={this.state.selectedAlgorithm} 
                    onChange={(e) => this.setState({ selectedAlgorithm: e.target.value })}
                >
                    <option value="" disabled>Select Algorithm</option>
                    <option value="BubbleSort">Bubble Sort</option>
                    <option value="SelectionSort">Selection Sort</option>
                    <option value="InsertionSort">Insertion Sort</option>
                    <option value="MergeSort">Merge Sort</option>
                    <option value="QuickSort">Quick Sort</option>
                </select>

                <button onClick={this.resetGraph}>Reset</button>
                <button onClick={this.handleSort}>Sort</button>

                {}
                <div className='MainGraph'>
                    {this.state.bar.map((height, index) => {
                        const selectionHighlight = this.state.currentSortingBars.includes(index);
                        return (
                            <div
                                key={index}
                                style={{
                                    height: `${height}px`,
                                    width: `40px`,
                                    borderRadius: `5px`,
                                    backgroundColor: selectionHighlight ? 'red' : 'greenyellow',
                                    transition: 'background-color 0.3s ease'
                                }}
                            ></div>
                        );
                    })}
                </div>
            </div>
        );
    }
}

export default Graph;