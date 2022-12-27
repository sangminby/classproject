import React from "react";

const styles = {
    wrapper : {
        margin:8,
        padding:8,
        display:'flax',
        flexDirection :'row',
        border : '1px solid gray',
        borderReadius : 16
    },

    messageText : {
        color : 'blue',
        fontSize : 24

    }

}

class Notification extends React.Component {

    constructor(props) {
        super(props)
        this.state = {checked : false};
    }

    componentDidMount() {
        const checkedVal = this.state.checked;
        console.log('componentDidMount () call !!', checkedVal)
        this.setState({checked : true})
    }

    componentDidUpdate() {
        const checkedVal = this.state.checked;
        console.log('componentDidMount () call !!', checkedVal)
    }

    componentDidUnmount() {
        const checkedVal = this.state.checked;
        console.log('componentDidMount () call !!', checkedVal)
    }

    render() {
        return (
            <div style={styles.wrapper}>
                <span style={styles.messageText}>{this.props.message}</span>
            </div>
        )
    }

}

export default Notification;