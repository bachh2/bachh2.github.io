function radiusAndSize(a, b) {
  let c = (a + b) * 2;
  let d = a * b;
  console.log("Chu vi hình chữ nhật là " + c);
  console.log("Diện tích hình chữ nhật là " + d);
}

function radiusAndSizeCircle(a) {
  let c = a * 2 * 3.14;
  let d = a * a * 3.14;
  console.log("Chu vi hình tròn là " + c);
  console.log("Diện tích hình tròn là " + d);
}

function findX(a, b) {
  let c = (0 - b) / a;
  console.log("X là " + c);
}

function convertCm(a) {
  let b = a * 10;
  let c = a / 100;
  let d = a / 100000;
  console.log("Số mm là " + b);
  console.log("Số m là " + c);
  console.log("Số km là " + d);
}

function convertTemp(a) {
  let b = 32 + a * 1.8;
  let c = a + 273;
  console.log("Độ F " + b);
  console.log("Độ K " + c);
}
