import './GraphImage.css'

function GraphImage({Image}){
    return(
        <img id='Image-tag' src={Image} alt="Comparison Graph Image"/>
    );
}

export default GraphImage;