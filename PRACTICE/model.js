/**
 * Created by SHADMAN on 24-Apr-16.
 */
//function constructor
function Task(id,name,desc){
    this.id=id;
    this.name=name;
    this.desc=desc;
    this.iscompleted=false;

}
//taskoperations object
var taskOperations={
    taskList: [],
    taskId :0,
    addTask:function(name,desc){
        this.taskId++;
        var task=new Task(this.taskId,name,desc);
        this.taskList.push(task);

    },
    toggleTask:function(id) {
        this.taskList[id - 1].iscompleted = !this.taskList[id - 1].iscompleted;
    },
    deleteTask:function() {
        return this.taskList = this.taskList.filter(function (taskObject) {
            return !taskObject.iscompleted;
        });

        },
    notCompleteCount:function() {
        return this.taskList.filter(function (taskObject) {
            return taskObject.iscompleted;

        }).length;


    }

}