import React from 'react';

function Header({header}) {
    return (
        <div>
            <header>
                <h1 class="title">{header.title}</h1>
                <p>{header.description}</p>
            </header>
        </div>
    );
}

export default Header;