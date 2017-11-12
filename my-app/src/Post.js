import React, { Component } from 'react';

export default class Post extends Component {
  render() {
    return (
      <div className="post">
        { this.props.children }
        <div id= "logo">   
	<img src="feup.png" position="absolute" height="100" width="550" alt='logo'/>
</div>
<body >
	<div class="container-fluid">
		<form id= "topics">
			<input type="text" name="title" placeholder="Title: What's your question?" class="col-md-6">
			<br>
			<input type="text" id="content" name="content" class="col-md-6">
			<br>
			<button id="btn-cancel" class="btn btn-default" href="/index.html"> Cancel</button>
			<button id="btn-submit" class="btn btn-primary" >Submit</button>
		</form>
	</div>
</body>
      </div>
    )
  }
}
