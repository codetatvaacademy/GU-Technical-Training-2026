import { useState } from 'react';

async function heapSort(arr, setArray) {
  let n = arr.length;

  for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
      await heapify(arr, n, i, setArray);
  }

  for (let i = n - 1; i > 0; i--) {
      [arr[0], arr[i]] = [arr[i], arr[0]];
      setArray([...arr]);
      await new Promise(resolve => setTimeout(resolve, 1000));
      await heapify(arr, i, 0, setArray);
  }
  return arr;
}

async function heapify(arr, n, i, setArray) {
  let largest = i;
  let left = 2 * i + 1;
  let right = 2 * i + 2;

  if (left < n && arr[left] > arr[largest]) {
      largest = left;
  }

  if (right < n && arr[right] > arr[largest]) {
      largest = right;
  }

  if (largest !== i) {
      [arr[i], arr[largest]] = [arr[largest], arr[i]];
      setArray([...arr]);
      await new Promise(resolve => setTimeout(resolve, 1000));
      await heapify(arr, n, largest, setArray);
  }
}

const Heap = () => {

   const [array, setArray] = useState([]);
            const [size, setSize] = useState(5)
            const [element, setelement] = useState("")
          
            const handleSort = async () => {
              let arr = array.map(Number);
              await heapSort(arr, setArray);
              setArray(arr);
          };
          
            const handleGenerateArray = () => {
              const newArray = element.split(',').map(num => parseInt(num.trim(), 10)).filter(num => !isNaN(num));
              console.log(newArray,newArray.length)
              if (newArray.length == size) {
                setArray(newArray);
              } else {
                console.log(newArray)
                alert(`Please enter exactly ${size} numbers.`);
              }
            };

  return (
    <>
    <div className="main">
    <h1>Heap Sort</h1>
      <div className='size'>
        <div className='arr_size'>
          <h2>Enter the Size of Array</h2>
          <input type="number" id="size_arr" name="size" value={size}placeholder='Size of Array' onChange={((e) => {
            setSize(e.target.value)
          })} />
        </div>
        <div className='elements'>
          <h2>Enter Array Elements</h2>
          <input id="size_arr" name="size" placeholder='Size of Array' value={element} onChange={((e) => {
            setelement(e.target.value)
          })} />
        </div>
      </div>
      <div className='btn'>
        <input type="button" value="Set Array" className='submit' onClick={handleGenerateArray} />
        <input type="button" value="Sort" className='submit' onClick={handleSort} />
      </div>

      <div id = "chart" style={{ display: 'flex', alignItems: 'flex-end', height: '300px', gap: '10px', marginTop: '20px' }}>
              {array.map((value, index) => (
                  <div key={index} id="inner" >
                    <div style={{ width: '45px', height: `${value * 3}px`, backgroundColor: 'blue', textAlign: 'center', color: 'white', transition: 'height 0.5s ease-in-out' }}>
                    </div>
                      {value}
                  </div>
              ))}
          </div>
    </div>
  </>
  )
}

export default Heap