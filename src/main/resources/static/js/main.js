alertOnClick = async function() {
    var dropdown = document.getElementById('my_dropdown');
    var studentName = dropdown.value;

    var result = await fetch('http://localhost:8080/getstudent/' + studentName);
    var student = await result.json();

    document.getElementById('math_grade').value = student.grades.mathGrade;
    document.getElementById('eng_grade').value = student.grades.englishGrade;
    document.getElementById('cs_grade').value = student.grades.computerScienceGrade;
}

studentsNamesSelectorLoader = async function() {
   var result = await fetch('http://localhost:8080/studentsNames')
   var studentsNames = await result.json();

   const dropdown = document.getElementById('my_dropdown');
   studentsNames.forEach(name => {
       const option = document.createElement('option');
       option.text = name;
       option.value = name;
       dropdown.add(option);
   });
}

subjectsNamesSelectorLoader = async function() {
   var result = await fetch('http://localhost:8080/getAllSubjects')
   var subjectsNames = await result.json();

   const dropdown = document.getElementById('subjects_dropdown');
   subjectsNames.forEach(name => {
          const option = document.createElement('option');
          option.text = name;
          option.value = name;
          dropdown.add(option);
      });
}

selectorsLoader = async function() {
    studentsNamesSelectorLoader();
    subjectsNamesSelectorLoader();
}

document.addEventListener('DOMContentLoaded', selectorsLoader);

document.getElementById('my_btn').addEventListener('click', alertOnClick);