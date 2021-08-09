import React, { useState, useEffect } from "react";
import axios from "axios";

const Images = () => {
  const [images, setImages] = useState([]);
  const fetchImages = () => {
    axios.get("http://localhost:8080/photos/all").then((res) => {
      setImages(res.data);
    });
  };

  useEffect(() => {
    fetchImages();
  }, []);

  return images.map((image, index) => {
      return (
          <div key={index}>
              <h1>{image.imageLink}</h1>
              <p>{image.uuid}</p>
          </div>
      );
  });
};

export default Images;
