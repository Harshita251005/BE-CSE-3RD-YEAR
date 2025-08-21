const { formatDate, dateConverter } = require("./helper/date-converter");

let date = formatDate(new Date());
console.log("Formatted:", date);

let localDate = dateConverter(new Date());
console.log("Local:", localDate);

const fs = require("fs");

console.log(1);

// ---- Async Read ----
fs.readFile("./text.txt", "utf-8", (err, data) => {
  if (err) {
    console.log("Read Error:", err);
  } else {
    console.log("Async Read:", data);
  }
});

console.log(2);

// ---- Sync Read ----
try {
  const data = fs.readFileSync("./text.txt", "utf-8");
  console.log("Sync Read:", data);
} catch (err) {
  console.log("Sync Read Error:", err);
}

// ---- Append File ----
fs.appendFile("./text.txt", "\n hello again", (err) => {
  if (err) console.log("Append Error:", err);
  else console.log("Async Append done");
});

fs.appendFileSync("./text.txt", "\n this is pushed by sync");

// ---- Delete File ----
fs.unlink("./text.txt", (err) => {
  if (err) {
    console.log("Delete Error:", err);
  } else {
    console.log("File deleted");
  }
});
