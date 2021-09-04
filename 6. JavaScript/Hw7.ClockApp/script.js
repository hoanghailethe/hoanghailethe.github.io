import Clock from "./clock.js";

let clockElement = document.querySelector(".clock");
let btnStart = document.querySelector('#start');
let btnStop = document.querySelector('#stop');
let btnRecord = document.querySelector('#record');
let btnReset = document.querySelector('#reset');

let recordTable = document.querySelector('.recordTable');

//khoi tao doi tuong clock
let clock = new Clock(clockElement);
clock.render();

//disabble
btnStop.disable = true;

//them action vao nut Start
btnStart.addEventListener("click", function(){
    clock.start();
});

//them su kien vao nut stop
btnStop.addEventListener("click", function(){
    clock.stop();
});

//them su kien vao nut record
btnRecord.addEventListener("click", function(){
    clock.record(recordTable);
});

//them su kien vao nut reset
btnReset.addEventListener("click", function(){
    clock.reset(recordTable);
});

//dissable:https://stackoverflow.com/questions/7526601/setattributedisabled-false-changes-editable-attribute-to-false
