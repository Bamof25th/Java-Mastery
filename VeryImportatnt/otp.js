function createOtp() {
  let otp = "";

  otp = Math.random().toFixed(4) * 10000;

  console.log(otp);
}

createOtp();
