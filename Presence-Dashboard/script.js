students = JSON.parse(localStorage.getItem("students"))
//   console.log(students[0].email)
function saveStudent(){
    
    students = JSON.parse(localStorage.getItem("students")) || []
  
    const nomInput = document.getElementById("nomInput")
    const prenomInput = document.getElementById("prenomInput")
    const emailInput = document.getElementById("emailInput")
    const groupInput = document.getElementById("groupSelect")
    const statutInput = document.getElementById("statutSelect")

    let studentObj = {nom: nomInput.value,prenom:prenomInput.value,email:emailInput.value,group: groupInput.value,status:statutInput.value}
    students.push(studentObj)

    let studentsString = JSON.stringify(students)
    localStorage.setItem("students",studentsString)

}

function fillList(){
    const list = document.querySelector("#studentsTable tbody")
    list.innerHTML = ""
    students = JSON.parse(localStorage.getItem("students"))
    for(student of students){
        const tr = document.createElement("tr")

        const badge = student.status === "Active" ? "bg-success" : "bg-danger";

        tr.innerHTML = `<td>${student.nom}</td>
                        <td>${student.prenom}</td>
                        <td>${student.email}</td>
                        <td>${student.group}</td>
                        <td><span class="badge ${badge}">${student.status}</span></td>
                        <td><button class="btn btn-link p-0"><i class="bi bi-eye"></i></button> 
                        <button class="btn btn-link p-0"><i class="bi bi-pencil-square"></i></button> 
                        <button class="btn btn-link p-0"><i class="bi bi-trash"></i></button> 
                        </td>`
        list.appendChild(tr)
    }
}


function statistics(){
students = JSON.parse(localStorage.getItem("students"))
const totalStudents = document.querySelector("#totalEtudiants h3")
totalStudents.innerHTML = `${students.length} <i class="bi bi-people-fill"></i>`

const etudiantsActif = document.querySelector("#etudiantsActif h3")
const etudiantsInactif = document.querySelector("#etudiantsInactif h3")
let activesum = 0
let inactivesum = 0
for(student of students){
    if(student.status === "Active"){
        activesum++;
    }else if(student.status === "Inactive"){
        inactivesum++;
    }
}
etudiantsActif.innerHTML = `${activesum} <i class="bi bi-person-check">`
etudiantsInactif.innerHTML = `${inactivesum} <i class="bi bi-person-exclamation"></i>`
}

function deleteStudent(){
    students = JSON.parse(localStorage.getItem("students"))

}

fillList();
statistics();