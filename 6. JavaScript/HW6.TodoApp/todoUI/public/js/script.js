let btnAdd = document.querySelector(".btn-add");
let btnCancel = document.querySelector(".btn-cancel");
let newTodo = document.querySelector(".new-todo");
let todoInput = document.querySelector(".todo-input");

btnAdd.addEventListener("click", function () {
    newTodo.style.display = "block";
});

btnCancel.addEventListener("click", function () {
    newTodo.style.display = "";
    todoInput.value = "";
});

let xhr = new XMLHttpRequest();

xhr.open("GET", "http://localhost:8080/todo", true);
xhr.responseType = "json";
xhr.setRequestHeader("Content-Type", "application/json");
xhr.withCredentials  = false;
xhr.send(null);

xhr.onerror = function (ev) {
    console.log("Không thể gửi yêu cầu HTTP!!");
};

let todos;
let doing = [];
let completed = [];
let doingNumber = document.querySelector(".doing .todo-number");
let completedNumber = document.querySelector(".completed .todo-number");
let doingList = document.querySelector(".doing .todo-list");
let completedList = document.querySelector(".completed .todo-list");
let btnMore = document.querySelector(".btn-more");

function update(el, id, title) {
    let xhr = new XMLHttpRequest();

    xhr.open("PUT", "http://localhost:8080/todo/update/" + id);

    xhr.setRequestHeader("Content-Type", "application/json", true);
    xhr.withCredentials  = false;

    xhr.send(JSON.stringify({ title: title, completed: true }));

    xhr.onerror = function () {
        console.log("Không thể gửi yêu cầu HTTP!");
    };

    xhr.onload = function () {
        if (xhr.status >= 200 || xhr.status < 300) {
            completedList.prepend(el);
        } else {
            console.log("Error: ", xhr.response);
        }
    };
}

xhr.onload = function (ev) {
    if (xhr.status >= 200 && xhr.status < 300) {
        xhr.response.reverse().forEach(function (todo) {
            if (todo.completed) completed.push(todo);
            else doing.push(todo);
        });

        doingNumber.textContent = doing.length;
        completedNumber.textContent = completed.length;

        let doingHTML = doing
            .map(function (todo) {
                return `
                    <li class="todo-item" onclick="update(this, ${todo.id}, '${todo.title}')">
                        <span class="btn-check">
                            <i class="bi bi-circle"></i>
                        </span>
                        ${todo.title}
                    </li>
                `;
            })
            .join("");

        doingList.innerHTML = doingHTML;

        let completedHTML = completed
            .splice(0, 2)
            .map(function (todo) {
                return `
                <li class="todo-item">
                    <i class="bi bi-check2"></i> ${todo.title}
                </li>
            `;
            })
            .join("");

        completedList.innerHTML = completedHTML;

        if (completed.length > 0) {
            btnMore.textContent = `... ${completed.length} công việc khác nữa`;

            btnMore.addEventListener("click", function () {
                let completedHTML = completed
                    .map(function (todo) {
                        return `
                        <li class="todo-item">
                            <i class="bi bi-check2"></i> ${todo.title}
                        </li>
                    `;
                    })
                    .join("");

                completedList.innerHTML += completedHTML;
                btnMore.remove();
            });
        }
    } else {
        console.log("Error: ", xhr.response);
    }
};

let newForm = document.forms.new;
newForm.addEventListener("submit", function (ev) {
    ev.preventDefault();

    if (todoInput.value.trim().length === 0) {
        alert("Vui lòng nhập nội dung công việc!!!");
        return;
    } else {
        let xhr = new XMLHttpRequest();

        xhr.open("POST", "http://localhost:8080/todo/create", true );
        xhr.withCredentials  = false;
        xhr.responseType = "json";

        let todo = {
            title: todoInput.value.trim(),
            completed: false,
        };

        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.send(JSON.stringify(todo));

        xhr.onerror = function () {
            console.log("Không thể gửi yêu cầu HTTP!!");
        };

        xhr.onload = function () {
            if (xhr.status >= 200 || xhr.status < 300) {
                let newTodoHTML = `
                    <li class="todo-item" onclick="update(this, ${xhr.response.id}, '${xhr.response.title}')">
                        <span class="btn-check">
                            <i class="bi bi-circle"></i>
                        </span>
                        ${xhr.response.title}
                    </li>
                `;

                doingList.innerHTML += newTodoHTML;
                newTodo.style.display = "";
                todoInput.value = "";
            } else {
                console.log("Error: ", xhr.response);
            }
        };
    }
});
