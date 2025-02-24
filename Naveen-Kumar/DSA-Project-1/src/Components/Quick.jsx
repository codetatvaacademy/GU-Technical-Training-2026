import {useState} from 'react'

async function quickSort(arr, setArray, low = 0, high = arr.length - 1) {
  if (low < high) {
      let pivotIndex = await partition(arr, low, high, setArray);
      await quickSort(arr, setArray, low, pivotIndex - 1);
      await quickSort(arr, setArray, pivotIndex + 1, high);
  }
  return arr;
}

async function partition(arr, low, high, setArray) {
  let pivot = arr[high];
  let i = low - 1;
  for (let j = low; j < high; j++) {
      if (arr[j] < pivot) {
          i++;
          [arr[i], arr[j]] = [arr[j], arr[i]];
          setArray([...arr]);
          await new Promise(resolve => setTimeout(resolve, 400));
      }
  }
  [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
  setArray([...arr]);
  await new Promise(resolve => setTimeout(resolve, 1000));
  return i + 1;
}


const Quick = () => {

  const [array, setArray] = useState([]);
        const [size, setSize] = useState(5)
        const [element, setelement] = useState("")
      
        const handleSort = async () => {
          let arr = array.map(Number);
          await quickSort(arr, setArray);
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
    <h1>Quick Sort</h1>
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

export default Quick