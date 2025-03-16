import {useState} from 'react'

async function mergeSort(arr, setArray) {
  if (arr.length <= 1) return arr;

  const middle = Math.floor(arr.length / 2);
  const left = await mergeSort(arr.slice(0, middle), setArray);
  const right = await mergeSort(arr.slice(middle), setArray);

  return await merge(left, right, setArray);
}

async function merge(left, right, setArray) {
  let result = [], lIndex = 0, rIndex = 0;

  while (lIndex < left.length && rIndex < right.length) {
      if (left[lIndex] < right[rIndex]) {
          result.push(left[lIndex++]);
      } else {
          result.push(right[rIndex++]);
      }
      setArray([...result, ...left.slice(lIndex), ...right.slice(rIndex)]);
      await new Promise(resolve => setTimeout(resolve, 1000));
  }

  return [...result, ...left.slice(lIndex), ...right.slice(rIndex)];
}

const Merge = () => {
  const [array, setArray] = useState([]);
      const [size, setSize] = useState(5)
      const [element, setelement] = useState("")
    
      const handleSort = async () => {
        let arr = array.map(Number);
        const sortedArr = await mergeSort(arr, setArray);
        setArray(sortedArr);
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
    <h1>Merge Sort</h1>
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

export default Merge