function sumAvg(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
  }
  let avg = sum / arr.length;
  return avg;
}

function findMax(arr) {
  let max = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (max < arr[i]) {
      max = arr[i];
    }
  }  
  return max;
}

function fibonacci(n) {
  if (n == 1) {
    let arr = [1];
    return arr;
  }
  else if (n == 2) {
    let arr = [1,1];
    return arr;
  }
  else if (n > 2) {
    let arr = [1, 1];
    for (let i = 2; i < n; i++){
      let temp = arr[i - 1] + arr[i - 2];
      arr.push(temp);
    }
    return arr;
  }
}

function removeFalsy(arr) {
  let temp =[];
  for (let i = 0; i < arr.length; i++){
    if (Boolean(arr[i]) == true) {
      temp.push(arr[i]);
    }
  }
  return temp;
}

function sortByColumn(arr, col) {
  
}

function double(arr) {
  let temp = [];
  for (let i = 0; i < arr.length; i++){
    let tempDouble = arr[i] * arr[i];
    temp.push(tempDouble);
  }
  return temp;
}

function capitalize(str) {
  let temp = "";
  temp.concat(str.charAt(0).toUpperCase());
  for (let i = i; i < str.length(); i++){
    if (str.charAt(i - 1) == ' ') {
      temp.concat(str.charAt(i).toUpperCase());
    } else {
      temp.concat(str.charAt(i));
    }
  }
  return temp;
}

function randItem(arr) {
  let rand = Math.floor(Math.random() * (arr.length - 0));
  return arr[rand];
}
