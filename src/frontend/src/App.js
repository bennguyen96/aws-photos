import logo from "./logo.svg";
import "./App.css";
import Images from "./api/Images";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Upload from "./Upload";


const App = () => {
  return (
    <Router>
      <Switch>
      <Route path="/upload">
          <Upload />
        </Route>
        <Route path="/">
          <Images />
        </Route>
      </Switch>
    </Router>
  );
}

export default App;
