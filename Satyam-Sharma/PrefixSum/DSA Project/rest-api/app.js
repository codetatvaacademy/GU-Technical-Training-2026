const express = require('express');
const app = express();
const userRoute = require('./api/routes/user');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');

app.use(cors())


mongoose.connect('mongodb+srv://ssaattyyaamm:qwertyuiop@gutech.lf4mp.mongodb.net/?retryWrites=true&w=majority&appName=gutech')
mongoose.connection.on('error', err => {
    console.log('failed connection');
})
mongoose.connection.on('connected', connectes => {
    console.log('connection established');
})

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.use('/user', userRoute);
app.use((req, res, next) => {
    res.status(404).json({
        message: 'URL Not found'
    })
})
module.exports = app;