function submit(e)
{
	console.log("submited!");
	questionJson = $('#askquestion-form').serializeArray();
	postJsonArray = formToJson(questionJson);
	console.log(questionJson);
	console.log(postJsonArray);
	makeXmlHttpGetCall("localhost:8080/student/1", null, true, false, null, null);
	
}

function cancel(){
	
	
}

function formToJson(formArray){
	stringJson = "{";
	for (var i = 0, len = formArray.length; i < len; i++) {
		stringJson+= "\""
		stringJson+= formArray[i].name;
		stringJson+="\":\"";
		stringJson+= formArray[i].value;
		stringJson+="\"";
		if(i!=len-1)
			stringJson+=", ";
	}
	stringJson+= "}";
	return stringJson
}

function makeXmlHttpGetCall(url, params, async, xml, callback, args) {
    var xmlHttpObj = createXmlHttpRequestObject();
    if (xmlHttpObj) {
        xmlHttpObj.open("Get",url, async);
        xmlHttpObj.onreadystatechange = function() {
            if (xmlHttpObj.readyState == 4 && xmlHttpObj.status == 200) {
                var response;
                if (xml == true)
                response = xmlHttpObj.responseXML;
                else
                response = xmlHttpObj.responseText;
                callback(response,args);
            }
        };
        xmlHttpObj.send(params);
    }
}

function createXmlHttpRequestObject() {
    return new XMLHttpRequest();
}
