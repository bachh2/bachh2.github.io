const tasks = [];

JSON.parse(localStorage.getItem("tasks")) || [];

const formEl = document.querySelector(".task-form");
const taskEl = formEl.elements.task;
const listEl = document.querySelector(".task-list");
const summaryEl = document.querySelector(".summary-text");

taskEl.focus();

function getRandomId() {
  return Math.floor(Math.random() * (10000 - 1000) + 1000);
}
formEl.addEventListener("submit", function (e) {
  e.preventDefault();
  const text = taskEl.value;

  const newTask = {
    id: getRandomId(),
    text,
  };
  tasks.unshift(newTask);
  taskEl.value = "";
  taskEl.focus();

  localStorage.setItem("tasks", JSON.stringify(tasks));
  renderTasks();
});

function renderTasks() {
  listEl.innerHTML = "";
  tasks.forEach(function (task) {
    const li = document.createElement("li");
    li.className = "task-item list-group-item bg-light mb-1 mt-1";
    const text = document.createTextNode(task.text);
    const button = document.createElement("button");
    button.className =
      "btn btn-delete btn-danger position-absolute top-0 start-100";
    button.addEventListener("click", function () {
      const id = task.id;
      for (let i = 0; i < tasks.length; i++) {
        if (tasks[i].id == id) {
          tasks.splice(i, 1);
        }
      }
      localStorage.setItem("tasks", JSON.stringify(tasks));
      listEl.removeChild(li);
      updateSummary();
    });

    const i = document.createElement("i");
    i.className = "bi bi-trash3";
    const span = document.createElement("span");
    span.innerHTML = `<button
                    onclick = "editTasks();renderTasks();"
                    class="btn btn-edit btn-info position-absolute top-0 end-0"
                   >
                    Edit
                  </button>`;

    button.append(i);
    li.append(text, button, span);
    listEl.append(li);
  });
  updateSummary();
}

function editTasks() {
  const id = tasks.id;
  for (let i = 0; i < tasks.length; i++) {
    if (tasks[i].id == id) {
      tasks[i]=newTask;
    }
  }
  localStorage.setItem("tasks", JSON.stringify(tasks));

}
renderTasks();

function updateSummary() {
  const text =
    tasks.length == 0
      ? "There is nothing"
      : `You have <span class="number fw-bold"> ${tasks.length} </span> pending tasks
        <button onclick = "tasks.length=0; localStorage.removeItem('tasks') ;renderTasks();" class="btn btn-clear btn-danger">Clear</button>`;
  summaryEl.innerHTML = text;
}
