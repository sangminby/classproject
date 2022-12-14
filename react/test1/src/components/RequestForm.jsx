import React, { useState } from "react";

function RequestForm(props) {

    const [value, setValue] = useState('요청사항을 입력하세요!')

    const handleChange = (event) => {
        setValue(event.target.value)
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        alert('요청사항 : ' + value)
    }

    return (
        <form onSubmit={handleSubmit}>
            <label>
                요청사항 : 
                <textarea value={value} onChange={handleChange}/>
            </label>
            <br/>
            <button type="submit">제출</button>
        </form>
    )
}

export default RequestForm