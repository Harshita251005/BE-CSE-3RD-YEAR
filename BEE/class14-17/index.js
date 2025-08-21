require("dotenv").config({ path: __dirname + "/.env" }); // must be before connectDB is required

const express = require("express");
const connectDB = require("./db/connectDB");
const path = require("path");

const app = express();
const PORT = 4000;

const todoRouter = require("./routes/todo.routes");

app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, "public")));

app.use("/todo", todoRouter);

app.get("/", (req, res) => { });

connectDB()
  .then(() => {
    app.listen(PORT, () => {
      console.log(`Server is running on port ${PORT}`);
    });
  })
  .catch((error) => console.log(error));
