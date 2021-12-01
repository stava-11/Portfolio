
const electron = require("electron");
const ipc = electron.ipcRenderer;
var userInput = document.getElementById('userInputSubmit');

userInput.addEventListener('click', (event) => {
    event.preventDefault();
    
    const userInputValue = document.getElementById("userInput").value;
    
    ipc.send("userInputSubmit", userInputValue);
    ipc.on("userInputResponse", (evt, response) => {
        let resultEl = document.getElementById("userResponse");
        if (response) {
            createUL(response);
            // userInput.removeEventListener("click", evt);
        } else {
            resultEl.innerHTML = "Unsuccessful! Please try again.";
        }
    });
}, false);


function createUL(response){
    var existingUL = document.getElementById("unorderedList");
    if (existingUL){
        existingUL.remove();+9
    }
    var unorderedList = document.createElement("UL");
    unorderedList.setAttribute("id", "unorderedList");
    document.getElementById("userResponse").appendChild(unorderedList);
    for (x in response) {
        var list = document.createElement("LI");
        var information = document.createTextNode(response[x].memo);
        list.appendChild(information);
        document.getElementById("unorderedList").appendChild(list);
      }
}



    