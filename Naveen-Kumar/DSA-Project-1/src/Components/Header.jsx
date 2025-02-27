
import { NavLink } from 'react-router'

const Header = () => {
  return (
    <div>
        <div className='navbar'>
          <h1>Visual Sort</h1>
        <div className='intro'>
          <h2>VISUALIZE SORT</h2>
          <p>Now Time to Visualize Sorting</p>
        </div>
      </div>

      <div id='sorting'>
          <h3>Sorting Algorithms</h3>
          <div className='start'>
            <NavLink to="/bubble"><button>Bubble sort</button></NavLink>
            <NavLink to="/selection"><button>Selection sort</button></NavLink>
            <NavLink to="/merge"><button>Merge sort</button></NavLink>
          </div>
          <div className='end'>
            <NavLink to="/quick"><button>Quick sort</button></NavLink>
            <NavLink to="/insertion"><button>Insertion sort</button></NavLink>
            <NavLink to="/heap"><button>Heap sort</button></NavLink>
          </div>
        </div>
    </div>
  )
}

export default Header