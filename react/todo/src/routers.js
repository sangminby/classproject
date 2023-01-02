import {createBrowserRouter} from "react-router-dom";
import MainPage from "./pages/MainPage";
import AboutPage from "./pages/AboutPage";

const routers = createBrowserRouter([
    {
        path: "",
        element: <MainPage></MainPage>
    },
    {
        path : "about", // /about
        element : <AboutPage></AboutPage>
    }
])