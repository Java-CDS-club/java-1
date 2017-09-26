window.addEventListener("DOMContentLoaded",init);
function init(){
    document.getElementById("add").addEventListener("click",doOperation);
    document.getElementById("subtract").addEventListener("click",doOperation);
    document.getElementById("multiply").addEventListener("click",doOperation);
    document.getElementById("divide").addEventListener("click",doOperation);
}
function doOperation(event){
  var firstNumber=document.getElementById("firstNum").value;
    var secondNumber=document.getElementById("secondNum").value;
    var buttonValue=event.srcElement.innerHTML;
   var result=0;
    if(buttonValue=="Add"){
        result=add(firstNumber,secondNumber);
    }
     if(buttonValue=="Sub"){
        result=subtract(firstNumber,secondNumber);
     }
    if(buttonValue=="Multi"){
        result=multiply(firstNumber,secondNumber);
    }

if(buttonValue=="Div"){
    result=divide(firstNumber,secondNumber);

}
document.getElementById("result").innerHTML=result;
}

function add(firstNumber,secondNumber){
    return parseInt(firstNumber)+parseInt(secondNumber);
}
function subtract(firstNumber,secondNumber){
    return firstNumber-secondNumber;

}
function multiply(firstNumber,secondNumber){
  return firstNumber*secondNumber;
}
function divide(firstNumber,secondNumber){
    return firstNumber/secondNumber;
}

