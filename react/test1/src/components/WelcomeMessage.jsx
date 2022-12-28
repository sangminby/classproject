import React from "react";
import FancyBoarder from "./FancyBoarder";

function WelcomeMessage(props) {

    return (
        <FancyBoarder color="red">
            <h1>안녕하세요 !!</h1>
            <p>사이트에 방문해주셔서 감사합니다.</p>
        </FancyBoarder>
    )
}

export default WelcomeMessage