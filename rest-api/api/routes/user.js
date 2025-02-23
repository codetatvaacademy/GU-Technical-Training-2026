const express = require('express');
const router = express.Router();
const mongoose = require('mongoose');
const User = require('../model/user');
const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');
const checkAuth = require('../middleware/check-auth');

router.get('/',checkAuth, (req, res, next) => {
    User.find()
        .then(result => {
            res.status(200).json({ userData: result });
        })
        .catch(err => {
            res.status(500).json({ error: err });
        });
});

router.get('/:id', (req, res, next) => {
    User.findById(req.params.id)
        .then(result => {
            res.status(200).json({ userData: result });
        })
        .catch(err => {
            res.status(500).json({ error: err });
        });
});

router.post('/signup', (req, res, next) => {
    bcrypt.hash(req.body.password, 10, (err, hash) => {
        if (err) {
            return res.status(500).json({ error: err });
        }
        const newUser = new User({
            _id: new mongoose.Types.ObjectId(),
            name: req.body.name,
            password: hash,
            email: req.body.email,
            phone: req.body.phone
        });
        newUser.save()
            .then(result => {
                res.status(201).json({ newUser: result });
            })
            .catch(err => {
                res.status(500).json({ error: err });
            });
    });
});

router.post('/login',(req, res, next) => {
    User.find({ name: req.body.name })
        .exec()
        .then(user => {
            if (user.length < 1) {
                return res.status(401).json({ message: 'user not exist' });
            }
            bcrypt.compare(req.body.password, user[0].password, (err, result) => {
                if (!result) {
                    return res.status(401).json({ message: 'wrong password' });
                }
                if (result) {
                    const token = jwt.sign({
                        name: user[0].name,
                        email: user[0].email,
                        phone: user[0].phone

                    },
                        'this is a secret', {
                        expiresIn: '24h'
                        }
                    )
                    res.status(200).json({
                        name: user[0].name,
                        email: user[0].email,
                        phone: user[0].phone,
                        token: token
                    });
                }
            })
        })
        .catch(err => {
            res.status(500).json({ error: err });
        });
});

module.exports = router;
