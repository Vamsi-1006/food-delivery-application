import React, { useState } from 'react'
import { Route, Routes } from 'react-router-dom';
import Addfood from './pages/Addfood/Addfood';
import Listfood from './pages/Listfood/Listfood';
import Sidebar from './components/Sidebar/Sidebar';
import Menubar from './components/Menubar/Menubar';
import Orders from './pages/Orders/Orders';
import { ToastContainer } from 'react-toastify';
const App = () => {
  const [sidebarVisible, setSidebarVisible] = useState(true);
  const toggleSidebar = () => {
    setSidebarVisible(!sidebarVisible);
  }
  return (
    <div className="d-flex" id="wrapper">
      <Sidebar sidebarVisible={sidebarVisible} />
      <div id="page-content-wrapper">
        <Menubar toggleSidebar={toggleSidebar} />
        <ToastContainer />
        <div className="container-fluid">
          <Routes>
            <Route path='/add' element={<Addfood />} />
            <Route path='/list' element={<Listfood />} />
            <Route path='/orders' element={<Orders />} />
            <Route path='/' element={<Listfood />} />
          </Routes>
        </div>
      </div>
    </div>
  )
}

export default App;