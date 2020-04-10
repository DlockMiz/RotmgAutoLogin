import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css'
import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";
import AccountForm from "./AccountForm/AccountForm";

function App() {
  return (
    <div>
        <Navbar bg="dark" variant="dark">
            <Navbar.Brand>Realm Login</Navbar.Brand>
            <Nav className="mr-auto">
                <Nav.Link>Home</Nav.Link>
                <Nav.Link>Accounts</Nav.Link>
                <Nav.Link>Calendar</Nav.Link>
            </Nav>
        </Navbar>
        <AccountForm/>
    </div>
  );
}

export default App;
