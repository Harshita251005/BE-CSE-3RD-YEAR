// utils/otp-handler.js

let currentOTP = null; // in-memory store (resets if server restarts)

function otpGenerator(length = 6) {
  const digits = "0123456789";
  let otp = "";
  for (let i = 0; i < length; i++) {
    otp += digits[Math.floor(Math.random() * 10)];
  }
  currentOTP = otp;
  return otp;
}

function otpVerify(otp) {
  return otp === currentOTP;
}

module.exports = { otpGenerator, otpVerify };
