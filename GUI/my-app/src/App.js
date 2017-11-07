import React, { Component } from 'react';
import feup from './feup.png';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={feup} height="100" width="550" alt='logo'/>
        </header>
      
<body className="App-body">
	

<section class="container">
    <div class="login">
      <h1>Login</h1>
      <form method="post" action="index.html">
        <p><input type="text" name="login" value="" placeholder="Username or Email"></input></p>
        <p><input type="password" name="password" value="" placeholder="Password"></input></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me"></input>
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></input></p>
        <p class="submit"><input type="submit" name="commit" value="Sign Up"></input></p>
      </form>
    </div>

    <div class="login-help">
      <p>Forgot your password? <a href="index.html">Click here to reset it</a>.</p>
    </div>
  </section>


</body>
      </div>

    );
  }
}




export default App;
