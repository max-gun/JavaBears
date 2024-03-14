alertOnClick = function() {
    var dropdown = document.getElementById('mydropdown');
    var selectedValue = dropdown.value;
    alert('Hello ' + selectedValue);
}

document.getElementById('my_btn').addEventListener('click', alertOnClick);