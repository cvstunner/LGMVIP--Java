// Instances
let srch_input_sub_wrpr = document.getElementById('srch-input-sub-wrpr');
let sidebar_bg = document.getElementById('sidebar-bg');
let srch_input = document.getElementById('srch-input');
let settings_sidebar = document.getElementById('settings-sidebar');
let acc_sidebar = document.getElementById('acc-sidebar');
let acc_icon_wrpr = document.getElementById('acc-icon-wrpr');
let settings_icon_wrpr = document.getElementById('settings-icon-wrpr');
let search_form = document.getElementById('search-form');
let toggle_btn = document.getElementsByClassName('toggle-btn');
let history_toggle = document.getElementById('history-toggle');
let srch_hist_wrpr = document.getElementById('srch-hist-wrpr');
let body = document.getElementById('body');
let srchd_query = '';
let userid = 1;
let user_history_status = true;
let user_history;
let srch_history_height = 45;

window.onload = () => {
    srch_input.value = srchd_query = window.sessionStorage.getItem("query");
    window.sessionStorage.setItem("userid", userid);
    get_user_status();
}

// EventListeners
srch_input.addEventListener('click', srch_input_onfocused);
body.addEventListener('click', srch_input_outfocused, true);
srch_input.addEventListener('input', srch_input_typed);

// Event Handlers
function srch_input_onfocused(e){
    e.stopPropagation();
    console.log(user_history)
    if(user_history !== null && user_history !== undefined){
        srch_input_sub_wrpr.style.height = srch_history_height + 'px';
        srch_input_sub_wrpr.style.borderRadius = '15px';
        srch_hist_wrpr.style.display = 'block';
        srch_input.placeholder = '';
    }
}

function srch_input_outfocused(){
    srch_input_sub_wrpr.style.height = '45px';
    srch_input_sub_wrpr.style.borderRadius = '25px';
    srch_hist_wrpr.style.display = 'none';
    srch_input.placeholder = 'Inserach of ...';
}
function srch_input_typed(){
    console.log(srch_input.value);
    srchd_query = srch_input.value;
}

function toggle_btn_clicked(){
    if(history_toggle.checked == true){
        console.log("history turned on!");
        history_toggle.checked == false;
        user_history_status = true;
        toggle_user_history(1);
        settings_icon_clicked();
    }
    else if(history_toggle.checked == false){
        console.log("history turned off!");
        history_toggle.checked == true;
        del_hist_btn_clicked();
        user_history_status = false;
        toggle_user_history(0);
    }
}

function del_hist_btn_clicked(){
    settings_icon_clicked();
    if(user_history_status == true){
        user_history = null;
        srch_hist_wrpr.innerHTML = ''; 
        query(`../api/user/history?uid=${userid}`, 'delete', null, 'application/json', false
            , function(res){
            populate_search_history(user_history);
            location.reload(true);
        });
    }
    else{
        return;
    }
}

function srch_hist_clicked(element){
    console.log(element.children[1].textContent);
    srch_input.value = srchd_query = element.children[1].textContent;
    search_form_submitted();
}

function sidebar_close_icon_clicked(){
    if(settings_icon_wrpr.getAttribute('name') === "visible"){
        settings_icon_clicked();
    }
    else if(acc_icon_wrpr.getAttribute('name') === "visible"){
        acc_icon_clicked();
    }
}

function settings_icon_clicked(){
    if(settings_icon_wrpr.getAttribute('name') === "hidden"){
        settings_sidebar.style.transform = "translateX(0vw)";
        sidebar_bg.style.display = "block";
        settings_icon_wrpr.setAttribute('name', "visible");
    }
    else{
        settings_sidebar.style.transform = "translateX(20vw)";
        sidebar_bg.style.display = "none";
        settings_icon_wrpr.setAttribute('name', "hidden");
    }
}

function acc_icon_clicked(){
    if(acc_icon_wrpr.getAttribute('name') === "hidden"){
        acc_sidebar.style.transform = "translateX(0vw)";
        sidebar_bg.style.display = "block";
        acc_icon_wrpr.setAttribute('name', "visible");
    }
    else{
        acc_sidebar.style.transform = "translateX(20vw)";
        sidebar_bg.style.display = "none";
        acc_icon_wrpr.setAttribute('name', "hidden");
    }
}

function toggle_user_history(status){
    query(`../api/user?uid=${userid}&hs=${status}`, 'put', null, 'application/json', false, function(res){
        if(res[0] === 200){
            location.reload();
        }
        else if(res[0] === 201){
        }
    });
}

function get_user_status(){
    query(`../api/user?uid=${userid}`, 'get', null, 'application/json', true, function(res){
        if(res[0] === 200){
            if (res[1]['map']['hist_status'] === '1'){
                user_history_status = true;
                history_toggle.checked == true;
                history_toggle.setAttribute("checked", "");
                get_user_history();
            }
            else if(res[1]['map']['hist_status'] === '0'){
                history_toggle.removeAttribute("checked");
                history_toggle.checked == false;
                user_history_status = false;
            }366
        }
        else if(res[0] === 201){
            user_history_status = false;
        }
    });
}

function get_user_history(){
    query(`../api/user/history?uid=${userid}`, 'get', null, 'application/json', true, function(res){
        if(res[0] === 200){
            user_history = res[1]['map'];
            populate_search_history(user_history);
        }
        else if(res[0] === 201){
            user_history = null;
        }
    });
}

function add_srch_history(body){
    if(search_form.elements[0].value !== ''){
        if(user_history_status == true){
            query(`../api/user/history?uid=${userid}`, 'post', {"query": body}, 'application/json', false, function(res){
                search_form.submit();
            });
        }
        else if(user_history_status == false){
            search_form.submit();
        }
    }
    else{
        return;
    }
}

function populate_search_history(data){
    let innerHTML_txt = '';
    let count = 0;
    for (const key in data){
        srch_history_height += 45;
        innerHTML_txt = `<div onclick="srch_hist_clicked(this)"><div></div><p>${data[key]}</p></div>` + innerHTML_txt;
        count+=1;
        if(count === 10){
            break;
        }
    }
    srch_hist_wrpr.innerHTML = innerHTML_txt;
}

function search_form_submitted(){
    window.sessionStorage.setItem("query", srchd_query);
    add_srch_history(srchd_query);
}

// function to make various Requests to Server
function query(route, method, body, type, parse, response){
    if (method === 'get' && parse === true){
        fetch(route, {
            method: method,
            headers: {
              'Accept': type,
              'Content-Type': type
            }
        }).then(async function(res){
            if (res.status === 200){
                return [res.status, await res.json()];
            }
            else{
                return [res.status, await res.json()];
            }
            return res;
        }).then(function(data){
            if (data[0] === 200){
                console.log(route, " query:" ,data);
                response(data);
            }
            else{
                response(data);
            }
            return data;
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
    else if(method !== 'get' && parse === true){
        fetch(route, {
            method: method,
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(body)
        }).then(async function(res) {
            console.log(res);
            console.log("not okaiiii");
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
    else if(method !== 'get' && parse === false){
        fetch(route, {
            method: method,
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(body)
        }).then(async function(res) {
            return res;
        }).then(function(data) {
            response(data);
            return data;
        }).catch(function(err) {
            console.log(err);
            alert('Error');
        });
    }
}