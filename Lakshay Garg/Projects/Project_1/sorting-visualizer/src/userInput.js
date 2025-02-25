import setHight from "./components/barGeneration.js"
import "./components/Bars.css"

export default function newBar() {
    document.getElementById('submmit').onclick = function(){
        let hight = document.getElementById('array').value;
        console.log(hight);
        console.log(typeof(hight));
        setHight(hight);
    };
}
    