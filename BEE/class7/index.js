// const express = require("express");
// const app = express();
// const PORT=4000;
// const {MongoClient} = require("mongodb");
// require("dotenv").config();

// app.use(express.json());

// const client = new MongoClient(process.env.DATABASE_URL);
// let userCollection;
// async function main(){
//   await client.connect();
//   const db = client.db("G24");
//   userCollection = db.collection("users");
//   return "done";
// }

// app.get("/user",async (req,res)=>{
//   try {
//     const {name,email} = req.query;
//     const result = await userCollection.insertOne({name,email});
//     res.status(201).json({result});
//   } catch (error) {
//     res.status(400).json({message:error.message})
//   }
// })

// app.post("/users",async (req,res)=>{
//   try {
//     const {users} = req.body;
//     const result = userCollection.insertMany(users);
//     res.status(201).json({result});
//   } catch (error) {
//     res.status(400).json({message:error.message})
//   }
// })

// app.delete("/user/:id",async(req,res)=>{
//   try {
//     const {id} = req.params;
//     const result = await userCollection.deleteOne({_id:id});
//     res.status(203).json({result,message:"user deleted successfully"});
//   } catch (error) {
//     res.status(400).json({message:error.message})
//   }
// })

// app.listen(PORT,()=>{
//   main().then(()=>console.log("db connected"))
//   .catch((err)=>console.log(err));
//   console.log(`server live on ${PORT}`);
// })



// //with comments

// require('dotenv').config(); // Load environment variables from .env file
// // This line should be at the top to ensure environment variables are loaded before any other code runs.
// // This code sets up a basic Express server that connects to a MongoDB database.
// const express = require("express");
// const app = express();
// const PORT = 4000;

// app.users(express.json()); // Middleware to parse JSON request bodies
// // This line should be before any route definitions to ensure the server can parse JSON data in requests.
// // It allows the server to handle incoming JSON data in requests, such as POST requests with user

// const { MongoClient } = require('mongodb');

// const client = new MongoClient(process.env.DATABASE_URL); // MongoDB connection string from environment variables.

// require('dotenv').config(); // Load environment variables from .env 

// let UserCollection;                             // MongoDB collection for users
// async function main() {                         // Connect to MongoDB and initialize the UserCollection
//     await client.connect();                     // Connect to the MongoDB server
//     const db = client.db("G24");                    // Use the database named "G24"
//     UserCollection = db.collection("users");      // Access the "users" collection
//     return "done";
//     }

// app.get("/user", async (req,res)=>{
//     try {
//         const {name, email} = req.query;
//     const result = await UserCollection.insertOne({name, email});
//     res.status(201).json({result});
//     } catch (error) {
//         res.status(400).json({message:error.message})}
//     })


// app.post("/users", async (req,res)=>{
//     try {
//         const {users} = req.body;
//     const result = UserCollection.insertMany(users);
//     res.status(201).json({result});
//     } catch (error) {
//         res.status(400).json({message:error.message})}
//     })

    

// app.listen (PORT,()=> {
//     console.log(Server is live on port ${PORT});
//     main().then(()=> console.log("db connected"))

//     .catch(err => console.error("Failed to connect to the database", err));
//     console.log('serve is live on port: ', PORT);
// })

// app.delete("/user/:id", async (req, res) => {
//     try{
//         const {id} = req.params; // Get the user ID from the request parameters
//         const result = await UserCollection.deleteOne({_id: id}); // Delete the user by ID
//         res.status(200).json({result,message: "User deleted successfully"}); // Respond with success message

//     }catch (error) {
//         res.status(400).json({message: error.message});} // Respond with error message if an error occurs
// });

// // This code sets up a basic Express server that connects to a MongoDB database and provides endpoints for user management.
// // It includes endpoints to create a user, add multiple users, and delete a user by ID
// // The server listens on port 4000 and connects to a MongoDB database named "G24".// The MongoDB connection string is stored in an environment variable named DATABASE_URL.
// // The server uses JSON middleware to parse incoming requests and handle user data in JSON format.// The server also handles errors gracefully by responding with appropriate status codes and messages.