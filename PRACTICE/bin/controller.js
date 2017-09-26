/**
 * Created by SHADMAN on 24-Apr-16.
 */
    window.addEventListener("DOMContentLoaded",function(){
    document.getElementById("add").addEventListener("click",addTask);
    document.getElementById("delete").addEventListener("click",deleteTask);
    document.getElementById("load").addEventListener("click",loadTask);
    document.getElementById("save").addEventListener("click",saveTask);



});
function loadTask(){
    if(window.localStorage) {
        var taskList = JSON.parse(localStorage.taskList);
        printList(taskList);
    }
    else{
        alert("your browser is outdated");

    }

}
function saveTask() {
    if (window.localStorage) {
        JSON.stringify(taskOperations.taskList);
        alert("Data saved...");
    }
    else {
        alert("your browser is outdated");

    }
}
    function deleteTask() {
        printList(taskOperations.deleteTask());
    }

 function printList(taskList) {
        var ul = document.getElementById("taskList");
        ul.innerHTML = "";
        taskList.forEach(function (taskobject) {
            var li = document.createElement("li");
            li.innerHTML = taskobject.id + " " + taskobject.name + " " + taskobject.desc;
            li.className = "green";
            li.addEventListener("click", toggleTask);
            ul.appendChild(li);
        });
    }

    function addTask() {
        var taskname = document.getElementById("taskname");
        var taskdesc = document.getElementById("desc");
        taskOperations.addTask(taskname.value, taskdesc.value);
        var ul = document.getElementById("taskList");
        var li = document.createElement("li");
        li.innerHTML = taskname.value + " " + taskdesc.value;
        ul.appendChild(li);
//var pending=document.getElementById("taskpending");

       // pending.innerHTMl=taskname.id;


}


