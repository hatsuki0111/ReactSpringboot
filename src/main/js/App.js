import React, {useState, useEffect} from 'react';
import axios from 'axios';
import EmployeeList from "./components/EmployeeList";

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {
        //Todo
        var url = 'http://localhost:8080/api/employees'; // リクエスト先URL
        axios.get(url)
            .then((response) => {
                var json = response.data._embedded.employees;
                this.setState({employees: json});
            });
    }

    render() {
        return (
            <EmployeeList employees={this.state.employees}/>
        )
    }
}

export default App;
