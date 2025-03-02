const array = [];
export function generateArray(arraysize) {
  for (let i = 0; i < arraysize; i++) {
    array.push(Math.floor(Math.random() * arraysize) + 1);
  }
  return array;
}

export function returnArray(){
  return array;
}
