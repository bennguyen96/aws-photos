import React, { useEffect } from 'react';
import axios from 'axios';

const Images = () => {

    const fetchImages = () => {
        axios.get("http://localhost:8080/photos/all").then(res => 
        console.log(res));
    };

    useEffect(() => {
        fetchImages();
    }, [])

    return <h1>test</h1>
};

export default Images;