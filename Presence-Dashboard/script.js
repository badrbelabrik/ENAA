
students = JSON.parse(localStorage.getItem("students"))
//   console.log(students[0].email)

function saveStudent(){
    students = JSON.parse(localStorage.getItem("students")) || []
  
    const nomInput = document.getElementById("nomInput")
    const prenomInput = document.getElementById("prenomInput")
    const emailInput = document.getElementById("emailInput")
    const groupInput = document.getElementById("groupSelect")
    const statutInput = document.getElementById("statutSelect")

    let newId = students.length > 0 ? students[students.length - 1].id + 1 : 1;
    let studentObj = {id:newId,nom: nomInput.value,prenom:prenomInput.value,email:emailInput.value,group: groupInput.value,status:statutInput.value}
    students.push(studentObj)

    let studentsString = JSON.stringify(students)
    localStorage.setItem("students",studentsString)
    showMessage(`Etudiant "${nomInput.value} ${prenomInput.value}" ajouter avec succes!`, 5000);
}

function fillList(){
    const list = document.querySelector("#studentsTable tbody")
    list.innerHTML = ""
    students = JSON.parse(localStorage.getItem("students"))
    for(student of students){
        const tr = document.createElement("tr")

        const badge = student.status === "Active" ? "bg-success" : "bg-danger";
        const studentid = student.id;
        tr.innerHTML = `<td>${student.nom}</td>
                        <td>${student.prenom}</td>
                        <td>${student.email}</td>
                        <td>${student.group}</td>
                        <td><span class="badge ${badge}">${student.status}</span></td>
                        <td><button class="btn btn-link p-0"><i class="bi bi-eye"></i></button> 
                        <button onClick= "editStudent(${studentid})" class="btn btn-link p-0" data-bs-toggle="modal" data-bs-target="#editStudentModal"><i class="bi bi-pencil-square"></i></button> 
                        <button onClick= "deleteStudent(${studentid})" class="btn btn-link p-0"><i class="bi bi-trash"></i></button> 
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


fillList();
statistics();

function deleteStudent(studentId){
    const confirmed = confirm(`are you sure you want to delete this student ?`)
    if(!confirmed) return;

    students = JSON.parse(localStorage.getItem("students"))
    const index = students.findIndex(item => item.id === studentId);
    
    students.splice(index,1);
    localStorage.setItem("students",JSON.stringify(students))
    fillList()
}

function editStudent(studentId) {
 
students = JSON.parse(localStorage.getItem("students"))
let student = students.find(item => item.id === studentId)
    document.getElementById("editNom").value = student.nom
    document.getElementById("editPrenom").value = student.prenom
    document.getElementById("editEmail").value = student.email
    document.getElementById("editGroup").value = student.group
    document.getElementById("editStatut").value = student.status

    const savebtn = document.getElementById("saveUpdatedStudent")
    savebtn.dataset.studentId = student.id
}

function saveEditedStudent(){
    const savebtn = document.getElementById("saveUpdatedStudent")
    const studentId = parseInt(savebtn.dataset.studentId)

    const students = JSON.parse(localStorage.getItem("students"))
    const index = students.findIndex(item => item.id === studentId);

        students[index].nom = document.getElementById("editNom").value;
        students[index].prenom = document.getElementById("editPrenom").value;
        students[index].email = document.getElementById("editEmail").value;
        students[index].group = document.getElementById("editGroup").value;
        students[index].status = document.getElementById("editStatut").value;

    localStorage.setItem("students", JSON.stringify(students));    
    showMessage(`Etudiant "${students[index].nom} ${students[index].prenom}" modifier avec succes!`, 5000);
}


function Search(word) {
    newArray =  students.filter((st) => st.name.contains(word));
    students = newArray;
}

function showMessage(text, duration = 5000) {
    const msg = document.getElementById("message");
    msg.textContent = text;
    msg.style.display = "block";
    msg.style.opacity = 1;

    setTimeout(() => {
        msg.style.opacity = 0;
        setTimeout(() => { msg.style.display = "none"; }, 300); // wait for fade-out
    }, duration);
}