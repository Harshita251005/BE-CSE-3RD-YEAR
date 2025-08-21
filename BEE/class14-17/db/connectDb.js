const mongoose = require("mongoose");

async function connectDB() {
  console.log("DEBUG: process.env.DB_URL =", process.env.DB_URL);

  if (!process.env.DB_URL) {
    throw new Error(" DB_URL missing from .env or dotenv not loaded");
  }

  await mongoose.connect(process.env.DB_URL, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  });

  console.log(" DB connected");
}

module.exports = connectDB;
