// Instances
let srch_input_sub_wrpr = document.getElementById('srch-input-sub-wrpr');
let srch_input = document.getElementById('srch-input');

// window.onload = () => {
// 	query()
// }

// EventListeners
srch_input.addEventListener('focus', srch_input_onfocused);
srch_input.addEventListener('focusout', srch_input_outfocused);
srch_input.addEventListener('keypress', function(e) {
	srch_input_handler(e);
});


// Event Handlers
function srch_input_onfocused(){
	srch_input_sub_wrpr.style.height = '415px';
	srch_input_sub_wrpr.style.borderRadius = '15px';
	srch_input.placeholder = '';
}

function srch_input_outfocused(){
	srch_input_sub_wrpr.style.height = '45px';
	srch_input_sub_wrpr.style.borderRadius = '25px';
	srch_input.placeholder = 'Inserach of ...';
}

function srch_input_handler(e){
    if(e.key === 'Enter'){
        e.preventDefault();
        console.log("Ok");
        let body = {}
        query(`query`, 'get', null, function(response){
        	if(response[0] == 200){
        		console.log(response);
        	}
        });
    }
}

// function to make various Requests to Server
function query(route, method, body, response){
    if (method === 'get'){
        fetch(route, {
            method: method,
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            }
        }).then(async function(res){
            if (res.status === 200){
                return [res.status, await res.json()];
            }
            else{
                return [res.status, await res.json()];
            }
        }).then(function(data){
            if (data[0] === 200){
                console.log(route, " query:" ,data);
                response(data);
            }
            else{
                response(data);
            }
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
    else {
        fetch(route, {
            method: method,
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(body)
        }).then(async function(res) {
            console.log(res);
            if (res.status === 200){
                return [res.status, await res.json()];
            }
            else{
                return [res.status, await res.json()];
            }
        }).then(function(data) {
            if (data[0] === 200){
                console.log(route, " query:" ,data);
                response(data);
            }
            else{
                response(data);
            }
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
}