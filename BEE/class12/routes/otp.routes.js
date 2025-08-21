// routes/otp.routes.js
const express = require("express");
const router = express.Router();
const { otpGenerator, otpVerify } = require("../utils/otp-handler");  // ✅ fixed import

// Generate OTP
router.get("/generate", (req, res) => {
  try {
    let otp = otpGenerator(6); // generate 6-digit OTP
    res.status(200).json({ otp });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
});

// Verify OTP
router.post("/verify", (req, res) => {
  try {
    const { otp } = req.body;
    const isMatched = otpVerify(otp);

    if (isMatched) {
      return res.status(200).json({ message: "otp verified" });
    }

    // if OTP is not matched
    throw new Error("otp not matched");  // ✅ corrected error throwing
  } catch (error) {
    res.status(400).json({ message: error.message });
  }
});

module.exports = router;
