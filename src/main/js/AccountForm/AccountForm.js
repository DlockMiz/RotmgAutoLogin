import React, {Component} from 'react';
import './AccountForm.css'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import axios from 'axios'
import Account from '../Models/Account'

class AccountForm extends Component{
    state={
        username: '',
        password: ''
    }

    sendAcctInfo = () => {
        const account = new Account(this.state.username, this.state.password)
        axios.post('/submitAccount', account).then(res => {
            console.log(res.data)
        })
    }

    getLoginStatus = () => {
        const account = new Account(this.state.username, this.state.password)
        axios.get('/getLoginStatus').then(res => {
            console.log(res.data)
        })
    }

    deleteAll = () => {
        const account = new Account(this.state.username, this.state.password)
        axios.get('/deleteAll').then(res => {
            console.log(res.data)
        })
    }

    render()
    {
        return (
            <div>
                <div className="wrapper">
                    <Form>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Label>Email address</Form.Label>
                            <Form.Control value={this.state.username} onChange={event => this.setState({username: event.target.value})} type="email" placeholder="Enter email"/>
                        </Form.Group>

                        <Form.Group controlId="formBasicPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" value={this.state.password} onChange={event => this.setState({password: event.target.value})} placeholder="Password"/>
                        </Form.Group>
                    </Form>
                    <Button onClick={this.sendAcctInfo} variant="primary" type="submit">
                        Submit
                    </Button>
                    <Button onClick={this.getLoginStatus} variant="primary" type="submit">
                        Get Login Status
                    </Button>
                    <Button onClick={this.deleteAll} variant="primary" type="submit">
                        Delete All Accounts
                    </Button>
                </div>
            </div>
        );
    }
}

export default AccountForm;
