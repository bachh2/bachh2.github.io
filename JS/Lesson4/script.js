const table = document.body.firstElementChild;

const rows = table.rows;

for (let i = 0; i < rows.length; i++){
    const td = rows[i].cells[i];
    td.style.backgroundColor = "red";
    const zigzag = rows[i].cells[rows.length - 1 - i];
    zigzag.style.backgroundColor = "green";
}

const parag = document.getElementById("para");

const wordsCount = parag.innerText.split(" ");

document.title = "Số từ: " + wordsCount.length;

for (let i = 0; i < wordsCount.length; i++){
    const word = wordsCount[i];
    if (word.startsWith("a")) { wordsCount[i] = ":)"         
    }

    if (word.length >= 8) {
        wordsCount[i] = "<mark>" + word + "</mark>";
    }    
}

parag.innerHTML = wordsCount.join(" ");