// App.js
//how to run
//how to add modules
// unit test
// reusable components
//eslint error : https://eslint.org/
// React lifecycle - render> state or prop change > destroy component

import React, { useState, useEffect } from 'react';
import './App.css'; // You can create this file for styling

const App = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await fetch('http://localhost:8083/api/fetch'); // Update with your Spring Boot API endpoint
      const result = await response.json();
      setData(result);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  return (
    <div className="App">
      <h1>Data Grid Example</h1>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name blah blah</th>
            {/* Add more columns based on your data structure */}
          </tr>
        </thead>
        <tbody>
          {data.map((item) => (
            <tr key={item.id}>
              <td>{item.id}</td>
              <td>{item.name}</td>
              {/* Add more cells based on your data structure */}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default App;
