import React from "react";
import FancyBoarder from "./FancyBoarder";

function Dialog(props) {

    return (
        <FancyBoarder color="blue">
            <h1>{props.title}</h1>
            <p>{props.message}</p>
            {props.children}
        </FancyBoarder>
    )
}

export default Dialog