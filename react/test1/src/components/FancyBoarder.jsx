import React from "react";

function FancyBoarder(props) {

    return (
        <div className={'boarder-' + props.color}>
            {props.children}
        </div>
    )
}

export default FancyBoarder